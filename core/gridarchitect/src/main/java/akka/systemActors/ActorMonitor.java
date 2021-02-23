/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.fortiss.powerflowsim.exporters.RDFExporter;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.ReceiveTimeout;
import akka.basicActors.LoggingMode;
import akka.basicMessages.AnswerContent;
import akka.japi.pf.ReceiveBuilder;
import akka.systemMessages.CompletionMessage;
import akka.systemMessages.EndSimulationMessage;
import akka.systemMessages.StartMessage;
import akka.systemMessages.TimeStepMessage;
import akka.systemMessages.TimeoutMessage;
import akka.timeManagement.GlobalTime;
import configuration.GridArchitectConfiguration;
import powerflowApi.PowerflowApi;
import powerflowApi.PowerflowMapping;
import simulation.SimulationStarter;


/**
 * The actor monitor is the guard actor (the first actor that is created). 
 * It is responsible to take care about the timing progress of the simulation.
 * It handles time steps as well as current time.
 * It tells the ActorSupervisor to start the next iteration.
 * It completes the simulation.
 * 
 * @author bytschkow
 *
 */
public class ActorMonitor extends AbstractActor {

	public LocalDateTime startTime;
	public LocalDateTime endTime;

	public long timeIntervalINT;
	public boolean realTimeMode = false;
	public LocalDate referenceDay;

	LoggingMode operationMode;
	public boolean considersTimeMode = false;

	private long startTimeStepComputation = System.currentTimeMillis();
	private long startSimulationComputation;

	public final Map<String, AnswerContent[]> behaviorMessageStateMap = new HashMap<String, AnswerContent[]>();
	
	private ActorRef externalRef;
	private ActorRef actorSupervisorRef;

	/** Reference to global time in {@link SimulationStarter} */
	GlobalTime globalTime;

	/*
	 * Constructor
	 */
	public ActorMonitor(LoggingMode operationMode) {
		this.operationMode = operationMode;
	}
	
	/*
	 * This is create method for the ActorMonitor
	 */
	public static Props create(LoggingMode operationMode) {
		return Props.create(ActorMonitor.class, operationMode);
	}

	@Override
	public void preStart() {
		this.startSimulationComputation = System.currentTimeMillis();
	}

	@Override
	public void postStop() {
		System.out.println("ActorMonitor STOP");
	}
	
	@Override
	public Receive createReceive() {
		ReceiveBuilder receiveBuilder = ReceiveBuilder.create();
		
		receiveBuilder
			.match(GlobalTime.class, s -> this.globalTime = s)	
			.match(CompletionMessage.class, this::handleCompletionMessage)
			.match(TimeoutMessage.class, s -> endSimulation())
			.match(StartMessage.class, this::startSimulation)
			.match(ReceiveTimeout.class, s-> System.out.println("ActorMonitor: received Timeout"))			
			.match(String.class, this::handleString);
		
		receiveBuilder.matchAny( o -> System.out.println("ActorMonitor: received unknown message"));
		
	    return receiveBuilder.build();
	}
	
	private void handleCompletionMessage(CompletionMessage completionMessage) {
		this.actorSupervisorRef = getSender();
		powerFlowMapping();

		endTimeStep();
		increaseTimeStep();
		startNewTimeStep();
	}
	
	
	private void handleString(String message) {

		if (message == "Inbox intitialize") {
			
			//System.out.println("Monitor: Message arived");
			
			externalRef = getSender();			
			getContext().system().actorSelection("/user/ActorSupervisor").tell("Init", getSelf());
			return;
		}

		if (message == "System created") {
			System.out.println("Actor System initiated. Generation took " + (System.currentTimeMillis() - startTimeStepComputation)
					+ "ms, active Threads: " + Thread.activeCount());
			System.out.println("****************************************************************");
			externalRef.tell("System created", getSelf());
			return;
		}

		if (message == "TimeStep") {
			getSender().tell(globalTime.getCurrentTimeStep(), getSelf());
			return;
		}

		if (message == "Register") {
			System.out.println("reg monitor");
			return;
		}

		if (message == "Inbox registration for start") {
			externalRef = getSender();
			return;
		}

		if (message == "ShutDown") {				
			externalRef.tell("Simulation Completed, terminating Actor System", getSelf());
			return;
		}
	}

	// OLD method for reference
	
	/*
	public void onReceive(Object message) throws Exception {
		// Message exchange with Classes outside the ActorSystem should use the Inbox
		
		if (message instanceof GlobalTime) {
			globalTime = (GlobalTime) message;
		}
		
		if (message == "Inbox intitialize") {
			inboxRef = getSender();
			getContext().system().actorSelection("/user/ActorSupervisor").tell("Init", getSelf());
			return;
		}

		if (message == "System created") {
			System.out.println("Generation took " + (System.currentTimeMillis() - startTimeStepComputation)
					+ "ms, active Threads: " + Thread.activeCount());
			System.out.println("****************************************************************");
			inboxRef.tell("System created", getSelf());
			return;
		}

		if (message instanceof CompletionMessage) {
			this.actorSupervisorRef = getSender();
			powerFlowMapping();

			endTimeStep();
			increaseTimeStep();
			startNewTimeStep();

			return;
		}

		if (message instanceof TimeoutMessage) {
			endSimulation();
			return;
		}

		if (message instanceof StartMessage) {
			this.startSimulation((StartMessage) message);
			return;
		}

		if (message == "TimeStep") {
			getSender().tell(globalTime.getCurrentTimeStep(), getSelf());
			return;
		}

		if (message == "Register") {
			System.out.println("reg monitor");
			return;
		}

		if (message == ReceiveTimeout.getInstance()) {
			System.out.println("timeout");
			return;
		}

		if (message == "Inbox registration for start") {
			inboxRef = getSender();
			return;
		}

		if (message == "ShutDown") {
			shutDownSimulation();
			return;
		}
	}
	*/

