/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.bioGas;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import helper.Swmcsv;
import vppClusterHeads.genericStuff.GenericAnswerContent;
import vppClusterHeads.genericStuff.GenericRequestContent;
import vppClusterHeads.genericStuff.VPPPlantType;

/**
 * 
 * This is a specific behavior
 * 
 * @author bytschkow
 *
 */

public class BioGasBehaviorModel extends BehaviorModel {

	final VPPPlantType type = VPPPlantType.BIOGAS;
	public double installedPower;

	// Answer Content
    public double actualPower;
    public double forecastPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent();
    
	public double flexibilityfactor;
	
    
    /*
     * Constructor
     */    
    public BioGasBehaviorModel(double installedPower) {
        this.installedPower = installedPower;
        
        // die Antworten die sich nicht ändern
        answerContentToSend.plantType = type;
		answerContentToSend.installedPower = this.installedPower;
    }
	
	@Override
	public void handleRequest() {
		flexibilityfactor = ((GenericRequestContent) requestContentReceived).flexibilityRequestFactor;
	}

	public void makeDecision() {		
		
		actualPower = installedPower*Swmcsv.getSWMProfileBioGas(this.actor.getCurrentTime());
		forecastPower = installedPower*Swmcsv.getSWMProfileBioGas(this.actor.getCurrentTime().plus(this.actor.getTimeStepDuration()));
		
		answerContentToSend.scheduledProduction = actualPower;
		answerContentToSend.forecastPower = forecastPower;
		
		double negativeFlexibility;		
		if (actualPower > 0.3 * installedPower) {
			negativeFlexibility = actualPower - 0.3 * installedPower;
		} else negativeFlexibility = 0;
		
		double positiveFlexibility = installedPower - actualPower;
		if (positiveFlexibility < 0) positiveFlexibility = 0;
		
		if (flexibilityfactor < 0){
			actualPower = actualPower + flexibilityfactor*negativeFlexibility;
		}
		
		if (flexibilityfactor > 0){
			actualPower = actualPower + flexibilityfactor*positiveFlexibility;
		}
		
		answerContentToSend.negativeFlexibility = negativeFlexibility;
		answerContentToSend.positiveFlexibility = positiveFlexibility;			
		answerContentToSend.currentPower = actualPower;		
	}

	public AnswerContent returnAnswerContentToSend() {
		//System.out.println(answerContentToSend);
		return answerContentToSend;
	}

	public RequestContent returnRequestContentToSend() {
		return null;
	}
}