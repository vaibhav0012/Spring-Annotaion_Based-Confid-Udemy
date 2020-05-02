package com.vaibhav.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Singleton")
public class TennisCoach implements Coach 
{
	//set field injection
	
	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach()
	{
		System.out.println("TennisCoach: default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("Startup method");
	}
	
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println("Clearup method");
	}
	/*//define a setter method
	@Autowired
	public void doCrazyStuff(FortuneService theFortuneService)
	{
		System.out.println("TennisCoach crazy stufff method");
		this.fortuneService=theFortuneService;
	}*/
/*	// add Constructor for injection
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService)
//	{
//		this.fortuneService=theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() 
	{
		return "TennisCoach daily workout";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}
