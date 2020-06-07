package com.in28minutes.spring.basics.springin10steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {

		// Logic for bubble sort

		return numbers;
	}
}
