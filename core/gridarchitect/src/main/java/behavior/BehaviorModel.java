/*
 * Copyright (c) 2011-2015, fortiss GmbH. Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified in the accompanying license
 * file LICENSE.txt located at the root directory of this software distribution.
 */

package behavior;

import java.util.ArrayList;

import akka.basicActors.BasicActor;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;

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

	@Override
	public boolean equals(Object o) {
		if (o instanceof BehaviorModel) {
			BehaviorModel tmp = (BehaviorModel) o;
			return tmp.fullActorPath.equals(fullActorPath);
		} else
			return false;
	}

	public BehaviorType getBehaviorType() {
		return behaviorType;
	}
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
