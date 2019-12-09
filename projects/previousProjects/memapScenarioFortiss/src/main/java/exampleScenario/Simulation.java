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
import simulation.SimulationStarter;
import topology.ActorTopology;


public class Simulation {
	
	private ActorTopology topology;
	
	public static LocalDateTime startTime = LocalDateTime.of(2018,7,9,0,0);
	public static LocalDateTime endTime = LocalDateTime.of(2018,7,16,0,0);
	public static Duration timeInterval = Duration.ofSeconds(1);
	
	
	public void run(){
		// disable jetty debug messages
		System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
		System.setProperty("org.eclipse.jetty.LEVEL", "OFF");
		
		topology = Topology.createTopology();
		//SimulationStarter.saveGridTopologyPlot(topology);   
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        //SimulationStarter.startSimulation(actorSystem,startTime, endTime, timeInterval);
        SimulationStarter.startSimulation(actorSystem, LocalDate.now(), timeInterval);
	}
	
	public static void main(String[] args){
		new Simulation().run();
	}
}
