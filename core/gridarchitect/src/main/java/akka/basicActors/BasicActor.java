/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.basicActors;

import static akka.dispatch.Futures.sequence;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.ReceiveTimeout;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.BasicRequest;
import akka.basicMessages.RequestContent;
import akka.japi.pf.ReceiveBuilder;
import akka.pattern.Patterns;
import akka.systemActors.CommunicationPattern;
import akka.systemMessages.EndSimulationMessage;
import akka.timeManagement.CurrentTimeStepSubscriber;
import akka.timeManagement.CurrentTimeSubscriber;
import akka.timeManagement.GlobalTime;
import behavior.InactiveBehaviorModel;
import configuration.GridArchitectConfiguration;
import scala.concurrent.Await;
import scala.concurrent.Future;
import topology.ActorTopology;

/**
 * 
 * General purpose Actor Behavior representing any possible Grid Entity.
 * 
 * <br>
 * <br>
 * <strong>IMPORTANT</strong> <br>
 * When individual behavior is required override the makeDecision() method of
 * the assigned behaviorModel. This gives your Actor an own Behavior
 * 
 * @author amack
 * @author bytschkow
 *
 */

public class BasicActor extends AbstractActor implements CurrentTimeStepSubscriber, CurrentTimeSubscriber {

	/** Current discrete time step */
	int currentTimeStep;
	/** Current continuous time */
	LocalDateTime currentTime;
	/** Period of a time step (optional and used sometimes if required) */
	Duration timeStepDuration;
	
	/** received BasicRequest with Time and RequestContent */
	public BasicRequest requestReceived;
	/** RequestContent is subject for inheritance */
	public RequestContent requestContentReceived;
	
	/** received Answers of the children */
	public ArrayList<BasicAnswer> answerListReceived = new ArrayList<BasicAnswer>();

	// Options is subject for inheritance
	public ActorOptions actorOptions;
	// AnswerContent is subject for inheritance
	public AnswerContent answerContent;

	//public List<ActorRef> downStreamTrace = new ArrayList<ActorRef>();
	//public List<ActorRef> upStreamTrace = new ArrayList<ActorRef>();

	private String simulationName;
	private ActorTopology actorTopology;
	
	/**
	 * This is default create method for the {@link BasicActor}
	 * 
	 * @param simulationName - SimulationName
	 * @param actorPath      - the "id" of the Actor
	 * @param actorTopology  - the gridTopology to locate the actor and its
	 *                       parameters
	 */
	public static Props create(String simulationName, String actorPath, ActorTopology actorTopology) {
		// Calls the constructor
		return Props.create(BasicActor.class, simulationName, actorPath, actorTopology);
	}

	/**
	 * Constructor of a BasicActors
	 */
	public BasicActor(String simulationName, String actorPath, ActorTopology actorTopology) {
		this.simulationName = simulationName;
		this.actorTopology = actorTopology;
		try {
			extractActorOptions(actorPath, actorTopology);
			this.actorOptions.behaviorModel.fullActorPath = actorPath;
			this.actorOptions.behaviorModel.actorName = actorPath.substring(actorPath.lastIndexOf("/") + 1,
					actorPath.length());
			this.actorOptions.behaviorModel.actor = this;
		} catch (Exception e) {
			e.printStackTrace();
			this.actorOptions.behaviorModel = new InactiveBehaviorModel();
		}

		checkChildrenBuilderOptionsMap();
		register();
	}

	/**
	 * checks if all ActorOptions are valid
	 */
	private void extractActorOptions(String path, ActorTopology topology) throws NullPointerException {
		this.actorOptions = topology.getActorOptions(path);
		if (this.actorOptions.childrenNameList == null)
			throw new NullPointerException(
					String.format("ChildrenNameList is invalid [%s]", this.actorOptions.childrenNameList));
		if (this.actorOptions.directConnectionsPathList == null)
			throw new NullPointerException(
					String.format("DirectConnectionList is invalid [%s]", this.actorOptions.directConnectionsPathList));
		if (this.actorOptions.behaviorModel == null)
			throw new NullPointerException(
					String.format("BehaviorParameter is invalid [%s]", this.actorOptions.behaviorModel));
	}

