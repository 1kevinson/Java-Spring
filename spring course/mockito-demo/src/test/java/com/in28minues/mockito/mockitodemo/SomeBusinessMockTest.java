package com.in28minues.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	// Using Mock is better than using stubs
	@Test
	public void findTheGreatestFromAllData() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 36, 21, 3, 61, 45 });

		// should be 61
		assertEquals(61, someBusinessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void findTheGreatestFromAllData_For1value() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });

		// should be 15
		assertEquals(15, someBusinessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void findTheGreatestFromAllData_NoValue() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

		// should be 61
		assertEquals(Integer.MIN_VALUE, someBusinessImpl.findTheGreatestFromAllData());
	}

}
