package com.JSPStudent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/fetchdata")
public class detailsServelet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			int id  = Integer.parseInt(req.getParameter("id"));
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					// Build Connection of database
					String url="jdbc:mysql://localhost:3306/servlet";
					Connection con = DriverManager.getConnection(url, "root", "root");
					
					// Execution of query 
					String select ="select * from employee where id=?";
					System.out.print("Enter the ID:"+id);
					//int id = new Scanner(System.in).nextInt();
					
					PreparedStatement pstmt = con.prepareStatement(select);
					pstmt.setInt(1,id);
					ResultSet rs = pstmt.executeQuery();
					HttpSession hs = req.getSession();
					hs.setAttribute("rs", rs);
					RequestDispatcher rd =  req.getRequestDispatcher("update.jsp");
					rd.forward(req, resp);
					
					while(rs.next()) {
						
						System.out.println(rs.getInt("id"));
						System.out.println(rs.getString("name"));
						System.out.println(rs.getLong("email"));
						
						
					}
					
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
		
	}
	
}