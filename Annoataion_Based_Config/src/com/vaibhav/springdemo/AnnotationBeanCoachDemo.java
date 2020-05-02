package com.vaibhav.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanCoachDemo {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		boolean result = theCoach==alphaCoach;
		System.out.println("result: "+result);
		System.out.println("Address theCoach: "+theCoach);
		System.out.println("Address aplhaCoach: "+alphaCoach);
		context.close();
		
	}

}
