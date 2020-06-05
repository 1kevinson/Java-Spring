package com.in28minutes.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin10steps.cdi.SomeCdiBusiness;

@SpringBootApplication
public class SpringIn10StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsCdiApplication.class);

	public static void main(String[] args) {

		// APPLICATION CONTEXT --> Manager of BEANS
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsCdiApplication.class, args);

		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
	}

}

// FINISHING SECTION 4