package com.maersk.line.orm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.Data;
@Data
@Entity
@Proxy(lazy=false)
@Table(name="EMP_TBL", schema="BRAINWAVZ")
public class Employee {
	@Id
	@Column(name="eno")
	private Integer id;
	private String name;
	private Double salary;
	
}
