/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.messageContents;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import dems.behaviorType.StrategyBehaviorType;
import akka.basicMessages.AnswerContent;

/**
 * 
 * This is a specific AnswerContent
 * 
 * @author bytschkow
 *
 */

public class GenericAnswerContent implements AnswerContent{

	public String dateTime;
	public double installedPower;
	public double currentProduction;
	public double scheduledProduction;
	public double expectedProduction;
	public double costs;
	public boolean communicationOK = true;
	
	public StrategyBehaviorType type;
	public String IN;
	public String OUT;
	
	public Double factorConformation;
	
	final static DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
	final static DecimalFormat df = new DecimalFormat("#0.00", format);
 
	public GenericAnswerContent() {	}
	
	public GenericAnswerContent(double currentProduction, double expectedProduction) {
		this.currentProduction = currentProduction;
		this.expectedProduction = expectedProduction;
	}

	public String toHTML() {
		return  "currentTime: " + dateTime + "<br>" +
				"currentProducton: " + df.format(currentProduction) + " kW<br>" +
                "expectedProduction: " + df.format(expectedProduction) + " kW<br>" +
                "installedPower: " + df.format(installedPower) + " kW<br>" +
                "requestConformation: " + helper() +
                "costs: " + df.format(costs) + " EUR/MWh";
	}
	
	private String helper(){
		if (factorConformation != null) {
			return df.format(factorConformation) + " kW<br>";
		} else {
			return "null";
		}
	}

}
