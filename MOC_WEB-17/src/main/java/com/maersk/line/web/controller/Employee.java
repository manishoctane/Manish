package com.maersk.line.web.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String eno;
	private String name;
	private String salary;
	public Employee() {
		System.out.println("Employee Object is Created");
	}

}
