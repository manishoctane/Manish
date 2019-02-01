package com.maersk.line.rcm.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MOCWebApplicationInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(MOCWebUtils.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		Dynamic register = servletContext.addServlet("ds", dispatcherServlet);
		register.setLoadOnStartup(1);
		register.addMapping("/");
		
	}

}
