package com.alstom.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
    	String sql = "insert into emp_tbl values(1,'Anil',5000)";
		jdbcTemplate.update(sql);
    	((AbstractApplicationContext)context).close();
    }
}
