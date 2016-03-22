/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package _ieeea118BusWithImport;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import configuration.GridArchitectConfiguration;

public class _ieee118BusWithImportSimulation {
	
	public static ActorTopology topology;
	private int startTimeStep = 1;
	private int maxTimeStep = 2;
	
	public void run(){
		
		topology = _ieee118BusTopologyImport.createTopology();
		
		GridArchitectConfiguration.showPowerFlowDetails = true;				
		SimulationStarter.saveGridTopologyPlot(topology);		
        ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);        
        SimulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);        
	}
	
	public static void main(String[] args){
		new _ieee118BusWithImportSimulation().run();
	}
}
