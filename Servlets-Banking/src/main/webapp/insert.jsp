<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="style.css">
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

</div>
</body>
</html>