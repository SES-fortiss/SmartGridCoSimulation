/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akkaAndSolverAndSCADA.behaviorModels;

import java.util.LinkedList;

import helper.SolarProfile;
import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;
import akka.advancedMessages.ErrorAnswerContent;
import akka.advancedMessages.GenericAnswerContent;
import akka.advancedMessages.GenericRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;

/**
 * Class for the solver connection 
 * 
 * @author bytschkow
 */

public class Component extends BehaviorModel{

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
    public Component(String path, double installedPower) {
        this.installedPower = installedPower;
        this.fullActorPath = path;
    }
	
	@Override
	public void handleRequest() {
	}

    // Entscheidung
    @Override
    public void makeDecision() {   	
    	    	
    	actualPower = installedPower*SolarProfile.getSolarProfileSummer(GlobalTime.currentTimeStep);
    	plannedPower = installedPower*SolarProfile.getSolarProfileSummer(GlobalTime.currentTimeStep+1);
    	
    	GenericRequestContent request = (GenericRequestContent) requestContentReceived;
		double factor = request.reductionFactor;
    	
    	actualPower = actualPower*factor;
    	    	
    	answerContentToSend.currentProduction = actualPower;
    	answerContentToSend.expectedProduction = plannedPower;
    	answerContentToSend.reductionFactorConformation = factor;    	

    	if (PowerflowMapping.isMapped()){
    		actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
        	actorResults.setPointActivePower = actualPower;
        	actorResults.setPointReactivePower = 0.0;
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

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		
	}
}