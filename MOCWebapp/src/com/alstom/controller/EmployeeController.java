package com.alstom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alstom.entity.Employee;
import com.alstom.service.EmployeeService;


@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String eno = request.getParameter("eno");
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		
		
		Employee employee = new Employee();
		employee.setEno(Integer.parseInt(eno));
		employee.setName(name);
		employee.setSalary(Double.parseDouble(salary));
		
		EmployeeService employeeService = new EmployeeService();
		employeeService.save(employee);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
