package com.alstom.spring.core;

public class Person {

	private Integer pid;
	private String name;
	
	public Person(Integer pid) {
		this.pid = pid;
		System.err.println("Integer");
	}

	public Person(Integer pid, String name) {
		this.pid = pid;
		this.name = name;
		System.err.println("Integer, String");
	}

	public Person(String name, Integer pid) {
		this.pid = pid;
		this.name = name;
		System.err.println("String , Integer");
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}

}
