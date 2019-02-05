package com.maersk.line.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public abstract class GenericController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getMethod().equals("GET")) {
			return new ModelAndView("error");
		} else {
			return  handleRequestInternal(request, response);
		}
	}
	protected abstract ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response);

}
