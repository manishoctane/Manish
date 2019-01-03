package com.maersk.line.orm.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.maersk.line.orm.domain.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void save(Employee employee) {
		entityManager.persist(employee);
	}
}
