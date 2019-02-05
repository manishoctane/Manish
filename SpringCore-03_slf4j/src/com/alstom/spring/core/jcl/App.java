package com.alstom.spring.core.jcl;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("spring-core.xml");
		container.getBean("person");
		container.getBean("person");
		container.getBean("person");
	}

}
