/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.house;

import eCarStreet.eCar.ECar;
import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;

public class HouseAnswerContent implements AnswerContent{
	
	public double demandHouse;
	public double demandCar;
	public double demandTotal;
	public double eCarSOC;
	public double cost;
	public double price;
	public double totalCost;
	public ECar eCarInformation;
	public double jahresVerbrauch;	
	public double predicted;
	
	public String toString(){
		return 
				GlobalTime.currentTime + ", " + 
				demandHouse + ", " + 
				demandCar + ", " + 
				demandTotal + ", " + 
				eCarSOC + ", " +
				cost + ", " +
				price+ ", " +
				totalCost;
	}
}
