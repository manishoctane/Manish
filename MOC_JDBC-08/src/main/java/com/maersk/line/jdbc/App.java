package com.maersk.line.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		String query = "select * from emp_tbl";
		List<Map<String, Object>> empList = jdbcTemplate.queryForList(query);
		for (Map<String, Object> map : empList) {
			System.out.println(map);
		}
		System.out.println(empList);
		
		((AbstractApplicationContext) context).close();
    }
}
