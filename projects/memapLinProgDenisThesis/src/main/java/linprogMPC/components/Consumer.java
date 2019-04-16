package linprogMPC.components;

import java.util.ArrayList;

import akka.basicMessages.AnswerContent;
import akka.systemActors.GlobalTime;
import linprogMPC.components.prototypes.Device;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.DemandMessage;

/**
 * This class represents the consumer. It is responsible to generate the
 * consumption profiles. This is also the place if additional uncertainties
 * should be implemented.
 * 
 * @author JMr
 * 
 * @version reviewed by DB, on 28.9.18, sollte soweit passen.
 *
 */
public class Consumer extends Device {

    public DemandMessage consumptionMessage = new DemandMessage();
    private ArrayList<Double> heatProfile;
    private ArrayList<Double> electricityProfile;

    // public final int consumerIndex;
    // private final ConsumptionProfiles consumptionProfiles;

    public Consumer(ArrayList<Double> heatProfile, ArrayList<Double> electricityProfile, int port) {
	super(port);
	this.heatProfile = heatProfile;
	this.electricityProfile = electricityProfile;
    }

    @Override
    public void makeDecision() {
	double[] demandVectorB = new double[2 * nStepsMPC];
	int cts = GlobalTime.getCurrentTimeStep();
	for (int i = 0; i < nStepsMPC; i++) {

	    try {
		demandVectorB[i] = -heatProfile.get(cts + i) / 60;
		demandVectorB[nStepsMPC + i] = -electricityProfile.get(cts + i) / 60;
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
