/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.advancedMessages;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import akka.basicMessages.AnswerContent;

/**
 * 
 * This is a specific AnswerContent
 * 
 * @author bytschkow
 *
 */

public class GenericAnswerContent implements AnswerContent{

	public double time;
	public String dateTime;
	public double installedPower;
	public double currentProduction;
	public double scheduledProduction;
	public double expectedProduction;
	public double costs;
	public String IN;
	public String OUT;
	
	public double reductionFactorConformation;
	
	final static DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
	final static DecimalFormat df = new DecimalFormat("#0.00", format);
 
	public GenericAnswerContent()
	{
		
	}
	
	public GenericAnswerContent(double currentProduction, double expectedProduction) {
		this.currentProduction = currentProduction;
		this.expectedProduction = expectedProduction;
	}
	
	@Override
	public String toString(){
		return ("GenericAnswerContent={" +
                "currentProducton: " + df.format(currentProduction) +
                "  expectedProduction: " + df.format(expectedProduction) +
                "  installedPower: " + df.format(installedPower) +
                "  reductionFactorConformation: " + df.format(reductionFactorConformation) +
                "  costs: " + df.format(costs) +
				"}");
	}

	public String toHTML() {
		return  "currentTime: " + dateTime + "<br>" +
				"currentProducton: " + df.format(currentProduction) + "<br>" +
                "expectedProduction: " + df.format(expectedProduction) + "<br>" +
                "installedPower: " + df.format(installedPower) + "<br>" +
                "reductionFactorConformation: " + df.format(reductionFactorConformation) + "<br>" +
                "costs: " + df.format(costs);
	}
}
