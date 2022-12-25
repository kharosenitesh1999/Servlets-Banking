<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>HTML DOM Events</h1>
<h2>The onmousedown Event</h2>

<p>Clock the text below!</p>
<p id="myP" onmousedown="mouseDown()" onmouseup="mouseUp()">
The mouseDown() function sets the color of this text to red.
The mouseUp() function sets the color of this text to blue.
</p>

<script>
function mouseDown() {
  document.getElementById("myP").style.color = "red";
}

function mouseUp() {
  document.getElementById("myP").style.color = "blue";
}
</script>

</body>
</html>

</body>
</html>