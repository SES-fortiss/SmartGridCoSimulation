package linprogMPC.components;

import java.util.concurrent.TimeUnit;

import akka.basicMessages.AnswerContent;
import linprogMPC.Simulation;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.StorageSpec;

public abstract class Storage extends Device {

	public double qdot_max_in;
	public double qdot_max_out;
	public double capacity;
	public StorageSpec specificationToSend = new StorageSpec();
	
	public double[] stateOfCharge = new double[n];
	public double[] linprogStorageInput = new double[n];
	public double[] linprogStorageOutput = new double[n];

	public Storage(String name, double qdot_max_in, double qdot_max_out, double capacity, int port) {
		super(name, port);
		this.qdot_max_in = qdot_max_in;
		this.qdot_max_out = qdot_max_out;
		this.capacity = capacity;
		specificationToSend.name = name;
	}

	@Override
	public void makeDecision() { 
		
		specificationToSend.name = this.name;
		specificationToSend.cost = new double[2*n];
		specificationToSend.couplingMatrix_H = new double[n][2*n];
		specificationToSend.couplingMatrix_el = new double[n][2*n];
		specificationToSend.capacityMatrix1 = new double[n][2*n];
		specificationToSend.capacityMatrix2 = new double[n][2*n];
		specificationToSend.vector = new double[2*n];
		specificationToSend.lowerBound = new double[2*n];
		specificationToSend.upperBound = new double[2*n];
		for(int i = 0; i < n; i++) {		
			for(int j = 0; j <= i; j++) {
				specificationToSend.capacityMatrix1[i][j] = -1.0;
				specificationToSend.capacityMatrix2[i][j] = 1.0;
			}			
			for(int j = i+1; j < n; j++) {
				specificationToSend.capacityMatrix1[i][j] = 0.0;
				specificationToSend.capacityMatrix2[i][j] = 0.0;
			}					
			for(int j = n; j <= n+i; j++) {
				specificationToSend.capacityMatrix1[i][j] = 1.0;
				specificationToSend.capacityMatrix2[i][j] = -1.0;
			}			
			for(int j = n+i+1; j < 2*n; j++) {
				specificationToSend.capacityMatrix1[i][j] = 0.0;
				specificationToSend.capacityMatrix2[i][j] = 0.0;
			}
			specificationToSend.vector[i] = 0.0;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qdot_max_in*Simulation.stepLength(TimeUnit.HOURS);
			
		}
		for(int i = n; i < 2*n; i++) {				
			specificationToSend.vector[i] = 0.0;
			specificationToSend.lowerBound[i] = 0.0;
			specificationToSend.upperBound[i] = qdot_max_out*Simulation.stepLength(TimeUnit.HOURS);
		}
//		System.out.println("x_ub = " + qdot_max_in*Simulation.stepLength(TimeUnit.HOURS) + ", " +qdot_max_out*Simulation.stepLength(TimeUnit.HOURS));
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return specificationToSend;
	}
	
	
	@Override
	public void handleRequest() {

	}
	
	
}
