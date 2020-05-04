package com.vaibhav.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.vaibhav.springdemo") // the package we need to search for searching the annotations
@PropertySource("classpath:sport.properties")
public class SportConfig 
{
	//define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	//define bean for our swim coach and inject dependencies
	@Bean
	public Coach swimCoach1()
	{
		return new SwimCoach1(sadFortuneService());
	}
	//
}
