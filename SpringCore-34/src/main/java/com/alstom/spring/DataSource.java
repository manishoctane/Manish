package com.alstom.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/alstom/config/db.properties")
public class DataSource {
	@Autowired
	private Environment environment;
	
	public void display() {
		String password = environment.getProperty("db.password");
		System.out.println(password);
	}
	
}
