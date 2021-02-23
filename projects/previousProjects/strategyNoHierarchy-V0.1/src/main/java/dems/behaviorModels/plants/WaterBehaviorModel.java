/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.behaviorModels.plants;

import java.time.LocalDateTime;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import dems.behaviorType.StrategyBehaviorType;
import dems.helper.CheckRequest;
import dems.helper.Costs;
import dems.messageContents.DEMSRequestContent;
import dems.messageContents.GenericAnswerContent;
import helper.MyDateTimeFormatter;
import helper.MyDoubleFormat;
import helper.Swmcsv;

/**
 * 
 * This is a specific behavior
 * 
 * @author bytschkow 
 *
 */

public class WaterBehaviorModel extends BehaviorModel {

	public double installedPower;
	
	public StrategyBehaviorType strategyBehaviorType = StrategyBehaviorType.WATER;
	public double cost = Costs.WATER;

	// Answer Content
    public double actualPower;
    public double plannedPower;
    public double expectedPower;
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent();
    
    // Request Content
    DEMSRequestContent request;
	public boolean individualRequestApplicable = false;
	public double setPointPower;

	// Ausgabe
	private String htmlIndividualRequest;
	
    /*
     * Constructor - use the ActorFactory to create an Actor with 
     * corresponding BehaviorModel
     */
    public WaterBehaviorModel() {
        this.installedPower = 0.0;
    }    
    public WaterBehaviorModel(double installedPower) {
        if (installedPower < 0.0) throw new IllegalArgumentException("WaterPowerPlantBehaviorModel.installedPower has to be > 0.0: " + installedPower);
        this.installedPower = installedPower;
    }
    public WaterBehaviorModel(String path, double installedPower) {
        if (installedPower < 0.0) throw new IllegalArgumentException("WaterPowerPlantBehaviorModel.installedPower has to be > 0.0: " + installedPower);
        this.installedPower = installedPower;
        this.actorName = path;
    }	
    
	@Override
	public void handleRequest() {
		request = (DEMSRequestContent) requestContentReceived;
		handleIndividualRequest();
	}
	
	public void handleIndividualRequest() {		
		int i = CheckRequest.checkIndividualContent(request.individualRequestList, actorName);
		if (i >= 0){
			individualRequestApplicable = true;
			setPointPower = request.individualRequestList.get(i).setPointPower;				
			htmlIndividualRequest  = "<br>individualRequest: <br> setPointPower: " + MyDoubleFormat.f.format(setPointPower);

		} else {
			individualRequestApplicable = false;
			setPointPower = installedPower*Swmcsv.getSWMProfileWater(this.actor.getCurrentTime());
			htmlIndividualRequest = "<br>individualRequest: null";
		}
	}

	@Override 
	public void makeDecision() {
		
		LocalDateTime currentTime = this.actor.getCurrentTime();
		LocalDateTime nextTime = currentTime.plus(this.actor.getTimeStepDuration());
		
		if (this.actor.getCurrentTimeStep() == 1) {
			setPointPower = installedPower*Swmcsv.getSWMProfileWater(currentTime);
		}
		actualPower = setPointPower;				
		//actualPower = actualPower * AddGaussianNoise.getNoise(0.01);
		
		expectedPower = installedPower*Swmcsv.getSWMProfileWater(nextTime);			
		
		answerContentToSend.currentProduction = actualPower;
		answerContentToSend.scheduledProduction = setPointPower;
		answerContentToSend.expectedProduction = expectedPower;
		answerContentToSend.installedPower = this.installedPower;
		answerContentToSend.costs = this.cost;
		answerContentToSend.type = this.strategyBehaviorType;
		
		if (individualRequestApplicable) {
			answerContentToSend.factorConformation = setPointPower;
		} else {
			answerContentToSend.factorConformation = null;
		}
		
		answerContentToSend.dateTime = currentTime.format(MyDateTimeFormatter.formatter);
	
		// zuerst alle Werte Setzen und zum schluss die Strings
		answerContentToSend.IN = request.toHTML() + htmlIndividualRequest ;
		answerContentToSend.OUT = answerContentToSend.toHTML();
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
