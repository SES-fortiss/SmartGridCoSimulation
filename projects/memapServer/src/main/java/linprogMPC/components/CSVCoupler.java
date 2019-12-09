package linprogMPC.components;

import linprogMPC.components.prototypes.Coupler;
import linprogMPC.messages.extension.NetworkType;

public class CSVCoupler extends Coupler {
	NetworkType primaryNetwork;
	NetworkType secondaryNetwork;
	double opCost;
	double costCO2;

	/**
	 * @param name             coupler name
	 * @param installedPower   coupler power [kW]
	 * @param efficiencyHeat   heat efficiency [-1, 10]
	 * @param efficiencyElec   electricity efficiency [-1, 10]
	 * @param primaryNetwork
	 * @param secondaryNetwork
	 * @param opCost           optimization cost [EUR]
	 * @param costCO2          CO2 cost [kg CO2/kWh]
	 * @param port
	 */
	public CSVCoupler(String name, double installedPower, double efficiencyHeat, double efficiencyElec,
			NetworkType primaryNetwork, NetworkType secondaryNetwork, double opCost, double costCO2, int port) {
		super(name, installedPower, efficiencyHeat, efficiencyElec, port);
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
		couplerMessage.installedPower = installedPower;

		// super.updateDisplay(couplerMessage);
	}

}
