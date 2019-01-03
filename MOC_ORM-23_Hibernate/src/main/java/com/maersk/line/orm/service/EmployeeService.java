package com.maersk.line.orm.service;

import java.util.List;

import com.maersk.line.orm.domain.Employee;

public interface EmployeeService {

	public List<Employee> findById();

	public List<Employee> findBySalary();
}
