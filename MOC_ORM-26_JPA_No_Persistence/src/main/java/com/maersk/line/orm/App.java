package com.maersk.line.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.maersk.line.orm.dao.EmployeeDAO;
import com.maersk.line.orm.domain.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line.orm");
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		employeeDAO.save(new Employee(5, "Zuhu", 10000d));
		((AbstractApplicationContext)context).close();
	}
}
