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
	@WebServlet("/insert")
	public class InsertServlet extends HttpServlet {
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			

			String name = req.getParameter("name");
			String email = req.getParameter("email");
			double sal=0 ;
			int id =0;
			
			try{
				sal =Double.parseDouble(req.getParameter("sal"));
								
			}catch( Exception e){
				System.out.println(e);
			}
			
			Student stud =new Student();
			
			
			stud.setName(name);
			stud.setSal(sal);
			stud.setEmail(email);
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url ="jdbc:mysql://localhost:3306/servlet";
				Connection con = DriverManager.getConnection(url,"root","root");
				
				String insert="insert into employee  (name,sal,email) values(?,?,?)";
				
				PreparedStatement pstmt =  con.prepareStatement(insert);
				//pstmt.setInt(1, stud.id);
				pstmt.setString(1, stud.name);
				pstmt.setDouble(2, stud.sal);
				pstmt.setString(3, stud.email);
				
				
				pstmt.execute();
				
				RequestDispatcher rd = req.getRequestDispatcher("insert.jsp");
				rd.include(req, resp);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					}

	}
