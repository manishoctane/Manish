package com.alstom.spring.core;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@Lazy(value=false)
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Person {
	
	private Integer pid;
	private String name;

	public Person() {
		System.out.println("Person Object");
	}
	
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
