package com.maersk.line.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maersk.line.dao.EmployeeDAO;
import com.maersk.line.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	public int calcSalaryAfterTax(Employee employee) {
		Double salary = employee.getSalary();
		Double taxSalary = (salary * 30) / 100;
		Double newSalary = salary - taxSalary;
		employee.setSalary(newSalary);
		return employeeDAO.save(employee);
	}
	public List<Employee> getAllEmployee(){
		return employeeDAO.findAllEmployee();
	}
	
	public Employee findById(Integer eno) {
		return employeeDAO.findById(eno);
	}
}
