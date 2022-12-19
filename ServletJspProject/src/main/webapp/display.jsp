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