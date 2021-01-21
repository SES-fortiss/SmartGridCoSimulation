/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package modellierung;

import akka.timeManagement.GlobalTime;
import topology.ActorTopology;

/**
 * 
 * This is the topology for the simulation
 * 
 * @author bytschkow
 *
 */

public class Topology {
	
	private static String simulationName = "MEMAP-Simulation";
	
	private static GlobalTime globalTime = new GlobalTime();
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor("MEMAP", ActorFactory.createAggregatorBehavior());
		top.addActorAsChild("MEMAP/gebaeude1", ActorFactory.createGebaeude1());
		top.addActorAsChild("MEMAP/gebaeude2", ActorFactory.createGebaeude2());
		top.addActorAsChild("MEMAP/gebaeude3", ActorFactory.createGebaeude3());
		top.addActorAsChild("MEMAP/gebaeude4", ActorFactory.createGebaeude4());
				
		return top;
	}
	
	public static GlobalTime getGlobalTime() {
		return globalTime;
	}
}
