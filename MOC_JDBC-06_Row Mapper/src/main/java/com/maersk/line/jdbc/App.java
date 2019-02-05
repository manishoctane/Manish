package com.maersk.line.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.maersk.line.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String query = "select * from emp_tbl where salary > 1000";
		List<Employee> empList = jdbcTemplate.query(query, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setEno(rs.getInt("eno"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				return employee;
			}
		});
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		((AbstractApplicationContext)context).close();
	}
}
