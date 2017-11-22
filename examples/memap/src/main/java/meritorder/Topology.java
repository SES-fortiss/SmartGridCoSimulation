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
		top.addActorAsChild("MEMAP/verbraucher1", ActorFactory.createVerbraucher("Lastprofil_EFH.csv",5.0, port++));
		top.addActorAsChild("MEMAP/verbraucher2", ActorFactory.createVerbraucher("Lastprofil_EFH2.csv",20.0, port++));
		top.addActorAsChild("MEMAP/verbraucher3", ActorFactory.createVerbraucher("Lastprofil_MFH_interp.csv",10.0, port++));
		top.addActorAsChild("MEMAP/verbraucher4", ActorFactory.createVerbraucher("Lastprofil_MFH2_interp.csv",10.0, port++));
				
		top.addActorAsChild("MEMAP/erzeuger1", ActorFactory.createErzeuger(20,5, port++));
		top.addActorAsChild("MEMAP/erzeuger2", ActorFactory.createErzeuger(30,1, port++));
		top.addActorAsChild("MEMAP/erzeuger3", ActorFactory.createErzeuger(50,2, port++));
		top.addActorAsChild("MEMAP/erzeuger4", ActorFactory.createErzeuger(10,3, port++));
		top.addActorAsChild("MEMAP/erzeuger5", ActorFactory.createErzeuger(100,10, port++));
		
		return top;
	}
}
