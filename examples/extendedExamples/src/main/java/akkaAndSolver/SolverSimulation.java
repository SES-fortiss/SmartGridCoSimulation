/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akkaAndSolver;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;

// This is executed with Eclipse
public class SolverSimulation {
	
	public static ActorTopology topology;
	private int maxTimeStep = 50;
	private int startTimeStep = 48;
	
	public void run(){
		topology = SolverTopology.createTopology();
		
		SimulationStarter.saveGridTopologyPlot(topology);				
		
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
		
        ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);
        
        simulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);
	}
	
	public static void main(String[] args){
		new SolverSimulation().run();
	}
}
