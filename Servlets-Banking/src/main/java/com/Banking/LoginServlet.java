package com.Banking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		long mobile = Long.parseLong(req.getParameter("pws"));
		
		PrintWriter pw = resp.getWriter();
		pw.println(mobile);
		HttpSession hs = req.getSession();
		//setter session
		hs.setAttribute("email", email);
		hs.setAttribute("mobile", mobile);
		
		HttpSession hs1 =  req.getSession();
		
		// getter session
		System.out.println((String)hs.getAttribute("email"));
		System.out.println((Long)hs.getAttribute("mobile"));
		
//		// remove session
//		hs.removeAttribute("email");
//
//		System.out.println((String)hs.getAttribute("email"));
//		System.out.println((Long)hs.getAttribute("mobile"));
//		
//		// invalidate session
//		hs.invalidate();
//		
//		System.out.println((String)hs.getAttribute("email"));
//		System.out.println((Long)hs.getAttribute("mobile"));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email:");
		String usr = sc.next();
		
		System.out.println("Enter the password:");
		
		long pws = sc.nextLong();
		
		
		if(email.equals(usr)|| pws==mobile) {
			
			
			pw.println("Successfully Login.......\n thanks for login....");
			
			RequestDispatcher rd =req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
}
