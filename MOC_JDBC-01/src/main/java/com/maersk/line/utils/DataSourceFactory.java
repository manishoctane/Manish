package com.maersk.line.utils;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.maersk.line"})
@PropertySource(value= {"com//maersk//line//config//application.properties"})
public class DataSourceFactory {

	@Bean
	public DataSource dataSource(Environment environment) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("dataSource.driver"));
		dataSource.setUrl(environment.getProperty("dataSource.url"));
		dataSource.setUsername(environment.getProperty("dataSource.username"));
		dataSource.setPassword(environment.getProperty("dataSource.password"));
		return dataSource;
	}
}
