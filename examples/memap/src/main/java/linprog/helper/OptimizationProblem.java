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

	public OptimizationProblem(int n, int nrOfProducers, int nrOfStorages) {
	
		this.nrOfProducers = nrOfProducers;
		this.nrOfStorages = nrOfStorages;
		
		lambda  = new double[n*(nrOfProducers+2*nrOfStorages+2)];
		
		h = new double[n*2*nrOfStorages];
		g = new double[n*2*nrOfStorages][n*(nrOfProducers+2*nrOfStorages+2)];
		
		b_eq = new double[2*n];
		a_eq = new double[2*n][n*(nrOfProducers+2*nrOfStorages+2)];
		
		x_lb = new double[n*(nrOfProducers+2*nrOfStorages+2)];
		x_ub = new double[n*(nrOfProducers+2*nrOfStorages+2)];
		
		
	}
	
	public int getNumberofProducers() {
		
		return nrOfProducers;
	}
	
	public int getNumberofStorages() {
		
		return nrOfStorages;
	}
	
	
}
