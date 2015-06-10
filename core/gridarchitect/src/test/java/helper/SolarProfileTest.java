/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

import junit.framework.Assert;

import org.junit.Test;

public class SolarProfileTest {

	@Test
	public void getSolarProfileSummerTest(){
		double result = SolarProfile.getSolarProfileSummer(50);
		Assert.assertTrue(result > 0.9 && result < 1.0);
	}
	
	@Test
	public void getAvgSolarProfileSummerTest(){
		double result = SolarProfile.getAvgSolarProfileSummer(50);
		Assert.assertTrue(result < 0.6 && result > 0.3);
	}
	
}
