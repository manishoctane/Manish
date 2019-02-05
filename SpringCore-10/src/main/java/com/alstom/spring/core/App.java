package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
		Person person = context.getBean(Person.class);
		person.displayPerson();
		((AbstractApplicationContext) context).close();
	}
}
