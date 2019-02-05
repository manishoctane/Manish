package com.alstom.spring.core;

public class Person {
	private Integer pid;
	private String name;
	private Double salary;

	public Person() {
		super();
		System.err.println("Object is Created !!");
	}

	public void display() {
		System.err.println(pid + " " + name + " " + salary);
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
