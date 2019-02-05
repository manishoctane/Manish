package com.maersk.line.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "emp")
public class EmployeeFormController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "empform";

	}
//	Data Binding Error Code Validation
	@RequestMapping(method = RequestMethod.POST)
	public String processEmployeeDataForm(Employee employee, Errors error) {
		System.out.println("We are calling Service Layer and Stored in DB");
		System.out.println(error.getErrorCount());
		System.out.println(error.hasErrors());
		System.out.println(employee.getEno());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
			if(employee.getName().equals("")||employee.getName().length()<=0) {
			error.rejectValue("name", "name.required", "***Name***");
				
			}
		if(error.hasErrors()) {
			System.out.println(error.getAllErrors());
			return "empform";
		}
		return "display";

	}
	
	@RequestMapping(path = "*")
	public String displayErrorPages() {
		return "error";
	}
}


