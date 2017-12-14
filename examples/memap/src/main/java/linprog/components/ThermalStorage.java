package linprog.components;

public class ThermalStorage extends Storage {
	
	public final double efficiency;
	
	public ThermalStorage(String name, double qdot_max_in, double qdot_max_out, double capacity, double efficiency) {
		super(name, qdot_max_in, qdot_max_out, capacity);
		if(efficiency < 0 || efficiency > 1) {
			//TODO throw exception
		}
		this.efficiency = efficiency;
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.0;
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix[i][i] = 1.0/efficiency;
			specificationToSend.vector[i] = 0;
		}
		for (int i = n; i < 2*n; i++) {
			specificationToSend.cost[i] = 0.0;
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.couplingMatrix[i][i] = -efficiency;
			specificationToSend.vector[i] = capacity/stepSize;
		}
	}

}
