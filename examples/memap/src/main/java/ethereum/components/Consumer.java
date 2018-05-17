package ethereum.components;

import java.math.BigInteger;

import akka.systemActors.GlobalTime;
import ethereum.helper.ConsumptionProfiles;

public class Consumer{
	
	private BigInteger consumption;
	private final int consumerIndex;
	private final ConsumptionProfiles consumptionProfiles;

	public Consumer(ConsumptionProfiles consumptionProfiles, int consumerIndex) {
		this.consumerIndex = consumerIndex;
		this.consumptionProfiles = consumptionProfiles;
	}

	public BigInteger readConsumption() {
		return consumption;
	}
	
	public BigInteger updateAndReadConsumption() {
		consumption = consumptionProfiles.getHeatConsumption(
				consumerIndex,
				GlobalTime.currentTimeStep
		);
		return consumption;
	}
}
