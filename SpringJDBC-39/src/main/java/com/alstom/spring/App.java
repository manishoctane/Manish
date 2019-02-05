package com.alstom.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.alstom");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
    	String sql = "insert into emp_tbl values(2,'Bharat',6000)";
		jdbcTemplate.update(sql);
        ((AbstractApplicationContext)context).close();
    }
}
