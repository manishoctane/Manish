package com.alstom.spring.arraylist;

import java.util.ArrayList;

public class Person {
	private Integer pid;
	private ArrayList<Integer> names;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public ArrayList<Integer> getNames() {
		return names;
	}

	public void setNames(ArrayList<Integer> names) {
		this.names = names;
	}

	public void displayPerson() {
		System.err.println(pid);
		System.err.println(names);
	}
}
