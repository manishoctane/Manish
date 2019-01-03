package com.maersk.line.orm.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.maersk.line.orm.domain.Employee;

@Configuration
public class LocalSessionFactoryBeanUtil {

	@Bean
	public LocalSessionFactoryBean sessionFactoryBean(@Autowired DataSource	dataSource) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setAnnotatedClasses(Employee.class);
		sessionFactory.setHibernateProperties(properties());
		return sessionFactory;
	}
	
	private Properties properties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}
}
