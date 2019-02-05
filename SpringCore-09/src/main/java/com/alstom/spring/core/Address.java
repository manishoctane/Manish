package com.alstom.spring.core;

public class Address {
private String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
public void displayAddress() {
	System.err.println(city);
}

}
