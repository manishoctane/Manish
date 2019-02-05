package com.alstom.spring.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class App {
	public static void main(String[] args) {
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
//		reader.loadBeanDefinitions(new ClassPathResource("spring-core.xml"));
		reader.loadBeanDefinitions(new FileSystemResource("D:\\CodinGame\\spring-core.xml"));
		Person person = container.getBean(Person.class);
		person.display();
		person.display();
	}
}
