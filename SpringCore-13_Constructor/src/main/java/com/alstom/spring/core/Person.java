package com.alstom.spring.core;

public class Person {
	private Integer pid;
	private String name;

	public Person(Integer pid, String name) {
		this.pid = pid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}

}
