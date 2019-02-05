package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
    	String message = container.getMessage("error.minmax", new Object[] {"Age","21","65"}, null);
    	System.err.println(message);
    	((AbstractApplicationContext)container).close();
    }
}
