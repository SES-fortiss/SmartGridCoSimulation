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

import scala.Serializable;
import akka.actor.ActorRef;
import akka.systemActors.GlobalTime;

/**
 * Created with IntelliJ IDEA. User: amack Date: 6/13/13 Time: 1:59 PM To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("serial")
public class BasicRequest implements Serializable {
	public final int timeStep;
	public final LocalDateTime timeValue;
	public final List<ActorRef> actorTrace;
	public final RequestContent requestContent;

	public BasicRequest(int timeStep, List<ActorRef> actorTrace, RequestContent requestContent) {
		this.timeStep = timeStep;
		this.timeValue = GlobalTime.currentTime;
		this.actorTrace = actorTrace;
		this.requestContent = requestContent;
	}

	public BasicRequest(int timeStep) {
		this.timeStep = timeStep;
		this.timeValue = GlobalTime.currentTime;
		this.actorTrace = null;
		this.requestContent = null;
	}

	public BasicRequest() {
		this.timeStep = GlobalTime.currentTimeStep;
		this.timeValue = GlobalTime.currentTime;
		this.actorTrace = null;
		this.requestContent = null;
	}

	@Override
	public String toString() {
		return String.format("timeStep:%s, actorTrace:%s, requestContent:%s", timeStep, actorTrace, requestContent/* , recieverPath */);
	}

}
