package com.in28minutes.spring.basics.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Everything that provide business logic is a @Service, everything that talk to the database is a @Repository

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {

		// Logic for Quick sort

		return numbers;
	}
}
