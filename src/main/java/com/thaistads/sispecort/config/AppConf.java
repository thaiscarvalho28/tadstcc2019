package com.thaistads.sispecort.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
public 
class AppConf implements WebMvcConfigurer {
    
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") 
		.allowedOrigins("*")
		.allowedMethods( "POST", "PUT", "GET", "OPTIONS", "DELETE", "HEAD")
		.allowedHeaders("*")
		.exposedHeaders("Content-Type", "Authorization", "Content-Length", "X-Requested-With") 
		.allowCredentials(true);
    
	}
    

}
