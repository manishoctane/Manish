package com.maersk.line.orm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maersk.line.orm.dao.EmployeeDAO;
import com.maersk.line.orm.domain.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;
	@Override
	public List<Employee> findById() {
		return employeeDAO.findById();
	}

	@Override
	public List<Employee> findBySalary() {
		return employeeDAO.findBySalary();
	}

}
