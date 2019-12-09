/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import eCarStreet.coordinator.Coordinator;
import eCarStreet.eCar.ECar;
import eCarStreet.eCar.helper.decisions.DecisionType;
import eCarStreet.house.House;
import eCarStreet.market.Market;

public abstract class ECarStreetActorFactory {
	
	public static ActorOptions createHouse(double demand, ECar eCarConfiguration, DecisionType decisionType){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new House(demand, eCarConfiguration, decisionType));		
		return result;
	}
	
	public static ActorOptions createHouse(double demand){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new House(demand));		
		return result;
	}
	
	public static ActorOptions createCoordinator(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Coordinator());	
		return result;		
	}
	
	public static ActorOptions createMarket(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Market());		
		return result;		
	}
	
	

}
