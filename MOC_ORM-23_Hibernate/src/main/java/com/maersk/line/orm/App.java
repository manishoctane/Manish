package com.maersk.line.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.maersk.line.orm.domain.Employee;
import com.maersk.line.orm.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line.orm");
		EmployeeService service = context.getBean(EmployeeService.class);
//		List<Employee> employee = service.findById();
//		employee.forEach(System.out::println);
		List<Employee> findBySalary = service.findBySalary();
		findBySalary.forEach(System.out::println);
		((AbstractApplicationContext)context).close();
	}
}
