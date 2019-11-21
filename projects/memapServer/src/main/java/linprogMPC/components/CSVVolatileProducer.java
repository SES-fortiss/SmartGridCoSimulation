package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.components.prototypes.Producer;
import linprogMPC.helper.SolarRadiation;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.VolatileProducerMessage;

public class CSVVolatileProducer extends Producer {
	static double efficiency = 1.0;
	public VolatileProducerMessage volatileProducerMessage;
	public NetworkType networkType;
	double opCost;
	double costCO2;

	/**
	 * @param name           volatile producer name
	 * @param installedPower volatile power [kW]
	 * @param networkType
	 * @param opCost         optimization cost [EUR]
	 * @param costCO2        CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public CSVVolatileProducer(String name, double installedPower, NetworkType networkType, double opCost,
			double costCO2, int port) {
		super(name, installedPower, efficiency, port);
		volatileProducerMessage = new VolatileProducerMessage();
		this.networkType = networkType;
		this.opCost = opCost;
		this.costCO2 = costCO2;
	}

	@Override
	public void makeDecision() {
		int cts = GlobalTime.getCurrentTimeStep();
		volatileProducerMessage.name = this.actorName;
		volatileProducerMessage.id = this.fullActorPath;
		volatileProducerMessage.operationalCostEUR = opCost;
		volatileProducerMessage.operationalCostCO2 = costCO2;
		volatileProducerMessage.efficiency = efficiency;
		volatileProducerMessage.installedPower = installedPower;
		volatileProducerMessage.networkType = this.networkType;
		volatileProducerMessage.forecast = new double[nStepsMPC];

		SolarRadiation solarRadiation = new SolarRadiation();

		for (int i = 0; i < nStepsMPC; i++) {
			volatileProducerMessage.forecast[i] = solarRadiation.getSolarProductionPerKWp(cts + i) * installedPower;
		}
		super.updateDisplay(volatileProducerMessage);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return volatileProducerMessage;
	}

}
