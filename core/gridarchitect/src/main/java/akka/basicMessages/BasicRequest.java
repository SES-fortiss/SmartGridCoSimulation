/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.basicMessages;

import java.time.LocalDateTime;
import java.util.List;

import akka.actor.ActorRef;
import scala.Serializable;

/**
 * Created with IntelliJ IDEA. User: amack Date: 6/13/13 Time: 1:59 PM To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("serial")
public class BasicRequest implements Serializable {
	
	public final int timeStep;
	public final LocalDateTime timeValue;
	public final List<ActorRef> actorTrace;
	public final RequestContent requestContent;

	public BasicRequest(int timeStep, LocalDateTime timeValue, List<ActorRef> actorTrace, RequestContent requestContent) {
		this.timeStep = timeStep;
		this.timeValue = timeValue;
		this.actorTrace = actorTrace;
		this.requestContent = requestContent;
	}

	public BasicRequest(int timeStep, LocalDateTime timeValue) {
		this.timeStep = timeStep;
		this.timeValue = timeValue;
		this.actorTrace = null;
		this.requestContent = null;
	}

	// TODO Not used. Remove? 
	/*public BasicRequest() {
		this.timeStep = globalTime.getCurrentTimeStep();
		this.timeValue = globalTime.getCurrentTime();
		this.actorTrace = null;
		this.requestContent = null;
	}*/

	@Override
	public String toString() {
		return String.format("timeStep:%s, actorTrace:%s, requestContent:%s", timeStep, actorTrace, requestContent/* , recieverPath */);
	}
	
}
