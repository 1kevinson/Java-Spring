package com.in28minues.mockito.mockitodemo;

public class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {

		return new int[] { 12, 45, 11, 33, 67 };
	}

}