package linprog.components;

import linprog.helper.EnergyPrices;

public class HeatPump extends Producer {

	public final double efficiency;
	
	public HeatPump(String name, double qdot_max, double efficiency, int port) {
		super(name, qdot_max, port);
		if(efficiency < 0.0 || efficiency > 1.0) {
			//TODO throw exception
			this.efficiency = efficiency;
		} else {
			this.efficiency = efficiency;
		}
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		EnergyPrices energyPrices = new EnergyPrices();
//		Calendar currentTime = startTime;
		for (int i = 0; i < n; i++) {
			// = 0 : Electricity for heat pump should come from PV production
			specificationToSend.cost[i] = 0.0; //energyPrices.getElectricityPriceInEuro(i);
//			currentTime.add(Calendar.SECOND, stepSize);
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix_H[i][j] = 0.0;
				specificationToSend.couplingMatrix_el[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix_H[i][i] = -efficiency;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qdot_max;
		}
		
		display.update(gson.toJson(specificationToSend));
	}
}
