package com.alstom.reflection.method;

public class PrivateObject {

	private String privateString = null;

	public PrivateObject(String privateString) {
		this.privateString = privateString;
	}

	@SuppressWarnings("unused")
	private String getPrivateString() {
		return this.privateString;
	}
}