package com.alstom.spring.core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean , DisposableBean{

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

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("4m checkProperties");
		if (pid == null) {
			throw new Exception("Supply PID value");
		}

	}

	public void destroy() throws Exception {
		
	}
}
