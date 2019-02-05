package com.alstom.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("db.properties")
public class DataSource {
	@Autowired
	private Environment environment;
	
	public void display() {
		String username = environment.getProperty("db.username");
		System.err.println(username);
	}
}
