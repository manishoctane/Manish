package com.maersk.line.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.maersk.line.orm.dao.EmployeeDAO;
import com.maersk.line.orm.domain.Employee;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line.orm");
       EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
       Employee employee = employeeDAO.findById(1);
       System.out.println(employee.getEno()+" "+employee.getName()+" "+employee.getSalary());
       ((AbstractApplicationContext)context).close();
    }
}

