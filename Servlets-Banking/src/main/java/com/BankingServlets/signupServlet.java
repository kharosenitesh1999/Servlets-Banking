package com.BankingServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Banking.Bank;

public class signupServlet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email =  req.getParameter("email");
		long mobile =  Long.parseLong(req.getParameter("mobile"));
		long adhar = Long.parseLong(req.getParameter("adhar")); 
		String dob = req.getParameter("dob"); 
		String pan = req.getParameter("pan");
		String country = req.getParameter("country");
		String state = req.getParameter("state");
		String city = req.getParameter("city");
		int zip =Integer.parseInt("zip");
		String type = req.getParameter("mode");
		
		Bank bank =  new Bank();
		bank.setFname(fname);
		bank.setLname(lname);
		bank.setEmail(email);
		bank.setMobile(mobile);
		bank.setAdhar(adhar);
		bank.setDob(dob);
		bank.setPan(pan);
		bank.setCountry(country);
		bank.setState(state);
		bank.setCity(city);
		bank.setZip(zip);
		bank.setType(type);
		
		
			
		
	}

}