	/**
	 * 
	 */
	private void endTimeStep() {
		System.out.println("TimeStep " + (globalTime.getCurrentTimeStep()) + " took "
				+ (System.currentTimeMillis() - startTimeStepComputation) + "ms, active Threads: "
				+ Thread.activeCount() + "   Starting TimeStep: " + (globalTime.getCurrentTimeStep() + 1));
		System.out.println("****************************************************************");
	}

	/**
	 * 
	 */
	private void increaseTimeStep() {
		globalTime.increaseCurrentTimeStep();

		if (considersTimeMode) {
			globalTime.setCurrentTime(startTime.plusSeconds(globalTime.getCurrentTimeStep() * timeIntervalINT));
			globalTime.setNextTime(globalTime.getCurrentTime().plusSeconds(timeIntervalINT));
		}

		if (realTimeMode) {
			globalTime.setCurrentTime(LocalDateTime.of(referenceDay, LocalTime.now()));
			globalTime.setNextTime(globalTime.getCurrentTime().plusSeconds(timeIntervalINT));
		}

	}

	public void startSimulation(StartMessage message) {

		setGlobalTimeSettings(message);
		externalRef = getSender();

		System.out.println("StartMessage: " + message);
		System.out.println("****************************************************************");

		startNewTimeStep();
	}

	private void setGlobalTimeSettings(StartMessage message) {
		if (message.timeMode) {
			// timeIntervalINT in seconds
			this.considersTimeMode = true;
			this.timeIntervalINT = message.timeInterval.getSeconds();
			this.startTime = message.startTime;
			int lastTimeStep = (int) (Duration.between(message.startTime, message.endTime).getSeconds()
					/ message.timeInterval.getSeconds());

			globalTime.setCurrentTime(message.startTime);
			globalTime.setPeriod(message.timeInterval);
			globalTime.setNextTime(globalTime.getCurrentTime().plus(globalTime.getPeriod()));
			globalTime.setLastTimeStep(lastTimeStep);
		}

		if (message.timeStepMode) {
			globalTime.setLastTimeStep(message.lastTimeStep);
			globalTime.setCurrentTimeStep(message.startTimeStep);
		}

		if (message.realTimeMode) {
			this.realTimeMode = true;

			LocalDate ld = message.referenceDay;
			System.out.println(ld);
			LocalTime t = LocalTime.now();
			System.out.println(t);

			globalTime.setCurrentTime(LocalDateTime.of(ld, t));
			globalTime.setPeriod(message.timeInterval);
			globalTime.setNextTime(globalTime.getCurrentTime().plus(globalTime.getPeriod()));

			this.timeIntervalINT = message.timeInterval.getSeconds();
			this.referenceDay = message.referenceDay;

			globalTime.setLastTimeStep(10000000);
		}
	}

	/**
	 * Triggers the execution of the powerFlowMapping
	 */
	public void powerFlowMapping() {

		if (PowerflowMapping.isMapped()) {
			PowerflowApi.execute();

			if (GridArchitectConfiguration.exportCIMFile) {
				File file = new File("CIM-Data-Timestep-" + globalTime.getCurrentTimeStep() + ".xml");
				RDFExporter.export(file, PowerflowMapping.getPowerflowTopology().CIMmodel);
				System.out.println("ActorMonitor.powerflowMapping(): export CIM to " + file.getAbsolutePath());
			}
		}
	}

	/*
	 * Increments TimeStep upon GridActorSupervisor completion and Broadcasts new
	 * TimeStep.
	 */
	public void startNewTimeStep() {

		if (globalTime.getCurrentTimeStep() < globalTime.getLastTimeStep()) {
			if (considersTimeMode)
				System.out.println(globalTime.getCurrentTime()); // Shows the actual Time before starting it

			startTimeStepComputation = System.currentTimeMillis();
			this.broadcastTimeStep();

			// If a delay is desired, the ActorMonitor waits before continuing.

			if (GridArchitectConfiguration.demoDelay > 0 || this.realTimeMode) {
				long sleepInMS = GridArchitectConfiguration.demoDelay;
				if (this.realTimeMode)
					sleepInMS = timeIntervalINT * 1000;
				try {
					Thread.sleep(sleepInMS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			endSimulation();
		}
	}

	private void endSimulation() {
		System.out.println("Simulation Done. Simulation took " + (System.currentTimeMillis() - this.startSimulationComputation) + "ms");
		System.out.println("****************************************************************");

		this.actorSupervisorRef.tell(new EndSimulationMessage(), getSelf());
		
		// Supervisor wird aufgefordert, den Anschluss vorzubereiten. Das passt auch.
		// Als Antwort wird "ShutDown" geschickt.
	}

	/**
	 * Broadcast new TimeStep to GridActorSupervisor.
	 */
	public void broadcastTimeStep() {
		getContext().system().eventStream().publish(new TimeStepMessage(globalTime.getCurrentTimeStep()));
	}

	public int getCurrentTimeStep() {
		return globalTime.getCurrentTimeStep();
	}

	public int getLastTimeStep() {
		return globalTime.getLastTimeStep();
	}

	public void setCurrentTimeStep(int value) {
		globalTime.setCurrentTimeStep(value);
	}

	public void setLastTimeStep(int value) {
		globalTime.setLastTimeStep(value);
	}



}
