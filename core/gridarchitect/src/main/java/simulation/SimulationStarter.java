/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package simulation;

import helper.GlobalOptions;
import helper.HTMLHelper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import resultLogger.ConstantLogger;
import resultLogger.utils.AnswerContent_LoggerInterface;
import resultLogger.utils.ConstantResultLogger;
import scala.concurrent.duration.Duration;
import topology.ActorTopology;
import visualization.GridD3Json;
import akka.actor.ActorSystem;
import akka.actor.Inbox;
import akka.basicActors.LoggingMode;
import akka.systemActors.ActorMonitor;
import akka.systemActors.ActorSupervisor;
import akka.systemMessages.StartMessage;
import configuration.GridArchitectConfiguration;

/**
 * 
 * This is the SimulationStarter Class it contains everything to get the simulation running
 * 
 * @author bytschkow
 * 
 */

public abstract class SimulationStarter {
	
	public static ActorSystem actorSystemRef;

	@SuppressWarnings("deprecation")
	public static ActorSystem initialiseActorSystem(final ActorTopology topology) {
		
		ConstantLogger.logNumberOfActors(topology);
		
		int deadline = 10; // How many seconds to wait for gridInitialization

		System.out.println("********************************************");
		System.out.println("System is initializing");
		System.out.println("...                   ");

		ActorSystem actorSystem = ActorSystem.create(topology.simulationName);
		actorSystemRef = actorSystem;
		actorSystem.actorOf(ActorMonitor.create(LoggingMode.MINIMAL), "ActorMonitor");
		actorSystem.actorOf(ActorSupervisor.create(topology.simulationName, LoggingMode.MINIMAL, topology), "ActorSupervisor");

		/*
		 * Hier passiert folgendes:
		 * 
		 * Monitor bekommt die Inbox Adresse Supervisor bekommt eine Init Nachricht zum Aufbau der Systems Inbox wartet auf den Aufbau des Grids (mit
		 * deadline)
		 * 
		 * Sobald das Grid aufgebaut ist, wird eine Nachricht an die Inbox zurueckgegeben
		 */
		if (GridArchitectConfiguration.unitTestingEnable)
		{
			try
			{
				Thread.sleep(50);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
        }
        
        Inbox inbox = Inbox.create(actorSystem);
        
        inbox.send(actorSystem.actorFor("/user/ActorMonitor"), "Inbox intitialize");
        inbox.receive(Duration.create(deadline, TimeUnit.SECONDS));

		System.out.println("Actor System initiated");
		System.out.println("****************************************************************");

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
	public static void startSimulation(ActorSystem actorSystem, int startTimeStep, int maxTimeStep) {
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
	public static void startSimulation(ActorSystem actorSystem, LocalDateTime startTime, LocalDateTime endTime, java.time.Duration timeInterval) {
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
	public static void startSimulation(ActorSystem actorSystem, LocalDate localDate, java.time.Duration timeInterval) {
    	StartMessage message = new StartMessage(localDate, timeInterval);
    	startNow(actorSystem, message);
    }

	/**
	 * @param message
	 */
	@SuppressWarnings("deprecation")
	private static void startNow(ActorSystem actorSystem, StartMessage message) {
    	// Maximal time to wait until simulation ends in TimeUnis.* (see below)
    	int deadline = 1000; 
    	
        /*
         * NOTE:
         * The inbox is required, to check when the simulation finished. 
         * The depricated method is the easiest way of implementation, 
         * as the Inbox.send() method requires an ActorRef Object. 
         */
        Inbox inbox = Inbox.create(actorSystem);
        
        /*
         *  Send the monitor the address Reference of the inbox and the StartMessage
         */
        inbox.send(actorSystem.actorFor("/user/ActorMonitor"), "Inbox registration for start"); 
        actorSystem.actorSelection("/user/ActorMonitor").tell(message, null);    	
       	
        // Inbox receives a message from Monitor when Simulation is completed
        inbox.receive(Duration.create(deadline, TimeUnit.SECONDS));
        actorSystem.shutdown();
        actorSystem.awaitTermination();
        return;
   }

	public static void setResultLogger(AnswerContent_LoggerInterface answerlogger) {
		ConstantResultLogger myResultLogger = new ConstantResultLogger(answerlogger);
		ConstantLogger.setResultLogger(myResultLogger);
	}
	
	public static void stopSimulation(){
		actorSystemRef.shutdown();
	}

}
