package com.maersk.line.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayController {
	@RequestMapping(path="display",method=RequestMethod.GET)
	public String display(HttpServletRequest request) {
		String name = "Rajiv";
		request.setAttribute("name", name );
		return "display";
	}
	@RequestMapping(path="employee",method=RequestMethod.GET)
	public ModelAndView getModelAndView() {
		String employeeName = "Bharat";
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("employee");
		modelAndView.addObject("name", employeeName);
		return modelAndView;
	}
	
	@RequestMapping(path="student",method=RequestMethod.GET)
	public String getModel(Model model) {
		String studentName = "Chandu";
		model.addAttribute("name", studentName);
		return "student";
	}
}
