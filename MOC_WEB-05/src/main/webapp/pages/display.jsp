<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Names Controller</title>
</head>
<body>
<%-- ${names} --%>
<c:forEach var="name" items="${names}">
${name}<br>
</c:forEach>
</body>
</html>