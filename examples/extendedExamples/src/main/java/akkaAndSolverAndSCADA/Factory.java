/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akkaAndSolverAndSCADA;

import java.util.HashSet;

import resultSaving.NoSave;
import akka.ActorFactory;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import akkaAndSolverAndSCADA.behaviorModels.Aggregator;
import akkaAndSolverAndSCADA.behaviorModels.Component;

public class Factory extends ActorFactory{
	
	// Aggregator Actor with name as parameter
	public static ActorOptions createAggregatorActor(String name){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Aggregator(name),new NoSave());		
		return result;		
	}
	
	// Solver Actor with name and installedProduction value as parameter
	public static ActorOptions createComponentActor(String name, double installedProduction){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Component(name, installedProduction),new NoSave());		
		return result;
	}	 

}
