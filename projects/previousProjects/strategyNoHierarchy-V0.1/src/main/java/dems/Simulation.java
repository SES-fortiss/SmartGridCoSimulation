/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems;

import java.time.Duration;
import java.time.LocalDateTime;

import dems.helper.DEMSActorFactory;
import dems.topologies.*;
import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;

/**
 * 
 * This is the main class for the VPP simulation.
 * It is executed with Eclipse.
 * 
 * This Simulation generate Output Files to ~/www2/root/... 
 * 
 * @author bytschkow
 *
 */

public class Simulation {	
	
	/****************************
	 * SETTINGS
	 * 
	 * There are 2 Options:
	 * - start the Simulation with timeSteps only
	 * - start the Simulation with realTimes only
	 * 
	 * You decide!
	 * 
	 ****************************/	
	
	public static LocalDateTime startTime;
	public static LocalDateTime endTime;			
	public static Duration timeInterval;
	private static long maxTimeSteps;
	
	public static long getMaxTimeSteps() {
		return maxTimeSteps;
	}

	public static String season;
	public static String fileName;
	public static ActorTopology grid;
	
	public static void main(String[] args){
		//runWinter();
		runSummer();
	}
	
	public static void runAllSzenarios() {
		
		boolean noControlVersion = true;		
		boolean controlVersion = false;
		
		prio();
		
		if (noControlVersion) {
			noControl();
			noControlTrading();
			noControlComOut();
			noControlPlantOut();
			
			noControlTradingComOut();
			noControlTradingPlantOut();
			noControlComOutPlantOut();
			noControlTradingComOutPlantOut();
		}
		
		if (controlVersion) {
			prioTrading();
			prioComOut();
			prioPlantOut();
				
			prioTradingComOut();
			prioTradingPlantOut();
			prioComOutPlantOut();		
			prioTradingComOutPlantOut();
		}
	}
	
	/************************************************************************************
	 * Winter Simulation
	 * 
	 * Daten von den SWM:
	 * 13.01.2013 - 19.01.2013
	 * 
	 ************************************************************************************/
	
	public static void runWinter(){		
		startTime = LocalDateTime.of(2013,1,13,0,0);
		endTime = LocalDateTime.of(2013,1,15,0,0);				
		timeInterval = Duration.ofMinutes(15);
		
		Duration simulationTimeOfInterest = Duration.between(startTime, endTime);
		long timeIntervalMillis = timeInterval.toMillis();
		long simulationTimeOfInterestMillis = simulationTimeOfInterest.toMillis();
		
		maxTimeSteps = simulationTimeOfInterestMillis / timeIntervalMillis + 1;
		
		season = "winter";
		runAllSzenarios();
	}
	
	
	/************************************************************************************
	 * Sommer Simulation	 *
	 *  
	 * Daten von den SWM:
	 * 01.08.2013 - 08.08.2013
	 ************************************************************************************/
	
	public static void runSummer(){
		startTime = LocalDateTime.of(2013,8,1,0,0);
		endTime = LocalDateTime.of(2013,8,7,23,45);				
		timeInterval = Duration.ofMinutes(15);		
		season = "sommer";
		
		Duration simulationTimeOfInterest = Duration.between(startTime, endTime);
		long timeIntervalMillis = timeInterval.toMillis();
		long simulationTimeOfInterestMillis = simulationTimeOfInterest.toMillis();
		
		maxTimeSteps = simulationTimeOfInterestMillis / timeIntervalMillis + 1;
		
		runAllSzenarios();
	}
	
	public static void start(){
		SimulationStarter.saveGridTopologyPlot(grid);
		
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
		
		ActorSystem actorSystem = simulationStarter.initialiseActorSystem(grid);
		simulationStarter.startSimulation(actorSystem, startTime, endTime, timeInterval);	
	}
	
	/************************************************************************************
	 * noControl Methoden
	 ************************************************************************************/
	private static void noControl() {
		fileName = season + "/noControl.json";
		grid = TopologyNoControl.createTopology();
		
		start();
	}
	
	private static void noControlTrading() {
		fileName = season + "/noControlTrading.json";		
		grid = TopologyNoControl.createTopology();
		
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());
		
		start();	
	}
	
	private static void noControlComOut() {
		fileName = season + "/noControlComOut.json";
		grid = TopologyNoControl.createTopology();
		
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));
		
		start();	
	}
	
	private static void noControlTradingComOut() {
		fileName = season + "/noControlTradingComOut.json";
		grid = TopologyNoControl.createTopology();
		
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));		
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());

		start();
	}
	
	private static void noControlPlantOut() {
		fileName = season + "/noControlPlantOut.json";
		grid = TopologyNoControl.createTopology();
		
		// Die BioGasAnlage TierparkHellabrunn soll ausfallen können
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));
		start();
	}
	
	private static void noControlTradingPlantOut() {
		fileName = season + "/noControlTradingPlantOut.json";
		grid = TopologyNoControl.createTopology();
		
		// Die BioGasAnlage TierparkHellabrunn soll ausfallen können
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());
		start();
	}
	
	private static void noControlComOutPlantOut() {
		fileName = season + "/noControlComOutPlantOut.json";
		grid = TopologyNoControl.createTopology();
		
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));
		
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));

		start();
	}
	
	private static void noControlTradingComOutPlantOut() {
		fileName = season + "/noControlTradingComOutPlantOut.json";
		grid = TopologyNoControl.createTopology();
		
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());
		
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));
		
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));

		start();
	}
	

	
	/************************************************************************************
	 * prio Methoden
	 ************************************************************************************/
	private static void prio() {
		fileName = season + "/prio.json";
		grid = TopologyPrioControl.createTopology();
		start();
	}
	
	private static void prioTrading() {
		fileName = season + "/prioTrading.json";
		grid = TopologyPrioControl.createTopology();
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());
		start();
	}

	private static void prioComOut() {
		fileName = season + "/prioComOut.json";
		grid = TopologyPrioControl.createTopology();		
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));
		start();
	}
	
	private static void prioPlantOut() {
		fileName = season + "/prioPlantOut.json";
		grid = TopologyPrioControl.createTopology();	
		
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));
		
		start();
	}
	
	private static void prioTradingComOut() {
		fileName = season + "/prioTradingComOut.json";
		grid = TopologyPrioControl.createTopology();
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());
		
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));
		start();
	}
	
	private static void prioTradingPlantOut() {
		fileName = season + "/prioTradingPlantOut.json";
		grid = TopologyPrioControl.createTopology();
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());
		
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));
		
		start();
	}
	
	private static void prioComOutPlantOut() {
		fileName = season + "/prioComOutPlantOut.json";
		grid = TopologyPrioControl.createTopology();		
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));
		
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));
		
		start();
	}	

	private static void prioTradingComOutPlantOut() {
		fileName = season + "/prioTradingComOutPlantOut.json";
		grid = TopologyPrioControl.createTopology();
		grid.addActorAsChild("DEMS/.Handel", DEMSActorFactory.createTradingActor());
		grid.removeActor("DEMS/Isarwerk1.1");
		grid.addActorAsChild("DEMS/Isarwerk1.1", DEMSActorFactory.createComOutWaterActor(800.));
		grid.removeActor("DEMS/BioGasTierparkHellabrunn");
		grid.addActorAsChild("DEMS/BioGasTierparkHellabrunn", DEMSActorFactory.createUnreliableBioGas(300.0));
		start();
	}			
}
