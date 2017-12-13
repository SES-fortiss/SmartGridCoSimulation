package linprog.components;

public abstract class DeviceIn extends Device {

	protected double qt_max;
	
	public DeviceIn(String name, double qt_max) {
		super(name);
		this.qt_max = qt_max;
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
			specificationToSend.upperBound[i] = qt_max;			
		}
	}

}
