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

	@WebServlet("/update")
	public class UpdateServlet  extends HttpServlet{

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			
			HttpSession hs = req.getSession();
			int id = (Integer)hs.getAttribute("id");
			String name = req.getParameter("name");
			double sal = Double.parseDouble(req.getParameter("sal"));
			String email = req.getParameter("email");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url ="jdbc:mysql://localhost:3306/servlet";
				Connection con = DriverManager.getConnection(url,"root","root");
				Statement st = con.createStatement();
				PreparedStatement pstmt = con.prepareStatement("update  emplyee SET name=? ,sal=? ,email=? where id=?");
				pstmt.setString(1, name);
				pstmt.setDouble(2,sal );
				pstmt.setString(3, email);
				pstmt.setInt(4, id);
				ResultSet details =  pstmt.executeQuery();
				
				RequestDispatcher rd = req.getRequestDispatcher("update.html");
				rd.forward(req, resp);
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}
