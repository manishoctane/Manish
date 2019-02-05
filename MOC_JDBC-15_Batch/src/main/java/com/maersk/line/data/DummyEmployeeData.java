package com.maersk.line.data;

import java.util.ArrayList;
import java.util.List;

import com.maersk.line.entity.Employee;

public class DummyEmployeeData {

	public static List<Employee> getEmployeeData() {
		List<Employee> empList = new ArrayList<>();
		Employee employee1 = new Employee(1, "Anil", 10000d);
		Employee employee2 = new Employee(2, "Bharat", 20000d);
		Employee employee3 = new Employee(3, "Chandu", 30000d);
		Employee employee4 = new Employee(4, "Dhanus", 40000d);
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		empList.add(employee4);
		return empList;
	}
}
