package com.maersk.line.orm.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

@Configuration
public class HibernateTransactionManagerUtil {
	@Bean
	public HibernateTransactionManager transactionManager(@Autowired SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
}
