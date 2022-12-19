package com.JdbcCon;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.xdevapi.Statement;

@WebServlet("/student")
public class StudentServlet extends HttpServlet{

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "root");
//here sonoo is database name, root is username and password  
				java.sql.Statement st = connection.createStatement();

			String query =  "select *from student";
 
				ResultSet rs =st.executeQuery(query);
				
				HttpSession hs =  req.getSession();
				hs.setAttribute("rs", rs);
			} catch (SQLException | ClassNotFoundException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
			rd.forward(req, resp);
		}
}
