package com.maersk.line.moc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.maersk.line.entity.Employee;
import com.maersk.line.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		EmployeeService service = context.getBean(EmployeeService.class);

		Employee empById = service.findById(1);
		System.out.println(empById);

		((AbstractApplicationContext) context).close();
	}
}
