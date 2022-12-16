package com.BankingServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import  com.Banking.ForgetClass;

public class forgetServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname =  req.getParameter("fname");
		String lname =  req.getParameter("lname");
		String email =  req.getParameter("email");
		long mobile  =  Long.parseLong(req.getParameter("mobile"));
		
		ForgetClass fc =  new ForgetClass(fname,lname,email,mobile);
		
		
		
		

		
		
		
	}
}
