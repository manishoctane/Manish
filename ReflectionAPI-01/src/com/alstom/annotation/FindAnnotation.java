package com.alstom.annotation;

import java.lang.annotation.Annotation;

public class FindAnnotation {
	public static void main(String[] args) {
		Class<COne> cls = COne.class;
		 Annotation[] annotations = cls.getAnnotations();
		 int length = annotations.length;
		System.err.println(length);
	}
}
