package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.components.prototypes.Producer;
import linprogMPC.helper.SolarRadiation;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.VolatileProducerMessage;

public class PV extends Producer {

	// static double efficiency = 1.0;
	VolatileProducerMessage volatileProducerMessage; 
	
	public PV(double installedPower, double efficiency, int port) {
		super(installedPower, efficiency, port); //qdot_max not used here
		volatileProducerMessage = new VolatileProducerMessage();
	}

	@Override
	public void makeDecision() {		
		int cts = GlobalTime.getCurrentTimeStep();	
		volatileProducerMessage.name = this.actorName;
		volatileProducerMessage.id = this.fullActorPath;		
		volatileProducerMessage.operationalPriceEURO = 0.00001;
		volatileProducerMessage.efficiency = efficiency;
		volatileProducerMessage.installedPower = installedPower;
		volatileProducerMessage.networkType = NetworkType.ELECTRICITY;
		volatileProducerMessage.forecast = new double[nStepsMPC];
		
		SolarRadiation solarRadiation = new SolarRadiation();

		
		for (int i = 0; i < nStepsMPC; i++) {
			volatileProducerMessage.forecast[i] = solarRadiation.getSolarProductionPerKWp(cts+i)*installedPower;			
		}
		super.updateDisplay(volatileProducerMessage);
	}
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		return volatileProducerMessage;
	}
	

}
