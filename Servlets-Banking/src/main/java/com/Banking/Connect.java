package com.Banking;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	static Connection connection ;
	public static Connection getConnection( String dbName,String username,String password) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			System.out.println(e);
			
		}
		
		String url="jdbc:mysql://localhost:3306";
		//create Connection
		try{
		connection = DriverManager.getConnection(url,username,password);
	}catch(SQLException e) {
		System.out.println(e);
		
	}
		
		return connection;
	}
	
}
