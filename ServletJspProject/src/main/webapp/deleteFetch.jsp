<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

body{

width: default;
height:default;

}

div.head{
height: 100px;
border: solid;
border-width: 5px;
margin-bottom: 25px;
border-radius: 50px;
border-color: menu;
background-color:teal;
cursor: pointer;
}
h1{
align-content:center;
height: 50px;
width:25%;
border: solid;
border-width: 50px;
margin-top: 50px;
margin-left: 550px;
margin-right: 150px;
border-radius: 100px;
border-width:50px;
border-color: menu;
background-color:teal;
padding:5px 0px 5px 10px;
color:white;
padding-top:10px;
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
cursor: pointer;
}

input.id{
border-width:5px;
border-radius: 25px;
height: 35px;
width: 350px;
padding-left:50px;
font-size: 20px;
font-family:cursive;
color:red;
cursor:inherit;
}

input.btn1{
border-width:5px;
border-radius: 25px;
height: 45px;
width: 150px;
padding-bottom: 10px;
font-size: 20px;
font-family:cursive;
color:white;
font-size:20px;
cursor:pointer;
background-color: red;
margin-right: 600px;

}

input.btn2{
border-width:5px;
border-radius: 25px;
height: 45px;
width: 150px;
padding-bottom: 10px;
font-size: 20px;
font-family:cursive;
color:white;
font-size:20px;
cursor:pointer;
background-color: red;
margin-right: -250px;

}
.p1{
height: 1200px;
border: solid;
background-color: gray;
margin-left:250px;
margin-right:250px;
border-radius: 50px;


}
.c1{
border: solid;
border-radius:25px;
border-width: 5px;
margin-left: 450px;
width: 50%;
height: 200px;
margin-top:-65px;
padding-top: 50px;
padding-bottom: 50px;
}
div.id{
padding-top:50px;
margin-left:10px;
}

lable{
font-size: 25px;
font-weight: bold;

}
</style>
</head>
<body align=center >

<form>

<form   >

<div class=head  method='post'>
<button formaction="insert.jsp" class="head" >Insert</button>&nbsp&nbsp&nbsp&nbsp
<button formaction="update.html" class="head" >Update</button>&nbsp&nbsp&nbsp&nbsp
<button formaction="delete.html" class="head" >Delete</button>&nbsp&nbsp&nbsp&nbsp
<button formaction="nav" class="head" >Display</button>&nbsp&nbsp&nbsp&nbsp
</div>

</form>

<form action="Dfetchdata" method="post">
<div class='id'>

<input  class='id' type='number' name ='id' placeholder="Enter the ID" required >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 
<input  class='btn1' type='submit' value=' Submit' >

</div>
</form>




<%  ResultSet rs = (ResultSet)session.getAttribute("rs"); %>

<%! int id ;
	String name ;
	long sal ;
	String email;
	%>

<%while(rs.next()){
	id =rs.getInt("id");
	name =rs.getString("name");
	sal =rs.getLong("sal");
	email =rs.getString("email"); 
	}
	%>

<form action="delete" method="post">
<h1>Delete Details</h1>
<div class=c1>

<lable>Name:</lable> &nbsp&nbsp<input class=id name='name' value="<%=name %>"><br><br>
<lable>Salary:</lable>&nbsp&nbsp <input class=id name='sal' value="<%= sal%>"><br><br>
<lable>Email:</lable> &nbsp&nbsp<input class=id name='email' value="<%=email %>"><br><br>
<input  class='btn2' type='submit' value=' Submit' >
</div>
</form>
</body>
</html>