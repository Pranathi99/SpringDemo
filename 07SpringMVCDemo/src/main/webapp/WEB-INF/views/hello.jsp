<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
	<h1>Hello!! Welcome to Spring MVC</h1>
	
	<%
		out.println("Id:"+request.getAttribute("id")+"<br/>");
		out.println("Name:"+request.getAttribute("name")+"<br/>");
		out.println("Salary:"+request.getAttribute("salary")+"<br/>");
	%>
	
	<p>id:<b>${id}</b></p>
	<p>name:<b>${name}</b></p>
	<p>salary:<b>${salary}</b></p>
	
	<p>${employee}</p>
</body>
</html>