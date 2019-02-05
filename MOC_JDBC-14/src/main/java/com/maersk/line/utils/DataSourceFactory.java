package com.maersk.line.utils;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.maersk.line")
@PropertySource("com/maersk/line/config/application.properties")
public class DataSourceFactory {
	
	@Bean
	public DataSource dataSource(Environment environment) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(environment.getProperty("dataSource.driveClass"));
		dataSource.setUrl(environment.getProperty("dataSource.url"));
		dataSource.setUsername(environment.getProperty("dataSource.username"));
		dataSource.setPassword(environment.getProperty("dataSource.password"));
		return dataSource;
	}
}
