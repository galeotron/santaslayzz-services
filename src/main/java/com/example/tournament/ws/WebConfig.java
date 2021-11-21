package com.example.tournament.ws;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@CrossOrigin
public class WebConfig implements WebMvcConfigurer {
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("PUT", "GET", "POST", "DELETE");
	}
}
