/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.house;

import java.time.LocalDateTime;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import eCarStreet.coordinator.RequestCoordinatorContent;
import eCarStreet.eCar.ECar;
import eCarStreet.eCar.helper.decisions.DecisionType;
import eCarStreet.eCar.helper.decisions.PriceOptimizedDecision;
import eCarStreet.eCar.helper.decisions.SimpleDecision;
import eCarStreet.eCar.helper.decisions.SimpleTwoTariffDecision;
import eCarStreet.helper.PriceHack;
import helper.standardLastProfil.StandardLastProfil;
import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;

public class House extends BehaviorModel {

	public HouseAnswerContent answer = new HouseAnswerContent();
	public SaveHouseAnswerContent recorder = new SaveHouseAnswerContent(this);

	public ECar eCar;
	public double jahresVerbrauch; // wird mit StandardLastProfil verrechnet
	ActorResults actorResults;
	
	public House(double jahresVerbrauch){
		this.jahresVerbrauch = jahresVerbrauch;
		this.eCar = null;
		this.recorder = null;
	}

	public House(double jahresVerbrauch, ECar car, DecisionType decisionType) {
		this.jahresVerbrauch = jahresVerbrauch;
		this.eCar = car;
		setDecision(decisionType);		
	}

	private void setDecision(DecisionType decisionType) {
		switch (decisionType) {
		case SIMPLE:
			this.eCar.decision = new SimpleDecision();
			break;
		case OPTIMAL:
			this.eCar.decision = new PriceOptimizedDecision();
			break;
		case TIMETRIGGERED:
			this.eCar.decision = new SimpleTwoTariffDecision();
			break;
		default:
			break;
		}		
	}

	public void handleRequest() {
	}

	public void makeDecision() {
		prepareAnswer();
		if (recorder != null){
			recorder.saveAnswer(answer);
		}
		
		
	}

	private void prepareAnswer() {
		
		LocalDateTime currentTime = this.actor.getCurrentTime();
		
		answer.demandHouse = -StandardLastProfil.getH0Demand(jahresVerbrauch,currentTime);				
		
		if (eCar != null){						
			RequestCoordinatorContent rcc = (RequestCoordinatorContent) requestContentReceived;
			
			// Wenn durch den Coordinator gesteuert wird
			if (rcc.optimizeLine) {
				
				double remainingTotalLoad = rcc.totalLoadRemaining;
				
				if (remainingTotalLoad == 0) remainingTotalLoad = 1000;
				
				double remainingCarLoad = (eCar.getSOC() - eCar.endSOC) * eCar.capacity;				
				double powerToLoad = rcc.carLoad * remainingCarLoad / remainingTotalLoad;
				eCar.setPower(powerToLoad, this.actor.getTimeStepDuration());
				answer.demandCar = -powerToLoad;
				answer.eCarSOC = eCar.getSOC();
			}
			
			// Wenn eigenständig entschieden wird
			else {
				answer.demandCar = eCar.getDemandAndCharge(currentTime, this.actor.getTimeStepDuration());
				answer.eCarSOC = eCar.getSOC();
			}
			
		}
		
		answer.demandTotal = answer.demandHouse + answer.demandCar;
		//answer.cost = preisArray[GlobalTime.currentTimeStep];
		
		if (PowerflowMapping.isMapped()){
			actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
			actorResults.activePower = answer.demandTotal * (-1000);
		}

		answer.price = PriceHack.price[this.actor.getCurrentTimeStep()];
		answer.cost = -answer.demandCar * answer.price;
		answer.totalCost += answer.cost;
		answer.eCarInformation = eCar;
		answer.jahresVerbrauch = jahresVerbrauch;
		
		
	}

	public AnswerContent returnAnswerContentToSend() {
		return answer;
	}

	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void endSimulation() {
		if (recorder != null){
			System.out.println(this.actorName + ": " +  answer.totalCost);
			recorder.close();
		}
	}

}
