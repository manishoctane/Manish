package com.alstom.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDAO {
	
	@Autowired
	@Qualifier("myImplTwo")
	public MyInterface myInterface;
	
	public void display() {
		myInterface.doSomeWork();
	}
}
