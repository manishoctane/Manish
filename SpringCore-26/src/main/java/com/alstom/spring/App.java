package com.alstom.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(Person.class);
      Person person = context.getBean(Person.class);
      System.err.println(person);
      ((AbstractApplicationContext)context).close();
    }
}
