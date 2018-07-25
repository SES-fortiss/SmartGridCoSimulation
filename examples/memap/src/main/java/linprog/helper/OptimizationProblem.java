package linprog.helper;

public class OptimizationProblem {
	
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
