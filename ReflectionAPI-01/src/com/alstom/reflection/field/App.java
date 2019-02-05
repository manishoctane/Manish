package com.alstom.reflection.field;

import java.lang.reflect.Field;

public class App {

	public static void main(String[] args) {
		PrivateObject privateObject = new PrivateObject("The Private Value");

		Field privateStringField;
		try {
			privateStringField = PrivateObject.class.getDeclaredField("privateString");
			privateStringField.setAccessible(true);
			String fieldValue = (String) privateStringField.get(privateObject);
			System.out.println("fieldValue = " + fieldValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}


	}

}
