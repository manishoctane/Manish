package com.maersk.line.moc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.maersk.line.entity.Employee;
import com.maersk.line.service.EmployeeService;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.err.println("Enter Employee Number");
//		int eno = scanner.nextInt();
		System.err.println("Enter Employee Name");
		String name = scanner.next();
//		System.err.println("Enter Employee Salary");
//		double salary = scanner.nextDouble();
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
		EmployeeService service = context.getBean(EmployeeService.class);
		
//		Employee employee = new Employee(eno, name, salary);
//		int result = service.calcSalaryAfterTax(employee);
//		System.out.println(result);
		
//		List<Employee> employeeList = service.getAllEmployee();
//		employeeList.forEach(System.out::println);
//		
//		Employee empById = service.findById(1);
//		System.out.println(empById);
//		
		Employee findByName = service.findByName(name);
		System.out.println(findByName);
		
		scanner.close();
		((AbstractApplicationContext)context).close();
	}
}
