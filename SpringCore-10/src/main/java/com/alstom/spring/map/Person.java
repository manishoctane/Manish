package com.alstom.spring.map;

import java.util.Map;

public class Person {
	private Map<Integer, String> details;

	public Map<Integer, String> getDetails() {
		return details;
	}

	public void setDetails(Map<Integer, String> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Person [details=" + details + "]";
	}
	
}

