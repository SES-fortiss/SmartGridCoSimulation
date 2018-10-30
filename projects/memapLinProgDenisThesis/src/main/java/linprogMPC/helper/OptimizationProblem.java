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
	
	int nrOfProducers;
	int nrOfStorages;
	int nrOfCouplers;
	int marketmatrices = 4; // selling/buying(2) of electricity/heat(2) und das ganze mal Anzahl nMPC

	public OptimizationProblem(int nStepsMPC, int nrOfProducers, int nrOfStorages, int nrOfCouplers) {
		
		this.nrOfProducers = nrOfProducers;
		this.nrOfStorages = nrOfStorages;
		this.nrOfCouplers = nrOfCouplers;		
		
		lambda  = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages) + nrOfCouplers + marketmatrices)];
		
		h = new double[nStepsMPC*2*nrOfStorages];
		g = new double[nStepsMPC*2*nrOfStorages][nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+marketmatrices)];
		
		b_eq = new double[2*nStepsMPC];
		a_eq = new double[2*nStepsMPC][nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+marketmatrices)];
		
		x_lb = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+marketmatrices)];
		x_ub = new double[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+marketmatrices)];		
		
		namesUB = new String[nStepsMPC*(nrOfProducers+(2*nrOfStorages)+nrOfCouplers+marketmatrices)];
		
		//System.out.println(nStepsMPC + " * ( " + nrOfProducers + " " + nrOfStorages + " " + nrOfCouplers + " und " + marketmatrices + ")");
		
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
