package com.maersk.line.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path ="/welcome")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello() {
		System.out.println("sayHello().GET");
		return "one";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String sayBye() {
		System.out.println("sayBye().POST");
		return "two";
	}
}
