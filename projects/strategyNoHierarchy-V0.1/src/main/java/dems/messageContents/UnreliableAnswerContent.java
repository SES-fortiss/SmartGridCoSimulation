/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.messageContents;

/**
 * UnreliableAnswerContent
 * 04.06.2014
 * @author bytschkow
 *
 */
public class UnreliableAnswerContent extends GenericAnswerContent {

	
	public UnreliableAnswerContent(){
		this(0.0,0.0);
	}
	
	public UnreliableAnswerContent(double currentProduction,
			double expectedProduction) {
		super(currentProduction, expectedProduction);
	}
	
	public boolean availability;	
	
	public String toHTML() {
		return  "currentTime: " + dateTime + "<br>" +
				"currentProducton: " + df.format(currentProduction) + " kW<br>" +
                "expectedProduction: " + df.format(expectedProduction) + " kW<br>" +
                "installedPower: " + df.format(installedPower) + " kW<br>" +
                "requestConformation: " + helper() +
                "costs: " + df.format(costs) + " EUR/MWh" +
        		"availability: " + availability;
	}
	
	private String helper(){
		if (factorConformation != null) {
			return df.format(factorConformation) + " kW<br>";
		} else {
			return "null";
		}
	}
}
