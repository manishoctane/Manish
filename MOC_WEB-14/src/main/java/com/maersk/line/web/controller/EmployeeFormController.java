package com.maersk.line.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("emp")
public class EmployeeFormController {
	@RequestMapping(method = RequestMethod.GET)
	public String displayEmployeeForm() {
		System.out.println("displayEmployeeForm()_GET");

		return "empform";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String processEmployeeData(HttpServletRequest request) {
		System.out.println("processEmployeeData()_POST");
		System.out.println(request.getParameter("eno"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("salary"));
		return "success";

	}
}
