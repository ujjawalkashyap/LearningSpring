package com.codeAlong.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}*/
	
	//define the default constructor
	public TennisCoach() {
		System.out.println("inside the default constructor");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() ;
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// define the init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	//define the destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	
	/*@Autowired
	public void doCrazyStuff(FortuneService fortuneService) {
		System.out.println("inside set doSomethingCrazy function");
		this.fortuneService = fortuneService;
	}*/
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside set fortune service function");
		this.fortuneService = fortuneService;
	}*/

}
