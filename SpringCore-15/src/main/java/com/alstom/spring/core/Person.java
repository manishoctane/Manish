package com.alstom.spring.core;

public class Person {
	double one;
	double two;

	public Person(int one, int two) {
		this.one = one;
		this.two = two;
		System.err.println("int int");
	}

	public Person(double one, double two) {
		this.one = one;
		this.two = two;
		System.err.println("double double");
	}

	@Override
	public String toString() {
		return "Person [one=" + one + ", two=" + two + "]";
	}

}
