package com.alstom.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyImplOne implements MyInterface{

	public void doSomeWork() {
		System.out.println("We are do SomeWork() in MyImplOne");
	}

}
