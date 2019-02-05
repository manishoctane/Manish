package com.maersk.line.rcm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
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
	
	public List<Employee> findByEno(Integer eno){
		String query = "select * from emp_tbl";
		if(eno != null) {
			query = query + "Where eno = ?";
		}
		System.out.println(query);
		return getJdbcTemplate().query(query, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setEno(rs.getInt("eno"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				return employee;
			}
		} );
	}
}
