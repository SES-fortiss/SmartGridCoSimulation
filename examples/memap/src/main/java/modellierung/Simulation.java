/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package modellierung;

import java.time.Duration;
import java.time.LocalDateTime;

import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;
import simulation.SimulationStarter;
import topology.ActorTopology;


public class Simulation {
	
	private ActorTopology topology;
	
	// 01 Juli 2014, 0:00 
	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,0,0);
	// 01 Juli 2014, 12:00
	public static LocalDateTime endTime = LocalDateTime.of(2014,7,1,23,45);
	public static Duration timeInterval = Duration.ofMinutes(15);
	
	public void run(){
		topology = Topology.createTopology();
		SimulationStarter.saveGridTopologyPlot(topology);   
		
		SimulationStarter simStarter = new SimulationStarter(new GlobalTime());
		
		ActorSystem actorSystem = simStarter.initialiseActorSystem(topology);
		simStarter.startSimulation(actorSystem,startTime, endTime, timeInterval);
	}
	
	public static void main(String[] args){
		new Simulation().run();
	}
}
