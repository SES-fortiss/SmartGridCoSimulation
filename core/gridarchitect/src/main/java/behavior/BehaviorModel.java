/*
 * Copyright (c) 2011-2015, fortiss GmbH. Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified in the accompanying license
 * file LICENSE.txt located at the root directory of this software distribution.
 */

package behavior;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicActors.BasicActor;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import faultStrategy.backEnd.BasicFaultStrategy;

/**
 * This class represents the basic Parameter of an Actor Behavior. The
 * extension, i.e. a concrete BegaviorModel, shall include the expected
 * parameters such as installed capacity, etc.
 * 
 * @author bytschkow
 */

public abstract class BehaviorModel {

	public static String defaultActorName = "unknown";

	/**
	 * Basis Variables
	 */
	public BehaviorType behaviorType;
	public String actorName = defaultActorName;
	public String fullActorPath = null;

	public RequestContent requestContentReceived;
	public ArrayList<BasicAnswer> answerListReceived;

	public BasicActor actor;
	public LocalDateTime actualTimeValue;
	public BasicFaultStrategy currentStrategy;

	@Override
	public boolean equals(Object o) {
		if (o instanceof BehaviorModel) {
			BehaviorModel tmp = (BehaviorModel) o;
			return tmp.fullActorPath.equals(fullActorPath);
		} else
			return false;
	}

	public int getActualTimeStep() {
		return GlobalTime.currentTimeStep;
	}

	public BehaviorType getBehaviorType() {
		return behaviorType;
	}

	public BasicFaultStrategy getCurrentStrategy() {
		return currentStrategy;
	}

	public void setCurrentStrategy(BasicFaultStrategy currentStrategy) {
		this.currentStrategy = currentStrategy;
	}

	/**
	 * <strong>handleError()</strong> <br>
	 * This method shall be implemented by each individual behaviorModel. <br>
	 * It gets called by the Actor if one child did not reply to the request of the
	 * current time step. This method might be removed in future <br>
	 * 
	 * @param errors a list with all the Errors which were caused
	 */
	public abstract void handleError(LinkedList<ErrorAnswerContent> errors);

	/**
	 * <strong>handleRequest()</strong> <br>
	 * This method shall be implemented by each individual behaviorModel. <br>
	 * It gets called by the Actor to prepare the Request of the time step. <br>
	 */
	public abstract void handleRequest();

	/**
	 * <strong>makeDecision()</strong> <br>
	 * This method shall be implemented by each individual behaviorModel. <br>
	 * It gets called by the Actor to reach the decision of the time step. <br>
	 */
	public abstract void makeDecision();

	/**
	 * <strong>returnAnswerContentToSend()</strong> <br>
	 * This method shall be implemented by each individual behaviorModel. <br>
	 * It gets called by the Actor to receive the AnswerContent and send it. <br>
	 */
	public abstract AnswerContent returnAnswerContentToSend();

	/**
	 * <strong>returnRequestContentToSend()</strong> <br>
	 * This method shall be implemented by each individual behaviorModel. <br>
	 * It gets called by the Actor to receive the RequestContent and send it. <br>
	 */
	public abstract RequestContent returnRequestContentToSend();

	/**
	 * <strong>endSimulation()</strong> <br>
	 * This method can be implemented by each individual behaviorModel. <br>
	 * It gets called by the Actor if the Simulation shall end. <br>
	 * This method can be used to close open FileWriters or Communication Channels.
	 * <br>
	 */
	public void endSimulation() {
	}

	public String toString() {
		return ("BehaviorParameter: {" + "behaviorType=" + behaviorType + "}");
	}

	/**
	 * Can be overwritten, to clean recourses, when the actor stops.
	 */
	public void stop() {
	}

}
