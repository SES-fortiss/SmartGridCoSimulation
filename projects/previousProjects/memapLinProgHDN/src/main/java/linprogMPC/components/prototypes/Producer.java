package linprogMPC.components.prototypes;

import akka.basicMessages.AnswerContent;
import linprogMPC.messages.OptimizationResultMessage;
import linprogMPC.messages.planning.ProducerMessage;

public abstract class Producer extends Device {

	public double maxPower;
	public double efficiency;
	
	public ProducerMessage producerMessage = new ProducerMessage();
	
	public double[] linprogAdvice  = new double[nStepsMPC];
	
	public Producer(double maxPower, double efficiency, int port) {
		super(port);
		
		this.maxPower = maxPower;
		this.efficiency = efficiency;				
	}

	@Override
	public void makeDecision() {}

	@Override
	public AnswerContent returnAnswerContentToSend() {		
		return producerMessage;
	}
	
	@Override
	public void handleRequest() {
		if(requestContentReceived instanceof OptimizationResultMessage) {
			
			OptimizationResultMessage linprogResult = ((OptimizationResultMessage) requestContentReceived);
			for (String key : linprogResult.resultMap.keySet()) {		
				if (key.contains(this.actorName)) {
					linprogAdvice = linprogResult.resultMap.get(key);
				}
			}
		}
	}

}
