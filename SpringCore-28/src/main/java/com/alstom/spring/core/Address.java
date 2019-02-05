package com.alstom.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class Address {
	@Value("Hyd")
	private String city;
	@Value("TS")
	private String State;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + "]";
	}
	
	
}
