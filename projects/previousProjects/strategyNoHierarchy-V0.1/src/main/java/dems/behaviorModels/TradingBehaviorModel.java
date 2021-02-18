/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.behaviorModels;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import dems.behaviorType.StrategyBehaviorType;
import dems.helper.CheckRequest;
import dems.helper.TradingSchedule;
import dems.messageContents.DEMSRequestContent;
import dems.messageContents.GenericAnswerContent;
import helper.MyDateTimeFormatter;
import helper.MyDoubleFormat;

/**
 * 
 * This is a specific behavior
 * 
 * @author bytschkow
 *
 */

public class TradingBehaviorModel extends BehaviorModel {
	
	public StrategyBehaviorType strategyBehaviorType = StrategyBehaviorType.TRADING;

	public double installedPower;
	public double cost = 99;

	// Answer Content
    public double actualPower;
    public double expectedPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent();
    
	public DEMSRequestContent request;
	public double factor;
	public boolean individualRequestApplicable = false;
	public double setPointPower;
	private String htmlIndividualRequest ="";
    
    /*
     * Constructor
     */
    public TradingBehaviorModel() {
        this.installedPower = 10000000.0;
    }
	
	@Override
	public void handleRequest() {
		request = (DEMSRequestContent) requestContentReceived;
		factor = request.reductionFactor;
		handleIndividualRequest();
	}
	
	public void handleIndividualRequest() {		
		if (request.individualContent){
			int i = CheckRequest.checkIndividualContent(request.individualRequestList, actorName);
			if (i >= 0){
				setPointPower = request.individualRequestList.get(i).setPointPower;
				individualRequestApplicable = true;
				htmlIndividualRequest  = "<br>individualRequest: <br> setPointPower: " + MyDoubleFormat.f.format(setPointPower);
			} else individualRequestApplicable = false;
		}
	}

	public void makeDecision() {
		
		if (individualRequestApplicable){
			actualPower = setPointPower;
		} else {
			actualPower = TradingSchedule.getSchedule(this.actor.getCurrentTime());
		}
		
		expectedPower = TradingSchedule.getSchedule(this.actor.getCurrentTime().plus(this.actor.getTimeStepDuration()));
		cost = TradingSchedule.getCost(this.actor.getCurrentTime());
		
		answerContentToSend.currentProduction = actualPower;
		answerContentToSend.scheduledProduction = actualPower;
		answerContentToSend.expectedProduction = expectedPower;
		answerContentToSend.factorConformation = factor;
		answerContentToSend.installedPower = this.installedPower;
		answerContentToSend.costs = this.cost;
		answerContentToSend.type = this.strategyBehaviorType;
				
		answerContentToSend.dateTime = this.actor.getCurrentTime().format(MyDateTimeFormatter.formatter);
		
		answerContentToSend.IN = request.toHTML() + htmlIndividualRequest;
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