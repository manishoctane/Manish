package com.maersk.line.rcm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maersk.line.rcm.domain.Employee;
import com.maersk.line.rcm.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(path="employee",method=RequestMethod.GET)
	public String displayEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeform";
	}
	@RequestMapping(path="employee",method=RequestMethod.POST)
	public String processEmployeeForm(@Valid Employee employee,Errors errors) {
		if(errors.hasErrors()) {
			return "employeeform";
		}
		employeeService.save(employee);
		return "display";
	}
	@RequestMapping(path="search",method=RequestMethod.GET)
	public String searchEmployee(Model model) {
		model.addAttribute("eno", new Employee());
		return "empsearch";
	}
	@RequestMapping(path="search",method=RequestMethod.POST)
	public String displayEmployeeData() {
		
		return "empdisplay";
		
	}
}
