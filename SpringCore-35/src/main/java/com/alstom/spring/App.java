package com.alstom.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.alstom.spring");
    	EmployeeDAO employee = context.getBean(EmployeeDAO.class);
    	employee.display();
    	((AbstractApplicationContext)context).close();
    }
}
