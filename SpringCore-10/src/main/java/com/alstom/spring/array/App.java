package com.alstom.spring.array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-array.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
		String[] names = person.getNames();
		for (String name : names) {
			System.out.println(name);
		}
		((AbstractApplicationContext) context).close();
	}
}
