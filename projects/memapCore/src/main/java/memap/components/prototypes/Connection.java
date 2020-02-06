package memap.components.prototypes;

import akka.basicMessages.AnswerContent;
import memap.messages.OptimizationResultMessage;
import memap.messages.extension.NetworkType;
import memap.messages.planning.ConnectionMessage;

public class Connection extends Device {

	/**
	 * public int connectedBuilding; public double maxIn; public double maxOut;
	 * public double efficiencyIn; public double efficiencyOut; public double
	 * operationalPriceEURO; public double operationalPriceCO2;
	 */

	public String connectedBuilding;
	public double q_max;
	public double efficiency;
	public double operationalPrice;
	public double pipeLengthInMeter;

	public ConnectionMessage connectionMessage = new ConnectionMessage();

	public double[] linprogConnectionInput = new double[nStepsMPC];
	public double[] linprogConnectionOutput = new double[nStepsMPC];

	// public Connection(int connectedBuilding, double maxIn, double maxOut, double
	// pipeLength, int port) {
	public Connection(String connectedBuilding, double pipeLengthInMeter, double lossesPer100m, double q_max) {
		super("connection", 0);

		/*
		 * this.connectedBuilding = connectedBuilding; this.maxIn = maxIn; this.maxOut=
		 * maxOut; this.operationalPriceEURO = 0.00001; this.operationalPriceCO2 = 0.0;
		 * // 1.5 % Verlust auf 100 Metern Leitung this.efficiencyIn =
		 * Math.pow(0.985,pipeLength/100); this.efficiencyOut =
		 * Math.pow(0.985,pipeLength/100);
		 */

		this.connectedBuilding = connectedBuilding;
		this.q_max = q_max;
		this.operationalPrice = 0.0001;
		efficiency = Math.pow(1.0 - lossesPer100m, pipeLengthInMeter / 100);
		this.pipeLengthInMeter = pipeLengthInMeter;
	}

	@Override
	public void makeDecision() {
		/**
		connectionMessage.networkType = NetworkType.HEAT;
		connectionMessage.name = this.actorName;
		connectionMessage.id = this.fullActorPath;
		connectionMessage.connectedBuilding = this.connectedBuilding;
		connectionMessage.maxIn = this.maxIn;
		connectionMessage.maxOut = this.maxOut;
		connectionMessage.efficiencyIn = this.efficiencyIn;
		connectionMessage.efficiencyOut = this.efficiencyOut;
		connectionMessage.operationalCostEUR = this.operationalPriceEURO;
		connectionMessage.operationalCostCO2 = this.operationalPriceCO2;*/
		
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