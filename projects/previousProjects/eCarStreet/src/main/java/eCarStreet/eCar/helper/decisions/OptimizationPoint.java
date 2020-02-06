/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar.helper.decisions;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalTime;
import java.util.Locale;

public class OptimizationPoint {
	
	double cost;
	OptimizationPoint next = null;
	double SOC;
	double SOCinKWh;
	double nextPowerDemand;
	LocalTime time = null;
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public OptimizationPoint(){
		df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
	}
	
	
	public String toString(){			
		String result = "SOCinKWH:" + df.format(this.SOCinKWh) + " Time: " + this.time  + " restCOST:" + df.format(this.cost)+ " nextPowerDemand:" + df.format(this.nextPowerDemand);		
		return result;
	};

}
