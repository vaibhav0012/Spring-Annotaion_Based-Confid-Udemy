package com.vaibhav.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) 
	{
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from the spring container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//close the bean
		context.close();
	}

}
