package com.alstom.reflection.process;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationProcessing {

	public static void main(String[] args) {
		Class<COne> cls = COne.class;
//		Annotation[] annotations2 = cls.getAnnotations();
//		int length = annotations2.length;
//		System.err.println(length);
		try {
			Method method = cls.getMethod("methodOne", null);
			Annotation[] annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
//				System.err.println(myAnnotation.eno()+" "+ myAnnotation.name());
				if(myAnnotation.name().equalsIgnoreCase("rahul")){
					System.exit(420);
				}else {
				System.err.println(myAnnotation.eno()+" "+ myAnnotation.name());
				}
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
