/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package memap;

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
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);						
		top.addActor("MEMAP", ActorFactory.createMEMAP());
		String path;
		
		for (int i = 1; i <= 5; i++) {
			path = "MEMAP/EMS"+i;
			top.addActorAsChild(path, ActorFactory.createHaus1());
		}
		
		top.addActorAsChild("MEMAP/Haus2", ActorFactory.createHaus2());
		top.addActorAsChild("MEMAP/OnlineReader", ActorFactory.createReaderOnline());
				
		return top;
	}
}
