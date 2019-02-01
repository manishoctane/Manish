<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form Details</title>
</head>
<body>
	<form:form modelAttribute="employee">
		<table id="employee_form">
			<thead>
				<tr>
					<th>Employee Management Form</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Employee No :</td>
					<td><form:input path="eno" /></td>
					<td><form:errors path="eno"></form:errors></td>
				</tr>
				<tr>
					<td>Employee Name :</td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name"></form:errors></td>
				</tr>
				<tr>
					<td>Employee Salary :</td>
					<td><form:input path="salary" /></td>
					<td><form:errors path="salary"></form:errors></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button>Submit</form:button></td>
					<td></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
				<th>Please provide valid information...</th>
				<th></th>
				</tr>
			</tfoot>
		</table>
	</form:form>
</body>
</html>