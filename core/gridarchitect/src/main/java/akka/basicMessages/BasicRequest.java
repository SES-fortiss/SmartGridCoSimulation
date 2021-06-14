/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.basicMessages;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import akka.actor.ActorRef;

/**
 * BasicRequest represents the message received from the parent actor.
 * It contains some basic information for the simulation, such as TIME information 
 * and a RequestContent (an interface for any requests content).
 */
public class BasicRequest {
	
	public final int timeStep;
	public final LocalDateTime timeValue;
	public final Duration timeStepDuration;
	public final List<ActorRef> actorTrace;
	public final RequestContent requestContent;

	public BasicRequest(
			int timeStep, 
			LocalDateTime timeValue, 
			Duration timeStepDuration, 
			List<ActorRef> actorTrace, 
			RequestContent requestContent) {
		this.timeStep = timeStep;
		this.timeValue = timeValue;
		this.timeStepDuration = timeStepDuration;
		this.actorTrace = actorTrace;
		this.requestContent = requestContent;
	}

	@Override
	public String toString() {
		return String.format("timeStep:%s, timeValue:%s, actorTrace:%s, requestContent:%s", timeStep, timeValue, actorTrace, requestContent);
	}
	
}
