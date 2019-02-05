package com.alstom.reflection.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FinePrivateMethod {

	public static void main(String[] args) {
		PrivateObject privateObject = new PrivateObject("The Private Value");

		Method privateStringMethod;
		try {
			privateStringMethod = PrivateObject.class.getDeclaredMethod("getPrivateString", null);
			privateStringMethod.setAccessible(true);
			String returnValue = (String) privateStringMethod.invoke(privateObject, null);
			System.out.println("returnValue = " + returnValue);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
