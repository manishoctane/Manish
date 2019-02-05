package com.maersk.line.web.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "reg")
public class RegistrationFormController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayEmployeeForm(Model model) {
		model.addAttribute("registration", new Registration());
		model.addAttribute("time", new Date());
		return "RegistrationFinal";
		
	}
//	Data Binding Error Code Validation
	@RequestMapping(method = RequestMethod.POST)
	public String processEmployeeDataForm(@Valid Registration registration, Errors error) {
		System.out.println("We are calling Service Layer and Stored in DB");
		System.out.println(error.getErrorCount());
		System.out.println(error.hasErrors());
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


