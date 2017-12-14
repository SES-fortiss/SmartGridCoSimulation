package linprog.components;

public abstract class Producer extends Device {

	protected double qdot_max;
	
	public Producer(String name, double qdot_max) {
		super(name);
		this.qdot_max = qdot_max;
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		specificationToSend.cost = new double[n];
		specificationToSend.couplingMatrix = new double[n][n];
		specificationToSend.lowerBound = new double[n];
		specificationToSend.upperBound = new double[n];
		
		for (int i = 0; i < n; i++) {
			specificationToSend.lowerBound[i] = 0;
			specificationToSend.upperBound[i] = qdot_max;			
		}
	}

}
