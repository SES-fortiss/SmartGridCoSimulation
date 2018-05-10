/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.messageContents;

import akka.basicMessages.RequestContent;

/**
 * 
 * This is a generic RequestContent
 * 
 * @author bytschkow
 *
 */

public class GenericRequestContent implements RequestContent{

	public double reductionFactor;
	
	public GenericRequestContent(double d) {
		this.reductionFactor = d;
	}
	
	public String toString(){
		return ("GenericRequestContent={" +
                "reductionFactor: " + reductionFactor + 
				"}");
	}

	/**
	 * @return
	 */
	public String toHTML() {
		return "reductionFactor: " + reductionFactor;
	}

}
