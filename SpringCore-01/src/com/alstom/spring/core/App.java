package com.alstom.spring.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {

		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(container);
		beanDefinitionReader.loadBeanDefinitions("spring-core.xml");
		//Person person = container.getBean(Person.class);
		Object object = container.getBean("person");
		Person person = (Person)object;
		System.err.println(person.getPid());
		System.err.println(person.getName());
		System.err.println(person.getAddress());
	}

}
