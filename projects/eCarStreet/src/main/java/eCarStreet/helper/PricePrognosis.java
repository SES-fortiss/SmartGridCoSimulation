/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.helper;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class PricePrognosis {

	public ArrayList<PricePoint> pricePrognosis = new ArrayList<PricePoint>();
	
	public PricePrognosis(){
		pricePrognosis.add(new PricePoint(LocalTime.of(0,0), 0.2 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(18,0), 0.3 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(21,0), 0.2 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(23,0), 0.13 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(1,0), 0.1 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(3,0), 0.15 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(5,0), 0.18 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(7,0), 0.22 ) );
		pricePrognosis.add(new PricePoint(LocalTime.of(20,0), 0.2 ) );
	}

	public double[] convertPricePrognosisToDoubleArray(int arrayLength, LocalTime startTime) {
		double[] result = new double[arrayLength];
		
		LocalTime currentTime = startTime;
		Duration interval = Duration.ofMinutes(15);
		
		int index = findStartIndex(currentTime);
		
		PricePoint currentPricePoint = pricePrognosis.get(index);
		PricePoint nextPricePoint = pricePrognosis.get(index+1);
		Duration difference = Duration.between(startTime, nextPricePoint.localTime);
		
		for (int i = 0; i < result.length; i++) {
			if (difference.compareTo(Duration.ZERO) <= 0){
				index++;
				currentPricePoint = pricePrognosis.get(index);
				nextPricePoint = pricePrognosis.get(index +1);
				difference = Duration.between(currentPricePoint.localTime, nextPricePoint.localTime);
				if (difference.isNegative()){
					difference = difference.plus(Duration.ofHours(24));
				}				
			}						
			result[i] = currentPricePoint.price;
			difference = difference.minus(interval);			
		}
		
		// This is a quick hack for testing
		/*
		
		for (int i = 0; i < result.length; i++) {
			result[i] = 2;
		}
		
		for (int i = result.length / 4; i < result.length; i++) {
			result[i] = 4.5;
		}
		
		for (int i = result.length / 4*2; i < result.length; i++) {
			result[i] = 2;
		}
		
		for (int i = result.length / 4*3; i < result.length; i++) {
			result[i] = 3;
		}
		*/		
		
		return result;
	}

	public int findStartIndex(LocalTime startTime) {
		
		LocalTime currentTime;
		LocalTime nextTime;		
		
		for (int i = 0; i < pricePrognosis.size()-1; i++) {
			
			currentTime = pricePrognosis.get(i).localTime;
			nextTime = pricePrognosis.get(i+1).localTime;
			
			if (startTime.compareTo(currentTime) >= 0 && startTime.compareTo(nextTime) < 0){
				return i;
			}
			
			if (currentTime.compareTo(nextTime) > 0) {
				return i;
			}
		}
		
		return 0;
	}

}
