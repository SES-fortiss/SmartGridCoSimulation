/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.water;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import helper.Swmcsv;
import vppClusterHeads.genericStuff.GenericAnswerContent;
import vppClusterHeads.genericStuff.VPPPlantType;

/**
 * 
 * This is a specific behavior
 * 
 * @author bytschkow
 *
 */

public class WaterBehaviorModel extends BehaviorModel {

	final VPPPlantType type = VPPPlantType.WATER;
	public double installedPower;

	// Answer Content
    public double actualPower;
    public double forecastPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent();
    
    /*
     * Constructor - use the ActorFactory to create an Actor with 
     * corresponding BehaviorModel
     */    
    public WaterBehaviorModel(double installedPower) {
        if (installedPower < 0.0) throw new IllegalArgumentException("WaterPowerPlantBehaviorModel.installedPower has to be > 0.0: " + installedPower);
        this.installedPower = installedPower;
        
		answerContentToSend.plantType = type;
		answerContentToSend.installedPower = this.installedPower;
    }
	
	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {		
		actualPower = installedPower*Swmcsv.getSWMProfileWater(this.actor.getCurrentTime());
		forecastPower = installedPower*Swmcsv.getSWMProfileWater(this.actor.getCurrentTime().plus(this.actor.getTimeStepDuration()));		
		
    	answerContentToSend.currentPower = actualPower;
    	answerContentToSend.scheduledProduction = actualPower;
    	answerContentToSend.forecastPower = forecastPower;

	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

}
