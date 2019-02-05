package com.alstom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.alstom.entity.Employee;

public class EmployeeDAO {


	public void save(Employee employee) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","brainwavz","matriux");

			String sql = "insert into emp_tbl values(?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, employee.getEno());
			prepareStatement.setString(2, employee.getName());
			prepareStatement.setDouble(3, employee.getSalary());
			prepareStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 

	}
}
