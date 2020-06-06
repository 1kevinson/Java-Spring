package com.in28minutes.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;

/**
 * ComponentScan is useful to scan for a beans outside the package of the
 * SpringBootApplication
 */

@Configuration
@ComponentScan
public class SpringIn10StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScanApplication.class);

	public static void main(String[] args) {

		// APPLICATION CONTEXT --> Manager of BEANS
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn10StepsComponentScanApplication.class);

		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);
		((AbstractApplicationContext) applicationContext).close();
	}
}
