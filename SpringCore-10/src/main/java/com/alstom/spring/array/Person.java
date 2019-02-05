package com.alstom.spring.array;

import java.util.Arrays;

public class Person {
	private String[] names;
	
	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public void displayPerson() {
		System.err.println(names);
	}

	@Override
	public String toString() {
		return "Person [names=" + Arrays.toString(names) + "]";
	}

}

