/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ieee13BusExampleOnePhaseInDevelopment;

import akka.advancedMessages.GenericAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;

/**
 * Class for the solver connection 
 * 
 * @author bytschkow
 */

public class NodeBehavior extends BehaviorModel{

	public double activePower;
	public double reactivePower;

	// Answer Content
    public double actualPower;
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent(0.0, 0.0);
    
    // ActorResults linked to the SovlerTopology.resultMap HashMap
    public ActorResults actorResults;
    
    /*
     * Constructor
     */
    public NodeBehavior(String path, double activePower, double reactivePower) {
        this.fullActorPath = path;
    	this.activePower = activePower;
    	this.reactivePower = reactivePower;
    }
	
	@Override
	public void handleRequest() {
	}

    @Override
    public void makeDecision() {   	

    	if (PowerflowMapping.isMapped()){    		
    		actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
        	actorResults.activePower = activePower;
        	actorResults.reactivePower = reactivePower;      	
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
}