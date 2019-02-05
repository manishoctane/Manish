package com.maersk.line.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController implements Controller {

	private ModelAndView modelAndView;

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(request.getMethod());

		if (request.getMethod().equals("POST")) {
			modelAndView = new ModelAndView("one").addObject("uname", "Anil");

		} else {

			modelAndView = new ModelAndView("error");
		}
		return modelAndView;

	}

}
