package com.maersk.line.web;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;

public class ContextLoaderListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext =sce.getServletContext();
		String value = servletContext.getInitParameter("contextConfigLocation");
		ApplicationContext parentContainer = null;
		if(value != null) {
//			new XmlWebApplicationContext(value);
		}else {
//			new XmlWebApplicationContext("applicationContext.xml");
		}
		servletContext.setAttribute("parentContainer", parentContainer);
	}
}
