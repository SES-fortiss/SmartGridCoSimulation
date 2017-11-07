/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package memap;

import java.util.HashSet;

import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import memap.behavior.Haus1;
import memap.behavior.Haus2;
import memap.behavior.MEMAPBehavior;

/**
 * 
 * The ActorFactory initializes the Actors with the corresponding BehaviorModels
 * 
 * @author bytschkow
 * 
 */
public abstract class ActorFactory {

	public static ActorOptions createHaus1(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Haus1());		
		return result;
	}
	
	public static ActorOptions createHaus2(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new Haus2());		
		return result;
	}
	
	
	public static ActorOptions createMEMAP(){
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new MEMAPBehavior());		
		return result;		
	}
}
