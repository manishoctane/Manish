package com.alstom.spring.core;

public class Person {
	private Integer pid;
	private String name;
	private double salary;
	
	public Person() {
		super();
		System.err.println("Object is Created");
	}
	public void display() {
		System.err.println(pid);
		System.err.println(name);
		System.err.println(salary);
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
