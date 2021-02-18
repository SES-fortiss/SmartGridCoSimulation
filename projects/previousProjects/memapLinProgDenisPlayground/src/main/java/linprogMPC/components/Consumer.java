package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import linprogMPC.helper.ConsumptionProfiles;
import linprogMPC.messages.ConsumptionMessage;


/**
 * This class represents the consumer. It is responsible to generate the consumption profiles.
 * This is also the place if additional uncertainties should be implemented.
 * 
 * @author JMr
 * 
 * @version reviewed by DB, on 28.9.18, sollte soweit passen.
 *
 */
public class Consumer extends Device {
	
	public ConsumptionMessage consumptionMessage = new ConsumptionMessage();
	public final int consumerIndex;
	private final ConsumptionProfiles consumptionProfiles;

	public Consumer(ConsumptionProfiles consumptionProfiles, int consumerIndex, int port) {
		super(port);
		this.consumerIndex = consumerIndex;
		this.consumptionProfiles = consumptionProfiles;
	}

	@Override
	public void makeDecision() {
		double[] demandVectorB = new double[2*nStepsMPC];
		int cts = this.actor.getCurrentTimeStep();
		for (int i = 0; i < nStepsMPC; i++) {
			demandVectorB[i] = -consumptionProfiles.getHeatConsumption(consumerIndex, cts+i);
			demandVectorB[nStepsMPC+i] = -consumptionProfiles.getElectricConsumption(consumerIndex, cts+i);
		}
		
		consumptionMessage.setDemandVector(demandVectorB);		
		super.updateDisplay(consumptionMessage);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return consumptionMessage;
	}	

}
