package com.codeAlong.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean from config file
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theAlphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach==theAlphaCoach);
		//print the result
		System.out.println("\nPointing to the same object:" + result);
		
		System.out.println("\nMemory location of the Coach" + theCoach);
		
		System.out.println("\nMemory location of the alpha Coach" + theAlphaCoach);
		
		//close the context
		context.close();
	}

}
