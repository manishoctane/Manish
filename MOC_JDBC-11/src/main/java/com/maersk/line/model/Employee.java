package com.maersk.line.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor 
public class Employee {
	
	private Integer eno;
	private String name;
	private Double salary;
	
}
