package com.maersk.line.orm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maersk.line.orm.dao.EmployeeDAO;
import com.maersk.line.orm.domain.Employee;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void save(Employee employee) {
		employeeDAO.saveEmployeeData(employee);
	}
	
	public Employee findById(Integer eno) {
		return employeeDAO.findByEmployeeId(eno);
//		Employee employee = employeeDAO.findByEmployeeId(eno);
//		 System.out.println(employee);
//		 return employee;
	}
}
