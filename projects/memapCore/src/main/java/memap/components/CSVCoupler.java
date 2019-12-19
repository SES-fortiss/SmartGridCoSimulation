package memap.components;

import memap.components.prototypes.Coupler;
import memap.messages.extension.NetworkType;

public class CSVCoupler extends Coupler {
	NetworkType primaryNetwork;
	NetworkType secondaryNetwork;
	double opCost;
	double costCO2;

	/**
	 * @param name             coupler name
	 * @param minPower         coupler minimum power [kW]
	 * @param maxPower         coupler maximum power [kW]
	 * @param efficiencyHeat   heat efficiency [-1, 10]
	 * @param efficiencyElec   electricity efficiency [-1, 10]
	 * @param primaryNetwork
	 * @param secondaryNetwork
	 * @param opCost           optimization cost [EUR]
	 * @param costCO2          CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public CSVCoupler(String name, double minPower, double maxPower, double efficiencyHeat, double efficiencyElec,
			NetworkType primaryNetwork, NetworkType secondaryNetwork, double opCost, double costCO2, int port) {
		super(name, minPower, maxPower, efficiencyHeat, efficiencyElec, port);
		this.primaryNetwork = primaryNetwork;
		this.secondaryNetwork = secondaryNetwork;
		this.opCost = opCost;
		this.costCO2 = costCO2;
	}

	@Override
	public void makeDecision() {
		couplerMessage.name = actorName;
		couplerMessage.id = fullActorPath;
		couplerMessage.primaryNetwork = primaryNetwork;
		couplerMessage.secondaryNetwork = secondaryNetwork;
		couplerMessage.operationalCostEUR = opCost;
		couplerMessage.operationalCostCO2 = costCO2;
		couplerMessage.efficiencyElec = efficiencyElec;
		couplerMessage.efficiencyHeat = efficiencyHeat;
		couplerMessage.minPower = minPower;
		couplerMessage.maxPower = maxPower;

		// super.updateDisplay(couplerMessage);
	}

}
