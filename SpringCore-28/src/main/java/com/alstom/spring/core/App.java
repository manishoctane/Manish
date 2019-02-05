package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(Address.class);
       Person person = context.getBean(Person.class);
       System.out.println(person);
       ((AbstractApplicationContext)context).close();
    }
}
