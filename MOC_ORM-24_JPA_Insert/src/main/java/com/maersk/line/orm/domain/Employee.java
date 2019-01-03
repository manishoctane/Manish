package com.maersk.line.orm.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the EMP_TBL database table.
 * 
 */
@Data
@Entity
@Table(name="EMP_TBL",schema="BRAINWAVZ")
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer eno;

	private String name;

	private Double salary;

}