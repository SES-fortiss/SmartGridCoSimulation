/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package _ieee14BusWithImport;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;
import configuration.GridArchitectConfiguration;

public class _ieee14BusWithImportSimulation {
	
	public static ActorTopology topology;
	private int startTimeStep = 1;
	private int maxTimeStep = 2;
	
	public void run(){
		
		topology = _ieee14BusTopologyImport.createTopology();
		
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
		
		GridArchitectConfiguration.showPowerFlowDetails = true;				
		SimulationStarter.saveGridTopologyPlot(topology);		
        ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);        
        simulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);        
	}
	
	public static void main(String[] args){
		new _ieee14BusWithImportSimulation().run();
	}
}