	// Registers the actor to the ActorSupervisor.
	private void register() {
		getContext().actorSelection("/user/ActorSupervisor").tell("Register", getSelf());
	}

	public ActorOptions getBasicActor() {
		return this.actorOptions;
	}

	public String getSimplePath() {
		return getSelf().path().toString().substring(getSelf().path().toString().indexOf("/user/"));
	}

	/*
	 * Checks the given grid parameters for validity. (Does every actor have a set
	 * of parameters and are those complete)
	 */
	private void checkChildrenBuilderOptionsMap() {
		String simplePath = getSelf().path().toString().substring(getSelf().path().toString().indexOf("/user/"));
		for (String childName : this.actorOptions.childrenNameList) {
			if (this.actorTopology.getActorOptions(simplePath + "/" + childName) != null) {
				this.spawnChild(childName, actorTopology);
				// TODO add the flag: hasAlreadyBeenSpawned, if required
				// gridTopology.getTopology().get(actorPath).hasAlreadyBeenSpawned = true;
			}
		}
	}

	
	@Override
	  public Receive createReceive() {
		
		ReceiveBuilder receiveBuilder = ReceiveBuilder.create();
		
		receiveBuilder
			.match(GlobalTime.class, this::handleGlobalTime)	
			.match(BasicRequest.class, this::handleBasicRequest)
			.match(EndSimulationMessage.class, this::handleEndSimulationMessage)
			.match(ReceiveTimeout.class, s-> System.out.println("received Timeout"));
		
		receiveBuilder.matchAny( o -> System.out.println("received unknown message"));
		
	    return receiveBuilder.build();
	  }
	
	private void handleGlobalTime(GlobalTime msg) {
		msg.subscribeToCurrentTimeStep(this);
		msg.subscribeToCurrentTime(this);
	}
	
	private void handleBasicRequest(BasicRequest request) {		
		try {					
			this.currentTimeStep = request.timeStep;
			this.currentTime = request.timeValue;
			this.timeStepDuration = request.timeStepDuration;
			
			//this.downStreamTrace = new ArrayList<ActorRef>();
			//this.downStreamTrace.addAll(request.actorTrace);
			//this.downStreamTrace.add(getSelf());

			this.requestReceived = request;
			this.requestContentReceived = request.requestContent;						
						
			CommunicationPattern.doSomeWork(this);

		} catch (Exception e) {
			System.out.println(getSelf() + "   " + e);
			getSender().tell(new akka.actor.Status.Failure(e), getSelf());
		}
	}
	
