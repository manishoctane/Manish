<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form Pages</title>
</head>
<body>
<form action="emp" method="POST">
<table>
  <tr>
    <th>Emp Id  </th>
    <td><input type="text" name="eno" value="${eno }"/></td>
  </tr>
  <tr>
    <th>Name </th>
    <td><input type="text" name="name" value="${employee.name }"/></td>
  </tr>
  <tr>
    <th>Salary </th>
    <td><input type="text" name="salary" value="${employee.salary }"/></td>
  </tr>
  <tr>
  <th></th>
  <th><button>Add Employee</button></th>
  <th></th>
  </tr>
</table>


<br>

</form>
</body>
</html>