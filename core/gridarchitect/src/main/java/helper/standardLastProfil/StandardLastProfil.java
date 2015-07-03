/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper.standardLastProfil;

import java.time.LocalDateTime;

public class StandardLastProfil {	
	
	/**
	 * 
	 * @param jahresVerbrauch this is a value in kwh - e.g. 2000
	 * @param localDateTime this is a time with year, month, day, hour, minute
	 * @return double value with the corresponding demand of a household (H0 - VDE Profile)
	 */
	
	public static double getH0Demand(double jahresVerbrauch, LocalDateTime localDateTime){								
		double result = 0.0;
		
		Periode periode = Periode.of(localDateTime.toLocalDate());		
		
		int hour = localDateTime.getHour();
		int minute = localDateTime.getMinute();
		int index = hour * 4 + minute/15;
		
		int dayofweek = localDateTime.getDayOfWeek().getValue();
		
		if (periode.equals(Periode.SOMMER)) {
			if (dayofweek <= 5) result = SommerProfile.workingDay[index];
			if (dayofweek == 6) result = SommerProfile.saturday[index];
			if (dayofweek == 7) result = SommerProfile.sunday[index];
		}
		
		if (periode.equals(Periode.UEBERGANG)) {
			if (dayofweek <= 5) result = UebergangProfile.workingday[index];
			if (dayofweek == 6) result = UebergangProfile.saturday[index];
			if (dayofweek == 7) result = UebergangProfile.sunday[index];
		}
		
		if (periode.equals(Periode.WINTER)) {
			if (dayofweek <= 5) result = WinterProfile.workingday[index];
			if (dayofweek == 6) result = WinterProfile.saturday[index];
			if (dayofweek == 7) result = WinterProfile.sunday[index];
		}		
		
		result = result * jahresVerbrauch / 1000000;
		return result;
	}
	
	public static double getH0DemandInterpolated(double jahresVerbrauch, LocalDateTime localDateTime){
		double result = 0;
		
		int minute = localDateTime.getMinute();
		
		if (minute % 15 == 0){
			result = getH0Demand(jahresVerbrauch, localDateTime);
		} else {
			double before = getH0Demand(jahresVerbrauch, localDateTime);
			double after = getH0Demand(jahresVerbrauch, localDateTime.plusMinutes(15));
			double diff = (after - before) * (minute % 15) / 15.0;						
			result = before + diff;
		}
		
		return result;
	}
}
