<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<table id="employee_tbl">
		<thead>
			<tr>
				<th>S.No</th>
				<th>Employee Data</th>
			</tr>
		</thead>
		<tbody style="color: blue;">
			<tr>
				<td>Eno :</td>
				<td>${employee.eno }</td>
			</tr>
			<tr>
				<td>Name :</td>
				<td>${employee.name }</td>
			</tr>
			<tr>
				<td>Salary :</td>
				<td>${employee.salary }</td>
			</tr>
			<tr>
				<td>Tax :</td>
				<td>${employee.tax }</td>
			</tr>
		</tbody>

	</table>
	<br>
	<a href="employee" style="color: green;">Add New Employee</a>
</body>
</html>