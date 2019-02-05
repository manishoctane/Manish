package com.maersk.line.web.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "display")
public class SampleController {
	@RequestMapping(method=RequestMethod.GET)
	public String employeeForm() {
		return "sampleform";
	}
//	@RequestMapping(method=RequestMethod.POST)
//	public String processEmployee(
//			Integer eno,
//			String name,
//			Double salary
//			) {
//		System.out.println("SampleController");
//		System.out.println("Eno : "+eno);
//		System.out.println("Name : "+name);
//		System.out.println("Salary : "+salary);
//		return "sampledisplay";
//	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String processEmployeeData(
			@RequestParam(name="eno") Integer employeeNo,
			@RequestParam(name="name") String employeeName,
			@RequestParam(name="salary") Double employeeSalary
			) {
		System.out.println("SampleController");
		System.out.println("Eno : "+employeeNo);
		System.out.println("Name : "+employeeName);
		System.out.println("Salary : "+employeeSalary);
		return "sampledisplay";
	}
}
