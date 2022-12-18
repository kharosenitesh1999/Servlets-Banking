<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align='center'>

<h1>
<%= "welcome to Web Page :" +1000 %> </h1> <br><br>

<form   >
<input type='text' placeholder='Enter the name :' name='name' ><br>	<br>
<input type='tel' placeholder='Enter mobile :' name='tel' ><br>	<br>
<input type='email' placeholder='Enter email :' name='email' ><br>	<br>

<button type='submit' >Submit</button><br> <br>
</form>
<%!long tel =0; %>

	<% 
	
	String name = request.getParameter("name");
	try{
		tel = Long.parseLong( request.getParameter("tel"));
	}catch(Exception e){
		out.println("Null Input!..........");
	}
	String email = request.getParameter("email");
	
	session.setAttribute("name", name);
	session.setAttribute("tel", tel);
	session.setAttribute("email", email);
	
	%> 
	<%= name+"  "+tel+" "+email %> </h1> <br><br>
	<h1><%= "Wel-Come To Jsp "+request.getParameter("name") %></h1>
	<%
	
	
	String getName =(String) session.getAttribute("name");
	String getEmail =(String) session.getAttribute("email");
	long getTel =(long) session.getAttribute("tel");
	
	%><br> <br><br> <br>
	<% out.println(getName); %> <br> <br>
	<%out.println(getTel);  %> <br> <br>
	<%out.println(getEmail); %> <br> <br>

<h3>Current Time:</h3>
<%= java.util.Calendar.getInstance().getTime() %>



</body>
</html>