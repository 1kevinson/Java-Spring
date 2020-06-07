package com.in28minues.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	// Using Mock is better than using stubs
	@Test
	public void findTheGreatestFromAllData() {

		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 36, 21, 3, 61, 45 });

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int res = someBusinessImpl.findTheGreatestFromAllData();

		// should be 61
		assertEquals(61, res);
	}

	@Test
	public void findTheGreatestFromAllData_For1value() {

		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int res = someBusinessImpl.findTheGreatestFromAllData();

		// should be 15
		assertEquals(15, res);
	}

}
