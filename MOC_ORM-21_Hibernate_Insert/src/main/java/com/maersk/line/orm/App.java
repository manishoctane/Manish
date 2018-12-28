package com.maersk.line.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.maersk.line.orm.domain.Employee;
import com.maersk.line.orm.service.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line.orm");
    	context.getBean(EmployeeService.class).save(new Employee(3, "Chandu", 10000d));
//    	Employee employee = context.getBean(EmployeeService.class).findById(1);
//    	System.out.println(employee);
    	((AbstractApplicationContext)context).close();
    }
}
