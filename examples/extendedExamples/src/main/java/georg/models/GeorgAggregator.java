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

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * Behavior ist ein Modell vom Verhalten (inkl. aller Parameter)
 * @author bytschkow
 */
public class GeorgAggregator extends BehaviorModel{
	
    public double actualAggregatedPowerProduction = 0.0;
    public GeorgAnswerContent answerContentToSend = new GeorgAnswerContent();
    
    /*
     * Constructor
     */
    public GeorgAggregator() {
    }

    public GeorgAggregator(String name) {
		actorName = name;
	}
	
	@Override
	public void handleRequest() {
	}

    @Override
    public void makeDecision() {
    	actualAggregatedPowerProduction = 0.0;
   
    	double childProduction = 0.0;
    	
      	for (BasicAnswer message : super.answerListReceived ){
    		if (message.answerContent instanceof GeorgAnswerContent) {
    			GeorgAnswerContent georgAnswerContent = (GeorgAnswerContent) message.answerContent;
				childProduction = georgAnswerContent.currentPower;
    		}
    		actualAggregatedPowerProduction += childProduction;
    	}
      	    	
    	answerContentToSend.currentPower = actualAggregatedPowerProduction;
    	
    	if(this.actorName != "unknown"){
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