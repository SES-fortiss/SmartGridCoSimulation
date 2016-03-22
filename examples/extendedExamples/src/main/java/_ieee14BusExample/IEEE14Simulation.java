/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package _ieee14BusExample;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import configuration.GridArchitectConfiguration;

/**
 * This class will start the simulation of the IEEE 14BUS System.
 * 
 * @author denis
 *
 */
public class IEEE14Simulation {
	
	public static ActorTopology topology;
	private int startTimeStep = 1;
	private int maxTimeStep = 2;
	
	public void run(){
		topology = Ieee14BusTopology.createTopology();
		
		GridArchitectConfiguration.showPowerFlowDetails = true;
		
		
		SimulationStarter.saveGridTopologyPlot(topology);		
        ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);        
        SimulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);
        
	}
	
	public static void main(String[] args){
		new IEEE14Simulation().run();
	}
}
