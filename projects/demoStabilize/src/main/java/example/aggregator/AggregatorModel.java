package example.aggregator;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import example.helper.Types;

public class AggregatorModel extends BehaviorModel {
	
	double sumKWH = 0;
	public AggregatorRecorder recorder = new AggregatorRecorder(this);
	public AggregatorAnswer aggregation = new AggregatorAnswer();
	
	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {				
		double demand = 0;
		double generation = 0;
		double powerInjection = 0; // can be negative and positive
		
		double privateLoad = 0;
		double commercialLoad = 0;
		double famrLoad = 0;
		double streetLightsLoad = 0;
		double solar = 0;
		
		for (BasicAnswer answer : super.answerListReceived) {
			
			AnswerToAggregator ans = (AnswerToAggregator) answer.answerContent;
			demand = demand + ans.demand;
			generation = generation + ans.generation;
			powerInjection = powerInjection + ans.powerInjection;
			
			if (ans.typ == Types.HOUSE) privateLoad += ans.demand;
			if (ans.typ == Types.COMMERCIAL) commercialLoad += ans.demand;
			if (ans.typ == Types.FARMS) famrLoad += ans.demand;
			if (ans.typ == Types.STREETLIGHTS) streetLightsLoad += ans.demand;
			if (ans.typ == Types.SOLAR) solar += ans.generation;
		}
		
		aggregation.demand = (int) demand;
		aggregation.generation = (int) generation;
		aggregation.powerInjection = (int) powerInjection;
		
		aggregation.house = (int) privateLoad;
		aggregation.commercial = (int) commercialLoad; 
		aggregation.farms = (int) famrLoad; 
		aggregation.streetLight = (int) streetLightsLoad;
		aggregation.solar = (int) solar;
		
		System.out.println("Demand: " + demand);
		System.out.println("Generation: " + generation);
		System.out.println("PowerInjection: " + powerInjection);
		
		//sumKWH += powerInjection * GlobalTime.period.toMinutes() / 60;
		//System.out.println("sumKWH: " + sumKWH);
		
		if (recorder != null){
			recorder.saveAnswer(aggregation);
		}
		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
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
}
