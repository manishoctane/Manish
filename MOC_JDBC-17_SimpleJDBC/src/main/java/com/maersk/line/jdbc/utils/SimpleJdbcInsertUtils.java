package com.maersk.line.jdbc.utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
public class SimpleJdbcInsertUtils {
	@Bean
	public SimpleJdbcInsert simpleJdbcInsert(@Autowired DataSource dataSource) {
		return new SimpleJdbcInsert(dataSource);
	}
}
