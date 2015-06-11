/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.clusterHead;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

import akka.basicMessages.RequestContent;

/**
 * 
 * This is a generic RequestContent
 * 
 * @author bytschkow
 *
 */

public class ClusterHeadRequestContent implements RequestContent{
	
	final static DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
	final static DecimalFormat df = new DecimalFormat("#0.00", format);

	public double reductionFactor;
	public boolean individualContent = false;
	public ArrayList<IndividualRequest> individualRequestList;
	
	public ClusterHeadRequestContent(){
		this(1.0);
	}
	
	public ClusterHeadRequestContent(double d) {
		this.reductionFactor = d;
		this.individualRequestList = new ArrayList<IndividualRequest>();
	}
	
	public String toString(){
		return ("AggregatorRequestContent={" +
                "reductionFactor: " + df.format(reductionFactor) +
                "  indvidualRequestList" +
				"}");
	}

	/**
	 * @return
	 */
	public String toHTML() {
		return "generalReductionFactor: " + df.format(reductionFactor);
	}
	
	public boolean simpleEquals(Object o) {
		return false;
	}
}
