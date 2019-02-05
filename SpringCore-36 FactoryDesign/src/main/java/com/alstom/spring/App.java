package com.alstom.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Person person = (Person) context.getBean("personFactory");
       person.display();
       ((AbstractApplicationContext)context).close();
       }
}
