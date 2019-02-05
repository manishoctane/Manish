package com.alstom.spring.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("spring-core.xml");
//		 Same method with different signature parameter is Overloding.
//		Person person = (Person) container.getBean("person");
//		Person person = container.getBean(Person.class);
		Person person = container.getBean("person1", Person.class);
		person.display();
	}

}
