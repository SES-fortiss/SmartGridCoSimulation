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

import akka.systemActors.GlobalTime;

public class TriggerPlantOut {
	
	public static boolean checkTrigger( LocalDateTime time ){
		
		if (GlobalTime.period.getSeconds()/60 >= 60 ){
			if (time.isAfter(LocalDateTime.of(2013,1,15,0,0)) && time.isBefore(LocalDateTime.of(2013,1,15,19,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,1,19,12,0)) && time.isBefore(LocalDateTime.of(2013,1,19,19,0))) {
				return true;
			}
		} else {
			
			if (time.isAfter(LocalDateTime.of(2013,1,13,12,0)) && time.isBefore(LocalDateTime.of(2013,1,13,15,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,1,15,0,0)) && time.isBefore(LocalDateTime.of(2013,1,15,3,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,1,19,12,0)) && time.isBefore(LocalDateTime.of(2013,1,19,20,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,8,1,12,0)) && time.isBefore(LocalDateTime.of(2013,8,1,15,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,8,2,0,0)) && time.isBefore(LocalDateTime.of(2013,8,2,4,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,8,2,18,0)) && time.isBefore(LocalDateTime.of(2013,8,2,23,0))) {
				return true;
			}
		}
		return false;
	}

}
