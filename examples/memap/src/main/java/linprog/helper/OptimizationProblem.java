package linprog.helper;

public class OptimizationProblem {
	
	public double[] lambda1;	// Euro
	public double[] lambda2;	// CO2
	public double[] lambda3;	// extended costs
	public double[] lambda4;	// mix of Euro and CO2
	
	public double[] lambda;	
	public double[] h;
	public double[][] g;
	public double[] b_eq;
	public double[][] a_eq;
	public double[] x_lb;
	public double[] x_ub;
	
	int nrOfProducers;
	int nrOfStorages;
	int marketmatrices = 4; // selling/buying(2) of electricity/heat(2)

	public OptimizationProblem(int n, int nrOfProducers, int nrOfStorages) {		
		this.nrOfProducers = nrOfProducers;
		this.nrOfStorages = nrOfStorages;
		
		lambda1  = new double[n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		lambda2  = new double[n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		lambda3  = new double[n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		lambda4  = new double[n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		
		lambda  = new double[n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		
		h = new double[n*2*nrOfStorages];
		g = new double[n*2*nrOfStorages][n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		
		b_eq = new double[2*n];
		a_eq = new double[2*n][n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		
		x_lb = new double[n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
		x_ub = new double[n*(nrOfProducers+(2*nrOfStorages)+marketmatrices)];
	}
	
	public int getNumberofProducers() {
		
		return nrOfProducers;
	}
	
	public int getNumberofStorages() {
		
		return nrOfStorages;
	}
	
	
}
