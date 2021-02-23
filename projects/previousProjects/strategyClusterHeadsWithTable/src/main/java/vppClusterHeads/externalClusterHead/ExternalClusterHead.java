/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.externalClusterHead;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import vppClusterHeads.clusterHead.ClusterHeadAnswerContent;
import vppClusterHeads.genericStuff.GenericRequestContent;

/**
 * 
 * @author bytschkow
 */

public class ExternalClusterHead extends BehaviorModel{
	
    public ClusterHeadAnswerContent answerContentToSend = new ClusterHeadAnswerContent();
    public GenericRequestContent requestContentToSend = new GenericRequestContent();    
    
    public String message;    
    
    public ClusterHeadConnection connection;
            
    /*
     * Constructor
     */
    public ExternalClusterHead() {
    	actorName = this.fullActorPath;
    	answerContentToSend.name = actorName;
    	
    	try {
			connection = new ClusterHeadConnection();
		} catch (Exception e) {
			e.printStackTrace();
			connection = null;
		}    	
    }
	
	@Override
	public void handleRequest() {}

    @Override
    public void makeDecision() {
    	
    	JsonCluster cluster = new JsonCluster();
    	
    	if (connection != null){    		
    		try {
    			message = connection.readValues();
    			Gson gson = new Gson();
    	    	cluster = gson.fromJson(message, JsonCluster.class);
    			//System.out.println(this.actorName + " receives message: " + message);
			} catch (Exception e) {
				System.out.println(this.actorName + ": No connection to DemoTableCluster - all values will be set to 0");
			}
    	}
    	double scalingfactor = 1;
    	
		answerContentToSend.solar = cluster.solar * scalingfactor;
		answerContentToSend.wind = cluster.wind * scalingfactor;
		answerContentToSend.bioGas = cluster.biogas *scalingfactor;
    	answerContentToSend.scheduled = cluster.targetValue * scalingfactor;
    	answerContentToSend.requestedPower = -cluster.clusterOutput * scalingfactor; // das ist das was benötigt wird    	
    	answerContentToSend.total = cluster.currentValue * scalingfactor;
    	answerContentToSend.name = actorName;
    	
    	System.out.println(this.actorName + ": " + answerContentToSend);
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