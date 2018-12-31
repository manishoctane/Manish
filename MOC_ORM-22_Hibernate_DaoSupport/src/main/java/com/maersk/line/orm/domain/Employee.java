package com.maersk.line.orm.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="EMP_TBL", schema="BRAINWAVZ")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private Integer eno;
	private String name;
	private Double salary;
	
}
