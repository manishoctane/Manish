package com.maersk.line.jdbc.utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Configuration
public class SimpleJdbcCallTemplateUtils {
	@Bean
	public SimpleJdbcCall simpleJdbcCall(@Autowired DataSource dataSource) {
		return new SimpleJdbcCall(dataSource);
	}
}
