package com.in28minutes.spring.basics.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

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
}
