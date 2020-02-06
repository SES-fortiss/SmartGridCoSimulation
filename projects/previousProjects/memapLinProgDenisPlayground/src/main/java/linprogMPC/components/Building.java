package linprogMPC.components;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprogMPC.external.M2MDisplay;
import linprogMPC.messages.BuildingMessage;
import linprogMPC.messages.ConsumptionMessage;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerMessage;
import linprogMPC.messages.StorageMessage;

public class Building extends BehaviorModel {
	
	protected M2MDisplay display;
	protected M2MDisplay display2;
	
	protected Gson gson = new Gson();
	public int port;
	
	// NEW(7.8.18 by JMr): Long-distance heating supply
	public boolean LDHeating;
	public int heatTransportLength;
	// ================================
	
	public BuildingMessage buildingMessage = new BuildingMessage();
	public OptimizationResult requestContentToSend = new OptimizationResult();	

	public Building(int port, boolean LDHeating, int heatTransportLength) {
		
		this.port = port;
		this.LDHeating = LDHeating;
		this.heatTransportLength = heatTransportLength;
		
		display = new M2MDisplay(port); // add port in to display a json
		display2 = new M2MDisplay(port-10);
		
		display.run();
		display2.run();
		
		System.out.println("Building-Display-port: " + port);		
		System.out.println("Building-Display2-port: " + (port-10));
	}


	
	
	@Override
	public void makeDecision() {	
	//	=======================  RECEIVING =======================	
				
		buildingMessage = new BuildingMessage();
		
		buildingMessage.name = this.actorName;
		buildingMessage.LDHeating = LDHeating;
		buildingMessage.heatTransportLength = heatTransportLength;
		
		for(BasicAnswer basicAnswer : answerListReceived) {			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof ConsumptionMessage) {
				buildingMessage.consumption.addConsumption(((ConsumptionMessage) answerContent).getDemandVector()); 
			}
			
			if(answerContent instanceof ProducerMessage) {
				buildingMessage.producers.add((ProducerMessage) answerContent);
			}
			
			if(answerContent instanceof StorageMessage) {
				buildingMessage.storages.add((StorageMessage) answerContent);
			}	
		}
		
		System.out.println("BuildingMessage: " + gson.toJson(buildingMessage));
		display.update(gson.toJson(buildingMessage));
	}

	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return buildingMessage;
	}


	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		// TODO Auto-generated method stub	
	}


	@Override
	public void handleRequest() {
		
		if(requestContentReceived instanceof OptimizationResult) {

			OptimizationResult linprogResult = ((OptimizationResult) requestContentReceived);
			
	//		=================== COST DECISION ? ======================		
			// for this decision it needs a financial model to which the building can be compared
			
			double[] memapCosts = linprogResult.basicsMap.get("MEMAP Costs");		
			double[] buildingCosts = linprogResult.basicsMap.get(this.actorName +" Costs");
	//		==========================================================		
	
				if (memapCosts != null) {

					requestContentToSend.basicsMap.put("MEMAP Costs", memapCosts);
					requestContentToSend.basicsMap.put(this.actorName + " Costs", buildingCosts);	

					for (String key : linprogResult.resultMap.keySet()) {
						if (key.contains(this.actorName)) {
							requestContentToSend.resultMap.put(key, linprogResult.resultMap.get(key));
						}
					}
				}
		} 
			display2.update(gson.toJson(requestContentToSend));	
	}


	@Override
	public RequestContent returnRequestContentToSend() {
		// TODO Auto-generated method stub
		return requestContentToSend;
	}
	
	@Override
	public void stop() {
		try {
			display.server.stop();
			display2.server.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		super.stop();
	}

}
