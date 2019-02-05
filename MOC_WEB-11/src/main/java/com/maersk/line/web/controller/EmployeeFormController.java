package com.maersk.line.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("employee")
public class EmployeeFormController {
	@RequestMapping(method=RequestMethod.GET)
	public String displayEmployeeForm() {
		System.out.println("displayEmployeeForm()_GET");
		return "employee";
	}
	@RequestMapping(method=RequestMethod.POST,produces="application/json")
	public String processEmployeeData() {
		System.out.println("processEmployeeData()_POST");
		return "display";
	}
}
