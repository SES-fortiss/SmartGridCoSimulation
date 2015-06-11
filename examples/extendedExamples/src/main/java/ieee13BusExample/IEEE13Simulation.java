/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ieee13BusExample;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;

// This is executed with Eclipse
public class IEEE13Simulation {
	
	public static ActorTopology topology;
	private int startTimeStep = 1;
	private int maxTimeStep = 2;
	
	public void run(){
		topology = Topology.createTopology();
		
		SimulationStarter.saveGridTopologyPlot(topology);		
        ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);        
        SimulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);
	}
	
	public static void main(String[] args){
		new IEEE13Simulation().run();
	}
}
