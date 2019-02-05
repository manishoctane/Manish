package com.alstom.spring.core;

public class Person {
	private Integer pid;
	private String name;
	private Address address;

	public Person() {
		System.err.println("Person Object is Created");
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
