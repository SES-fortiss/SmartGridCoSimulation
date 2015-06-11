/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package georg.models;

import java.util.LinkedList;

import georg.models.helper.GeorgSchedule;
import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;

/**
 * Class for georg's behavior 
 * 
 * @author bytschkow
 */

public class GeorgComponents extends BehaviorModel{

	// Answer Content
    public double actualPower;
    public GeorgAnswerContent answerContentToSend = new GeorgAnswerContent();
    
    // ActorResults linked to the SovlerTopology.resultMap HashMap
    public ActorResults actorResults;
    
    /**
     * Constructor
     * 
     * @param name: Name der componente
     * @param path: Unique path der co
     */
    public GeorgComponents(String name, String path) {    	
        this.actorName = name;
        this.fullActorPath = path;
    }
	
	@Override
	public void handleRequest() {
	}

    // Entscheidung
    @Override
    public void makeDecision() {   	

    	actualPower = GeorgSchedule.getSchedule(this.actorName, GlobalTime.currentTimeStep);    	
    	answerContentToSend.currentPower = actualPower;   	
    	
    	// TODO einbinden ins Mapping
    	
    	// TODO actorPath is null
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
		// TODO Auto-generated method stub
		
	}
}