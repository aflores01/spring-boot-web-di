package com.learning.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.springboot.di.app.models.service.IService;
import com.learning.springboot.di.app.models.service.MyComplexService;
import com.learning.springboot.di.app.models.service.MyService;

@Configuration
public class AppConfig {

	@Bean("MyComplexService")
	public IService registerMyService() {
		return new MyComplexService();
	}
	
	@Bean("MyService")
	public IService registerMyComplexService() {
		return new MyService();
	}
}
