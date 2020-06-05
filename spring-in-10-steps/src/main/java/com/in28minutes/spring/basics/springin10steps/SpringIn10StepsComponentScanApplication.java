package com.in28minutes.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;

/**
 * ComponentScan is useful to scan for a beans outside the package of the
 * SpringBootApplication
 */

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn10StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScanApplication.class);

	public static void main(String[] args) {

		// APPLICATION CONTEXT --> Manager of BEANS
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsComponentScanApplication.class,
				args);

		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);
	}
}
