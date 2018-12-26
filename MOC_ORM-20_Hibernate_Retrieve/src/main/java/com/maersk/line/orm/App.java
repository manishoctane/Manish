package com.maersk.line.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.maersk.line.orm.domain.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line.orm");
		 List<Employee> empList = context.getBean(HibernateTemplate.class).loadAll(Employee.class);
		 empList.forEach(System.out::println);
		((AbstractApplicationContext) context).close();
	}
}
