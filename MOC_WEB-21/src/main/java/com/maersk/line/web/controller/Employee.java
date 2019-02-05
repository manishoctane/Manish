package com.maersk.line.web.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employee {
	@NotNull(message= "{message.id.NotNull}")
	private Integer eno;
	@Size(min=5, max=20, message = "{user.name.invalid}")
	@NotEmpty(message="Name is Reqiured")
	@Pattern(message="Invalid data", regexp="[a-zA-Z]*")
	private String name;
	@NotNull(message="{message.salary.NotNull}")
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
