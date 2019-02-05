package com.alstom.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Address {
	private String city;
	private String state;

	public String getCity() {
		return city;
	}

	@Value("Hyd")
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	@Value("TS")
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
