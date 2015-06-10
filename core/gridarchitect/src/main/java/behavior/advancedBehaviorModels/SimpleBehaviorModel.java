/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package behavior.advancedBehaviorModels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import faultStrategy.backEnd.BasicFaultStrategy;
import akka.advancedMessages.ErrorAnswerContent;
import akka.advancedMessages.SingleReceiverRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;

public abstract class SimpleBehaviorModel {
	
	protected AbstractMultiMessageInitiatorBehaviorModel parent;
	
	/**
	 * Handle the request before it is executed
	 * @param request the request in context
	 * @param currentTimeStep the current TimeStep
	 */
	public abstract RequestContent handleRequest(RequestContent request, int currentTimeStep); 
	
	/**
	 * Make a Decision with the answers of the children
	 * 
	 * @param answers
	 *            the answers of the children
	 * @return a Mapping of the answer to the RequestContent for the next TimeStep (The RequestContent can be null if there is no more Request to
	 *         handle). If the returned map is null, the SimpleBehaviorModel returned an old value and all the children and the strategy will be
	 *         finished immediately
	 */
	public abstract HashMap<BasicAnswer, RequestContent> makeDecision (ArrayList<BasicAnswer> answers);
	
    /**
	 * <strong>returnAnswerContentToSend()</strong> <br>
	 * This method shall be implemented by each individual behaviorModel. <br>
	 * It gets called by the Actor to receive the AnswerContent and send it. <br>
	 */
	public abstract AnswerContent returnAnswerContentToSend();
	
	/**
	 * Handle an error which was caused by a SingleReceiverRequest
	 * @param error the Error answer in Context
	 * @param nextRequest the next Request which should be fired ( can be altered) 
	 * @return the SingleRecieverRequest which should be send in the next TimeStep
	 */
	public abstract SingleReceiverRequestContent handleErrorSingleReciever (ErrorAnswerContent error, SingleReceiverRequestContent nextRequest);
	
	/**
	 * Handle an error which was caused by a Request
	 * @param error the Error answer in Context
	 * @param nextRequest the next Request which should be fired ( can be altered)
	 * @return the RequestContent which should be send in the next TimeStep
	 */
	public abstract RequestContent handleError (ErrorAnswerContent error, RequestContent nextRequest);
	
	/**
	 * Calling this function indicates, the TimeStep is over and everything should be prepared afterwards to attack the next TimeStep
	 */
	public abstract void clearForNextTimeStep();
	
	/**
	 * Allows to change the Strategy, before sending a new Request
	 * @param nextRequest the Request which will be send next
	 * @return The strategy which should be used. Return null if there should be no change
	 */
	public abstract BasicFaultStrategy changeStrategy(RequestContent nextRequest);
	
	/**
	 * Allows the user to check the Answer which the history returned is valid
	 * @param historyAnswers a list with all the answer that were received from the history. Might be null, if history found no answer!
	 * @param error the error which was causing the fact that we are using the history
	 * @param requestFromHistory the request which fired before the strategy said to get the history
	 * @return the BasicAnswer which should be used, can also be null.
	 */
	public abstract BasicAnswer handleHistoryMessage(LinkedList<BasicAnswer> historyAnswers, ErrorAnswerContent error, RequestContent requestFromHistory);
	/**
	 * Get the currently active strategy
	 * @return the currently active strategy 
	 */
	public BasicFaultStrategy getStrategy()
	{
		return this.parent.getCurrentStrategy();
	}
	
	/**
	 * Set the parent of the SimpleBehaviorModel
	 * @param parentBehaviorModel an AbstractMultiMessageInitiatorBehaviorModel or an AbstractMultiMessageForwardBehaviorModel
	 */
	public void setParentBehaviorModel(AbstractMultiMessageInitiatorBehaviorModel parentBehaviorModel)
	{
		this.parent = parentBehaviorModel;
	}
	/**
	 * checks if the parent BehaviorModel is the same 
	 */
	public boolean equals(Object o)
	{
		boolean res =false;
		
		if (o instanceof SimpleBehaviorModel)
		{
			if (this.parent.fullActorPath.equals(((SimpleBehaviorModel) o).parent.fullActorPath))
				res = true;
		}
		
		return res;
	}
	/**
	 * Get the current Time Step
	 * @return the current Time Step
	 */
	public int getActualTimeStep() {
		return GlobalTime.currentTimeStep;
	}
	
	/**
	 * Get the actor path of the parent BehaviorModel. SimpleBehaviorModels do not have a specific path
	 * @return The full actor path
	 */
	public String getFullActorPath()
	{
		return this.parent.fullActorPath;
	}
}
