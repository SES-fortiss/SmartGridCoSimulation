/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.coordinator;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;

public class CoordinatorAnswerContent implements AnswerContent{
	
	public double demandTotal;
	public double demandECars;
	public double demandHouses;
	
	public String toString(){
		return 
				GlobalTime.currentTime.getHour() + ":" + GlobalTime.currentTime.getMinute() + ", " + 
				demandTotal + ", " + 
				demandECars + ", " +
				demandHouses;		
	}
}
