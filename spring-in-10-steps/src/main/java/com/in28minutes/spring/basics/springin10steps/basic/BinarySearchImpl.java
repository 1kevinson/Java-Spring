package com.in28minutes.spring.basics.springin10steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;

	// AutoWiring by name -> no need to use @Primary
	// private SortAlgorithm sortAlgorithm;

	// AutoWiring with Qualifier is better when we have most of beans

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array

		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
}
