package com.maersk.line.web.controller;

import lombok.Data;

@Data
public class Registration {

	private String fstname;
	private String middlename;
	private String lastname;
	
	private String fatherfstname;
	private String fathermiddlename;
	private String fatherlastname;
	
	private String motherfstname;
	private String mothermiddlename;
	private String motherlastname;
	
	private String sex;
	private String community;
	
	private String handicapp;
	
	private String dob;
	private String pob;
	private String sob;
	
	private String nationality;
	private String countryother;
	
	private String mobileno;
	private String mobileno_confirm;
	
	private String Email;
	private String confirmEmail;
	
	private String DesiredPassword;
	private String ConfirmPassword;
	
	
	
	
}
