/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

import org.junit.Test;

public class PricePrognosisTest {

	@Test
	public void testCreatePriceCurve() {		
		PricePrognosis pp = new PricePrognosis();
		assertNotNull(pp.pricePrognosis);
		//System.out.println(PricePrognosis.pricePrognosis);		
	}

	@Test
	public void testConvertPricePrognosisToDoubleArray() {
		PricePrognosis pp = new PricePrognosis();
		double [] result = pp.convertPricePrognosisToDoubleArray(96, LocalTime.of(17, 00));		
		assertNotNull(pp.pricePrognosis);
		assertEquals(0.3, result[0], 0.1);
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public void findStartIndexShallFindCorrectIndex(){
		PricePrognosis pp = new PricePrognosis();
		
		int index = 0;
		
		LocalTime timeToTestA = pp.pricePrognosis.get(0).localTime;
		LocalTime timeToTestB = pp.pricePrognosis.get(1).localTime;
		LocalTime timeToTest = timeToTestA.plus(Duration.between(timeToTestA, timeToTestB).dividedBy(2));
		
		index = pp.findStartIndex(timeToTest);
		assertEquals(0, index);
		
		timeToTestA = pp.pricePrognosis.get(1).localTime;
		timeToTestB = pp.pricePrognosis.get(2).localTime;
		timeToTest = timeToTestA.plus(Duration.between(timeToTestA, timeToTestB).dividedBy(2));
		
		index = pp.findStartIndex(timeToTest);
		assertEquals(1, index);
		
	}
}
