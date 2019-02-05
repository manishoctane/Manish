package com.maersk.line.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maersk.line.entity.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

		public void saveEmployeeBatchData(List<Employee> empBatch) {
			String query = "insert into emp_tbl values(?,?,?)";
			jdbcTemplate.batchUpdate(query, new BatchPreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps, int i) throws SQLException {
					Employee employee = empBatch.get(i);
					ps.setInt(1, employee.getEno());
					ps.setString(2, employee.getName());
					ps.setDouble(3, employee.getSalary());
				}
				
				@Override
				public int getBatchSize() {
					return empBatch.size();
				}
			});
		}
	
}
