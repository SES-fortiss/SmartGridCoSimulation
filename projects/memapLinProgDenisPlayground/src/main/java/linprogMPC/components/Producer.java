package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.OptimizationResult;
import linprogMPC.messages.ProducerMessage;

public abstract class Producer extends Device {

	public double installedPower;
	public double efficiency;
	
	public ProducerMessage producerMessage = new ProducerMessage();
	
	public double[] linprogAdvice  = new double[nStepsMPC];
	
	public Producer(double installedPower, double efficiency, int port) {
		super(port);
		this.installedPower = installedPower;
		this.efficiency = efficiency;
		producerMessage.name = this.actorName;
	}

	@Override
	public void makeDecision() {
		
		// es werden nur variablen der richtigen größe erzeugt
		producerMessage.name = this.actorName;
		producerMessage.cost = new double[nStepsMPC];
		producerMessage.couplingMatrix_H = new double[nStepsMPC][nStepsMPC];
		producerMessage.couplingMatrix_el = new double[nStepsMPC][nStepsMPC];
		producerMessage.lowerBound = new double[nStepsMPC];
		producerMessage.upperBound = new double[nStepsMPC];
		
		for (int i = 0; i < nStepsMPC; i++) {
			producerMessage.lowerBound[i] = 0.0;
			producerMessage.upperBound[i] = installedPower;
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return producerMessage;
	}
	
	@Override
	public void handleRequest() {
		if(requestContentReceived instanceof OptimizationResult) {
			
			OptimizationResult linprogResult = ((OptimizationResult) requestContentReceived);
			for (String key : linprogResult.resultMap.keySet()) {		
				if (key.contains(this.actorName)) {
					linprogAdvice = linprogResult.resultMap.get(key);
				} 
			}
		}
	}

}