	/**
	 * The method delegated the message to all children and
	 * executes the endSimulation() method of every behaviour model.
	 * @param endSimMessage
	 */
	private void handleEndSimulationMessage(EndSimulationMessage endSimMessage) {
		try {
			this.executeEndSimulationLogic();
			this.actorOptions.behaviorModel.endSimulation();
			getSender().tell(new EndSimulationMessage(), getSelf());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * OLD Akka internal method defining the actor Message handling. 
	 * This method is kept as a reference for debugging and testing.
	 * 
	public void onReceive(Object message) throws Exception {

		if (message instanceof GlobalTime) {
			GlobalTime globalTime = (GlobalTime) message;
			globalTime.subscribeToCurrentTimeStep(this);
			globalTime.subscribeToCurrentTime(this);
		}

		if (message instanceof DisableReportingMessage) {
			this.reportToParentEnabled = false;
			return;
		}

		if (message instanceof DebugMessage) {
			this.debug((DebugMessage) message);
			return;
		}

		if (message instanceof DirectMessage) {
			this.upStreamTrace = new ArrayList<ActorRef>();
			this.upStreamTrace.addAll(((DirectMessage) message).actorTrace);
			this.upStreamTrace.add(getSelf());

			answerSpecificActor(getSender());
			return;
		}

		if (message instanceof BasicRequest) {
			try {
				BasicRequest request = (BasicRequest) message;
				
				this.currentTimeStep = request.timeStep;
				this.currentTime = request.timeValue;
				this.timeStepDuration = request.timeStepDuration;
				
				this.downStreamTrace = new ArrayList<ActorRef>();
				this.downStreamTrace.addAll(request.actorTrace);
				this.downStreamTrace.add(getSelf());

				doSomeWork((BasicRequest) message);

			} catch (Exception e) {
				System.out.println(getSelf() + "   " + e);
				getSender().tell(new akka.actor.Status.Failure(e), getSelf());
				throw e;
			}
			return;
		}

		if (message == ReceiveTimeout.getInstance()) {
			System.out.println("timeout");
			return;
		}

		if (message instanceof EndSimulationMessage) {
			this.executeAskLogicEndSimulation();
			this.actorOptions.behaviorModel.endSimulation();
			getSender().tell(new EndSimulationMessage(), getSelf());
		}

	}
	*/

	private void executeEndSimulationLogic() throws Exception {
		if (this.getContext().getChildren().iterator().hasNext()) {

			// Patterns.ask() returns a Future<Object>
			List<Future<Object>> childrenResponseList = new ArrayList<Future<Object>>();

			for (ActorRef child : this.getContext().getChildren()) {
				childrenResponseList.add(Patterns.ask(child, new EndSimulationMessage(),
						GridArchitectConfiguration.childrenResponseTime));// childrenResponseListTimeOut
			}

			Future<Iterable<Object>> childrenFuturesIterable = sequence(childrenResponseList,
					this.getContext().system().dispatcher());
			Await.result(childrenFuturesIterable,
					scala.concurrent.duration.Duration.create((GridArchitectConfiguration.childrenResponseTime), TimeUnit.MILLISECONDS));
		}

	}

	/*
	 * Spawns a child GridActor according to the childrenList from the topology.
	 */
	void spawnChild(String actorName, ActorTopology actorTopology) {
		String actorPath = getSelf().path().toString().substring(getSelf().path().toString().indexOf("/user/")) + "/"
				+ actorName;
		getContext().actorOf(BasicActor.create(simulationName, actorPath, actorTopology), actorName);
	}

	/*
	 * Helper method to avoid an infinite askChildren loop when directConnections
	 * are defined sloppy. (Detects a short circuit during runtime)
	 
	@SuppressWarnings("unlikely-arg-type")
	public boolean detectCircle() {
		boolean circle = false;
		for (String directConnection : this.actorOptions.directConnectionsPathList)
			if (this.downStreamTrace.contains(getContext().system().actorSelection(directConnection))) {
				circle = true;
			}
		return circle;
	}
	*/

	/**
	 * This methods gets called by the communicationPattern after the request
	 * Message is received It gives the possibility to react to that before sending
	 * a request to available children
	 */
	public void handleRequest() {
		this.actorOptions.behaviorModel.requestContentReceived = this.requestContentReceived;
		this.actorOptions.behaviorModel.handleRequest();
	}

	/*******************************************
	 * Wrapper method for all defined Behaviors.
	 ******************************************/
	
	public void makeDecision() {		
		this.actorOptions.behaviorModel.answerListReceived = this.answerListReceived;
		this.actorOptions.behaviorModel.makeDecision();
	}

	/*
	 * Wrapper method to send all kinds of AnswerContents.
	 */
	public AnswerContent returnAnswerContentToSend() {
		return this.actorOptions.behaviorModel.returnAnswerContentToSend();
	}

	public RequestContent returnRequestContentToSend() {
		return this.actorOptions.behaviorModel.returnRequestContentToSend();
	}

	public int getCurrentTimeStep() {
		return currentTimeStep;
	}

	public LocalDateTime getCurrentTime() {
		return currentTime;
	}
	
	public Duration getTimeStepDuration() {
		return timeStepDuration;
	}

	@Override
	public void postStop() throws Exception {
		actorOptions.behaviorModel.stop();
		super.postStop();
	}

	@Override
	public void update(int currentTimeStep) {
		this.currentTimeStep = currentTimeStep;
	}

	@Override
	public void update(LocalDateTime currentTime) {
		this.currentTime = currentTime;
	}
}
