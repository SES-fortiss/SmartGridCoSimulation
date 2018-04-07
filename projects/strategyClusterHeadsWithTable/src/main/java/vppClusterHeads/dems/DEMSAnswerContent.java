/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.dems;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

import vppClusterHeads.clusterHead.ClusterHeadAnswerContent;
import akka.basicMessages.AnswerContent;

/**
 * DEMSAggregatorAnswerContent
 * 
 * @author bytschkow
 * 
 * created on 07.05.2014
 */
public class DEMSAnswerContent implements AnswerContent  {
	
	final static DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
	final static DecimalFormat df = new DecimalFormat("#0.00", format);
	
	public String name;
	
	public double total;
	public double scheduled;
	public double solar;
	public double water;
	public double wind;
	public double bioGas;
	public double bioMass;
	public double pF; // positive Flexibility available
	public double nF; // negative Flexibility available

	public ArrayList<ClusterHeadAnswerContent> children;
		
	public String toString(){
		return ("{" +
                "total: " + df.format(total) + 
                "  scheduled: " + df.format(scheduled) +
                "  solar: " + df.format(solar) +
                "  wind: " + df.format(wind) +
                "  water: " + df.format(water) +
                "  bioGas: " + df.format(bioGas) +
                "  bioMass: " + df.format(bioMass) +
                "  children number: " + children.size() +    
				"}");
	}
}
