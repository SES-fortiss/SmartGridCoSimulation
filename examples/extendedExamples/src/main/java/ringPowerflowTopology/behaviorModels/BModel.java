/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ringPowerflowTopology.behaviorModels;

import java.util.LinkedList;

import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;
import akka.advancedMessages.ErrorAnswerContent;
import akka.advancedMessages.GenericAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * Class for the solver connection
 * 
 * @author bytschkow
 */

public class BModel extends BehaviorModel{

	public double installedPower = 0.0;

	// Answer Content
    public double actualPower;
    public double plannedPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent(0.0, 0.0);
    
    // ActorResults linked to the SovlerTopology.resultMap HashMap
    public ActorResults actorResults;
    
    /*
     * Constructor
     */
    public BModel(String path, double installedPower) {
        this.installedPower = installedPower;
        this.fullActorPath = path;
    }
	
	@Override
	public void handleRequest() {
	}

    @Override
    public void makeDecision() {   	    	    	 	
    	actualPower = installedPower;    	    	
    	answerContentToSend.currentProduction = actualPower;    	

    	if (PowerflowMapping.isMapped()){
    		actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
        	actorResults.activePower = actualPower;
        	//actorResults.setPointReactivePower = -actualPower*0.5;
    	}
    }
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		
	}
}