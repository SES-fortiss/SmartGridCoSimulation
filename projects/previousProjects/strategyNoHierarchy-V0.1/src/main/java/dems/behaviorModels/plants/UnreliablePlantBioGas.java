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
import dems.messageContents.UnreliableAnswerContent;
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

public class UnreliablePlantBioGas extends BehaviorModel {

	public double installedPower;
	public double cost = Costs.BIOGAS;
	public StrategyBehaviorType strategyBehaviorType = StrategyBehaviorType.BIOGAS;

	// Answer Content
    public double actualPower;
    public double expectedPower;    
    public UnreliableAnswerContent answerContentToSend = new UnreliableAnswerContent();
    
	public DEMSRequestContent request;
	public boolean individualRequestApplicable = false;
	public double setPointPower;
	private String htmlIndividualRequest ="";
    
    /*
     * Constructor
     */    
    public UnreliablePlantBioGas(double installedPower) {
        this.installedPower = installedPower;
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
			setPointPower = installedPower*Swmcsv.getSWMProfileBioGas(this.actor.getCurrentTime());
			htmlIndividualRequest = "<br>individualRequest: null";
		}
	}	

	boolean available = true;
	int timeBroken = 0;
	
	public void makeDecision() {
		
		int currentTimeStep = this.actor.getCurrentTimeStep();
		LocalDateTime currentTime = this.actor.getCurrentTime();
		LocalDateTime nextTime = currentTime.plus(this.actor.getTimeStepDuration());
		
		if (currentTimeStep == 1) {
			setPointPower = installedPower*Swmcsv.getSWMProfileBioGas(currentTime);
		}
		
		actualPower = setPointPower;
		
		// Setze die Anlage wieder funktionsbereit
		if (timeBroken == 0){
			available = true;
		}		

		// Hier wird der Ausfall der Anlage getriggert, Ausfallwahrscheinlichkeit 5%
		if (available){
			
			double random = Math.random();		
			
			if (random <= 0.05) {
				available = false;
				timeBroken = 5;
			}			
		}
		
		if (!available && timeBroken > 0) {
			actualPower = 0.0;
			timeBroken--;
		}
		
		answerContentToSend.availability = available;
		
		expectedPower = installedPower*Swmcsv.getSWMProfileBioGas(nextTime);
		
		answerContentToSend.currentProduction = actualPower;
		answerContentToSend.scheduledProduction = setPointPower;
		answerContentToSend.expectedProduction = expectedPower;
		answerContentToSend.installedPower = this.installedPower;
		answerContentToSend.costs = this.cost;
		
		if (individualRequestApplicable) {
			answerContentToSend.factorConformation = setPointPower;
		} else {
			answerContentToSend.factorConformation = null;
		}
				
		answerContentToSend.dateTime = currentTime.format(MyDateTimeFormatter.formatter);
		answerContentToSend.type = strategyBehaviorType;
		
		answerContentToSend.IN = request.toHTML() + htmlIndividualRequest;
		answerContentToSend.OUT = answerContentToSend.toHTML();
		
		if(this.actorName != "unknown"){
			//System.out.println(actorName + ": " + answerContentToSend);
    	}
	}

	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	public RequestContent returnRequestContentToSend() {
		return null;
	}
	
}