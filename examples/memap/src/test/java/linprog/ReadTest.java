package linprog;

import com.google.gson.Gson;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import akka.actor.ActorSystem;
import linprog.Simulation;
import simulation.SimulationStarter;
import topology.ActorTopology;
import linprog.helper.ConsumptionProfiles;
import linprog.helper.EnergyPrices;
import meritorder.helper.ReadMemapFiles;

import com.joptimizer.optimizers.LPOptimizationRequest;
import com.joptimizer.optimizers.LPPrimalDualMethod;;



public class ReadTest {

	
	
	
	private static final int NR_OF_CONSUMERS_JAN = 5;
	private static final int N = 70;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		
		
//		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS_JAN);
//		for (int k=0; k<NR_OF_CONSUMERS_JAN; k++) {
//		System.out.println("Haus " + (k+1) + ":");
//		System.out.println("Wärme: " + consumptionProfiles.getHeatConsumption(k,0));
//		System.out.println("Wärme: " + consumptionProfiles.getHeatConsumption(k,10));
//		System.out.println("Wärme: " + consumptionProfiles.getHeatConsumption(k,69));
//		System.out.println("Strom: " + consumptionProfiles.getElectricConsumption(k,0));
//		}
		System.out.println(" ------------------------------ ");
		
		EnergyPrices energyPrices = new EnergyPrices();
		
		double[] cost = new double[N] ;
		
		for (int i = 0; i < N; i++) {
			cost[i] = energyPrices.getElectricityPriceInCent(i);
		}
		
		System.out.println("Kosten: " + cost[0]);
		
		
//		double[][] A = createMatrix();
		
//		ReadTest.SimTester();
		//System.out.println(gson.toJson(A));
		
//		double te = 70 % 1120;
//		System.out.println(te);
	}




// Test of Capacity Matrix Generation:
	
//	public static double[][] createMatrix() {
//	final int n = 2;	
//		
//
//	
//		// From ThermalStorage
//		double[][] capacityMatrix1 = new double[n][2*n];
//		double[][] capacityMatrix2 = new double[n][2*n];
//		double[] vector = new double[2*n];
//		double[] lowerBound = new double[2*n];
//		double[] upperBound = new double[2*n];
//		
//		for(int i = 0; i < n; i++) {		
//			for(int j = 0; j <= i; j++) {
//				capacityMatrix1[i][j] = -1.0;
//				capacityMatrix2[i][j] = 1.0;
//			}			
//			for(int j = i+1; j < n; j++) {
//				capacityMatrix1[i][j] = 0.0;
//				capacityMatrix2[i][j] = 0.0;
//			}					
//			for(int j = n; j <= n+i; j++) {
//				capacityMatrix1[i][j] = 1.0;
//				capacityMatrix2[i][j] = -1.0;
//			}			
//			for(int j = n+i+1; j < 2*n; j++) {
//				capacityMatrix1[i][j] = 0.0;
//				capacityMatrix2[i][j] = 0.0;
//			}
//			vector[i] = 0.0;
//			lowerBound[i] = 0.0;
//			upperBound[i] = 20.;
//		}
//		for(int i = n; i < 2*n; i++) {				
//			vector[i] = 0.0;
//			lowerBound[i] = 0.0;
//			upperBound[i] = 20.;
//		}
//		
//		return capacityMatrix2;
//	}
//
//	public static void SimTester() {
//		
//	final int k = 1;
//	// From Optimization Matrices
//
//	Gson gson = new Gson();
//	
//	int nrOfProducers = 1;
//	int nrOfStorages = 1;
//
//	double[] lambda  = new double[k*(nrOfProducers+2*nrOfStorages)];
//	double[] h = new double[k*(1+2*nrOfStorages)];
//	double[][] g = new double[k*(1+2*nrOfStorages)][k*(nrOfProducers+2*nrOfStorages)];
//	double[] b_eq = new double[k*(1+2*nrOfStorages)];
//	double[][] a_eq = new double[k*(1+2*nrOfStorages)][k*(nrOfProducers+2*nrOfStorages)];
//	double[] x_lb = new double[k*(nrOfProducers+2*nrOfStorages)];
//	double[] x_ub = new double[k*(nrOfProducers+2*nrOfStorages)];
//	
//	LPOptimizationRequest or = new LPOptimizationRequest();
//	or.setC(lambda);
//	or.setG(g);
//	or.setH(h);
//	or.setA(a_eq);
//	or.setB(b_eq);
//	or.setLb(x_lb);
//	or.setUb(x_ub);
//	
//	System.out.println("c: " + or.getC().size());		
//	System.out.println("G: " + or.getG().rows() + " x " + or.getG().columns());		
//	System.out.println("h: " + or.getH().size());		
//	System.out.println("A: " + or.getA().rows() + " x " + or.getA().columns());		
//	System.out.println("b: " + or.getB().size());
//	System.out.println("lb: " + or.getLb().size());		
//	System.out.println("ub: " + or.getUb().size());		
//	System.out.println(" ------------------------------ ");
//	
//	LPPrimalDualMethod opt = new LPPrimalDualMethod();
//	opt.setLPOptimizationRequest(or);
//	try {
//		opt.optimize();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	System.out.println(gson.toJson(opt.getLPOptimizationResponse().getSolution()));
//	
	//System.out.println(gson.toJson(a_eq));
	
	
//	}

	}

