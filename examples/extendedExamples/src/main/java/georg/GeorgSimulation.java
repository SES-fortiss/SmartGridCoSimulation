/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package georg;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;

// This is executed with Eclipse
public class GeorgSimulation {
	
	public static ActorTopology topology;
	private int maxTimeStep = 96;
	
	public void run(){
		topology = GeorgTopology.createTopology();		
		
		SimulationStarter.saveGridTopologyPlot(topology);				
		
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
        ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);
        
        simulationStarter.startSimulation(actorSystem, 0, maxTimeStep);
	}
	
	public static void main(String[] args){
		new GeorgSimulation().run();
	}
}
