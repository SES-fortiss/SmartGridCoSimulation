/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.coordinator;
import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import eCarStreet.ECarStreetTopology;
import eCarStreet.house.HouseAnswerContent;

public class Coordinator extends BehaviorModel{	
	
	public double totalDemand = 0;
	public CoordinatorAnswerContent answer = new CoordinatorAnswerContent();
	public RequestCoordinatorContent request = new RequestCoordinatorContent();
	
	public static ArrayList<Double> eCarLoadList = new ArrayList<Double>();
	
	
	public RecorderCoordinator recorder = new RecorderCoordinator(this);	
	public boolean optimizeLine = true;
	
	
	@Override
	public void handleRequest() {
		prepareRequest();
	}

	@Override
	public void makeDecision() {
		prepareAnswer();
		recorder.saveAnswer(answer);	
	}

	private void prepareAnswer() {
		optimizeLine = ECarStreetTopology.coordinatorControl;
		
		totalDemand = 0;
		
		double demandECars = 0;
		double demandHouses = 0;		
		
		for (BasicAnswer message : super.answerListReceived){
			if (message.answerContent instanceof HouseAnswerContent) {
				HouseAnswerContent answer = (HouseAnswerContent) message.answerContent;
				totalDemand += answer.demandTotal;
				demandECars += answer.demandCar;
				demandHouses += answer.demandHouse;
			}
		}
		
		answer.currentTime = this.actor.getCurrentTime();
		answer.demandTotal = totalDemand;
		answer.demandECars = demandECars; 
		answer.demandHouses = demandHouses;
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return request;
	}
	
	@Override
	public void endSimulation(){
		recorder.close();
	}

	private void prepareRequest() {
		
		CoordinatorOptimizeLine.setCurrentTime(this.actor.getCurrentTime());
		CoordinatorOptimizeLine.setCurrentDuration(this.actor.getTimeStepDuration());
		
		if (optimizeLine){
			eCarLoadList = CoordinatorOptimizeLine.prepareRequest(super.answerListReceived);
		}
		
		if (eCarLoadList != null){
			request.carLoad = eCarLoadList.get(this.actor.getCurrentTimeStep()-1);
			
			// das wird angepasst bei sehr wenig verbleibendem Speicher.
			if (request.carLoad >= Math.abs(CoordinatorOptimizeLine.totalLoadRemaining)) request.carLoad = Math.abs(CoordinatorOptimizeLine.totalLoadRemaining);			
			
			request.carLoad *= 3600.0 / this.actor.getTimeStepDuration().getSeconds();
		}		
		
		request.optimizeLine = this.optimizeLine;
		request.totalLoadRemaining = CoordinatorOptimizeLine.totalLoadRemaining;		
	}	
}
