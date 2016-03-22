/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ieee13BusExampleOnePhaseInDevelopment;

import java.util.HashSet;

import akka.ActorFactory;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

public class NodeBehaviorFactory extends ActorFactory{
	
	// Solver Actor with name and installedProduction value as parameter
	public static ActorOptions createNode(String name, double activePower, double reactivePower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new NodeBehavior(name, activePower, reactivePower));		
		return result;		
	}	 

}
