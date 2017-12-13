package linprog.components;

public abstract class DeviceInOut extends Device {

	public double qt_max_in;
	public double qt_max_out;

	public DeviceInOut(String name) {
		super(name);
	}

	@Override
	public void makeDecision() {
		super.makeDecision();
		specificationToSend.cost = new double[2*n];
		specificationToSend.couplingMatrix = new double[n][2*n];
		specificationToSend.capacityMatrix1 = new double[n][2*n];
		specificationToSend.capacityMatrix2 = new double[n][2*n];
		specificationToSend.vector = new double[2*n];
		specificationToSend.lowerBound = new double[2*n];
		specificationToSend.upperBound = new double[2*n];
		for(int i = 0; i < n; i++) {		
			for(int j = 0; j <= i; j++) {
				specificationToSend.capacityMatrix1[i][j] = -1;
				specificationToSend.capacityMatrix2[i][j] = 1;
			}			
			for(int j = i+1; j <= n; j++) {
				specificationToSend.capacityMatrix1[i][j] = 0;
				specificationToSend.capacityMatrix2[i][j] = 0;
			}			
			specificationToSend.vector[i] = 0.0;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qt_max_in;
		}
		for(int i = n; i < 2*n; i++) {			
			for(int j = 0; j <= i; j++) {
				specificationToSend.capacityMatrix1[i][j] = 1;
				specificationToSend.capacityMatrix2[i][j] = -1;
			}			
			for(int j = i+1; j <= n; j++) {
				specificationToSend.capacityMatrix1[i][j] = 0;
				specificationToSend.capacityMatrix2[i][j] = 0;
			}			
			specificationToSend.vector[i] = 0.0;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qt_max_out;
		}
	}
	
}
