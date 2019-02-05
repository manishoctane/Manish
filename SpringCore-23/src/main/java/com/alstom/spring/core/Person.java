package com.alstom.spring.core;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

//@Configuration("pd")
@Configuration
public class Person {

	private Integer pid;
	private String name;

	public Integer getPid() {
		return pid;
	}

	@Required
	@Value(value="10")
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	@Required
	@Value(value="Anil")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}

}
