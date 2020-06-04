package com.in28minutes.spring.basics.springin10steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {

		// Logic for bubble sort

		return numbers;
	}
}
