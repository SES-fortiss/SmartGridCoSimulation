/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi.standardActors;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import powerflowApi.ActorResults;
import powerflowApi.NodeType;
import powerflowApi.PowerflowMapping;

/**
 * Definition of a PQNode. The necessary values are <b>active
 * power</b> - a power injection, and a <b>reactive power</b>. 
 * The reason for those two values is that this node usually 
 * represents usually consumption, which has a defined power 
 * (active and reactive).
 * 
 * TODO - It might be good to have it on another location of the code,
 * more general one.
 * 
 * @author bytschkow
 */

public class PQNode extends BehaviorModel{

	public double activePower;
	public double reactivePower;
	public NodeType nodeType = NodeType.PQ;
    
    // ActorResults linked to the SovlerTopology.resultMap HashMap
    public ActorResults actorResults;
    
    public PQNode(String path, double activePower, double reactivePower) {
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
}