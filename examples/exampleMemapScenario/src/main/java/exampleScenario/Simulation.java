/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package exampleScenario;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;
import simulation.SimulationStarter;
import topology.ActorTopology;


public class Simulation {
	
	private ActorTopology topology;
	
	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,0,0);
	public static LocalDateTime endTime = LocalDateTime.of(2014,7,6,21,0);
	public static Duration timeInterval = Duration.ofSeconds(1);
	
	
	public void run(){
		topology = Topology.createTopology();
		SimulationStarter.saveGridTopologyPlot(topology);
		
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
		
		ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);
        //SimulationStarter.startSimulation(actorSystem,startTime, endTime, timeInterval);
		simulationStarter.startSimulation(actorSystem, LocalDate.of(2014,7,1), timeInterval);
	}
	
	public static void main(String[] args){
		new Simulation().run();
	}
}
