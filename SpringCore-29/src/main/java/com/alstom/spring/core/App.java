package com.alstom.spring.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ResourceBundleMessageSource;

public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
//       Properties properties = System.getProperties(); // new Properties();
//       properties.load(new FileInputStream("db.properties"));
//       String driver = properties.getProperty("db.driver");
//       System.err.println(driver);
    	
    	DefaultListableBeanFactory container = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
    	reader.loadBeanDefinitions("spring.xml");
    	ResourceBundleMessageSource source = container.getBean("messageSource", ResourceBundleMessageSource.class);
    	String message = source.getMessage("db.driver", null, null);
    	System.err.println(message);
    	
    }
}
