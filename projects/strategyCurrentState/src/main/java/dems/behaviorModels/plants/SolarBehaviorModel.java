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
 * Modell vom SolarPanel Verhalten (inkl. aller Parameter)
 * 
 * @author bytschkow
 */

public class SolarBehaviorModel extends BehaviorModel{

	public StrategyBehaviorType strategyBehaviorType = StrategyBehaviorType.SOLAR;
	public double cost = Costs.SOLAR;
	public double installedPower;

	// Answer Content
    public double actualPower;
    public double plannedPower;    
    public GenericAnswerContent answerContentToSend = new GenericAnswerContent(0.0, 0.0);
    
    DEMSRequestContent request; 
    
	public boolean individualRequestApplicable = false;
	public double setPointPower;
	private String htmlIndividualRequest;
       
    /*
     * Constructor
     */
    public SolarBehaviorModel() {
        this.installedPower = 0.0;
    }    
    public SolarBehaviorModel(double installedPower) {
        if (installedPower < 0.0) throw new IllegalArgumentException("installedPower has to be > 0.0: " + installedPower);
        this.installedPower = installedPower;
    }
    public SolarBehaviorModel(String name, double installedPower) {
        if (installedPower < 0.0) throw new IllegalArgumentException("installedPower has to be > 0.0: " + installedPower);
        this.installedPower = installedPower;
        this.actorName = name;
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
			setPointPower = installedPower*Swmcsv.getSWMProfileSolar(GlobalTime.currentTime);
			htmlIndividualRequest = "<br>individualRequest: null";
		}
	}
	
    @Override
    public void makeDecision() {    	
    	
    	if (GlobalTime.currentTimeStep == 1) {
			setPointPower = installedPower*Swmcsv.getSWMProfileSolar(GlobalTime.currentTime);
		}
    	
		actualPower = setPointPower;
			
    	plannedPower = installedPower*Swmcsv.getSWMProfileSolar(GlobalTime.nextTime);    	
    	
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
		
		answerContentToSend.time = GlobalTime.currentTimeStep;
		answerContentToSend.dateTime = GlobalTime.currentTime.format(MyDateTimeFormatter.formatter);
		
		// zuerst alle Werte Setzen und zum schluss die Strings
		answerContentToSend.IN = request.toHTML() + htmlIndividualRequest ;
		answerContentToSend.OUT = answerContentToSend.toHTML();
    	
    	if (this.actorName != "unknown") {
    		//System.out.println(actorName + ": " + answerContentToSend);
    	}
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