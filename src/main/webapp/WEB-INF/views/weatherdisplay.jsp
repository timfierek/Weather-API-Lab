<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather Forecast</title>
</head>
<body>
	<h2>Here is your weather forecast!</h2>
	
	<h4>Weather for ${areaDescription}</h4>
	<div>Current temperature (F): ${temp}</div>
	<div>Current windspeed (mph): ${winds}</div>
	<div>Current visibility (miles): ${visibility}</div>
	
	<h4>How the rest of the week is looking...</h4>
	<div>${forecastLabels[0]}:</div>
	<div>${futureForecasts[0]}</div><br>
	
	<div>${forecastLabels[1]}:</div>
	<div>${futureForecasts[1]}</div><br>
	
	<div>${forecastLabels[2]}:</div>
	<div>${futureForecasts[2]}</div><br>
	
	<div>${forecastLabels[3]}:</div>
	<div>${futureForecasts[3]}</div><br>
	
	<div>${forecastLabels[4]}:</div>
	<div>${futureForecasts[4]}</div><br>
	
	<div>${forecastLabels[5]}:</div>
	<div>${futureForecasts[5]}</div><br>
	
	<div>${forecastLabels[6]}:</div>
	<div>${futureForecasts[6]}</div><br>
	
	<div>${forecastLabels[7]}:</div>
	<div>${futureForecasts[7]}</div><br>
	
	<div>${forecastLabels[8]}:</div>
	<div>${futureForecasts[8]}</div><br>
	
	<div>${forecastLabels[9]}:</div>
	<div>${futureForecasts[9]}</div><br>
	
	<div>${forecastLabels[10]}:</div>
	<div>${futureForecasts[10]}</div><br>
	
	<div>${forecastLabels[11]}:</div>
	<div>${futureForecasts[11]}</div><br>
	
	<div>${forecastLabels[12]}:</div>
	<div>${futureForecasts[12]}</div><br>
</body>
</html>