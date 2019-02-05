package com.maersk.line.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String query = "select min(salary) from emp_tbl";
		Double empSalary = jdbcTemplate.query(query, new ResultSetExtractor<Double>() {

			@Override
			public Double extractData(ResultSet rs) throws SQLException, DataAccessException {
				Double minSalary = 0d;
				if(rs.next()) {
				minSalary = rs.getDouble(1);
				}
				return minSalary;
			}
		});
		System.out.println(empSalary);
		((AbstractApplicationContext)context).close();
    }
}
