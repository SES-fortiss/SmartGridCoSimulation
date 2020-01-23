/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package resultLogger;

import akka.advancedMessages.ErrorAnswerContent;
import akka.advancedMessages.ForwardActorFailureAnswerContent;
import akka.advancedMessages.ForwardActorFailureRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.BasicRequest;
import akka.basicMessages.RequestContent;
import configuration.GridArchitectConfiguration;
import faultStrategy.requests.HistoryRequestContent;
import resultLogger.utils.ConstantResultLogger;
import topology.ActorTopology;

public class ConstantLogger {
	private static ConstantResultLogger myResultLogger;
	
	public ConstantLogger() {
		
	}

	public synchronized static void writeResultToFile(int currentTimeStep) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
		{
			myResultLogger.writeResult(myResultLogger.timeStep_MessageCounter, myResultLogger.timeStep_ErrorAnswerContents,
					myResultLogger.timeStep_FinalAnswerContents, myResultLogger.timeStep_HistoryRequests, myResultLogger.timeStep_HistoryLookupMessages,
					currentTimeStep, myResultLogger.timeStep_StrategyUsages);

			while (myResultLogger.finishedWriting == false)
			{
				try
				{
					Thread.sleep(10);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			myResultLogger.clearLogger();
		}
	}

	public synchronized static void logHistoryRequest(HistoryRequestContent request, BasicAnswer answertype) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
			myResultLogger.storeHistoryRequest(request, answertype);
	}

	public synchronized static void logFinalAnswer(AnswerContent answer) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
			myResultLogger.storeFinalAnswer(answer);
	}

	public synchronized static void logError(ErrorAnswerContent error) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
			myResultLogger.storeError(error);
	}

	public synchronized static void logMessageSendCounter(BasicAnswer answer) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
		{
			if (!(answer.answerContent instanceof ForwardActorFailureAnswerContent))
				myResultLogger.storeMessageSendCounter();
		}
	}

	public synchronized static void logMessageSendCounter(BasicRequest request) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
		{
			if (!(request.requestContent instanceof ForwardActorFailureRequestContent))
				myResultLogger.storeMessageSendCounter();
		}
	}
	
	public synchronized static void logNumberOfActors(ActorTopology topo) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
		{
			int number = topo.getActorTopology().size();
			myResultLogger.storeNumberOfActors(number);
		}
	}
	
	public synchronized static void logStrategyUsages(String faultProducerPath, AnswerContent previousAnswer, Class<? extends RequestContent> nextRequest, 
			Class<? extends RequestContent> rootRequest) {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
		{
			myResultLogger.logStrategyUsages(faultProducerPath, previousAnswer, nextRequest, rootRequest);
		}
	}

	public synchronized static void setResultLogger(ConstantResultLogger logger) {
		myResultLogger = logger;
	}

	public synchronized static void endSimulation() {
		if (GridArchitectConfiguration.logResults && myResultLogger != null)
			myResultLogger.endLogger();
	}
}
