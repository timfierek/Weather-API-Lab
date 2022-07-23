<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather lol</title>
</head>
<body>
	<h1>Welcome to my Weather Website</h1>
	<div>
		<h4>Enter your location below for accurate weather!</h4>
		<form action="/location-submit" method="post">
			Latitude:  <input type="text" name="lat" required><br><br>
			Longitude: <input type="text" name="lon" required><br><br>
		
			<input type="submit" value="View Weather">
		</form>
	
	</div>
</body>
</html>