package com.maersk.line.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages="com.maersk.line.web")
@EnableWebMvc
@Configuration
public class MOCWebApplicationUtil {

}
