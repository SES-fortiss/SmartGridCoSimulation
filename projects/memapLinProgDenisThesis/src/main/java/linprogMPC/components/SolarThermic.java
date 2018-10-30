package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.helper.SolarRadiation;
import linprogMPC.messages.individualParts.planning.VolatileProducerMessage;
import linprogMPC.messages.types.NetworkType;

/**
 * Achtung SolarTheric ist ein Clon von PV, mit dem Unterschied, dass die geschickte message, den NetworkType Heat hat.
 * @author bytschkow
 *
 */
public class SolarThermic extends Producer {

	static double efficiency = 1.0;
	VolatileProducerMessage volatileProducerMessage; 
	
	public SolarThermic(double installedPower, int port) {
		super(installedPower, efficiency, port); //qdot_max not used here
		volatileProducerMessage = new VolatileProducerMessage();
	}

	@Override
	public void makeDecision() {		
		int cts = GlobalTime.getCurrentTimeStep();	
		volatileProducerMessage.name = this.actorName;
		volatileProducerMessage.cost = 0.00001;
		volatileProducerMessage.efficiency = efficiency;
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
