package com.maersk.line.rcm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MOCInternalResourceViewResolver {
	@Bean
	public InternalResourceViewResolver viewResolver(@Autowired Environment environment) {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix(environment.getProperty("web.prefix"));
		viewResolver.setSuffix(environment.getProperty("web.suffix"));
		return viewResolver;
	}
}
