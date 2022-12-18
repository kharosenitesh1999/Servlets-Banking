<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style >
body{
background-color:gray;
}
.parent {
	border-width:50px;
	border-color:red blue black yellow;
	border-radius:20px;
	border-style: solid  ;
	align-content: center;
	width: 600px;
	height: 400px;
	align-content: center;
	padding-left: 10px;
	padding-top: 60px;
	background-color: white;
	color: black;
	align-content: center;
}
input{
border-width:5px;
border-radius: 25px;
height: 35px;
width: 300px;
padding-left:100px;
font-size: 20px;
font-family:cursive;
color:red;
}
button.btn4{

border-width:5px;
border-radius: 25px;
height: 45px;
width: 250px;
padding-left:0px;
background-color: rgb(0,0,0);

font-size: 20px;
font-family:cursive;
color:white;
}
button.head{

border-width:5px;
border-radius: 25px;
height: 45px;
width: 250px;
padding-left:0px;
background-color: rgb(0,0,0);
margin:25px 40px 10px 55px;
font-size: 20px;
font-family:cursive;
color:white;
}
div.head{
height: 100px;
border: solid;
border-width: 5px;
margin-bottom: 25px;
border-radius: 50px;
border-color: menu;
background-color:teal;
}
h1{
font-family: cursive;
font-size: 10mm;
color:red; 
}
</style>
</head>
<body>
<br>
<br>

<form>

 <div class=head>

<button class="head" formaction="insert.jsp">Insert</button>&nbsp&nbsp&nbsp&nbsp
<button class="head"formaction="update.jsp">Update</button>&nbsp&nbsp&nbsp&nbsp
<button class="head"formaction="delete.jsp">Delete</button>&nbsp&nbsp&nbsp&nbsp
<button class="head"formaction="display.jsp">Display</button>&nbsp&nbsp&nbsp&nbsp

</div>
</form>

<div align=center>

<form action="" >
<div class='parent' >
<h1 align="center">Wel-Come</h1>

<input type='text' placeholder="Enter  the Name" name='name' required><br><br>
<input type='tel' placeholder="Enter the  Mobile" name='tel' required><br><br>
<input type='email' placeholder="Enter the email" name='email' required><br><br>
<button class="btn4"  formaction="insert.jsp" type="submit">Submit</button><br><br>
</div>
</form>



<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	long tel=0 ;
	String tels=null;
	try{
		tels =request.getParameter("tel");
		
		
	}catch( Exception e){
		if(e!=null){
			out.println(e);
			tel = Long.parseLong(tels);
		}
	}
	session.setAttribute("name", name);
	session.setAttribute("tel", tel);
	session.setAttribute("email",email);
	
%>

</div>
</body>
</html>