package com.maersk.line.orm.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("{com.maersk.line.orm}")
@EnableTransactionManagement
public class LocalEntityManagerFactoryBeanUtil {
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalEntityManagerFactoryBean entityManagerFactory = new LocalEntityManagerFactoryBean();
		entityManagerFactory.setPersistenceUnitName("MOC_ORM-24_JPA_Insert");	
		return entityManagerFactory;
	}
}
