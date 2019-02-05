package com.maersk.line.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(path="welcome")
	public String display() {
		System.out.println("display()_GET");
		return "one";
	}
}
