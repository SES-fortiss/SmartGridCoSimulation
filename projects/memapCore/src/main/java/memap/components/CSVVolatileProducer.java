package memap.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import memap.components.prototypes.Producer;
import memap.helper.SolarRadiation;
import memap.messages.extension.NetworkType;
import memap.messages.planning.VolatileProducerMessage;

public class CSVVolatileProducer extends Producer {
	public NetworkType networkType;
	double opCost;
	double costCO2;
	static double efficiency = 1.0;
	public VolatileProducerMessage volatileProducerMessage;
	private SolarRadiation solarRadiation = null;

	/**
	 * @param name           volatile producer name
	 * @param minPower       volatile minimum power [kW]
	 * @param maxPower       volatile maximum power [kW]
	 * @param networkType
	 * @param opCost         optimization cost [EUR]
	 * @param costCO2        CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public CSVVolatileProducer(String name, String csvFile, double minPower, double maxPower, NetworkType networkType,
			double opCost, double costCO2, int port) {
		super(name, minPower, maxPower, efficiency, port);
		volatileProducerMessage = new VolatileProducerMessage();
		this.networkType = networkType;
		this.opCost = opCost;
		this.costCO2 = costCO2;
		solarRadiation = new SolarRadiation(csvFile);
	}

	@Override
	public void makeDecision() {
		int cts = GlobalTime.getCurrentTimeStep();
		volatileProducerMessage.id = fullActorPath;
		volatileProducerMessage.name = actorName;
		volatileProducerMessage.minPower = minPower;
		volatileProducerMessage.maxPower = maxPower;
		volatileProducerMessage.operationalCostEUR = opCost;
		volatileProducerMessage.operationalCostCO2 = costCO2;
		volatileProducerMessage.efficiency = efficiency;
		volatileProducerMessage.networkType = networkType;
		volatileProducerMessage.forecast = new double[nStepsMPC];

		for (int i = 0; i < nStepsMPC; i++) {
			volatileProducerMessage.forecast[i] = solarRadiation.getSolarProductionPerKWp(cts + i) * maxPower;
		}
		super.updateDisplay(volatileProducerMessage);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return volatileProducerMessage;
	}
}
