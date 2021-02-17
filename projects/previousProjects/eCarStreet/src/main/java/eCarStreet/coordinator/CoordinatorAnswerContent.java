/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.coordinator;

import java.time.LocalDateTime;

import akka.basicMessages.AnswerContent;

public class CoordinatorAnswerContent implements AnswerContent{
	
	public LocalDateTime currentTime;
	public double demandTotal;
	public double demandECars;
	public double demandHouses;
	
	public String toString(){
		return 
				currentTime.getHour() + ":" + currentTime.getMinute() + ", " + 
				demandTotal + ", " + 
				demandECars + ", " +
				demandHouses;		
	}
}
