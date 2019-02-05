package com.maersk.line.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maersk.line.dao.EmployeeDAO;
import com.maersk.line.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public void saveEmployeeData(Employee employee) {
		employeeDAO.save(employee);
	}
}
