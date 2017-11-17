/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package meritorder;

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
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor("MEMAP", ActorFactory.createAggregatorBehavior());
		top.addActorAsChild("MEMAP/verbraucher1", ActorFactory.createVerbraucher(3000,100, port++));
		top.addActorAsChild("MEMAP/verbraucher2", ActorFactory.createVerbraucher(5000,80, port++));
		top.addActorAsChild("MEMAP/verbraucher3", ActorFactory.createVerbraucher(1000,60, port++));
		top.addActorAsChild("MEMAP/verbraucher4", ActorFactory.createVerbraucher(1000,40, port++));
		top.addActorAsChild("MEMAP/verbraucher5", ActorFactory.createVerbraucher(1000,20, port++));
		top.addActorAsChild("MEMAP/verbraucher6", ActorFactory.createVerbraucher(1000,10, port++));
				
		return top;
	}
}
