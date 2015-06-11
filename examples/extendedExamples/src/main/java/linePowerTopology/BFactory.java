/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package linePowerTopology;

import java.util.HashSet;

import resultSaving.NoSave;
import ringPowerflowTopology.behaviorModels.AggregatorModel;
import ringPowerflowTopology.behaviorModels.BModel;
import akka.ActorFactory;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

public class BFactory extends ActorFactory{
	
	// Aggregator Actor with name as parameter
	public static ActorOptions createAggregatorActor(String name){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new AggregatorModel(name),new NoSave());		
		return result;		
	}
	
	// Solver Actor with name and installedProduction value as parameter
	public static ActorOptions createActor(String name, double installedProduction){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new BModel(name, installedProduction),new NoSave());		
		return result;		
	}	 

}
