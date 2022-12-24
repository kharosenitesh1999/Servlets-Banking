package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Select {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Build Connection of database
			String url="jdbc:mysql://localhost:3306/servlet";
			Connection con = DriverManager.getConnection(url, "root", "root");
			
			// Execution of query 
			String select ="select * from employee where id=?";
			System.out.print("Enter the ID:");
			int id = new Scanner(System.in).nextInt();
			PreparedStatement pstmt = con.prepareStatement(select);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getLong("sal"));
				System.out.println(rs.getString("email"));
				System.out.println();
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
