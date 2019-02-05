package com.maersk.line.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.maersk.line.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String query ="select * from emp_tbl where salary > ?";
		List<Employee> empList = jdbcTemplate.query(query , (PreparedStatementSetter) ps -> {
			ps.setDouble(1, 1000);
			
		},(rs,rowNum) -> {
				Employee employee = new Employee();
				employee.setEno(rs.getInt("eno"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				return employee;
			
		});
		empList.forEach(System.out::println);
		((AbstractApplicationContext)context).close();
	}
}
