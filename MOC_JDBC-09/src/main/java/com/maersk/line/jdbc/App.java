package com.maersk.line.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

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
		String query = "select * from emp_tbl where salary = 5000";
		Employee employee = jdbcTemplate.queryForObject(query, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				
				employee.setEno(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				return employee;
			}
		});
		System.out.println(employee);
		
		((AbstractApplicationContext)context).close();
	}
}
