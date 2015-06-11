/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.helper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * DEMSSchedule
 * 10.06.2014
 * @author bytschkow
 *
 */
public class TradingSchedule {
	
	public static boolean isInit = false;
	public static boolean isCostInit = false;
	public static List<SchedulePoint> scheduleList = new ArrayList<SchedulePoint>();
	public static List<SchedulePoint> costList = new ArrayList<SchedulePoint>();

	/**
	 * This method returns the ScheduledProduction based on 96 TimeSteps per Day
	 * 
	 * @param timeStep
	 * @return ScheduledProduction for the given TimeStep
	 */	
	
	public static double getSchedule(LocalDateTime time) {
		if (!isInit) {
			setSchedule();		
		}		
				
		double result = getValue(time, scheduleList);		
		return result;
	}


	private static double getValue(LocalDateTime time, List<SchedulePoint> list) {
		SchedulePoint buffer1;
		SchedulePoint buffer2;		
		for (int i=0; i< list.size()-1; i++){
			buffer1 = list.get(i);
			buffer2 = list.get(i+1);						
			if(time.isEqual(buffer1.time) || time.isAfter(buffer1.time) && time.isBefore(buffer2.time)){
				return buffer1.schedule;
			}					
		}
		return 0.0;
	}	
	
	static void setSchedule(){
		scheduleList.add(new SchedulePoint(LocalDateTime.of(1990,1,1,0,0), 0));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,14,0,0), 100));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,16,0,0), -500));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,30,0,0), -500));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,8,1,0,0), 100));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,8,2,0,0), -500));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,2,12,0), 300));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2014,1,2,12,0), 1000));
	}


	public static double getCost(LocalDateTime time) {
		if (!isCostInit) {
			setCosts();		
		}
		double result = getValue(time, costList);		
		return result;
	}


	private static void setCosts() {
		costList.add(new SchedulePoint(LocalDateTime.of(1990,1,1,0,0), 20));
		costList.add(new SchedulePoint(LocalDateTime.of(2013,1,14,0,0), 60));
		costList.add(new SchedulePoint(LocalDateTime.of(2013,1,16,0,0), 10));
		costList.add(new SchedulePoint(LocalDateTime.of(2013,1,30,0,0), 40));		
	}	
}
