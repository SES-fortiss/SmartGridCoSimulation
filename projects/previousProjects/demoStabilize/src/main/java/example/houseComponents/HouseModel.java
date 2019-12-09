package example.houseComponents;

import helper.lastProfil.LastProfilTennet;

import java.util.LinkedList;

import powerflowApi.ActorResults;
import powerflowApi.PowerflowMapping;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import example.aggregator.AnswerToAggregator;
import example.helper.Types;

public class HouseModel extends BehaviorModel {
	
	public AnswerToAggregator answerContentToSend = new AnswerToAggregator();
	public Types typ = Types.HOUSE;
	
	double jahresVerbrauch;
	public HouseRecorder recorder;
	public ActorResults actorResults;

	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		double gen = 0.0;				
		
		for (BasicAnswer answer : super.answerListReceived) {			
			AnswerToAggregator ans = (AnswerToAggregator) answer.answerContent;		
			if (ans.typ == Types.SOLAR) gen += ans.generation;
		}
		
		answerContentToSend.demand = LastProfilTennet.getLoadDomestic(jahresVerbrauch, actualTimeValue);
		answerContentToSend.generation = gen;
		answerContentToSend.powerInjection = answerContentToSend.generation - answerContentToSend.demand;
		answerContentToSend.typ = this.typ;
		
		if (recorder != null){
			recorder.saveAnswer(answerContentToSend);
		}
		
		if (PowerflowMapping.isMapped()){
    		actorResults = PowerflowMapping.actorResultsMap.get(fullActorPath);
        	actorResults.activePower = -answerContentToSend.powerInjection;
        	//actorResults.setPointReactivePower = -actualPower*0.5;
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
	
	@Override
	public void endSimulation() {
		if (recorder != null){
			recorder.close();
		}
	}
	
	// Constructor
	public HouseModel(double jahresVerbrauch){
		this.jahresVerbrauch = jahresVerbrauch;
		
		if (this.actorName.equals("HausProfil1_1")) {
			this.recorder = new HouseRecorder(this);
		}
		
		if (this.actorName.equals("HausProfil2_1")) {
			this.recorder = new HouseRecorder(this);
		}
		
		if (this.actorName.equals("HausProfil3_1")) {
			this.recorder = new HouseRecorder(this);
		}
	}
}
