package com.alstom.log4j.orm;

import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;

public class DisplayData {
	public static void main(String[] args) {
		Logger logger = Logger.getRootLogger();
		logger.info("Project Started : " + new Date());
		ProcessData processData = new ProcessData();
		ArrayList<Employee> empList = processData.getData();
		logger.info("size is : " + empList);
		logger.info("No of Employee Retrieve : " + empList.size());
		for (Employee employee : empList) {
			System.out.print(employee.getEno() + "\t");
			System.out.print(employee.getName() + "\t");
			System.out.println(employee.getSalary());
		}
		logger.info("Project Completed");
	}

}
