/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.genericStuff;

import akka.basicMessages.RequestContent;

/**
 * 
 * This is a generic RequestContent
 * 
 * @author bytschkow
 *
 */

public class GenericRequestContent implements RequestContent{

	public double flexibilityRequestFactor;
	
	public String toString(){
		return ("GenericRequestContent={" +
                "requestFactor: " + flexibilityRequestFactor + 
				"}");
	}

	/**
	 * @return
	 */
	public String toHTML() {
		return "requestFactor: " + flexibilityRequestFactor;
	}
	
	public boolean simpleEquals(Object o) {
		return false;
	}
}
