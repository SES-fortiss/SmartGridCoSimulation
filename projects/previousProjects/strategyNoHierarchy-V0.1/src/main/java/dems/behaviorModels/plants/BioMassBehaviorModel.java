/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.behaviorModels.plants;

import java.util.LinkedList;

import dems.behaviorType.StrategyBehaviorType;
import dems.helper.CheckRequest;
import dems.helper.Costs;
import dems.messageContents.DEMSRequestContent;
import dems.messageContents.GenericAnswerContent;
import helper.MyDateTimeFormatter;
import helper.MyDoubleFormat;
import helper.Swmcsv;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;

/**
 * 
 * This is a specific behavior
 * 
 * @author bytschkow
 *
 */

public class BioMassBehaviorModel extends BehaviorModel {

	public double installedPower;
	public double cost = Costs.BIOMASS;
	public StrategyBehaviorType plantType = StrategyBehaviorType.BIOMASS;

	// Answer Content
    public double actualPower;
    public double plannedPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent(0.0, 0.0);
    
    DEMSRequestContent request;
	public boolean individualRequestApplicable = false;
	public double setPointPower;
	private String htmlIndividualRequest = "";
    
    /*
     * Constructor
     */
    public BioMassBehaviorModel() {
        this.installedPower = 0.0;
    }    
    public BioMassBehaviorModel(double installedPower) {
        this.installedPower = installedPower;
    }
    public BioMassBehaviorModel(String path, double installedPower) {
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
			setPointPower = installedPower*Swmcsv.getSWMProfileBioMass(GlobalTime.currentTime);
			htmlIndividualRequest = "<br>individualRequest: null";
		}
	}	
	
	public void makeDecision() {	
		
		if (GlobalTime.currentTimeStep == 1) {
			setPointPower = installedPower*Swmcsv.getSWMProfileBioMass(GlobalTime.currentTime);
		}
		
		double lastPowerValue = actualPower;		
		
		if (individualRequestApplicable) {
			
			double powerChange = setPointPower - lastPowerValue;
			double maxRampRateAllowed =  installedPower * GlobalTime.period.getSeconds() / 60 * plantType.rampRate / 100;
			
//			System.out.println("powerChange: " + powerChange);
//			System.out.println("maxRampRateAllowed: " + maxRampRateAllowed);
			
			// Checke ob sich das Kraftwerk schnell genug regeln l�sst. 
			// Dazu wird die installierte Leistung, der RampUp Faktor und die Periode gecheckt
			if (Math.abs(powerChange) < maxRampRateAllowed )  {				
				actualPower = setPointPower;
			}
			// Wenn sich das Kraftwerk nich so schnell anpassen kann, dann wird es nur teilweise den Sollwert einstellen k�nnen.
			else {				
				actualPower = lastPowerValue + Math.signum(powerChange) * maxRampRateAllowed;

				// Power is not allowed to be less than 0				
				if (actualPower < 0 ) {
					actualPower = 0;
				}		
				
				if (actualPower > installedPower) {
					actualPower = installedPower;
				}
			}
			
		} 
		// Ohne Individuellen Request
		else {
			actualPower = setPointPower;
		}
		
		plannedPower = installedPower*Swmcsv.getSWMProfileBioMass(GlobalTime.nextTime);
		
		answerContentToSend.currentProduction = actualPower;
		answerContentToSend.scheduledProduction = setPointPower;
		answerContentToSend.expectedProduction = plannedPower;
		answerContentToSend.installedPower = this.installedPower;
		answerContentToSend.costs = this.cost;
		answerContentToSend.type = plantType;
		
		if (individualRequestApplicable) {
			answerContentToSend.factorConformation = setPointPower;
		} else {
			answerContentToSend.factorConformation = null;
		}
		
		answerContentToSend.time = GlobalTime.currentTimeStep;
		answerContentToSend.dateTime = GlobalTime.currentTime.format(MyDateTimeFormatter.formatter);
		
		answerContentToSend.IN = request.toHTML() + htmlIndividualRequest ;
		answerContentToSend.OUT = answerContentToSend.toHTML();
	}

	public AnswerContent returnAnswerContentToSend() {
		//System.out.println("BioMass: " + actualPower);
		return answerContentToSend;
	}

	public RequestContent returnRequestContentToSend() {
		return null;
	}
	
	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}