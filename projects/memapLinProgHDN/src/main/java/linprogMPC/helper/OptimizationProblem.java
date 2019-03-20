package linprogMPC.helper;

public class OptimizationProblem {
	
	public double[] lambda;
	public double[] h;
	public double[][] g;
	public double[] b_eq;
	public double[][] a_eq;
	public double[] x_lb;
	public double[] x_ub;
	public String[] namesUB;
	
	int nrOfBuildings;
	int nrOfProducers;
	int nrOfStorages;
	int nrOfCouplers;
	int nrOfConnections;
	int marketmatrices;

	public OptimizationProblem(int nStepsMPC, int nrOfBuildings, int nrOfProducers, int nrOfStorages, int nrOfCouplers, int nrOfConnections, boolean lDHeating) {
		
		this.nrOfBuildings = nrOfBuildings;
		this.nrOfProducers = nrOfProducers;
		this.nrOfStorages = nrOfStorages;
		this.nrOfCouplers = nrOfCouplers;
		this.nrOfConnections = nrOfConnections;
		
		if (lDHeating) {
			this.marketmatrices = 2+2*nrOfBuildings; // selling/buying(2) of electricity/heat(2)
		}
		else {
			this.marketmatrices = 2; // selling/buying(2) of electricity
		}
		
		
		lambda  = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages) + nrOfCouplers + nrOfConnections*2 + marketmatrices)];
		
		h = new double[nStepsMPC*2*nrOfStorages];
		g = new double[nStepsMPC*2*nrOfStorages][nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		
		b_eq = new double[nStepsMPC*(nrOfBuildings+1)];
		a_eq = new double[nStepsMPC*(nrOfBuildings+1)][nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		
		x_lb = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		x_ub = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];		
		
		namesUB = new String[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+nrOfConnections*2+marketmatrices)];
		
		//System.out.println(nStepsMPC + " * ( " + nrOfProducers + " " + nrOfStorages + " " + nrOfCouplers + " und " + marketmatrices + ")");
		
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
		/*
		result += "OptimizationProblem:\n";
		result += "Producers: "+this.nrOfProducers;
		result += " Storages: "+this.nrOfStorages;
		result += " Couplers: "+this.nrOfCouplers + "\n";
		*/
		result += "A: " + a_eq.length + " x " + a_eq[0].length  + "\n";
		
		result += "b: " + b_eq.length  + "\n";
		
		/*
		result += "h: " + h.length  + "\n";
		
		if (g.length == 0) {
			result += "G: 0 x 0\n";
		} else result += "G: " + g.length + " x " + g[0].length  + "\n";
		
		
		result += "lb: " + x_lb.length  + "\n";
		result += "ub: " + x_ub.length  + "\n";
		*/
		
		return result;
	}
}
