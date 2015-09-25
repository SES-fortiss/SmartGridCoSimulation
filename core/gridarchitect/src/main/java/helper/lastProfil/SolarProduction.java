/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package helper.lastProfil;

import helper.SolarProfile;

import java.time.LocalDateTime;

public class SolarProduction {	

	public static double getDailySolarProduction(double installedPower, LocalDateTime inputTime){
		
		double production = 0.0;
		
		int month = inputTime.getMonthValue();
		int day = inputTime.getDayOfMonth();
		
		switch (month) {
		case 1:
			production = SolarData2007.januar[day-1];
			break;
		case 2:
			production = SolarData2007.februar[day-1];
			break;
		case 3:
			production = SolarData2007.maerz[day-1];
			break;
		case 4:
			production = SolarData2007.april[day-1];
			break;
		case 5:
			production = SolarData2007.mai[day-1];
			break;	
		case 6:
			production = SolarData2007.juni[day-1];
			break;
		case 7:
			production = SolarData2007.juli[day-1];
			break;			
		case 8:
			production = SolarData2007.august[day-1];
			break;
		case 9:
			production = SolarData2007.september[day-1];
			break;
		case 10:
			production = SolarData2007.oktober[day-1];
			break;
		case 11:
			production = SolarData2007.november[day-1];
			break;
		case 12:
			production = SolarData2007.dezember[day-1];
			break;
		}
		
		// normieren auf 1kwp --> tagesproduktion in kwh einer 1kp anlage
		production = production / SolarData2007.installedPower;
		
		// mulitplizieren mit dem input der Anlage
		production = production * installedPower;
		
		return production;

	}
	
	public static double getSolarProductionPower(double installedPower, LocalDateTime inputTime){		
		double result = 0;		
		double dailyproduction = getDailySolarProduction(installedPower, inputTime);		
		int timeIndex = inputTime.getHour()*4 + inputTime.getMinute() / 15;			
		double prozent = SolarProfile.getNormalizedSolarProfileSummer(timeIndex)*4;		
		result = dailyproduction * prozent;		
		return result;
	}
}
