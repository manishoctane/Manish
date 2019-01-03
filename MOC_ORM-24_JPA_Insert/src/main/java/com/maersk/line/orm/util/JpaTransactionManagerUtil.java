package com.maersk.line.orm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class JpaTransactionManagerUtil {

	@Bean
	public JpaTransactionManager jpaTransactionManager(
			@Autowired LocalEntityManagerFactoryBean entityManagerFactoryBean) {
		return new JpaTransactionManager(entityManagerFactoryBean.getObject());

	}
}
