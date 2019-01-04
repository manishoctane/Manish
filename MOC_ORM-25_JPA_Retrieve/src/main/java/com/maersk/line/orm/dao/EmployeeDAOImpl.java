package com.maersk.line.orm.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.maersk.line.orm.domain.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Employee findById(Integer eno) {
		return entityManager.find(Employee.class, eno);

	}

}
