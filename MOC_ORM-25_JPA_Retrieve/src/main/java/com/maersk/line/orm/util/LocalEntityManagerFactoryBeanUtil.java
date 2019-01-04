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
	public LocalEntityManagerFactoryBean managerFactoryBean() {
		LocalEntityManagerFactoryBean managerFactoryBean = new LocalEntityManagerFactoryBean();
		managerFactoryBean.setPersistenceUnitName("MOC_ORM-25_JPA_Retrieve");
		return managerFactoryBean;
}
}