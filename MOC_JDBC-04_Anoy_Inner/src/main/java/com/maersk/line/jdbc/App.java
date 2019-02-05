package com.maersk.line.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.maersk.line.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String query = "select * from emp_tbl";
		List<Employee> result = jdbcTemplate.query(query, new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException {
				List<Employee> empList = new ArrayList<>();
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setEno(rs.getInt("eno"));
					employee.setName(rs.getString("name"));
					employee.setSalary(rs.getDouble("salary"));
					empList.add(employee);
				}
				return empList;
			}
		});
		for (Employee employee : result) {
			System.out.println(employee);
		}
		((AbstractApplicationContext) context).close();
	}
}
