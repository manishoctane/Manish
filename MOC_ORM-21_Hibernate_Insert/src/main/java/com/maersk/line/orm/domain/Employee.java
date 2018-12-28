package com.maersk.line.orm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EMP_TBL",schema="BRAINWAVZ")
public class Employee {
	@Id
	@Column(name="eno")
	private Integer id;
	private String name;
	private Double salary;
}
