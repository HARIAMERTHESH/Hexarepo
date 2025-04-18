package com.bookapp.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.io.InputStream;

public class DbconnectionUtil {
	static Connection connection;
	
	public static Connection getConnection() {
		// get the properties object that has the properties
		Properties properties = DbPropertiesUtil.getProperties();
		// get the properties using methods
		// get the url,username,password
		String url=properties.getProperty("db.url");
		String username=properties.getProperty("db.username");
		String password=properties.getProperty("db.password");
		try {
			connection=DriverManager.getConnection(url, username, password);
	    	 
		         }catch (IOException e) {
		        	 e.printStackTrace();
		         }
		         return connection;	
		
	}

}
