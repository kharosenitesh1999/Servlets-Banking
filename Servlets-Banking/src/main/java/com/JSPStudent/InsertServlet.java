package com.JSPStudent;

import java.io.IOException;
import java.sql.SQLException;

import com.JSPStudent.JSPStudentDao;

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
		long tel=0 ;
		String tels=null;
		try{
			tels =req.getParameter("tel");
			
			
		}catch( Exception e){
			if(e!=null){
				
				tel = Long.parseLong(tels);
			}
		}
		
//		HttpSession hs = req.getSession();
//		
//		hs.setAttribute("name", name);
//		hs.setAttribute("tel", tel);
//		hs.setAttribute("email",email);
		
		Student stud =new Student();
		stud.setName(name);
		stud.setTel(tel);
		stud.setEmail(email);
		
		JSPStudentDao studDao =  new JSPStudentDao();

		try {
			// database connection of insert
			int ret = studDao.insertStudent(stud);
			if(ret >0){
				System.out.println("submitted data...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
