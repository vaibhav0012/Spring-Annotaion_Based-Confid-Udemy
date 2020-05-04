package com.vaibhav.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach1 implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach1 (FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "100m swimming warm-up";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
	
	public String getEmail()
	{
		return email;
	}
	public String getTeam()
	{
		return team;
	}

}
