package com.alstom.spring.autowire;

public class Person {

	private Integer pid;
	private String name;
	private Address address;

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

	public void checkProperties() throws Exception {
		System.out.println("4m checkProperties");
		if (pid == null) {
			throw new Exception();
		}
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}
}
