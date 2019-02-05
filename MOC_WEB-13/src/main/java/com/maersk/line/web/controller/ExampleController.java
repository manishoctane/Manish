package com.maersk.line.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("example")
public class ExampleController {
	@RequestMapping(method=RequestMethod.GET)
	public void display(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request);
		System.out.println(response);
		String name = "Rajiv";
		request.setAttribute("name", name );
	}
}
