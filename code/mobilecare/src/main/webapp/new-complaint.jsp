<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Complaint</title>
	</head>
	<body>
		<h2>Raise Complaint</h2>
		<form action="${pageContext.request.contextPath}/newComplaint" method="post">
			Mobile Number: <input type="text" name="mobileNo"/><br/>
			Registered Email Address: <input type="text" name="emailAddress"/><br/>
			Problem Description: <textarea rows="10" cols="20" name="problem"></textarea><br/>
			Alt Contact No: <input type="text" name="altContactNo"><br/>
			<input type="submit" value="Raise Complaint"/>
		</form>
	</body>
</html>