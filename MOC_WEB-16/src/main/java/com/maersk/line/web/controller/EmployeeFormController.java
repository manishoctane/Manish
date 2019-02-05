package com.maersk.line.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeFormController {
	@GetMapping(path="/emp/{id}")
	public String display(@PathVariable(name="id") Integer id) {
		System.out.println("GET : "+id);
		return "one";
	}
}
