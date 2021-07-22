package memap.components.prototypes;

import akka.basicMessages.AnswerContent;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;

public class Connection extends Device {

	// for deserialization
	public String sourceBuilding;
	public String connectedBuilding;
	public double q_max;
	public double efficiency;
	public double operationalPrice;
	public double pipeLengthInMeter;

	public ConnectionMessage connectionMessage = new ConnectionMessage();

	public double[] linprogConnectionInput;
	public double[] linprogConnectionOutput;

	public Connection(String sourceBuilding, String connectedBuilding, double pipeLengthInMeter, double lossesPer100m, double q_max) {
		super("connection_From" + sourceBuilding + "_To"+connectedBuilding, 0);

		this.sourceBuilding = sourceBuilding;
		this.connectedBuilding = connectedBuilding;
		this.operationalPrice = 0.0001;
		efficiency = Math.pow(1.0 - lossesPer100m, pipeLengthInMeter / 100);
		this.q_max =  (efficiency != 0) ? (q_max / efficiency) :  0.0 ;
		this.pipeLengthInMeter = pipeLengthInMeter;
		
		// Initialization delayed until after topologyConfig initialization
		linprogConnectionInput = new double[topologyConfig.getNrStepsMPC()];
		linprogConnectionOutput = new double[topologyConfig.getNrStepsMPC()];
	}

	@Override
	public void makeDecision() {
		connectionMessage.networkType = NetworkType.HEAT;
		connectionMessage.name = actorName;
		connectionMessage.id = fullActorPath;
		
		connectionMessage.connectedBuildingFrom = fullActorPath.split("/")[this.fullActorPath.split("/").length-2];		
		connectionMessage.connectedBuildingTo = connectedBuilding;
		
		connectionMessage.efficiency = efficiency;
		connectionMessage.maxPower = q_max;
		connectionMessage.pipeLengthInMeter = pipeLengthInMeter;
		connectionMessage.operationalCostEUR = operationalPrice;
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {

		connectionMessage.id = fullActorPath;

		return connectionMessage;
	}

	@Override
	public void handleRequest() {
		if (requestContentReceived instanceof OptimizationResultMessage) {
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