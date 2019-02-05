package com.alstom.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyImplTwo implements MyInterface {

	public void doSomeWork() {
		System.out.println(" We are doSomeWork() in MyImplTwo");
	}

}
