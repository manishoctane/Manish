package com.alstom.spring.map;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-map.xml");
		Person person = context.getBean(Person.class);
		Map<Integer, String> details = person.getDetails();
		System.out.println(details);
		((AbstractApplicationContext) context).close();
	}
}
