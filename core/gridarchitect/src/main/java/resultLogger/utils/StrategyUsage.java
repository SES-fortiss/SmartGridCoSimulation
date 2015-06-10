/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultLogger.utils;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.RequestContent;

public class StrategyUsage {
	private Integer strategyPlusMessages;
	private ErrorAnswerContent strategyFaultProducerCase;
	private Class<? extends RequestContent> strategyFaultMessage;
	private String strategyFaultProducerPath;
	
	public StrategyUsage(ErrorAnswerContent strategyFaultProducerCase,Class<? extends RequestContent> strategyFaultMessage,String strategyFaultProducerPath)
	{
		this.strategyFaultMessage= strategyFaultMessage;
		this.strategyFaultProducerCase = strategyFaultProducerCase;
		this.strategyFaultProducerPath =strategyFaultProducerPath;
		this.strategyPlusMessages=0;
	}

	public Integer getStrategyPlusMessages() {
		return strategyPlusMessages;
	}

	public ErrorAnswerContent getStrategyFaultProducerCase() {
		return strategyFaultProducerCase;
	}

	public Class<? extends RequestContent> getStrategyFaultMessage() {
		return strategyFaultMessage;
	}

	public String getStrategyFaultProducerPath() {
		return strategyFaultProducerPath;
	}
	
	public void increaseCounter()
	{
		// Request
		this.strategyPlusMessages++;
		//Answer
		this.strategyPlusMessages++;
	}
	
	public boolean equals (Object o)
	{
		boolean res = false;
		
		if (o instanceof StrategyUsage)
		{
			StrategyUsage tmp = (StrategyUsage) o;
			
			if (this.strategyFaultProducerPath.equals(tmp.strategyFaultProducerPath) && 
					this.strategyFaultMessage.equals(tmp.strategyFaultMessage))
				res = true;
		}
		
		return res;
	}
	
	public boolean isTheSame (String faultyActorPath, Class<? extends RequestContent> initalRequest)
	{
		boolean res = false;
		
		res =this.strategyFaultProducerPath.equals(faultyActorPath) && this.strategyFaultMessage.equals(initalRequest);
		
		return res;
	}
	
}
