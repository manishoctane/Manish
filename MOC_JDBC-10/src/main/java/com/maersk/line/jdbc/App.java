package com.maersk.line.jdbc;

import java.util.List;

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
		List<Employee> empList = jdbcTemplate.query(query,
				(rs, rowNum) -> new Employee(rs.getInt("eno"), rs.getString("name"), rs.getDouble("salary")));
		empList.forEach(System.out::println);
		((AbstractApplicationContext) context).close();
	}
}
