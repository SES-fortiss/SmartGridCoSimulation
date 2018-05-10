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

import akka.basicMessages.AnswerContent;

/**
 * DEMSAggregatorAnswerContent
 * 
 * @author bytschkow
 * 
 * created on 07.05.2014
 */
public class DEMSAggregatorAnswerContent implements AnswerContent  {
	
	final static DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
	final static DecimalFormat df = new DecimalFormat("#0.00", format);
	
	public double time;
	public String dateTime;	
	public double currentProduction;
	public double cpMinusGuesses;
	public double expectedProduction;
	public double scheduledProduction;
	public String OUT;
	
	// costs of the System
	public double costPowerPlants = 0.0;
	public double costPunishment = 0.0;
	public double costPurchase = 0.0;
	public double costTotalPowerPlants = 0.0;
	public double costTotalPunishment = 0.0;
	public double costTotalPurchase = 0.0;
	public double earnings = 0.0;
	
	
	//
	public String parameters;
	
	public DEMSAggregatorAnswerContent(double currentProduction, double expectedProduction){
		this.currentProduction = currentProduction;
		this.expectedProduction = expectedProduction;
	}
		
	public String toString(){		 
		return ("DEMSAggregatorAnswerContent={" +
                "currentProducton: " + df.format(currentProduction) + 
                "  expectedProduction: " + df.format(expectedProduction) +
                "  scheduledProduction: " + df.format(scheduledProduction) +
				"}");
	}
	
	public String toHtml(){
		return ("Zeit: " + dateTime + "<br>"
				+ "Betriebskosten(h): " + df.format(costPowerPlants) + "<br>"
				+ "Strafkosten(h): " + df.format(costPunishment) + "<br>"
				+ "Einkaufskosten(h): " + df.format(costPurchase) + "<br>"				
				);
	}

}
