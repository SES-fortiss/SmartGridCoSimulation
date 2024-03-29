/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet;

import java.time.Duration;
import java.time.LocalDateTime;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;

/**
 * 
 * This is the main class for the ECAR simulation.
 * 
 * @author bytschkow
 *
 */

public class ECarSimulation {	
	
	public static LocalDateTime startTime;
	public static LocalDateTime endTime;			
	public static Duration timeInterval;
	
	public static String fileName;
	public static ActorTopology grid;
	
	private static long maxTimeSteps = 0;
	
	public static long getMaxTimeSteps() {
		return maxTimeSteps;
	}

	public static void main(String[] args){
		run();
	}
	
	public static void run(){		
		startTime = LocalDateTime.of(2014,1,1,11,0);
		endTime = LocalDateTime.of(2014,1,2,12,0);
		timeInterval = Duration.ofMinutes(15);
		
		
		Duration simulatationTimeInterval = Duration.between(startTime, endTime);
		
		long timeIntervalMillis = timeInterval.toMillis();
		long simulatationTimeIntervalMillis = simulatationTimeInterval.toMillis();
		
		maxTimeSteps = simulatationTimeIntervalMillis / timeIntervalMillis + 1;
		
		start();
	}	
	
	/************************************************************************************
	 * Start Simulation
	 ************************************************************************************/	
	
	public static void start(){		
		fileName = "/eCarStreet.json";
		grid = ECarStreetTopology.createTopology();	
		
		SimulationStarter.saveGridTopologyPlot(grid);
		
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
		
		ActorSystem actorSystem = simulationStarter.initialiseActorSystem(grid);
        simulationStarter.startSimulation(actorSystem, startTime, endTime, timeInterval);	
	}
	
	
}
