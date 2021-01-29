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

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.ReceiveTimeout;
import akka.actor.UntypedActor;
import akka.basicActors.BasicActor;
import akka.basicActors.LoggingMode;
import akka.basicMessages.AnswerContent;
import akka.systemMessages.CompletionMessage;
import akka.systemMessages.EndSimulationMessage;
import akka.systemMessages.StartMessage;
import akka.systemMessages.TimeStepMessage;
import akka.systemMessages.TimeoutMessage;
import akka.timeManagement.GlobalTime;
import behavior.advancedBehaviorModels.AbstractMessageHelper;
import configuration.GridArchitectConfiguration;
import powerflowApi.PowerflowApi;
import powerflowApi.PowerflowMapping;
import resultLogger.ConstantLogger;
import simulation.SimulationStarter;

public class ActorMonitor extends UntypedActor {

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
	private ActorRef inboxRef;
	private ActorRef actorSupervisorRef;

	// Lucs stuff
	private int previousErrors;
	private int previousHistory;

	/** Reference to global time in {@link SimulationStarter} */
	GlobalTime globalTime;

	/*
	 * Constructor
	 */
	public ActorMonitor(LoggingMode operationMode) {
		this.operationMode = operationMode;
		previousErrors = 0;
		previousHistory = 0;
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
		shutDownSimulation();
		System.out.println("ActorMonitor STOP");
	}

	@Override
	public void onReceive(Object message) throws Exception {
		// Message exchange with Classes outside the ActorSystem should use the Inbox
		
		if (message instanceof GlobalTime) {
			globalTime = (GlobalTime) message;
		}
		
		if (message == "Inbox intitialize") {
			inboxRef = getSender();
			this.getContext().system().actorSelection("/user/ActorSupervisor").tell("Init", getSelf());
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

	/**
	 * 
	 */
	private void endTimeStep() {

		/*
		 * Luc's extension to providing the ErrorStatics
		 */
		if (GridArchitectConfiguration.printErrorStatistic) {
			System.out.println("How many Errors occurred " + (BasicActor.NumberOfErrors - previousErrors));
			System.out
					.println("How often was the history used " + (AbstractMessageHelper.historyUsed - previousHistory));
			System.out.println("History insert Time " + BasicActor.InsertTime + " ms ");
			System.out.println("History search Time " + AbstractMessageHelper.searchTime + " ms ");

			BasicActor.InsertTime = 0;
			AbstractMessageHelper.searchTime = 0;

			previousErrors = BasicActor.NumberOfErrors;
			previousHistory = AbstractMessageHelper.historyUsed;
		}

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
//			System.out.println(ld);
			LocalTime t = LocalTime.now();
//			System.out.println(t);

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
		System.out.println("Terminating Actor System");
		System.out.println("Simulation took " + (System.currentTimeMillis() - this.startSimulationComputation) + "ms");
		System.out.println("****************************************************************");

		ConstantLogger.endSimulation();

		this.actorSupervisorRef.tell(new EndSimulationMessage(), getSelf());
	}

	private void shutDownSimulation() {
		this.inboxRef.tell("Simulation Completed, terminating Actor System", getSelf());
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
