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
	public void makeDecision() {}

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
