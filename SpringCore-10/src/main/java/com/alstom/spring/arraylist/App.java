package com.alstom.spring.arraylist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-arraylist.xml");
		Person person = context.getBean(Person.class);
		person.displayPerson();
//		System.err.println(person);
		((AbstractApplicationContext) context).close();
	}
}
