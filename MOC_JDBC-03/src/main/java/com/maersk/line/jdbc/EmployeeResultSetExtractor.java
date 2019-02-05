package com.maersk.line.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.maersk.line.model.Employee;

public class EmployeeResultSetExtractor implements ResultSetExtractor<ArrayList<Employee>> {
	
	@Override
	public ArrayList<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		while(rs.next()) {
			Employee employee = new Employee();
			employee.setId(rs.getInt("eno"));
			employee.setName(rs.getString("name"));
			employee.setSalary(rs.getDouble("salary"));
			empList.add(employee);
		}
		return empList;
	}

}
