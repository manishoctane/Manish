package com.alstom.spring.core;

public class Address {
	private String state;
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}

}
