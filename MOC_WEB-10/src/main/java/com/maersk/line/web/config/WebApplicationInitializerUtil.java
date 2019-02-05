package com.maersk.line.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationInitializerUtil implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
		container.register(WebApplicationUtil.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(container);
		
		Dynamic register = servletContext.addServlet("ds", dispatcherServlet);
		register.setLoadOnStartup(1);
		register.addMapping("/");
				
	}

}
