package com.maersk.line.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	@RequestMapping(path="/fc",method=RequestMethod.GET)
	public String getDisplay() {
		System.out.println("from FirstController");
		return "one.jsp";
	}
}
