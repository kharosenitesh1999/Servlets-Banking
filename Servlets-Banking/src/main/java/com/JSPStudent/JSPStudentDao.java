package com.JSPStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSessionEvent;

import com.Banking.Connect;

public class JSPStudentDao extends Connect{
	
	static Connection connection;
	static PreparedStatement pstmt ;
	static ResultSet rs;
	
	static {
		
		connection  = Connect.getConnection("servlet", "root","root" );
	}
	
	public int insertStudent(Student stud) throws SQLException {
		
		connection  = Connect.getConnection("servlet", "root","root" );
		
		String insert = "insert into details (name,tel,email) "
				+ "values(?,?,?)";
		 pstmt = connection.prepareStatement(insert);
		 
		 pstmt.setString(1,stud.name);
		 pstmt.setLong(2,stud.tel);
		 pstmt.setString(3,stud.email);
		 
		 int ret =  pstmt.executeUpdate();
		 
		 connection.close();
		 return ret;
	}
	
public int  updateStudent(Student stud) throws SQLException {

	connection  = Connect.getConnection("servlet", "root","root" );
	
	String update = "update details SET tel=? Where name=? and email=? ";
	 pstmt = connection.prepareStatement(update);
	 
	 pstmt.setLong(1,stud.tel);
	 pstmt.setString(2,stud.name);
	 pstmt.setString(3,stud.email);
	 
	 int ret =  pstmt.executeUpdate();
	 
	 connection.close();
	 return ret;
		
	}
public int deleteStudent(Student stud) throws SQLException {

	connection  = Connect.getConnection("servlet", "root","root" );
	
	String delete = "delete from details WHERE name=? and tel=?";
	 pstmt = connection.prepareStatement(delete);
	 
	 pstmt.setString(1,stud.name);
	 pstmt.setLong(2,stud.tel);
	
	 
	 int ret =  pstmt.executeUpdate();
	 
	 connection.close();
	 return ret;
	
}
public ResultSet displayStudentJsp(Student stud) throws SQLException {

	ArrayList <Student> al =  new ArrayList<>();
	connection  = Connect.getConnection("servlet", "root","root" );
	
	String select = "SELECT name ,tel ,email from details WHERE name=? and tel=?";
	 pstmt = connection.prepareStatement(select);
	 
	 pstmt.setString(1,stud.name);
	 pstmt.setLong(2,stud.tel);
	
	 
	 rs = pstmt .executeQuery();
	
	 
	 
	 connection.close();
	
	 return rs;
	
}

public ResultSet displayStudent() throws SQLException {

	ArrayList <Student> al =  new ArrayList<>();
	connection  = Connect.getConnection("servlet", "root","root" );
	
	String select = "SELECT * from details ";
	 pstmt = connection.prepareStatement(select);	 
	 rs = pstmt .executeQuery();
	
	 
	 
	 connection.close();
	
	 return rs;
	
}

}
