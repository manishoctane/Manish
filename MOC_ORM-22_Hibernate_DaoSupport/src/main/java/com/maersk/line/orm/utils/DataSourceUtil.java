package com.maersk.line.orm.utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.maersk.line.orm")
@PropertySource("com/maersk/line/orm/config/application.properties")
@EnableTransactionManagement
public class DataSourceUtil {
	
	@Bean
	public DataSource dataSource(@Autowired Environment environment) {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(environment.getProperty("dataSource.driveClass"));
		dataSource.setJdbcUrl(environment.getProperty("dataSource.url"));
		dataSource.setUsername(environment.getProperty("dataSource.username"));
		dataSource.setPassword(environment.getProperty("dataSource.password"));
		return dataSource;
	}
}
