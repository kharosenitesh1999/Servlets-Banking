<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: gray;
	align-content: center;
	width: 800px;
	height: 1000px;
	margin-left: 500px;
}

.title {
	align-content: center;
}

.parent {

	border-style: solid ;
	align-content: center;
	width: 800px;
	height: 800px;
	align-content: center;
	padding-left: 50px;
	padding-top: 100px;
	background-color: white;
	color: black;
	align-content: center;
}

.child1 {

	margin-top: 50px;
	border : solid;
	border-color: red;
	border-style: solid;
	margin-right: 300px;
	border: solid;
	background-color: orange;
}

lable {
	font-size: 150%;
	border-color: red;
}
</style>
</head>
<body>

	<div class="parent">

		<marquee class="title" direction="right">
			<h1>
				WEL-Come :-<%
			session.getAttribute("name");
			%>
			</h1>
		</marquee>
		<div class='child1'>

			<lable>Name: </lable>
			<%=session.getAttribute("name")%><br> <br>
			<lable>Tel: </lable>
			<%=session.getAttribute("tel")%><br> <br>
			<lable>Email: </lable>
			<%=session.getAttribute("email")%><br> <br>

		</div>
	</div>

</body>
</html>