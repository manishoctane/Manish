package com.alstom.spring.SpringCore_38;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.alstom.spring");
//        Person person = (Person) context.getBean("rajiv");
        Person person = (Person) context.getBean("person");
        person.display();
        ((AbstractApplicationContext)context).close();
    }
}
