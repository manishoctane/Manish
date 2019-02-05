package com.alstom.service;

import com.alstom.dao.EmployeeDAO;
import com.alstom.entity.Employee;

public class EmployeeService {

	public void save(Employee employee) {
		Double salary = employee.getSalary();
		salary = salary - (salary*0.18);
		
		employee.setSalary(salary);
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.save(employee);
		
		
	}
}
