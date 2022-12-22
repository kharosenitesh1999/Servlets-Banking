<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import= "java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align ="center">
<h1 align="center">Display</h1>

<form    >

<%  ResultSet rs = (ResultSet)session.getAttribute("rs"); %>
<table cellpadding=25px border=2 align=center>
<th>ID</th>
<th>Name</th>
<th>Tel</th>
<th>Email</th>

<%while(rs.next()){ %>
<tr>
<td><%= rs.getInt("id") %></td>
<td><%= rs.getString("name")%></td>
<td><%= rs.getDouble("sal")%></td>
<td><%= rs.getString("email")%></td>
</tr>
<% } %>

</table>

</form>
</body>
</html>

<!-- 
use   servlet;
create table employee(id int not null, name varchar(150) ,sal  double, email varchar(100), primary key(id));
desc servlet.employee;
select *from servlet.employee;
insert into employee( id,name ,sal,email) values(4,'dada' , 1231.0 ,'data@gmail.com'); -->