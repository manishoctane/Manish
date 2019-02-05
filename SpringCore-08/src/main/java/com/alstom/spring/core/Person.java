package com.alstom.spring.core;

public class Person {
	private Integer pid;
	private String name;

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
	public void displayPerson() {
		System.err.println(pid);
		System.err.println(name);
	}
}
