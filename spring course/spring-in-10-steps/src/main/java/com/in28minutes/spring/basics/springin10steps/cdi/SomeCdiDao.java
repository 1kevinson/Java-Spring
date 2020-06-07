package com.in28minutes.spring.basics.springin10steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

	public int[] getData() {
		return new int[] { 4, 115, 22, 63 };
	}
}
