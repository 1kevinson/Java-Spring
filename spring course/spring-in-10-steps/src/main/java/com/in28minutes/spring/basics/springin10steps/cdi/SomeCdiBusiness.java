package com.in28minutes.spring.basics.springin10steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

//Spring or CDI annotation are the same

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
