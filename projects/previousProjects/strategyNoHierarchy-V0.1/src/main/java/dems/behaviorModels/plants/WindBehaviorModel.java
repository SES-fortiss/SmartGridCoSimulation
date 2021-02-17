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
import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
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

public class WindBehaviorModel extends BehaviorModel {

	public double installedPower;
	
	public StrategyBehaviorType strategyBehaviorType = StrategyBehaviorType.WIND;
	public double cost = Costs.WIND;

	// Answer Content
    public double actualPower;
    public double plannedPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent();

    // Request Handling
    DEMSRequestContent request;
	int requestIndex;
	public boolean individualRequestApplicable = false;
	public double setPointPower;

	// Ausgabe Helper
	String htmlIndividualRequest = "";
	
    /*
     * Constructor
     */
    public WindBehaviorModel() {
        this.installedPower = 0.0;
    }    
    public WindBehaviorModel(double installedPower) {
        this.installedPower = installedPower;
    }
    public WindBehaviorModel(String path, double installedPower) {
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
			setPointPower = installedPower*Swmcsv.getSWMProfileWind(this.actor.getCurrentTime());
			htmlIndividualRequest = "<br>individualRequest: null";
		}
	}

	public void makeDecision() {	
		
		LocalDateTime currentTime = this.actor.getCurrentTime();
		LocalDateTime nextTime = currentTime.plus(this.actor.getTimeStepDuration());
		
		
		if (this.actor.getCurrentTimeStep() == 1) {
			setPointPower = installedPower*Swmcsv.getSWMProfileWind(currentTime);
		}
		
		actualPower = setPointPower;				
		plannedPower = installedPower*Swmcsv.getSWMProfileWind(nextTime);
		
		answerContentToSend.currentProduction = actualPower;
		answerContentToSend.scheduledProduction = setPointPower;
		answerContentToSend.expectedProduction = plannedPower;
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

	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	public RequestContent returnRequestContentToSend() {
		return null;
	}
	
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}