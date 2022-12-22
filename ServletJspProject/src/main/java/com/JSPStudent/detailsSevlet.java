package com.JSPStudent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/fetchdata")
public class detailsSevlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servlet";
			Connection con = DriverManager.getConnection(url,"root","root");
			Statement st = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement("Select *from employee  where id =?");
			            pstmt.setInt(1, id); 
			ResultSet details =  pstmt.executeQuery();	
				HttpSession hs  =  req.getSession();
				
				hs.setAttribute("details", details);
				
				    hs.setAttribute("id", id);
				
			// data sending for display on jsp 
				
			RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
			rd.forward(req,resp);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
