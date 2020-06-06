package com.in28minutes.spring.basics.springin10steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin10steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringIn10StepsXmlContextApplication {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXmlJdbcConnection());
		}
	}
}