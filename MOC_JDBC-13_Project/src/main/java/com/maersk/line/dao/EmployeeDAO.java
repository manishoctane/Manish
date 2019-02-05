package com.maersk.line.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.maersk.line.entity.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

//	public int save(Employee employee) {
//		String query = "insert into emp_tbl values(?,?,?)";
//		return jdbcTemplate.update(query, employee.getEno(), employee.getName(), employee.getSalary());
//	}
//	
//	public List<Employee> findAllEmployee() {
//		String query = "select * from emp_tbl";
//		return jdbcTemplate.query(query, (rs, rowNum) -> {
//			return new Employee(rs.getInt("eno"),rs.getString("name"), rs.getDouble("salary"));
//		});
//	}
//	
//	public Employee findById(Integer eno) {
//		String query = "select * from emp_tbl where eno = ?";
//		return jdbcTemplate.queryForObject(query , (rs,rowNUm) ->{
//			return new Employee(rs.getInt("eno"),rs.getString("name"), rs.getDouble("salary"));
//		}, eno);	
//	}
//	
	public Employee findByName(String name) {
		String query="select * from emp_tbl where name = ?";
		return jdbcTemplate.queryForObject(query, (rs, rowNuym)->{
			return new Employee(rs.getInt("eno"), rs.getString("name"), rs.getDouble("salary"));
		}, name);		
	}
}
