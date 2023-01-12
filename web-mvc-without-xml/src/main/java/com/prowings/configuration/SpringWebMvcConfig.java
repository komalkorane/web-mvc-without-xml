package com.prowings.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.prowings")
public class SpringWebMvcConfig {
    
	
	public InternalResourceViewResolver resolveView() {
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setPrefix("WEB-INF/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
	
	
	
}
