package com.alstom.spring.SpringCore_37;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Person person = (Person) context.getBean("person");
        person.display();
        ((AbstractApplicationContext)context).close();
}
}