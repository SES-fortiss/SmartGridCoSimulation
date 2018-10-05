package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.StorageMessage;

public abstract class Storage extends Device {

	public double qdot_max_in;
	public double qdot_max_out;
	public double capacity;
	public StorageMessage storageMessage = new StorageMessage();
	
	
	public double[] stateOfCharge = new double[nStepsMPC];
	public double[] linprogStorageInput = new double[nStepsMPC];
	public double[] linprogStorageOutput = new double[nStepsMPC];

	public Storage(double qdot_max_in, double qdot_max_out, double capacity, int port) {
		super(port);
		this.qdot_max_in = qdot_max_in;
		this.qdot_max_out = qdot_max_out;
		this.capacity = capacity;
		storageMessage.name = this.actorName;
	}

	@Override
	public void makeDecision() { 
		
		storageMessage.name = this.actorName;
		storageMessage.cost = new double[2*nStepsMPC];
		storageMessage.couplingMatrix_H = new double[nStepsMPC][2*nStepsMPC];
		storageMessage.couplingMatrix_el = new double[nStepsMPC][2*nStepsMPC];
		storageMessage.capacityMatrix1 = new double[nStepsMPC][2*nStepsMPC];
		storageMessage.capacityMatrix2 = new double[nStepsMPC][2*nStepsMPC];
		storageMessage.h_vector = new double[2*nStepsMPC];
		storageMessage.lowerBound = new double[2*nStepsMPC];
		storageMessage.upperBound = new double[2*nStepsMPC];
		for(int i = 0; i < nStepsMPC; i++) {		
			for(int j = 0; j <= i; j++) {
				storageMessage.capacityMatrix1[i][j] = -1.0;
				storageMessage.capacityMatrix2[i][j] = 1.0;
			}			
			for(int j = i+1; j < nStepsMPC; j++) {
				storageMessage.capacityMatrix1[i][j] = 0.0;
				storageMessage.capacityMatrix2[i][j] = 0.0;
			}					
			for(int j = nStepsMPC; j <= nStepsMPC+i; j++) {
				storageMessage.capacityMatrix1[i][j] = 1.0;
				storageMessage.capacityMatrix2[i][j] = -1.0;
			}			
			for(int j = nStepsMPC+i+1; j < 2*nStepsMPC; j++) {
				storageMessage.capacityMatrix1[i][j] = 0.0;
				storageMessage.capacityMatrix2[i][j] = 0.0;
			}
			storageMessage.h_vector[i] = 0.0;
			storageMessage.lowerBound[i] = 0.0;
			storageMessage.upperBound[i] = qdot_max_in;
		}
		for(int i = nStepsMPC; i < 2*nStepsMPC; i++) {				
			storageMessage.h_vector[i] = 0.0;
			storageMessage.lowerBound[i] = 0.0;
			storageMessage.upperBound[i] = qdot_max_out;
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return storageMessage;
	}
	
	
	@Override
	public void handleRequest() {

	}
	
	
}
