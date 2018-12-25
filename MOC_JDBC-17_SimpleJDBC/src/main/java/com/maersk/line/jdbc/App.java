package com.maersk.line.jdbc;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
    	SimpleJdbcInsert jdbcInsert = context.getBean(SimpleJdbcInsert.class);
    	jdbcInsert.withTableName("EMP_TBL");
    	HashMap<String, Object> map = new HashMap<>();
    	map.put("eno", 9);
    	map.put("name", "Harish");
    	map.put("salary", 10000d);
    	jdbcInsert.execute(map);
    	((AbstractApplicationContext)context).close();
	}
}
