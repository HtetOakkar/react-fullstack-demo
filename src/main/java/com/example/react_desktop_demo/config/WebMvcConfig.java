package com.example.react_desktop_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		long MAX_AGE_SECS = 3600;
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE")
				.maxAge(MAX_AGE_SECS);
		WebMvcConfigurer.super.addCorsMappings(registry);
	}
}
