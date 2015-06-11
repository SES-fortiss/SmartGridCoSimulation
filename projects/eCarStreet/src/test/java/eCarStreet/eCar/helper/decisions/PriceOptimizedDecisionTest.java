/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar.helper.decisions;

import java.time.LocalDateTime;

import org.junit.Test;

import eCarStreet.eCar.ECar;
import eCarStreet.eCar.helper.configurations.*;

public class PriceOptimizedDecisionTest {

	@Test
	public void testGetDemand() {
		
		PriceOptimizedDecision decision = new PriceOptimizedDecision();		
		ECar car = new CarConfiguration5();
		car.decision = new SimpleDecision();
		LocalDateTime time = LocalDateTime.now();
		
		double result = decision.getDemand(car, time);

		System.out.println(result);
		
	}

}
