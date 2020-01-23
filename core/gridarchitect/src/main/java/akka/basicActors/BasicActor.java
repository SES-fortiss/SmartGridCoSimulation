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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import actorMessageHistory.MessageHistory;
import akka.actor.ActorRef;
import akka.actor.Kill;
import akka.actor.Props;
import akka.actor.ReceiveTimeout;
import akka.actor.UntypedActor;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.BasicRequest;
import akka.basicMessages.RequestContent;
import akka.pattern.Patterns;
import akka.systemActors.MultipleCommunicationPattern;
import akka.systemMessages.DebugMessage;
import akka.systemMessages.DirectMessage;
import akka.systemMessages.DisableReportingMessage;
import akka.systemMessages.EndSimulationMessage;
import akka.systemMessages.TimeoutMessage;
import akka.timeManagement.CurrentTimeStepSubscriber;
import akka.timeManagement.CurrentTimeSubscriber;
import akka.timeManagement.GlobalTime;
import behavior.InactiveBehaviorModel;
import configuration.GridArchitectConfiguration;
import faultStrategy.backEnd.BasicFaultStrategy;
import resultLogger.ConstantLogger;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;
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

public class BasicActor extends UntypedActor implements CurrentTimeStepSubscriber, CurrentTimeSubscriber {

	/** Current time step */
	int currentTimeStep;
	/** Current day-time */
	LocalDateTime currentTime;

	public LocalDateTime timeValue;
	public ArrayList<BasicAnswer> answerListReceived = new ArrayList<BasicAnswer>();

	// Options is subject for inheritance
	public ActorOptions actorOptions;
	// AnswerContent is subject for inheritance
	public AnswerContent answerContent;
	// RequestContent is subject for inheritance
	public RequestContent requestContentReceived;

	public boolean reportToParentEnabled = true;

	public List<ActorRef> downStreamTrace = new ArrayList<ActorRef>();
	public List<ActorRef> upStreamTrace = new ArrayList<ActorRef>();

	public BasicRequest initializationMessageCache;
	public boolean overrideReportToParent;

	private String simulationName;
	private ActorTopology actorTopology;

	// Lucs stuff
	public MessageHistory messageHistory;
	public HashMap<Integer, LinkedList<AnswerContent>> allAnswers;
	private static final boolean debugging = false;
	// private BasicStrategy strategy;
	public static Integer NumberOfErrors = 0;
	public static long InsertTime = 0;

	/**
	 * here are the methods for the initialization of the actor
	 * 
	 */

	// Akka internal method getting called upon actor creation. Use if required
	// public void preStart() {}

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

