package com.maersk.line.orm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maersk.line.orm.dao.EmployeeDAO;
import com.maersk.line.orm.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override @Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

}
