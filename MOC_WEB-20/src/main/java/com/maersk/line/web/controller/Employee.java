package com.maersk.line.web.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employee {

	private Integer eno;
	private String name;
	private Double salary;
	public Employee() {
		System.out.println("Employee Object is Created");
	}
	public Employee(Integer eno) {
		this.eno = eno;
	}
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	

}
