/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package georg.models.helper;

import georg.models.GeorgAggregator;
import georg.models.GeorgComponents;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class GeorgActorFactory {
	
	// TODO - when there is time, the Factory Pattern can be implemented correctly!
	
	// GeorgsComponent with a name
	public static ActorOptions createGeorgsComponent(String name, String path){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GeorgComponents(name, path));		
		return result;		
	}

	// GeorgsAggregator with a name
	public static ActorOptions createGeorgsAggregator(String name){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new GeorgAggregator(name));		
		return result;		
	}

}
