package com.vaibhav.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) 
	{
		//read spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from the spring container
		SwimCoach1 theCoach = context.getBean("swimCoach1",SwimCoach1.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		// call method for email and team
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//close the bean
		context.close();
	}

}
