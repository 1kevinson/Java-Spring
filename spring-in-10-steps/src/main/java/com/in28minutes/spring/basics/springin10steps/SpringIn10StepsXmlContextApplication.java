package com.in28minutes.spring.basics.springin10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin10steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringIn10StepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsXmlContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			@SuppressWarnings("unused")
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			// log... [xmlJdbcConnection, xmlPersonDAO]
		}
	}
}