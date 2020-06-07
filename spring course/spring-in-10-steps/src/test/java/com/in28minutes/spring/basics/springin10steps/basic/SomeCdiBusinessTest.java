/**
 * @author Arsene Kevin
 * @Test  with Spring Framework
 */

package com.in28minutes.spring.basics.springin10steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.in28minutes.spring.basics.springin10steps.cdi.SomeCdiBusiness;
import com.in28minutes.spring.basics.springin10steps.cdi.SomeCdiDao;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	// Inject Mock
	@InjectMocks
	SomeCdiBusiness someCdiBusiness;

	// Create Mock
	@Mock
	SomeCdiDao daoMock;

	@Test
	public void testBasicScenario() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
		assertEquals(4, someCdiBusiness.findGreatest());
	}

	@Test
	public void testBasicScenario2() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4, 26 });
		assertEquals(26, someCdiBusiness.findGreatest());
	}

}
