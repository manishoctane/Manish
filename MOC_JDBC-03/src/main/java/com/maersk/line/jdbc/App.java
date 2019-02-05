package com.maersk.line.jdbc;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.maersk.line.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String query = "select * from emp_tbl";
		ArrayList<Employee> empList = jdbcTemplate.query(query, new EmployeeResultSetExtractor());
		for (Employee employee : empList) {
			System.err.println(employee);
		}
		((AbstractApplicationContext) context).close();
	}
}
