package linprogMPC.helper.lp;

public class LPOptimizationProblem {
	
	public double[] lambda;
	public double[] lambdaCO2;
	public double[] h;
	public double[][] g;
	public double[] b_eq;
	public double[][] a_eq;
	public double[] x_lb;
	public double[] x_ub;
	public String[] namesUB;
	public double[] etas;
	
	int nrOfBuildings;
	int nrOfProducers;
	int nrOfStorages;
	int nrOfCouplers;
	int nrOfConnections;
	int marketmatrices;
	

	public LPOptimizationProblem(int nStepsMPC, int nrOfBuildings, int nrOfProducers, int nrOfStorages, int nrOfCouplers, int nrOfConnections) {
		
		this.nrOfBuildings = nrOfBuildings;
		this.nrOfProducers = nrOfProducers;
		this.nrOfStorages = nrOfStorages;
		this.nrOfCouplers = nrOfCouplers;
		this.nrOfConnections = nrOfConnections;
		
		this.marketmatrices = 2; // selling/buying(2) of electricity	
		
		lambda  = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages) + nrOfCouplers + nrOfConnections*2 + marketmatrices)];
		lambdaCO2  = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages) + nrOfCouplers + nrOfConnections*2 + marketmatrices)];
		
		h = new double[nStepsMPC*2*nrOfStorages];
		g = new double[nStepsMPC*2*nrOfStorages][nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		
		b_eq = new double[nStepsMPC*(nrOfBuildings+1)];
		a_eq = new double[nStepsMPC*(nrOfBuildings+1)][nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];		
		
		x_lb = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		x_ub = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];		
		
		namesUB = new String[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		etas = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		
	}
	
	public int getNrOfBuildings() {
		return nrOfBuildings;
	}
	
	public int getNumberofProducers() {		
		return nrOfProducers;
	}
	
	public int getNumberofStorages() {		
		return nrOfStorages;
	}
	
	public int getNumberofCouplers() {		
		return nrOfCouplers;
	}
	
	public int getNrOfConnections() {
		return nrOfConnections;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "A: " + a_eq.length + " x " + a_eq[0].length  + "\n";
		result += "b: " + b_eq.length  + "\n";

		return result;
	}
}
