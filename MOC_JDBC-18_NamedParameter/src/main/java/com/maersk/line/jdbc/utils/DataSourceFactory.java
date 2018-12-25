package com.maersk.line.jdbc.utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.maersk.line")
@PropertySource("com/maersk/line/jdbc/config/application.properties")
public class DataSourceFactory {

@Bean
	public DataSource dataSource(@Autowired Environment environment) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("dataSource.driveClass"));
		dataSource.setUrl(environment.getProperty("dataSource.url"));
		dataSource.setUsername(environment.getProperty("dataSource.username"));
		dataSource.setPassword(environment.getProperty("dataSource.password"));
		return dataSource;
		
	}
}
