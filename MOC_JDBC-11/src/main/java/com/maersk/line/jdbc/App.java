package com.maersk.line.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		Integer eno = 3;
		String name = "Chandu";
		Double salary = 10000d;
		String query = "insert into emp_tbl values(?,?,?)";
		jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setInt(1, eno);
				preparedStatement.setString(2, name);
				preparedStatement.setDouble(3, salary);
				return preparedStatement;
			}
		});
		((AbstractApplicationContext)context).close();
	}
}
