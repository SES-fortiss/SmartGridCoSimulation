/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package exampleJose;

import helper.standardLastProfil.StandardLastProfil;

import java.time.LocalDateTime;
import java.util.LinkedList;

import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * @author Denis Bytschkow
 *
 */
public class EMSHouse extends BehaviorModel {
	
	public EMSAnswer ans = new EMSAnswer();
	public ActorResults actorResults;

	public void handleError(LinkedList<ErrorAnswerContent> errors) {}

	public void handleRequest() {}

	public void makeDecision() {
		
		KRequest requestRec = (KRequest) requestContentReceived;
		
		ans.currentPower = StandardLastProfil.getH0Demand(3500, LocalDateTime.now());
		if (requestRec.noPower == false) ans.currentPower = 0; 
		
		ans.reactivePower = Math.random()*30;
		
		System.out.println(PowerflowMapping.isMapped());
		
		if (PowerflowMapping.isMapped()){
    		actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
        	actorResults.setPointActivePower = ans.currentPower;
        	PowerflowMapping.actorResultsMap.put(fullActorPath, actorResults);
    	}
	}

	public AnswerContent returnAnswerContentToSend() {
		return ans;
	}

	public RequestContent returnRequestContentToSend() {
		return null;
	}
}
