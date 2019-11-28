package linprogMPC.components;

import akka.basicMessages.AnswerContent;
import linprogMPC.components.prototypes.Device;
import linprogMPC.messages.extension.NetworkType;
import linprogMPC.messages.planning.ConnectionMessage;

public class Connection extends Device {

	public String connectedBuilding;
	public double q_max;
	public double efficiency;
	public double operationalPrice;
	public double pipeLengthInMeter;
	
	public ConnectionMessage connectionMessage = new ConnectionMessage();
	
	public double[] linprogConnectionInput = new double[nStepsMPC];
	public double[] linprogConnectionOutput = new double[nStepsMPC];
	
	public Connection(String connectedBuilding, double pipeLengthInMeter, double lossesPer100m, double q_max) {
		super(0);
		
		this.connectedBuilding = connectedBuilding;
		this.q_max = q_max;
		this.operationalPrice = 0.0001;
		
		// Verlust abhängig von Leitungslaenge
		this.efficiency = Math.pow(1.0 - lossesPer100m,  pipeLengthInMeter / 100);
		this.pipeLengthInMeter = pipeLengthInMeter;
	}

	@Override
	public void makeDecision() {
		connectionMessage.networkType = NetworkType.HEAT;
		connectionMessage.name = this.actorName;
		connectionMessage.id = this.fullActorPath;
		connectionMessage.connectedBuilding = this.connectedBuilding;
		connectionMessage.efficiency = this.efficiency;
		connectionMessage.q_max = this.q_max;
		connectionMessage.pipeLengthInMeter = this.pipeLengthInMeter;
		connectionMessage.operationalPrice = this.operationalPrice;
	}
	
	@Override
	public AnswerContent returnAnswerContentToSend() {
		
		this.connectionMessage.id = this.fullActorPath;		
		return connectionMessage;
	}
	
	@Override
	public void handleRequest() {}

}
