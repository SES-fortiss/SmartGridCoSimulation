/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi.standardActors;

import java.util.HashSet;

import akka.ActorFactory;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

public class PowerFlowBusActorFactory extends ActorFactory{
	
	public static ActorOptions createPQactor(String name, double activePower, double reactivePower){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new PQNode(name, activePower, reactivePower));		
		return result;		
	}
	
	public static ActorOptions createPVactor(String name, double activePower, double voltage){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new PVNode(name, activePower, voltage));
		return result;		
	}

}
