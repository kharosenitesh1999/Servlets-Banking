package com.JSPStudent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/nitesh")
public class DisaplyServlet extends HttpServlet {

	static ResultSet rs ;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		

			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			}catch(ClassNotFoundException e) {
				System.out.println(e);
				
			}
			
			
			
			String url="jdbc:mysql://localhost:3306/servlet";
			//create Connection
		try{
			
			Connection connection = DriverManager.getConnection(url,"root","root");
			
			String select = "SELECT * from details ";
			PreparedStatement  pstmt = connection.prepareStatement(select);	 
			 rs = pstmt .executeQuery();
			
		
			 
		}catch(SQLException e) {
			System.out.println(e);
			
		}
		
		HttpSession hs = req.getSession();
		hs.setAttribute("rs", rs);
		
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
		
		
	}
}
