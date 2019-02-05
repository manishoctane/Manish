package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/alstom/spring/config/spring-core.xml","classpath:com/alstom/spring/config/spring.xml");
		Address address = context.getBean(Address.class);
		Person person = context.getBean(Person.class);
		person.displayPerson();
		address.displayAddress();
		((AbstractApplicationContext) context).close();
	}
}
