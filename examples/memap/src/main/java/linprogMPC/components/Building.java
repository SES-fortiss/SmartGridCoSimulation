package linprogMPC.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

import org.fortiss.smg.actuatorclient.opcua.impl.ActuatorClientImpl;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprogMPC.Simulation;
import linprogMPC.OPCUA.ReadNode;
import linprogMPC.OPCUA.opcuaClient;
import linprogMPC.messages.BuildingSpec;
import linprogMPC.messages.Consumption;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerSpec;
import linprogMPC.messages.StorageSpec;
import memap.external.M2MDisplay;

public class Building extends BehaviorModel {
	
	//duplicated from Device.java
	protected final String name;
	
	protected M2MDisplay display;
	protected M2MDisplay display2;
	
	protected Gson gson = new Gson();
	public int port;
	
	// Establish OPC UA Client - Server
	public String host = "0.0.0.0";
	public String opcPort = "4840";
	
	ReadNode reader = new ReadNode();
	opcuaClient MemapOpcuaClient = new opcuaClient(reader);
	
	
	
//	ReadNode reader = new ReadNode();	
//    public void opcuaClient(reader).run();
	
	// NEW(7.8.18 by JMr): Long-distance heating supply
	public boolean LDHeating;
	public int heatTransportLength;
	// ================================
	
	public BuildingSpec specificationToSend = new BuildingSpec();
	public OptimizationResult requestContentToSend = new OptimizationResult();	

	public Building(String name, int port, boolean LDHeating, int heatTransportLength) {
		
		//duplicated from Device.java
		if(name == null) {
			//TODO throw exception
		}
		this.name = name;
		this.port = port;
		this.LDHeating = LDHeating;
		this.heatTransportLength = heatTransportLength;
		
		display = new M2MDisplay(port); // add port in to display a json
		display2 = new M2MDisplay(8070);
		
		display.run();
		display2.run();
	}


	
	
	@Override
	public void makeDecision() {
		
	
	
//		=======================  RECEIVING =======================	
			
		specificationToSend = new BuildingSpec();
		
		specificationToSend.name = name;
		specificationToSend.LDHeating = LDHeating;
		specificationToSend.heatTransportLength = heatTransportLength;
		
		for(BasicAnswer basicAnswer : answerListReceived) {			
			AnswerContent answerContent = basicAnswer.answerContent;
			if(answerContent instanceof Consumption) {
				specificationToSend.consumption.addConsumption(((Consumption) answerContent).getVector()); 
			}
			if(answerContent instanceof ProducerSpec) {
				specificationToSend.producers.add((ProducerSpec) answerContent);
			}
			if(answerContent instanceof StorageSpec) {
				specificationToSend.storages.add((StorageSpec) answerContent);
			}		
		}
		
		display.update(gson.toJson(specificationToSend));

//		=======================  OPCUA =======================	
		
		
		
		

	}

	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
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
			double[] buildingCosts = linprogResult.basicsMap.get(this.name +" Costs");
	//		==========================================================		
	
				if (memapCosts != null) {

					requestContentToSend.basicsMap.put("MEMAP Costs", memapCosts);
					requestContentToSend.basicsMap.put(this.name + " Costs", buildingCosts);	

					for (String key : linprogResult.resultMap.keySet()) {
						if (key.contains(this.name)) {
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

}
