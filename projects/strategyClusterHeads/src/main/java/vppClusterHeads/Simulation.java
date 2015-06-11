/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads;

import java.time.Duration;
import java.time.LocalDate;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;

/**
 * 
 * This is the main class for the VPP simulation.
 * It is executed with Eclipse.
 * 
 * @author bytschkow
 *
 */

public class Simulation {
	
	public static ActorTopology vppgrid;
	public static ActorSystem actorSystem;
	
	/****************************
	 * SETTINGS
	 ****************************/	
	
	public static LocalDate referenceDay = LocalDate.of(2013,8,2);			
	public static Duration desiredTimeInterval = Duration.ofSeconds(2);
	
	/****************************
	 * START
	 ****************************/
	
	public void run(){		
		vppgrid = Topology.createTopology();
		//vppgrid = Topology.createTopologyFromJson("test.txt");
		SimulationStarter.saveGridTopologyPlot(vppgrid);
        
		actorSystem = SimulationStarter.initialiseActorSystem(vppgrid);
        SimulationStarter.startSimulation(actorSystem, referenceDay, desiredTimeInterval);
	}
	
	public static void main(String[] args){
		new Simulation().run();
	}
}