	/*
	 * Constructor eines BasicActors
	 */
	public BasicActor(String simulationName, String actorPath, ActorTopology actorTopology) {
		this.simulationName = simulationName;
		this.actorTopology = actorTopology;
		this.messageHistory = new MessageHistory();
		this.allAnswers = new HashMap<>();
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
		initDirectConnections();
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

	/*
	 * Akka internal method defining the actor Message handling. Messages not
	 * handled here are discarded.
	 */
	@Override
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
				this.timeValue = request.timeValue;
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

	private void executeAskLogicEndSimulation() throws Exception {
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
					Duration.create((GridArchitectConfiguration.childrenResponseTime), TimeUnit.MILLISECONDS));
		}

	}

	private void debug(DebugMessage message) {
		System.out.println(message.power);
		getSender().tell(null, getSelf());
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
	 * Wrapper for the executeResponseLogic method. Actor commits suicide upon
	 * failure and sends a timeout to the GridActorSupervisor.
	 */
	public void askChildren() {
		try {
			this.executeAskLogic();
		} catch (Exception e) {
			getSelf().tell(Kill.getInstance(), getSelf());
			getContext().system().actorSelection("/user/ActorMonitor").tell(new TimeoutMessage(), getSelf());
		}
	}

	/*
	 * Actor reacts to RequestMessage by its parent (or the GridActorSupervisor)
	 */
	void doSomeWork(BasicRequest message) throws Exception {
		this.requestContentReceived = message.requestContent;
		MultipleCommunicationPattern.doSomeWork(this, message);
	}

	/*
	 * similar method to executeResponseLogic, but asks Actors defined in the
	 * directConnectionsList instead of its children.
	 */
	public void askSpecificActor() {
		MultipleCommunicationPattern.askSpecificActor(this);
	}

	/*
	 * Similar to answerParent but for directConnections
	 */
	private void answerSpecificActor(ActorRef sender) throws Exception {
		MultipleCommunicationPattern.answerSpecificActor(this, sender);
	}

	/*
	 * Helper method to avoid an infinite askChildren loop when directConnections
	 * are defined sloppy. (Detects a short circuit during runtime)
	 */
	@SuppressWarnings("unlikely-arg-type")
	public boolean detectCircle() {
		boolean circle = false;
		for (String directConnection : this.actorOptions.directConnectionsPathList)
			if (this.downStreamTrace.contains(getContext().system().actorSelection(directConnection))) {
				circle = true;
			}
		return circle;
	}

	/**
	 * Implementation of the akka ask/future pattern: ask children for their
	 * Decision and make own decision upon receiving all responses.
	 */
	private void executeAskLogic() throws Exception {
		MultipleCommunicationPattern.askChildren(this);
	}

	/**
	 * This methods gets called by the communicationPattern after the request
	 * Message is received It gives the possibility to react to that before sending
	 * a request to available children
	 */
	public void prepareRequest() {
		// System.out.println(this.actorOptions.behaviorModel.actorName+"
		// "+requestContentReceived);
		this.actorOptions.behaviorModel.requestContentReceived = this.requestContentReceived;
		this.actorOptions.behaviorModel.handleRequest();
	}

	/*******************************************
	 * Wrapper method for all defined Behaviors.
	 ******************************************/
	public void makeDecision() {

		this.actorOptions.behaviorModel.actualTimeValue = timeValue;
		this.actorOptions.behaviorModel.answerListReceived = this.answerListReceived;

		// if errorHandler is not Active, all ErrorCode stuff shall not be executed
		if (GridArchitectConfiguration.errorHandlerActive == false) {
			this.actorOptions.behaviorModel.makeDecision();
		} else {
			// if a child replied with null it should be interpreted as if the child did not
			// reply at all
			LinkedList<ErrorAnswerContent> errorAnswers = new LinkedList<ErrorAnswerContent>();
			for (BasicAnswer msg : this.actorOptions.behaviorModel.answerListReceived) {
				// the actor received a faulty message
				if (msg.answerContent instanceof ErrorAnswerContent) {
					if (GridArchitectConfiguration.printErrorStatistic)
						NumberOfErrors++;
					// System.out.println("Error "+msg.answerContent);
					ErrorAnswerContent tmp = (ErrorAnswerContent) msg.answerContent;
					// fill the answer with aditional information
					tmp.setReciever(this);
					tmp.setRequest(this.returnRequestContentToSend());
					tmp.setSender(msg.senderPath);
					tmp.setBasicAnswer(msg);

					ConstantLogger.logError(tmp);
					errorAnswers.add(tmp);
					if (debugging)
						System.out.println("in error?");
				} else {
					if (GridArchitectConfiguration.printErrorStatistic) {
						long starttime = System.currentTimeMillis();
						// add the healthy messages to the history
						this.messageHistory.addHistoryEntry(msg.timeStep, msg);
						long endtime = System.currentTimeMillis();

						long tmp = endtime - starttime;

						InsertTime += tmp;
					} else {
						// add the healthy messages to the history
						if (msg.answerContent == null) {
							System.out
									.println(this.actorOptions.behaviorModel.actorName + " " + requestContentReceived);
							System.out.println("sender is " + msg.senderPath);
						}
						this.messageHistory.addHistoryEntry(msg.timeStep, msg);
					}
				}
			}
			// remove all the null messages from the list
			for (ErrorAnswerContent message : errorAnswers) {
				// System.out.println("Error found "+message);
				this.actorOptions.behaviorModel.answerListReceived.remove(message.getBasicAnswer());
			}

			// check if all children replied to the request
			if (errorAnswers.isEmpty()) {
				// all children replied
				this.actorOptions.behaviorModel.makeDecision();
			} else {
				// some children did not reply
				this.actorOptions.behaviorModel.handleError(errorAnswers);

				this.actorOptions.behaviorModel.makeDecision();
			}

			if (GridArchitectConfiguration.unitTestingEnable) {
				// Add answers to the list, to check later in the tests,
				if (actorOptions.behaviorModel.getCurrentStrategy() != null) {
					BasicFaultStrategy strategy = actorOptions.behaviorModel.getCurrentStrategy();
					if (strategy != null && strategy.isFinished()) {
						AnswerContent answer = this.actorOptions.behaviorModel.returnAnswerContentToSend();
						// System.out.println(this.actorOptions.behaviorModel.actorName+" added
						// "+answer+" to test");
						insertAnswerContent(answer);
					}
				}
				// Add answers to the list, to check later in the tests
				if (actorOptions.behaviorModel.actorName.equals("SimpleCommunication")) {
					insertAnswerContent(this.actorOptions.behaviorModel.returnAnswerContentToSend());
				}
			}
		} // end of else code from errorHandling
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

	private void initDirectConnections() {
		// Disable Reporting um doppelten Versand der Reports zu vermeiden
		if (!this.actorOptions.directConnectionsPathList.isEmpty()) {
			for (String dcPath : this.actorOptions.directConnectionsPathList) {
				getContext().actorSelection(dcPath).tell(new DisableReportingMessage(), getSelf());
			}
			System.out.println(getSelf().path() + "disabling ");
		}
	}

	private void insertAnswerContent(AnswerContent answer) {
		LinkedList<AnswerContent> res = this.allAnswers.get(currentTimeStep);
		if (res == null) {
			res = new LinkedList<>();
		}

		res.add(answer);

		this.allAnswers.put(currentTimeStep, res);
	}

	public int getCurrentTimeStep() {
		return currentTimeStep;
	}

	public LocalDateTime getCurrentTime() {
		return currentTime;
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
