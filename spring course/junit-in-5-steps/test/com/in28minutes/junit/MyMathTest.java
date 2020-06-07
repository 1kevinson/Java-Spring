package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();

	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void After() {
		System.out.println("After");
	}

	// In JUnit BeforeClass & AfterClass should be static
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void AdterClass() {
		System.out.println("AfterClass");
	}

	@Test
	public void sumWith4numbers() {
		System.out.println("Test1");
		assertEquals(19, myMath.sum(new int[] { 3, 9, 6, 1 }));
	}

	@Test
	public void sumWith3numbers() {
		System.out.println("Test2");
		assertEquals(10, myMath.sum(new int[] { 3, 6, 1 }));
	}

}
