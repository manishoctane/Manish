package com.alstom.log4j.orm;

import java.util.ArrayList;

import org.apache.log4j.Logger;

public class ProcessData {
	private Logger logger = Logger.getLogger(ProcessData.class);

	public ArrayList<Employee> getData() {
		logger.info("Get Data From Retrieve Data");
		RetrieveData retrieveData = new RetrieveData();
		ArrayList<Employee> employeeData = retrieveData.getEmployeeData();
		return employeeData;
	}
}
