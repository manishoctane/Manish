package com.alstom.log4j.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class RetrieveData {
	private Logger logger = Logger.getLogger(RetrieveData.class);
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultSet;

	public ArrayList<Employee> getEmployeeData() {
		logger.info("Entered into getEmployeeData()");
		ArrayList<Employee> empList = new ArrayList<>();
		try {
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "brainwavz", "matriux");
			logger.debug("Got the Connection from Database");
			String sql = "select * from emp_tbl";
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			logger.debug("Got the Resultset from Database");
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEno(resultSet.getString(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getString(3));
				empList.add(employee);
			}
		} catch (SQLException e) {
			logger.error(e.getMessage());
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
				logger.debug("Connection Close from Database");
			} catch (SQLException e) {
				logger.error(e.getMessage());
			}

		}
		logger.info("Completed getEmployeeData");
		return empList;
	}
}
