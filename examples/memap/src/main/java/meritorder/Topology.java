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
		top.addActorAsChild("MEMAP/verbraucher1", ActorFactory.createVerbraucher(1000,10, port++));
		top.addActorAsChild("MEMAP/verbraucher2", ActorFactory.createVerbraucher(2000,8, port++));
		top.addActorAsChild("MEMAP/verbraucher3", ActorFactory.createVerbraucher(3000,6, port++));
		top.addActorAsChild("MEMAP/verbraucher4", ActorFactory.createVerbraucher(4000,4, port++));
		top.addActorAsChild("MEMAP/verbraucher5", ActorFactory.createVerbraucher(5000,2, port++));
		top.addActorAsChild("MEMAP/verbraucher6", ActorFactory.createVerbraucher(6000,3, port++));
				
		top.addActorAsChild("MEMAP/erzeuger1", ActorFactory.createErzeuger(1,5, port++));
		top.addActorAsChild("MEMAP/erzeuger2", ActorFactory.createErzeuger(1,1, port++));
		top.addActorAsChild("MEMAP/erzeuger3", ActorFactory.createErzeuger(1,2, port++));
		top.addActorAsChild("MEMAP/erzeuger4", ActorFactory.createErzeuger(1,3, port++));
		top.addActorAsChild("MEMAP/erzeuger5", ActorFactory.createErzeuger(1,7, port++));
		
		return top;
	}
}
