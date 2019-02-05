package com.alstom.spring.core;

public class Person {
	private Integer pid;
	private String name;
	private Address address;

	public Person(Integer pid, String name, Address address) {
		super();
		this.pid = pid;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}

}
