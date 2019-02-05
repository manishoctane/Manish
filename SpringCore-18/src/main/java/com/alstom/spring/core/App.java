package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
		Person luv = context.getBean("luv", Person.class);
		System.err.println(luv);
		Person kush = context.getBean("kush", Person.class);
		System.err.println(kush);
		((AbstractApplicationContext) context).close();
    }
}
