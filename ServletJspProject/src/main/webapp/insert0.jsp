<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<%@ page import ="com.JSPStudent.Student"  %>
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
height: 30px;
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

<form  action="display.jsp" method="post">
<button class="head" >Display</button>&nbsp&nbsp&nbsp&nbsp
</form>




<div align=center>

<form action="inserts"  method="post">
<div class='parent' >
<h1 align="center">Wel-Come</h1>
<input type='text' placeholder="Enter  the Name" name='name' required><br><br>
<input type='tel' placeholder="Enter the  salary" name='sal' required><br><br>
<input type='email' placeholder="Enter the email" name='email' required><br><br>
<button class="btn4"  type="submit">Submit</button><br><br>
</div>
</form>

</div>

</body>
</html>

<!-- 
<form>

 <div class=head>

<button class="head" formaction="insert.jsp">Insert</button>&nbsp&nbsp&nbsp&nbsp
<button class="head" formaction="update.jsp">Update</button>&nbsp&nbsp&nbsp&nbsp
<button class="head" formaction="delete.jsp">Delete</button>&nbsp&nbsp&nbsp&nbsp
</form> -->