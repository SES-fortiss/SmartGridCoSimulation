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

	public CSVVolatileProducer(String name, double installedPower, NetworkType networkType, int port) {
		super(name, installedPower, efficiency, port);
		volatileProducerMessage = new VolatileProducerMessage();
		this.networkType = networkType;

	}

	@Override
	public void makeDecision() {
		int cts = GlobalTime.getCurrentTimeStep();
		volatileProducerMessage.name = this.actorName;
		volatileProducerMessage.id = this.fullActorPath;
		volatileProducerMessage.operationalPriceEURO = 0.00001;
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
