package com.alstom.spring.core;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	@Value("10")
	private Integer pid;
	@Value("Anil")
	private String name;
//	@Autowired(required=false)
	private Address address;

	@Inject
	public Person(Address address) {
		super();
		this.address = address;
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

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}

}
