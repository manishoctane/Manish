package com.maersk.line.orm.utils;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.maersk.line.orm.domain.Employee;

@Configuration
public class LocalSessionFactoryBeanUtils {
	
	private Properties properties() {
		return (Properties) new Properties().setProperty("hibernate.show_sql", "true");	
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactoryBean(@Autowired DataSource dataSource) {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setAnnotatedClasses(Employee.class);
		sessionFactoryBean.setHibernateProperties(properties());
		return sessionFactoryBean;
	}
}
