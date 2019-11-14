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
 * @version reviewed by DB, on 16.11.18, es wurde ein factor 4 reingebracht, um von kWh auf power umzurechnen.
 * Das sollte man im Auge behalten, bzw auf einen generischen Ansatz anpassen!!!
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
				demandVectorB[i] = -consumptionProfiles.getHeatConsumption(consumerIndex, cts+i)*4;
				demandVectorB[nStepsMPC+i] = -consumptionProfiles.getElectricConsumption(consumerIndex, cts+i)*4;
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
