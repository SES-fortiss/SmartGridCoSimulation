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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import akka.basicMessages.RequestContent;

/**
 * 
 * This is a generic RequestContent
 * 
 * @author bytschkow
 *
 */

public class DEMSRequestContent implements RequestContent{
	
	final static DecimalFormatSymbols format = new DecimalFormatSymbols(Locale.ENGLISH);
	final static DecimalFormat df = new DecimalFormat("#0.00", format);

	public double reductionFactor;
	public boolean individualContent = false;
	public List<IndividualRequest> individualRequestList;
	
	public DEMSRequestContent(){
		this(1.0);
	}
	
	public DEMSRequestContent(double d) {
		this.reductionFactor = d;
		this.individualRequestList = new ArrayList<IndividualRequest>();
	}
	
	public String toString(){
		return ("DEMSRequestContent={" +
                //"reductionFactor: " + df.format(reductionFactor) +
                "indvidualRequestList" +
				"}");
	}

	/**
	 * @return
	 */
	public String toHTML() {
		return "";
		//return "generalReductionFactor: " + df.format(reductionFactor);
	}

}
