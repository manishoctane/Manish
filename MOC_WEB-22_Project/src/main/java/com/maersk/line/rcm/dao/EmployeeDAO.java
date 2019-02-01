package com.maersk.line.rcm.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.maersk.line.rcm.domain.Employee;

@Repository
public class EmployeeDAO extends JdbcDaoSupport {
	@Autowired
	public EmployeeDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	public void save(Employee employee) {
		String query = "insert into emp_tbl values(?,?,?)";
		getJdbcTemplate().update(query , employee.getEno(),employee.getName(),employee.getSalary());
	}
}
