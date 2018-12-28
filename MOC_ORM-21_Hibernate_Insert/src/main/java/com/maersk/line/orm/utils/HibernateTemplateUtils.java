package com.maersk.line.orm.utils;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

@Configuration
public class HibernateTemplateUtils {
	@Bean
	public HibernateTemplate hibernateTemplate(@Autowired SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
	}
}
