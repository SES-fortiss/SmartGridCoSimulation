/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet;

import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

public class TestLocalTimeComparisions {

	LocalTime time = LocalTime.of(11, 00);
	LocalTime later = LocalTime.of(12, 00);
	LocalTime earlier = LocalTime.of(10, 00);
	LocalTime equal = LocalTime.of(11, 00);
	
	@Test
	public void timeShallBeBefore(){
		assertTrue("12:00 is later than 11:00", time.isBefore(later));
	}
	
	@Test
	public void timeShallBeLater(){
		assertTrue(time.isAfter(earlier));
	}
	
	@Test
	public void timeShallBeLaterOrEqual(){
		assertTrue("Time is greater or equal", 0 >= time.compareTo(equal) );
		assertTrue("Time is greater or equal", 0 >= time.compareTo(later) );
		assertFalse("Time is greater or equal", 0 >= time.compareTo(earlier) );
	}
	
}
