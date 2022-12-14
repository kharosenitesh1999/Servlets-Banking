package com.Banking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signup  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String email =  req.getParameter("name");
		long mobile =  Long.parseLong(req.getParameter("mobile"));
		long adhar = Long.parseLong(req.getParameter("adhar")); 
		String pan = req.getParameter("pan"); 
	}

}
