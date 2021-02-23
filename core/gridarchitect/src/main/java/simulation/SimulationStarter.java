/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package simulation;

import static akka.pattern.Patterns.ask;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import akka.actor.ActorSystem;
import akka.basicActors.LoggingMode;
import akka.systemActors.ActorMonitor;
import akka.systemActors.ActorSupervisor;
import akka.systemMessages.StartMessage;
import akka.timeManagement.GlobalTime;
import helper.GlobalOptions;
import helper.HTMLHelper;
import resultLogger.ConstantLogger;
import resultLogger.utils.AnswerContent_LoggerInterface;
import resultLogger.utils.ConstantResultLogger;
import topology.ActorTopology;
import visualization.GridD3Json;

/**
 * 
 * This is the SimulationStarter Class it contains everything to get the simulation running
 * 
 * @author bytschkow
 * 
 */

public class SimulationStarter {
	
	/** Reference to GlobalTime object */
	private GlobalTime globalTime;
	public static ActorSystem actorSystemRefStatic;
	public ActorSystem actorSystemRefNonStatic;

	public SimulationStarter(GlobalTime globalTime) {
		this.globalTime = globalTime;
	}
	
	public ActorSystem initialiseActorSystem(ActorTopology topology) {
		
		ConstantLogger.logNumberOfActors(topology);
		
		int deadline = 10; // How many seconds to wait for gridInitialization

		System.out.println("********************************************");
		System.out.println("System is initializing");
		System.out.println("...                   ");

		ActorSystem actorSystem = ActorSystem.create(topology.simulationName);
		actorSystemRefStatic = actorSystem;
		actorSystemRefNonStatic = actorSystem;
		
		actorSystem.actorOf(ActorMonitor.create(LoggingMode.MINIMAL), "ActorMonitor");		
		actorSystem.actorOf(ActorSupervisor.create(topology.simulationName, LoggingMode.MINIMAL, topology), "ActorSupervisor");
		
		/**
		* Here's what happens:
		*
		* Monitor receives the inbox address Supervisor receives an init message to set up the systems Inbox is waiting for the grid to be set up (with
		* deadline)
		*
		* As soon as the grid is set up, a message is returned to the inbox
		*/
        
		actorSystem.actorSelection("/user/ActorSupervisor").tell(globalTime, null);
		actorSystem.actorSelection("/user/ActorMonitor").tell(globalTime, null);	
		
		CompletableFuture<Void> future =
			    ask(actorSystem.actorSelection("/user/ActorMonitor"), "Inbox intitialize", 
			    		Duration.ofSeconds(deadline)).toCompletableFuture().thenAccept(s -> {}); 
		
		try {
			future.get(); // blocking, i.e. it waits until the topology is created
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			
			System.out.println("Actor System could not be created correctly. Actor System terminating...");
			actorSystem.terminate();
			return null;
		} 

		return actorSystem;
	}

	public static void saveGridTopologyPlot(ActorTopology actorTopology) {
		String filePathHtml = GlobalOptions.inputFolderPath(actorTopology.simulationName) + "GridTopologyPlot.html";
		String filePathJson = GlobalOptions.inputFolderPath(actorTopology.simulationName) + "gridtopology.json";

		GridD3Json.saveHtml(filePathHtml);
		System.out.println("Saved - GridTopologyPlot to: " + filePathHtml);
		
		GridD3Json.saveAsJson(filePathJson, GridD3Json.convertToJson(actorTopology));		
		System.out.println("Saved - GridTopology to JSON: " + filePathJson);
		
		filePathJson = GlobalOptions.wwwFolder(actorTopology.simulationName) + "topology/gridtopology.json";
		GridD3Json.saveAsJson(filePathJson,GridD3Json.convertToJson(actorTopology));
		System.out.println("Saved - GridTopology to JSON: " + filePathJson);
		
		HTMLHelper.saveLinePlotHtml(filePathHtml.replace("GridTopologyPlot", "LinePlot").replace("Input", "Results"));
	}

	/**
	 * 
	 * Option A ein System zu starten - mit Zeitschritten
	 * 
	 * @param actorSystem
	 * @param startTimeStep
	 * @param maxTimeStep
	 */
	public void startSimulation(ActorSystem actorSystem, int startTimeStep, int maxTimeStep) {
		StartMessage message = new StartMessage(startTimeStep, maxTimeStep);
		startNow(actorSystem, message);
	}

	/**
	 * 
	 * Option B ein System zu starten - mit Anfangs-, Endzeitpunkt und Intervalangabe
	 * 
	 * @param actorSystem
	 * @param startTime
	 * @param endTime
	 * @param timeInterval
	 */
	public void startSimulation(ActorSystem actorSystem, LocalDateTime startTime, LocalDateTime endTime, java.time.Duration timeInterval) {
		StartMessage message = new StartMessage(startTime, endTime, timeInterval);
		startNow(actorSystem, message);
	}
		
	/**
	 * 
	 * Option C ein System zu starten - EchtzeitDemo
	 * 
	 * @param actorSystem
	 * @param 
	 * @param endTime
	 * @param timeInterval
	 */
	public void startSimulation(ActorSystem actorSystem, LocalDate localDate, java.time.Duration timeInterval) {
    	StartMessage message = new StartMessage(localDate, timeInterval);
    	startNow(actorSystem, message);
    }

	/**
	 * @param message
	 */
	private void startNow(ActorSystem actorSystem, StartMessage message) {
    	// Maximal time to wait until simulation ends in TimeUnis.* (see below)
    	int deadline = 100000; 
		
		CompletableFuture<Void> future =
			    ask(actorSystem.actorSelection("/user/ActorMonitor"), 
			    		message,
			    		Duration.ofSeconds(deadline)).toCompletableFuture().thenAccept(s -> {}); 
		
		try {
			future.get(); // blocking, i.e. it waits until the topology is created			
			System.out.println("SimulationStarter: Simulation completed. Terminating system.");			
			actorSystem.terminate();
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
        
        return;
    }

	public static void setResultLogger(AnswerContent_LoggerInterface answerlogger) {
		ConstantResultLogger myResultLogger = new ConstantResultLogger(answerlogger);
		ConstantLogger.setResultLogger(myResultLogger);
	}
	
	public static void stopSimulationStatic(){
		actorSystemRefStatic.terminate();
	}
	
	public void stopSimulation(){
		actorSystemRefNonStatic.terminate();
	}
	
}


