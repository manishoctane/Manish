package com.alstom.spring.core;

import org.springframework.beans.factory.annotation.Required;

public class Person {

	private Integer pid;
	private String name;

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

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}

}
