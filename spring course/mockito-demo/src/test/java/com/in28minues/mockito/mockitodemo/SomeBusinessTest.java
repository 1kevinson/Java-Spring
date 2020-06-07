package com.in28minues.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void findTheGreatestFromAllData() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int res = someBusinessImpl.findTheGreatestFromAllData();

		// should be 67
		assertEquals(67, res);
	}

}
