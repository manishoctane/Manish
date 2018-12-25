package com.maersk.line.jdbc;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		NamedParameterJdbcTemplate jdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
		String query="insert into emp_tbl values(:id,:name,:salary)";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", 8);
		map.put("name", "Raju");
		map.put("salary", 10000d);
		jdbcTemplate.execute(query, map, (ps)-> ps.executeUpdate());
				/* new PreparedStatementCallback<Integer>() {

			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});*/
		((AbstractApplicationContext)context).close();
	}
}
