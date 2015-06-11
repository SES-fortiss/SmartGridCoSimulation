/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akkaAndSolver.behaviorModels;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.advancedMessages.GenericAnswerContent;
import akka.advancedMessages.GenericRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;

/**
 * Behavior ist ein Modell vom Verhalten (inkl. aller Parameter)
 * @author bytschkow
 */
public class SolverAggregatorBehaviorModel extends BehaviorModel{
	
    public double actualAggregatedPowerProduction = 0.0;
    public double expectedAggregatedPowerProduction = 0.0;
    public double scheduledAggregatorProduction = 0.0;
    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent(0.0,0.0);
    
    // Requests
    public double requestFactor;
    public GenericRequestContent requestContentToSend = new GenericRequestContent(1.0);
    
    /*
     * Constructor
     */
    public SolverAggregatorBehaviorModel() {
    }

    public SolverAggregatorBehaviorModel(String name) {
		actorName = name;
	}
	
	@Override
	public void handleRequest() {
	}

    @Override
    public void makeDecision() {
    	actualAggregatedPowerProduction = 0.0;
    	expectedAggregatedPowerProduction = 0.0;
    	
    	double childProduction = 0.0;
    	double childPlannedProduction = 0.0;
    	
      	for (BasicAnswer message : super.answerListReceived ){
    		if (message.answerContent instanceof GenericAnswerContent) {
    			GenericAnswerContent solarAnswerContent = (GenericAnswerContent) message.answerContent;
				childProduction = solarAnswerContent.currentProduction;
				childPlannedProduction = solarAnswerContent.expectedProduction;
    		}
    		actualAggregatedPowerProduction += childProduction;
    		expectedAggregatedPowerProduction += childPlannedProduction;    		
    	}
      	
      	scheduledAggregatorProduction = SolverAggregatorSchedule.getSchedule(GlobalTime.currentTimeStep+1);
      	
    	answerContentToSend.currentProduction = actualAggregatedPowerProduction;
    	answerContentToSend.expectedProduction = expectedAggregatedPowerProduction;
    	
    	requestContentToSend.reductionFactor = decideReductionFactor();
    	
    	if(this.actorName != "unknown"){
    		System.out.println(actorName + ": " + answerContentToSend);
    		System.out.println(actorName + ": " + requestContentToSend);
    	}
    }	
    
	private double decideReductionFactor() {
        double scheduledPowerProduction = scheduledAggregatorProduction;        
        double reductionFactorToSend;
        if (scheduledPowerProduction >= expectedAggregatedPowerProduction){
        	reductionFactorToSend = 1.0;
        } else {
        	reductionFactorToSend = scheduledPowerProduction / expectedAggregatedPowerProduction;
        }    	
		return reductionFactorToSend;
	}
    
    
	// Convert aus JSON
	@Override
	public SolverAggregatorBehaviorModel convertJsonToBehaviorModel(LinkedHashMap<String, Object> jsonMap) {        
        return new SolverAggregatorBehaviorModel();
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
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub
		
	}
}