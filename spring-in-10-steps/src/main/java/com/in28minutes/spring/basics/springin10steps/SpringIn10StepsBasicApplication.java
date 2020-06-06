package com.in28minutes.spring.basics.springin10steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin10steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn10StepsBasicApplication {

	public static void main(String[] args) {

		// APPLICATION CONTEXT --> Manager of BEANS
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn10StepsBasicApplication.class);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);

		System.out.println(result);
	}

}

// FINISHING SECTION 4