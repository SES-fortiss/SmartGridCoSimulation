/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.solar;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import helper.Swmcsv;
import vppClusterHeads.genericStuff.GenericAnswerContent;
import vppClusterHeads.genericStuff.VPPPlantType;

/**
 * Modell vom SolarPanel Verhalten (inkl. aller Parameter)
 * 
 * @author bytschkow
 */

public class SolarBehaviorModel extends BehaviorModel{
	
	final VPPPlantType type = VPPPlantType.SOLAR;
	public double installedPower;
	public double factor;

	// Answer Content
    public double actualPower;
    public double forecastPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent();    
       
    /*
     * Constructor
     */    
    public SolarBehaviorModel(double installedPower) {
        if (installedPower < 0.0) throw new IllegalArgumentException("installedPower has to be > 0.0: " + installedPower);
        this.installedPower = installedPower;
        
		answerContentToSend.plantType = type;
    	answerContentToSend.installedPower = this.installedPower;
    }
	
	@Override
	public void handleRequest() {
	}

    // Entscheidung
    @Override
    public void makeDecision() {    
    	
    	actualPower = installedPower * Swmcsv.getSWMProfileSolar(this.actor.getCurrentTime());
    	forecastPower = installedPower * Swmcsv.getSWMProfileSolar(this.actor.getCurrentTime().plus(this.actor.getTimeStepDuration()));
    	
    	answerContentToSend.scheduledProduction = actualPower;
    	
    	double variation = 2 * Math.random() - 1.0; // also zwischen +1 und -1
    	double prozent = 0.02;
    	answerContentToSend.currentPower = actualPower + actualPower*variation*prozent;
    	
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
	
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}