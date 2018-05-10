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


/**
 * DEMSSchedule
 * 10.06.2014
 * @author bytschkow
 *
 */
public class DEMSSchedule {
	
	public static boolean isInit = false;
	public static ArrayList<SchedulePoint> scheduleList = new ArrayList<SchedulePoint>(1024);

	/**
	 * This method returns the ScheduledProduction based on 96 TimeSteps per Day
	 * 
	 * @param timeStep
	 * @return ScheduledProduction for the given TimeStep
	 */	
	
	public static double getSchedule(LocalDateTime time) {
		if (!isInit) {
			setPrices();			
		}
		
		SchedulePoint buffer1, buffer2;
		
		for (int i=0; i< scheduleList.size()-1; i++){
			buffer1 = scheduleList.get(i);
			buffer2 = scheduleList.get(i+1);
			
//			System.out.println(time + " b1:" + buffer1.time + " b2:"+buffer2.time);
			
			if(time.isEqual(buffer1.time) || time.isAfter(buffer1.time) && time.isBefore(buffer2.time)){
				return buffer1.schedule;
			}					
		}		
		return 0;
	}
	
	
	static void setPrices(){
		scheduleList.add(new SchedulePoint(LocalDateTime.of(1990,1,1,0,0), 9000));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,2,1,0,0), 11000));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2014,1,1,0,0), 11000));		
	}
	
	
	// this method is not used at the moment, but might be usefull later on
	static void setPricesAlternative(){
		scheduleList.add(new SchedulePoint(LocalDateTime.of(1990,1,1,0,0), 0));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,13,0,0), 9300));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,13,5,0), 9100));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,13,7,0), 9300));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,13,9,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,13,14,0), 8300));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,13,22,0), 8400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,14,0,0), 8500));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,14,8,0), 9000));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,14,18,0), 8900));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,15,0,0), 9100));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,15,6,0), 9200));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,15,10,0), 9000));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,15,12,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,16,0,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,16,12,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,17,0,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,17,12,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,18,0,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,18,12,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,19,0,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,19,12,0), 9400));
		scheduleList.add(new SchedulePoint(LocalDateTime.of(2013,1,20,12,0), 9400));
		
//		for (SchedulePoint p : scheduleList){
//			System.out.println(p);
//		}
	}
}
