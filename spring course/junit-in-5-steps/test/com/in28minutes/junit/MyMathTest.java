package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

public class MyMathTest {

	@Test
	public void test() {
		MyMath myMath = new MyMath();
		int sum = myMath.sum(new int[] { 3, 5, 9, 6, 1 });

		// Check that the result is 24

		System.out.println(sum);
	}

}
