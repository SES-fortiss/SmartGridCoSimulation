package memap.messages.planning;

import akka.basicMessages.AnswerContent;
import memap.messages.extension.NetworkType;

public class CouplerMessage implements AnswerContent {
	
	public String name;
	public String id;
	public NetworkType primaryNetwork;
	public NetworkType secondaryNetwork;
	
	public double minPower;
	public double maxPower;
	
	public double operationalCostEUR;
	public double[] varOperationalCostEUR;
	public double operationalCostCO2;
	
	public double efficiencyHeat;
	public double efficiencyElec;
	
}