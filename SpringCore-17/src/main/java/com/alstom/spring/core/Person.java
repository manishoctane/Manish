package com.alstom.spring.core;

public class Person {

	private Address address;

	public Person(Address address) {
		this.address = address;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public void payMoney() {
		address.payMoneyOnElecProm();
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}

}
