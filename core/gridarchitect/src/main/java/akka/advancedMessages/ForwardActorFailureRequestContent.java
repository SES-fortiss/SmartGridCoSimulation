/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.advancedMessages;

import akka.basicMessages.RequestContent;
/**
 * special request that triggers the actors to report their measured values
 * @author Luc
 *
 */
public class ForwardActorFailureRequestContent implements RequestContent{
	private boolean isGetInformationRequest;
	private boolean isAdjustmentRequest;
	
	/**
	 * Creates a new instance 
	 * @param isGetInformationRequest was the initial request a GetInformationRequest
	 * @param isAdjustmentRequest was the initial request a AdjustmentRequest
	 */
	public ForwardActorFailureRequestContent(boolean isGetInformationRequest,boolean isAdjustmentRequest)
	{
		this.isAdjustmentRequest = isAdjustmentRequest;
		this.isGetInformationRequest = isGetInformationRequest;
	}

	public boolean isGetInformationRequest() {
		return isGetInformationRequest;
	}

	public boolean isAdjustmentRequest() {
		return isAdjustmentRequest;
	}
}
