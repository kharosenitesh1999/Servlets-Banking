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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/delete")
public class DeleteServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			int id  = Integer.parseInt(req.getParameter("id"));
	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url ="jdbc:mysql://localhost:3306/servlet";
				Connection con = DriverManager.getConnection(url,"root","root");
				Statement st = con.createStatement();
				PreparedStatement pstmt = con.prepareStatement("Delete from employee where id=? ");
				pstmt.setInt(1, id);
				boolean ret = pstmt.execute();
				if(ret ==false) {
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
				
				
				HttpSession hs  =req.getSession();
				hs.invalidate();				
				
				RequestDispatcher rd = req.getRequestDispatcher("demo.jsp");
				rd.forward(req, resp);
				
			} catch (ClassNotFoundException | SQLException e) {
				
								e.printStackTrace();
			}
		}	
}


