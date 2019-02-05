package com.maersk.line.jdbc;

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
      jdbcTemplate.update("insert into emp_tbl values(2,'Bharat',10250)");
      ((AbstractApplicationContext)context).close();
    }
}
