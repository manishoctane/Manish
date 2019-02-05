package com.maersk.line.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "emp")
public class EmployeeFormController {
	@RequestMapping(method = RequestMethod.GET)
	public String displayEmployeeForm() {
		return "empform";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String processEmployeeDataForm(Employee employee) {
		System.out.println("We are calling Service Layer and Stored in DB");
		System.out.println(employee.getEno());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		return "display";

	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	public String processEmployeeFormData(Employee employee,Model model) {
//		System.out.println("We are calling Service Layer and Stored in DB");
//		System.out.println(employee.getEno());
//		System.out.println(employee.getName());
//		System.out.println(employee.getSalary());
//		return "display";
//
//	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	public String processEmployeeForm(Employee employee,Model model) {
//		System.out.println("We are calling Service Layer and Stored in DB");
//		System.out.println(employee.getEno());
//		System.out.println(employee.getName());
//		System.out.println(employee.getSalary());
//		model.addAttribute("employee", employee);
//		return "display";
//
//	}

	@RequestMapping(path = "*")
	public String displayErrorPages() {
		return "error";
	}
}
