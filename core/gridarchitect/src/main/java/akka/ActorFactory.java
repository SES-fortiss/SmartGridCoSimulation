/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka;

import java.util.HashSet;

import resultSaving.NoSave;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class ActorFactory {

	// PlainBehavior without parameters
	public static ActorOptions createPlainActor(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new BlankActorBehavior(),new NoSave());		
		return result;		
	}
	
}
