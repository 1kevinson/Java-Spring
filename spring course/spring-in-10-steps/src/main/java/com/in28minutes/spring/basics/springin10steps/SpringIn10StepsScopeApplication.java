package com.in28minutes.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.in28minutes.spring.basics.springin10steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn10StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);

	public static void main(String[] args) {

		// APPLICATION CONTEXT --> Manager of BEANS
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn10StepsScopeApplication.class);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao.getJdbcConnection());

		((AbstractApplicationContext) applicationContext).close();

	}

}

// FINISHING SECTION 4