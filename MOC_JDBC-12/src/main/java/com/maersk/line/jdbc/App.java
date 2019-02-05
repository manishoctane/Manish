package com.maersk.line.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.maersk.line.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
	
		List<Employee> employeeList = jdbcTemplate.query(new PreparedStatementCreator() {

			private String qurey = "select * from emp_tbl";

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				return con.prepareStatement(qurey);
			}
		}, new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Employee> empList = new ArrayList<>();
				while(rs.next()) {
				Employee employee = new Employee();
				employee.setEno(rs.getInt("eno"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				empList.add(employee);
			}
				return empList;
			}
		});
		employeeList.forEach(System.out::println);
		((AbstractApplicationContext) context).close();
	}
}
