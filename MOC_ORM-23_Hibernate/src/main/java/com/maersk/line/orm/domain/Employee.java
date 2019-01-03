package com.maersk.line.orm.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EMP_TBL",schema="BRAINWAVZ")
public class Employee {
	@Id
	private Integer eno;
	private String name;
	private Double salary;
}
