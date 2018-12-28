package com.maersk.line.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.maersk.line.orm.domain.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveEmployeeData(Employee employee) {
		hibernateTemplate.save(employee);
	}

	public Employee findByEmployeeId(Integer eno) {
		Employee employee = new Employee();
		hibernateTemplate.load(employee, eno);
		return employee;
	}
}
