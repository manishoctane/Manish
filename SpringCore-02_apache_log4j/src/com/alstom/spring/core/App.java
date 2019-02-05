package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-core.xml");
		Object object = container.getBean("person");
		Person person = (Person) object;
		System.err.println(person.getPid());
		System.err.println(person.getName());
		System.err.println(person.getAddr());
	}

}
