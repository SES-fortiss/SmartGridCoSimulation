package linprog.helper;

public class OptimizationProblem {
	
	public double[] lambda;
	public double[] h;
	public double[][] g;
	public double[] x_lb;
	public double[] x_ub;

	public OptimizationProblem(int n, int nrOfProducers, int nrOfStorages) {
		lambda  = new double[n*(nrOfProducers+2*nrOfStorages)];
		h = new double[n*(1+2*nrOfStorages)];
		g = new double[n*(1+2*nrOfStorages)][n*(nrOfProducers+2*nrOfStorages)];
		x_lb = new double[n*(nrOfProducers+2*nrOfStorages)];
		x_ub = new double[n*(nrOfProducers+2*nrOfStorages)];
	}
	
	
}
