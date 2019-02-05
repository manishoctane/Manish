package com.alstom.reflection;

import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = Class.forName("com.alstom.reflection.CTwo");
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
