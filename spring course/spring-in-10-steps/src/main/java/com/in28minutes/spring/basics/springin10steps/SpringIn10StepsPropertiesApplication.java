package com.in28minutes.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.in28minutes.spring.basics.springin10steps.properties.SomeExternalService;

@Configuration
@ComponentScan
public class SpringIn10StepsPropertiesApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringIn10StepsPropertiesApplication.class);

	public static void main(String[] args) {

		// APPLICATION CONTEXT --> Manager of BEANS
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn10StepsPropertiesApplication.class);

		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		logger.info("The URL define in file => {}", service.returnServiceUrl());
		System.out.println(service);

		((AbstractApplicationContext) applicationContext).close();

	}

}
