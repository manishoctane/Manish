package com.alstom.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
    	String message = container.getMessage("db.driver", null, null);
    	System.err.println(message);
    	((AbstractApplicationContext)container).close();
    }
}
