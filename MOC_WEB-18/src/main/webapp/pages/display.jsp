<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data</title>
</head>
<body>
<h1>The following Employee data is Stored</h1>
Eno : ${employee.eno }<br>
Name : ${employee.name }<br>
Salary: ${employee.salary }<br><br>
<a href="emp">Add New Employee</a>
</body>
</html>