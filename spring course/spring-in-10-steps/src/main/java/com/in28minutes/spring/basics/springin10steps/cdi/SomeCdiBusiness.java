package com.in28minutes.spring.basics.springin10steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

//Spring or CDI annotation are the same

@Named
public class SomeCdiBusiness {

	@Inject
	private SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

	public int findGreatest() {
		int greatest = Integer.MIN_VALUE; // -255484158

		int[] data = someCdiDao.getData();
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}

		return greatest;
	}
}
