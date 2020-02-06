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
 * IndividualRequest
 * 11.06.2014
 * @author bytschkow
 *
 */
public class IndividualRequest {
	public String id;
	public double setPointPower;
	
	public IndividualRequest(String id, double setPoint){
		this.id = id;
		this.setPointPower = setPoint;
	}
}
