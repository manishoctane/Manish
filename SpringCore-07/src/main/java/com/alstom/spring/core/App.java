package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
//		context.getBean(Address.class);
		context.getBean(Person.class);
		((AbstractApplicationContext) context).close();
	}
}
