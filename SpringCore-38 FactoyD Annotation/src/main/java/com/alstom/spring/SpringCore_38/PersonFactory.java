package com.alstom.spring.SpringCore_38;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonFactory {
//	@Bean("rajiv")
	@Bean
	public Person person() {
		return new Person();
	}
	
}
