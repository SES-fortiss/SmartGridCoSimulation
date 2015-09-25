/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package helper.lastProfil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import junit.framework.Assert;

import org.junit.Test;

public class SolarProductionTest {

	@Test
	public void testGetSolarProduction() {
		
		double installedPower = 8.1;
		
		double reference = SolarProduction.getDailySolarProduction(installedPower, LocalDateTime.now());		
		double sum = 0;
		
		for (int i = 0; i < 96; i++) {
			
			int hour = i / 4;
			int minute = i%4 * 15;
			
			LocalDateTime time = LocalDateTime.of(LocalDate.now(), LocalTime.of(hour, minute));			
			sum += SolarProduction.getSolarProductionPower(installedPower, time);
			
		}		
		sum = sum / 4;
		
		Assert.assertEquals(reference, sum, 0.1);
		
	}

}
