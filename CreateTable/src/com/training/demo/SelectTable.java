package com.training.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trainingdb";
		String username="root";
		String password="HAri9898@";
		
		String sql ="create table student(student_name varchar(20),student_id int primary key,department  varchar(20))";
		Connection connection = null;
		PreparedStatement statement =null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			statement =connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				//get the row
				//get the first column
				String studentName = rs.getString("student_name");
				int studentId = rs.getInt("student_id");
				String department = rs.getString(3);
			}
			boolean result=statement.execute();
		    System.out.println("Table created" + !result);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			}catch(SQLException e) {
				
			}
		}
		

	}

	}

