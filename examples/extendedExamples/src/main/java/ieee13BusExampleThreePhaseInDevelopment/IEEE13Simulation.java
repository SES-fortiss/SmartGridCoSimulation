/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ieee13BusExampleThreePhaseInDevelopment;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;

// This is executed with Eclipse
public class IEEE13Simulation {
	
	public static ActorTopology topology;
	private int startTimeStep = 1;
	private int maxTimeStep = 2;
	
	public void run(){
		topology = IEEE13BusTopology.createTopology();
		
		
		// TODO this example is not ready. It still needs some work! BE CAREFULL WHEN USING IT
		
		SimulationStarter.saveGridTopologyPlot(topology);	
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
        ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);        
        simulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);
	}
	
	public static void main(String[] args){
		new IEEE13Simulation().run();
	}
}
