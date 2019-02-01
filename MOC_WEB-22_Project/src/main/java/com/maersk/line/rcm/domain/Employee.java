package com.maersk.line.rcm.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Employee {
	@NotNull(message="Enter Employee Id")
	private Integer eno;
	@NotEmpty(message="Enter Employee Name")
	private String name;
	@NotNull(message="Enter Employee Salary")
	private Double salary;
	private Double tax;
}
