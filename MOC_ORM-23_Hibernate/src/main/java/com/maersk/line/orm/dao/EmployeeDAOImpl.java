package com.maersk.line.orm.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.maersk.line.orm.domain.Employee;

@Repository
public class EmployeeDAOImpl extends HibernateDaoSupport implements EmployeeDAO {
	@Autowired
	public EmployeeDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@Override
	public List<Employee> findById() {
		return getHibernateTemplate().loadAll(Employee.class);
	}

	@Override
	public List<Employee> findBySalary() {
		String query = "select e from Employee e where e.salary>10000 and e.salary<30000";
		return getHibernateTemplate()
				.getSessionFactory()
				.openSession()
				.createQuery(query, Employee.class)
				.getResultList();
	}

}
