package com.codeAlong.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a happy day ahead";
	}

}
