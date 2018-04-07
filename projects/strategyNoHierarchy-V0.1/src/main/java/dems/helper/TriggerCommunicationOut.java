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

public class TriggerCommunicationOut {
	
	public static boolean checkTrigger( LocalDateTime time ){
		
		if (GlobalTime.period.getSeconds()/60 >= 60 ){
			if (time.isAfter(LocalDateTime.of(2013,1,14,0,0)) && time.isBefore(LocalDateTime.of(2013,1,14,19,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,1,18,12,0)) && time.isBefore(LocalDateTime.of(2013,1,18,19,0))) {
				return true;
			}
		} 
		// F�r feine Zeitaufl�sung
		else {
			if (time.isAfter(LocalDateTime.of(2013,1,14,0,0)) && time.isBefore(LocalDateTime.of(2013,1,14,3,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,1,18,12,0)) && time.isBefore(LocalDateTime.of(2013,1,18,14,30))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,8,1,4,0)) && time.isBefore(LocalDateTime.of(2013,8,1,7,0))) {
				return true;
			}
			
			if (time.isAfter(LocalDateTime.of(2013,8,2,1,0)) && time.isBefore(LocalDateTime.of(2013,8,2,3,0))) {
				return true;
			}
		}
		return false;
	}

}
