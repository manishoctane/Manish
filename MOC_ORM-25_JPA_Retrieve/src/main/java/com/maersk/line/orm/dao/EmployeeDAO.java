package com.maersk.line.orm.dao;

import com.maersk.line.orm.domain.Employee;

public interface EmployeeDAO {

	public Employee findById(Integer eno);
}
