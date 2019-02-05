package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-innerbean.xml");
		Person person = context.getBean("person", Person.class);
		System.err.println(person);
//		Address address = context.getBean("address", Address.class);
//		System.err.println(address);
		((AbstractApplicationContext) context).close();
	}
}
