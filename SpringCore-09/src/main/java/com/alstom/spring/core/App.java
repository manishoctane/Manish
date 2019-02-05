package com.alstom.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext parent = new ClassPathXmlApplicationContext("classpath:com/alstom/spring/config/one.xml");
		ApplicationContext child = new ClassPathXmlApplicationContext(
				new String[] { "classpath:com/alstom/spring/config/spring-core.xml" }, parent);
		Person person = child.getBean(Person.class);
		Address address = child.getBean(Address.class);
		person.displayPerson();
		address.displayAddress();
		((AbstractApplicationContext) child).close();
		((AbstractApplicationContext) parent).close();
	}
}
