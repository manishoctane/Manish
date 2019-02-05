package com.alstom.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	@Value("20")
	private Integer pid;
	@Value("Anil")
	private String name;
//	@Resource
	@Inject
	private Address address;
	@PostConstruct
	public void checkInit() {
		if(pid==null) {
			throw new RuntimeException("PID is required");
		}
	}
	@PreDestroy
	public void destroy() {
		System.err.println("Object is Destroy");
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
