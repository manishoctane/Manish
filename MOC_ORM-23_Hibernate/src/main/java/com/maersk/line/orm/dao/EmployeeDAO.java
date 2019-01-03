package com.maersk.line.orm.dao;

import java.util.List;

import com.maersk.line.orm.domain.Employee;

public interface EmployeeDAO {

	public List<Employee> findById();
	
	public List<Employee> findBySalary(); 
}
