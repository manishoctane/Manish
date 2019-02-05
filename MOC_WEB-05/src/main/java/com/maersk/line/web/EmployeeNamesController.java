package com.maersk.line.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EmployeeNamesController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<String> empList = new ArrayList<>();
		empList.add("Anil");
		empList.add("Bharat");
		empList.add("Chandu");
		empList.add("Dharma");
		
		return new ModelAndView("display.jsp").addObject("names", empList);
	}

}
