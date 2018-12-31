package com.maersk.line.orm.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.maersk.line.orm.domain.Employee;

@Repository
public class EmployeeDAOImpl extends HibernateDaoSupport implements EmployeeDAO{
	@Autowired
	public EmployeeDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	@Override
	public void save(Employee employee) {
		getHibernateTemplate().save(employee);
	}

}
