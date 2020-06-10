package com.in28minutes.spring.aop.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;

	public String calculateSomething() {

		// Business Logic
		return dao2.retrieveSomething();
	}

}
