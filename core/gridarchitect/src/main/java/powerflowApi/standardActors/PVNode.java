/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi.standardActors;

import java.util.LinkedList;

import powerflowApi.ActorResults;
import powerflowApi.NodeType;
import powerflowApi.PowerflowMapping;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * Class to create a PVNode of the model. The necessary values are <b>active
 * power</b> - a power injection, and a <b>voltage</b>. The reason for those two
 * values is that this node represents usually generation, which regulates power
 * and voltage.
 * 
 * TODO - It might be good to have it on another location of the code,
 * more general one.
 * 
 * @author bytschkow
 */

public class PVNode extends BehaviorModel {

	public double activePower;
	public double voltage;
	public NodeType nodeType = NodeType.PQ;

	// ActorResults linked to the SovlerTopology.resultMap HashMap
	public ActorResults actorResults;

	/*
	 * Constructor
	 */
	public PVNode(String path, double activePower, double voltage) {
		this.fullActorPath = path;
		this.activePower = activePower;
		this.voltage = voltage;
	}

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {

		if (PowerflowMapping.isMapped()) {
			actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
			actorResults.activePower = activePower;
			actorResults.voltage = voltage;
			actorResults.nodeType = this.nodeType;
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}