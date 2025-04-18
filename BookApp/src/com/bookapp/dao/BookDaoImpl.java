package com.bookapp.dao;

import com.bookapp.model.Book;
import com.bookapp.util.DbconnectionUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements IBookDao {
	private Connection connection;
	

	@Override
	public void addBook(Book book) {
		// create the sql query
		String sql ="in sert into book vakues(?,?,?,?,?)";
		//get connection;
		connection = DbconnectionUtil.getconnection();
		// create prepared stmt
		PreparedStatement statement = connection.prepareStatement(sql);
		try {
		statement = connection.prepareStatement(sql);
		//call execute query
		ResultSet rs = Statement.executeQuery();
		// iterate to get each row
		while(rs.next()) {
			String title = rs.getString("title");
			int bookId = rs.getInt("book_id");
			String author = rs.getString("author");
			double price = rs.getDouble("price");
			Book book = new Book(title,bookId,author,price,category);
			books.add(book);
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		
            ps.executeUpdate();
            System.out.println("Book added successfully!");
         }

	
		// TODO Auto-generated method stub
		
		connection = DbconnectionUtil.getConnection();


	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		 String sql = "UPDATE books SET price = ? WHERE book_id = ?";
	        PreparedStatement statement = null;
	        
	        try {
	            connection = DbconnectionUtil.getConnection();
	            statement = connection.prepareStatement(sql);
	            
	            statement.setDouble(1, price);
	            statement.setInt(2, bookId);
	            
	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Book updated successfully!");
	            } else {
	                System.out.println("No book found with ID: " + bookId);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (statement != null) statement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }


	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM books WHERE book_id = ?";
        PreparedStatement statement = null;
        
        try {
            connection = DbconnectionUtil.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setInt(1, bookId);
            
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("No book found with ID: " + bookId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

	}

	@Override
	public Book getById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
