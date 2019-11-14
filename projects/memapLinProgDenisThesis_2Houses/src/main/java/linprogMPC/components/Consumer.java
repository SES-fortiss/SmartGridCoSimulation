package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.components.prototypes.Device;
import linprogMPC.helper.ConsumptionProfiles;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.DemandMessage;


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
	
	public DemandMessage consumptionMessage = new DemandMessage();
	
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
		int cts = GlobalTime.getCurrentTimeStep();
		for (int i = 0; i < nStepsMPC; i++) {
			
			try {
				demandVectorB[i] = -4*consumptionProfiles.getHeatConsumption(consumerIndex, cts+i);
				demandVectorB[nStepsMPC+i] = -4*consumptionProfiles.getElectricConsumption(consumerIndex, cts+i);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		consumptionMessage.setDemandVector(demandVectorB);
		consumptionMessage.networkType = NetworkType.DEMANDWITHBOTH;
		consumptionMessage.name = this.actorName;
		consumptionMessage.id = this.fullActorPath;
		consumptionMessage.forecastType = "Profile";
		consumptionMessage.optimizationCriteria = "Price";
		
		super.updateDisplay(consumptionMessage);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return consumptionMessage;
	}	

}
