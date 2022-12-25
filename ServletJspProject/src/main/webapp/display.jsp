<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import= "java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display data</title>
<style>

input{

border-width:5px;
border-radius: 25px;
height: 45px;
width: 250px;
padding-left:0px;
background-color: rgb(220,0,0);
margin:25px 40px 10px 55px;
font-size: 20px;
font-family:cursive;
color:white;
cursor: pointer;
}
</style>
</head>
<body align ="center">

<header>

<form action="insert.jsp">
<input type="submit" onclick="click()" Value=" Go to Home Page" >

<script>
function click(){

alert ( "Welcome User" );

}
</script>
</form>
</header>
<h1 align="center">Display</h1>

<form    >

<%  ResultSet rs = (ResultSet)session.getAttribute("rs"); %>
<table cellpadding=25px border=2 align=center>
<th>ID</th>
<th>Name</th>
<th>Tel</th>
<th>Email</th>

<%while(rs.next()){  

%>
<tr>
<td><%= rs.getInt("id") %></td>
<td><%= rs.getString("name")%></td>
<td><%= rs.getLong("sal")%></td>
<td><%= rs.getString("email")%></td>
</tr>
<% } %>

</table>

</form>

</body>
</html>
