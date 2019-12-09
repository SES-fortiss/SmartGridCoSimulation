/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.clusterHead;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import vppClusterHeads.genericStuff.GenericAnswerContent;
import vppClusterHeads.genericStuff.GenericRequestContent;

/**
 * DEMSAggregator bekommt alle Nachrichten und kann diese Verarbeiten
 * 
 * @author bytschkow
 */

public class ClusterHead extends BehaviorModel{
	
    public ClusterHeadAnswerContent answerContentToSend = new ClusterHeadAnswerContent();
    public GenericRequestContent requestContentToSend = new GenericRequestContent();
    
    public double flexibilityRequestFactor = 0.0;
            
    /*
     * Constructor
     */
    public ClusterHead() {
    	this.actorName = this.fullActorPath;
    	answerContentToSend.name = actorName;
    }
	
	@Override
	public void handleRequest() {		
		flexibilityRequestFactor = ((GenericRequestContent) super.requestContentReceived).flexibilityRequestFactor;
		requestContentToSend.flexibilityRequestFactor = flexibilityRequestFactor;
	}

    @Override
    public void makeDecision() {     	
    	double childTotalPower = 0.0;
    	double childSolarPower = 0.0;
    	double childWindPower = 0.0;
    	double childWaterPower = 0.0;
    	double childBioGasPower = 0.0;
    	double childBioMassPower = 0.0;    	
    	
    	double childPlannedProduction = 0.0;
    	double childNegativeFlexibility = 0.0;
    	double childPositiveFlexibility = 0.0;
    	
      	for (BasicAnswer message : super.answerListReceived){
    		if (message.answerContent instanceof GenericAnswerContent) {    			
    			GenericAnswerContent answer = (GenericAnswerContent) message.answerContent;
				childTotalPower += answer.currentPower;
				childPlannedProduction += answer.forecastPower;
				childPositiveFlexibility += answer.positiveFlexibility;
				childNegativeFlexibility += answer.negativeFlexibility;				
				
				switch (answer.plantType) {
					case SOLAR:
						childSolarPower += answer.currentPower;
						break;
					case WATER:
						childWaterPower += answer.currentPower;
						break;
					case WIND:
						childWindPower += answer.currentPower;
						break;
					case BIOGAS:
						childBioGasPower += answer.currentPower;
						break;
					case BIOMASS:
						childBioMassPower += answer.currentPower;
						break;
					default:
						break;
				}
    		}
    	}
      	
    	answerContentToSend.total = childTotalPower;
    	answerContentToSend.scheduled = childPlannedProduction;    	
    	answerContentToSend.solar = childSolarPower;
    	answerContentToSend.wind = childWindPower;
    	answerContentToSend.water = childWaterPower;
    	answerContentToSend.bioGas = childBioGasPower;
    	answerContentToSend.bioMass = childBioMassPower;
    	answerContentToSend.nF = childNegativeFlexibility;
    	answerContentToSend.pF = childPositiveFlexibility;
    	answerContentToSend.name = actorName;
    	
    	if(true){
    		System.out.println(actorName + ": " + answerContentToSend);
    	}
    }

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}
	
	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}