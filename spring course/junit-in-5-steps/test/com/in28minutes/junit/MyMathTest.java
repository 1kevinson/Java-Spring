package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();

	@Test
	public void sumWith4numbers() {

		assertEquals(19, myMath.sum(new int[] { 3, 9, 6, 1 }));
	}

	@Test
	public void sumWith3numbers() {

		assertEquals(10, myMath.sum(new int[] { 3, 6, 1 }));
	}

}
