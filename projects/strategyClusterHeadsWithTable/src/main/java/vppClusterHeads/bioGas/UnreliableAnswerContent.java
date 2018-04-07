/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.bioGas;

import vppClusterHeads.genericStuff.GenericAnswerContent;

/**
 * UnreliableAnswerContent
 * 04.06.2014
 * @author bytschkow
 *
 */
public class UnreliableAnswerContent extends GenericAnswerContent {
	
	public UnreliableAnswerContent() {
		super();
	}
	
	public boolean availability;
	
	public String toHTML() {
		return 		
		"currentProducton: " + df.format(currentPower) + "<br>" +
        "forecastPower: " + df.format(forecastPower) + "<br>" +
        "installedPower: " + df.format(installedPower) + "<br>" +
        "reductionFactorConformation: " + df.format(flexibilityFactorConformation) + "<br>" +
        "costs: " + df.format(costs) + "<br>" + 
        "availability: " + availability;
	}
}
