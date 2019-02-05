package com.alstom.annotation.processing;

import java.lang.annotation.Annotation;

public class App {
	public static void main(String[] args) {
		Class<COne> cls = COne.class;
		 Annotation[] annotations = cls.getAnnotations();
		 int length = annotations.length;
		System.err.println(length);
	}
}
