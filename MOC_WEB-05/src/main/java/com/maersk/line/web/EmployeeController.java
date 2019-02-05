package com.maersk.line.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EmployeeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Anil", 1000d));
		empList.add(new Employee(2, "Bharat", 2000d));
		empList.add(new Employee(3, "Chandu", 3000d));
		empList.add(new Employee(4, "Dharma", 4000d));
		return new ModelAndView("employee.jsp").addObject("empList",empList);
	}

}
