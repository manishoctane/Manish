package com.maersk.line.rcm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maersk.line.rcm.dao.EmployeeDAO;
import com.maersk.line.rcm.domain.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public void save(Employee employee) {
		var salaryBeforeTax = employee.getSalary();
		var taxAmount = salaryBeforeTax*0.30;
		var salaryAfterTax = salaryBeforeTax - taxAmount;
		employee.setSalary(salaryAfterTax);
		employee.setTax(taxAmount);
		employeeDAO.save(employee);
	}
}
