package com.maersk.line.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String query = "select max(salary) from emp_tbl";
		Double empSalary = jdbcTemplate.queryForObject(query, Double.class);
		System.out.println(empSalary);
		((AbstractApplicationContext) context).close();
	}
}
