/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ieee13BusExampleThreePhaseInDevelopment;

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

public class ThreePhaseNodeBehavior extends BehaviorModel{

	public double[] activePower = {0,0,0};
	public double[] reactivePower = {0,0,0};

	// Answer Content
    public double actualPower;
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent(0.0, 0.0);
    
    // ActorResults linked to the SovlerTopology.resultMap HashMap
    public ActorResults actorResults;
    
    /*
     * Constructor
     */
    public ThreePhaseNodeBehavior(String path, double[] activePower, double[] reactivePower) {
        this.fullActorPath = path;
    	this.activePower = activePower;
    	this.reactivePower = reactivePower;
    }
	
	@Override
	public void handleRequest() {
	}

    @Override
    public void makeDecision() {   	

    	// FIXME the activePower Output is still wrong. This has to be fixed!
    	if (PowerflowMapping.isMapped()){    		
    		actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
        	actorResults.activePower = 0.0;
        	actorResults.reactivePower = 0.0;      	
        	PowerflowMapping.actorResultsMap.put(fullActorPath, actorResults);        	
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
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		
	}
}