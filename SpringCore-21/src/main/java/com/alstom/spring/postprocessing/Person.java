package com.alstom.spring.postprocessing;

import org.springframework.beans.factory.annotation.Required;


public class Person {

	private Integer pid;
	private String name;
	private Address address;

	public Integer getPid() {
		return pid;
	}

	@Required
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	@Required
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}

}
