package linprogMPC.components;

import java.util.LinkedList;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import linprogMPC.OPCUA.ReadClient;
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
	
	
	public String clientName = "name";
	public String clientURI = "URI";
	

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
		
//		=======================  OPC UA Read  =======================	
		
		// Define Node(s) to read --> extend to List<NodeID> 
		NodeId node1 = new NodeId(2,30);
		
		try {
			ReadClient.startClient(clientName, clientURI, node1);
			// Output:
			String readValue = ReadClient.getData();
			System.out.println("[OPC UA] heat consumption " + name + ": " + readValue);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("OPC Client read failed");
		}
		
	
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
