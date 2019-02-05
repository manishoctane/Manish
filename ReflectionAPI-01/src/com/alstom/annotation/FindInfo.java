package com.alstom.annotation;

import java.lang.reflect.Method;

public class FindInfo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {

		Class<?> cls = Class.forName("com.alstom.annotation.COne");
		Method method = cls.getMethod("methodOne", null);
		System.out.println(method.getName());
	}

}
