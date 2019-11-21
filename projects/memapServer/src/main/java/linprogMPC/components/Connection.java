package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import linprogMPC.components.prototypes.Device;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.ConnectionMessage;

public class Connection extends Device {

	public int connectedBuilding;
	public double maxIn;
	public double maxOut;
	public double efficiencyIn;
	public double efficiencyOut;
	public double operationalPriceEURO;
	public double operationalPriceCO2;
	
	public ConnectionMessage connectionMessage = new ConnectionMessage();
	
	public double[] linprogConnectionInput = new double[nStepsMPC];
	public double[] linprogConnectionOutput = new double[nStepsMPC];
	
	public Connection(int connectedBuilding, double maxIn, double maxOut, double pipeLength, int port) {
		super("connection", port);
		
		this.connectedBuilding = connectedBuilding;
		this.maxIn = maxIn;
		this.maxOut= maxOut;
		this.operationalPriceEURO = 0.00001;
		this.operationalPriceCO2 = 0.0;
		// 1.5 % Verlust auf 100 Metern Leitung
		this.efficiencyIn = Math.pow(0.985,pipeLength/100);
		this.efficiencyOut = Math.pow(0.985,pipeLength/100);
	}

	@Override
	public void makeDecision() {
		connectionMessage.networkType = NetworkType.HEAT;
		connectionMessage.name = this.actorName;
		connectionMessage.id = this.fullActorPath;	
		connectionMessage.connectedBuilding = this.connectedBuilding;
		connectionMessage.maxIn = this.maxIn;
		connectionMessage.maxOut= this.maxOut;
		connectionMessage.efficiencyIn = this.efficiencyIn;
		connectionMessage.efficiencyOut = this.efficiencyOut;	
		connectionMessage.operationalPriceEURO = this.operationalPriceEURO;
		connectionMessage.operationalPriceCO2 = this.operationalPriceCO2;
	}
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		
		this.connectionMessage.id = this.fullActorPath;
		
		return connectionMessage;
	}
	
	@Override
	public void handleRequest() {
		if(requestContentReceived instanceof OptimizationResultMessage) {			
			OptimizationResultMessage linprogResult = ((OptimizationResultMessage) requestContentReceived);			
						
			String key = this.actorName + "In";
			if (linprogResult.resultMap.containsKey(key)) {
				linprogConnectionOutput = linprogResult.resultMap.get(key);
			} 			
			
			key = this.actorName + "Out";
			if (linprogResult.resultMap.containsKey(key)) {
				linprogConnectionInput = linprogResult.resultMap.get(key);
			}			
		}
	}

}