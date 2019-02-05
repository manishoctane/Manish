package com.alstom.spring.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("spring-core.xml");
		Person person1 = container.getBean("person1",Person.class);
		Person person2 = container.getBean("person2",Person.class);
		person1.display();
		person2.display();
	}

}
