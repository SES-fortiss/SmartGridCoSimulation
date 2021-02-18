/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar.helper.decisions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import eCarStreet.eCar.ECar;

public class SimpleTwoTariffDecision implements Decision {
	
	
	/**
	 * SWM bietet den Nebentarif ab 21:00 Uhr an
	 */
	LocalTime beginningTimeCheapTariff = LocalTime.of(22, 00);
	LocalTime endTimeCheapTariff = LocalTime.of(07, 00);

	@Override
	public double getDemand(ECar eCar, LocalDateTime time, Duration period) {
		
		LocalTime localTime = LocalTime.of(time.getHour(), time.getMinute());
		
		if (localTime.compareTo(LocalTime.of(12,0)) == 0) {
			eCar.setSOC(eCar.startSOC);
		}
		
		if (localTime.compareTo(beginningTimeCheapTariff) >= 0 ||
				localTime.compareTo(eCar.leavingTime) <= 0){
			SimpleDecision simpleDecision = new SimpleDecision();
			
			
			return simpleDecision.doCharge(eCar, period);
		}
		
		return 0;
	}

}
