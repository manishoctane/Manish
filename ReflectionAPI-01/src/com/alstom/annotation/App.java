package com.alstom.annotation;

import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		Class<COne> cls = COne.class;
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
