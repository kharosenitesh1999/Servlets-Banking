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
			int id = (Integer)hs.getAttribute("fid");
			String  name = req.getParameter("name");
			 Double sal;
			//int id = Integer.parseInt(req.getParameter("id"));
			try {

				sal =Double.parseDouble(req.getParameter("sal"));
				
			}catch(NullPointerException e) {
				sal=0.0;
			}
			String email = req.getParameter("email");
			PreparedStatement pstmt =null;
			
			
			System.out.println("*1:");				
System.out.println(id);
System.out.println(name);
System.out.println(sal);
System.out.println(email);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url ="jdbc:mysql://localhost:3306/servlet";
				
				Connection con = DriverManager.getConnection(url,"root","root");
				Statement st = con.createStatement();
				
				 pstmt = con.prepareStatement("update  employee SET name=? ,sal=? ,email=? where id=?");
				
				pstmt.setString(1, name);
				pstmt.setDouble(2,sal );
				pstmt.setString(3, email);
				pstmt.setInt(4, id);
				int details =  pstmt.executeUpdate();

			System.out.println("*2:");	
System.out.println(id);
System.out.println(name);
System.out.println(sal);
System.out.println(email);
					RequestDispatcher rd = req.getRequestDispatcher("insert.jsp");
					rd.forward(req, resp);
					
				 
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			} finally{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
