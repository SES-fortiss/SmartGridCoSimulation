package linprog.components;

public class Battery extends Storage {
	
	
	
	public Battery(String name, double qdot_max_in, double qdot_max_out, double capacity) {
		super(name, qdot_max_in, qdot_max_out, capacity);
	}
	
	@Override
	public void makeDecision() {
		super.makeDecision();
		for (int i = 0; i < n; i++) {
			specificationToSend.cost[i] = 0.0;
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.vector[i] = 0;
		}
		for (int i = n; i < 2*n; i++) {
			specificationToSend.cost[i] = 0.0;
			for (int j = 0; j < n; j++) {
				specificationToSend.couplingMatrix[i][j] = 0.0;
			}
			specificationToSend.vector[i] = capacity/stepSize;
		}
	}

}
