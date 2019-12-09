package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.components.prototypes.Producer;
import linprogMPC.helper.SolarRadiation;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.VolatileProducerMessage;

/**
 * Achtung SolarTheric ist ein Clon von PV, mit dem Unterschied, dass die geschickte message, den NetworkType Heat hat.
 * @author bytschkow
 *
 */
public class SolarThermic extends Producer {

	// static double efficiency = 1.0;
	VolatileProducerMessage volatileProducerMessage; 
	
	public SolarThermic(double installedPower, int port) {
		super(installedPower, 1, port); //qdot_max not used here
		volatileProducerMessage = new VolatileProducerMessage();
	}

	@Override
	public void makeDecision() {		
		int cts = GlobalTime.getCurrentTimeStep();	
		volatileProducerMessage.name = this.actorName;
		volatileProducerMessage.id = this.fullActorPath;
		volatileProducerMessage.operationalPriceEURO = 0.00001;
		volatileProducerMessage.efficiency = 1;
		volatileProducerMessage.installedPower = installedPower;
		volatileProducerMessage.networkType = NetworkType.HEAT;
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
