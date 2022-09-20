<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show Items</title>
	</head>
	<body>
		<c:forEach items="${listItems}" var="item">
            Item ID: ${item.itemID} <br>
            Item Description: ${item.itemDesc} <br>
            -------------------------------------<br>
        </c:forEach>
        <br>
        <input type="button" value="Home" onclick="window.location='index.jsp'" >
	</body>
</html>