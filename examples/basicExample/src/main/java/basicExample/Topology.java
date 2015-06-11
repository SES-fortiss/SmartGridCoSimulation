/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package basicExample;

import topology.ActorTopology;

/**
 * 
 * This is the topology for the simulation
 * 
 * @author bytschkow
 *
 */

public class Topology {
	
	private static String simulationName = "Simulation";
	
	public static ActorTopology createTopology(){
		
		ActorTopology top = new ActorTopology(simulationName);
				
		/*
		 *  Actor Topology
		 */
		top.addActor("Server", ActorFactory.createAggregator());
		String path;
		
		for (int i = 1; i <= 3; i++) {
			path = "Server/SmartMeter"+i;
			top.addActorAsChild(path, ActorFactory.createChild());
		}
				
		return top;
	}
}
