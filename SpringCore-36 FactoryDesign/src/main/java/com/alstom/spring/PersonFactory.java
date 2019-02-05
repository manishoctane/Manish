package com.alstom.spring;

public class PersonFactory {

	public static Person createPerson() {
		Person person = new Person();
		return person;
	}
}
