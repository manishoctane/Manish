package com.maersk.line.jdbc.call;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		SimpleJdbcCall jdbcCall = context.getBean(SimpleJdbcCall.class);
		jdbcCall.withProcedureName("emp_tbl_proc").declareParameters(
				new SqlParameter("p_eno", Types.INTEGER),
				new SqlParameter("p_name",Types.CHAR),
				new SqlParameter("p_salary", Types.DOUBLE)
				);
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("p_eno", 1);
		hashMap.put("p_name", "Anil");
		hashMap.put("p_salary", 10000d);
		Map<String, Object> map = jdbcCall.execute(hashMap);
		map.entrySet().forEach(System.out::println);
		((AbstractApplicationContext)context).close();
	}
}
