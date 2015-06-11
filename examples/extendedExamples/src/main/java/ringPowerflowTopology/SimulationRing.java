/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ringPowerflowTopology;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;

// This is executed with Eclipse
public class SimulationRing {
	
	public static ActorTopology topology;
	private int startTimeStep = 0;
	private int maxTimeStep = 1;
	
	public void run(){
		topology = TopologyRing.createTopology();
		
		SimulationStarter.saveGridTopologyPlot(topology);		
        ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);        
        SimulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);
	}
	
	public static void main(String[] args){
		new SimulationRing().run();
	}
}
