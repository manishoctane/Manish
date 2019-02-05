<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form Pages</title>
</head>
<body>
<form:form modelAttribute="employee">
		<table>
			<tr>
				<th>Emp No</th>
				<td><form:input path="eno" /></td>
				<td><form:errors path="eno" /></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<th>Salary</th>
				<td><form:input path="salary" /></td>
				<td><form:errors path="salary" /></td>
			</tr>
			<tr>
			<td></td>
			<td><form:button>Add Employee</form:button></td>
			<td></td>
			</tr>
		</table>
	
	</form:form>
</body>
</html>