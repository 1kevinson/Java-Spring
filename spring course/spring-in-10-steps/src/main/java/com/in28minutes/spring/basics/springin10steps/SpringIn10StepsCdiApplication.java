package com.in28minutes.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.in28minutes.spring.basics.springin10steps.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class SpringIn10StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsCdiApplication.class);

	public static void main(String[] args) {

		// APPLICATION CONTEXT --> Manager of BEANS
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn10StepsCdiApplication.class);

		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());

		((AbstractApplicationContext) applicationContext).close();
	}

}

// FINISHING SECTION 4