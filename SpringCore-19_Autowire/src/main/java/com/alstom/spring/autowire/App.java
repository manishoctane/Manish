package com.alstom.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
		((AbstractApplicationContext) context).close();
	}
}
