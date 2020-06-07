package com.in28minues.mockito.mockitodemo;

public class SomeBusinessImpl {

	private DataService dataService;

	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE; // -2147483648

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

}
