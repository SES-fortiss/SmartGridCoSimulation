/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package linePowerTopology.behaviorModels;

import akka.advancedMessages.GenericAnswerContent;
import akka.advancedMessages.GenericRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import helper.SolarProfile;
import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;

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
    
    int currentTimeStep = 0;
    
    /*
     * Constructor
     */
    public BModel(String path, double installedPower) {
        this.installedPower = installedPower;
        this.fullActorPath = path;
    }
	
	@Override
	public void handleRequest() {
		currentTimeStep = this.actor.requestReceived.timeStep;
	}

    // Entscheidung
    @Override
    public void makeDecision() {   	
    	    	
    	actualPower = installedPower*SolarProfile.getSolarProfileSummer(currentTimeStep);
    	plannedPower = installedPower*SolarProfile.getSolarProfileSummer(currentTimeStep+1);
    	
    	GenericRequestContent request = (GenericRequestContent) requestContentReceived;
		double factor = request.reductionFactor;
    	
    	actualPower = actualPower*factor;
    	
    	actualPower = installedPower;
    	    	
    	answerContentToSend.currentProduction = actualPower;
    	answerContentToSend.expectedProduction = plannedPower;
    	answerContentToSend.reductionFactorConformation = factor;    	

    	if (PowerflowMapping.isMapped()){
    		actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
        	actorResults.activePower = actualPower;
        	//actorResults.setPointReactivePower = -0.1 * actualPower;
        	PowerflowMapping.actorResultsMap.put(fullActorPath, actorResults);
    	}
    	
    	if (this.actorName != "unknown") {
    		System.out.println(actorName + ": " + answerContentToSend);
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
}