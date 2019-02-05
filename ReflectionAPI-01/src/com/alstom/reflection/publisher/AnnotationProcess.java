package com.alstom.reflection.publisher;

import java.lang.annotation.Annotation;

public class AnnotationProcess {

	public static void main(String[] args) {
		Class<Book> cls = Book.class;
		Annotation[] annotations = cls.getAnnotations(); //Due to Annotated Element
		for (Annotation annotation : annotations) {
			if (annotation instanceof Author) {
				Author author = (Author) annotation;
				System.err.println(author.name());
			}
			if (annotation instanceof Version) {
				Version version = (Version) annotation;
				System.err.println(version.number());
			}
		}
	}

}
