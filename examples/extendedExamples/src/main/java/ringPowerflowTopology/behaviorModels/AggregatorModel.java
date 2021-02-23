/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ringPowerflowTopology.behaviorModels;

import akka.advancedMessages.GenericAnswerContent;
import akka.advancedMessages.GenericRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;

/**
 * Just a simple AggregationBehavior for execution of the simulation
 * 
 * @author bytschkow
 */
public class AggregatorModel extends BehaviorModel {

	public GenericAnswerContent answerContentToSend =
			new GenericAnswerContent();
	public GenericRequestContent requestContentToSend =
			new GenericRequestContent(1.0);

	/*
	 * Constructor
	 */
	public AggregatorModel(String name) {
		actorName = name;
	}

	public void handleRequest() {
		System.out.println(PowerflowMapping.actorResultsMap);
		
		ActorResults ar =
				(ActorResults) PowerflowMapping.actorResultsMap
						.get("/user/ActorSupervisor/SolverAggregator/Node1");
		double test = ar.activePower;
		System.out.println("ringPowerflowTopology.behaviorModels.AggregatorModel: Accessed ActorResult Data - " + test);
		
		
	}

	public void makeDecision() {
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}
}