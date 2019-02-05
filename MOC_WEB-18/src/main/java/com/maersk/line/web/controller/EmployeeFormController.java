package com.maersk.line.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "emp")
public class EmployeeFormController {
	@RequestMapping(method = RequestMethod.GET)
	public String displayEmployeeForm() {
		return "empform";

	}
//	Data Binding Error Code Validation
	@RequestMapping(method = RequestMethod.POST)
	public String processEmployeeDataForm(Employee employee, Errors error,HttpServletRequest request) {
		System.out.println("We are calling Service Layer and Stored in DB");
		System.out.println(error.getErrorCount());
		System.out.println(error.hasErrors());
		
		System.out.println(employee.getEno());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		request.setAttribute("eno", request.getParameter("eno"));
			
		if(error.hasErrors()) {
			return "empform";
		}
		return "display";

	}
	
	@RequestMapping(path = "*")
	public String displayErrorPages() {
		return "error";
	}
}


//	User Define validation Code Write huge Amount Code...

//	@RequestMapping(method = RequestMethod.POST)
//	public String processEmployeeDataForm(Employee employee, Errors error) {
//		System.out.println("We are calling Service Layer and Stored in DB");
//		System.out.println(error.getErrorCount());
//		System.out.println(error.hasErrors());
//		
//		System.out.println(employee.getEno());
//		System.out.println(employee.getName());
//		System.out.println(employee.getSalary());
//		if(employee.getEno() <=0  ) {
//			error.rejectValue("", "", "Invalid Eno Value");
//		}
//		return "display";
//
//	}