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

import akka.systemActors.GlobalTime;
import eCarStreet.eCar.ECar;
import eCarStreet.helper.PricePrognosis;

public class PriceOptimizedDecision implements Decision {
	
	Optimizer optimizer = null;
	OptimizationPoint[] fahrplan;

	@Override
	public double getDemand(ECar eCar, LocalDateTime time) {		
		
		if (optimizer == null){			
			calculateOptimizedFahrplan(eCar);
		}
		
		double power = 0.0;
		LocalTime internalTime = LocalTime.of(time.getHour(), time.getMinute());
		
		for (int i = 0; i < fahrplan.length-1; i++) {
			
			if (internalTime.compareTo(fahrplan[i].time) >= 0
					&&  (	(internalTime.compareTo(fahrplan[i+1].time) < 0)  
					|| fahrplan[i+1].time.compareTo(LocalTime.of(0, 0)) == 0) ) {
				power = fahrplan[i].nextPowerDemand;
				eCar.setSOC(fahrplan[i+1].SOC);
			}
		}
		return -power;
	}

	public void calculateOptimizedFahrplan(ECar eCar) {
		Duration period = GlobalTime.period;
		if (period == null) period = Duration.ofMinutes(15);		
		optimizer = new Optimizer(eCar, period);
		
		PricePrognosis pp = new PricePrognosis();		
		double[] preisArray = pp.convertPricePrognosisToDoubleArray(optimizer.timeN, eCar.arrivalTime);		
		fahrplan = optimizer.optimize(preisArray);
	}

}
