/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package behavior.advancedBehaviorModels;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import faultStrategy.backEnd.BasicFaultStrategy;
import akka.advancedMessages.ErrorAnswerContent;
import akka.advancedMessages.ForwardActorFailureRequestContent;
import akka.advancedMessages.MultiRequestContainer;
import akka.advancedMessages.PingRequestContent;
import akka.advancedMessages.SingleReceiverRequestContent;
import akka.advancedMessages.SingleReceiverRequestContainer;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

public class AbstractMessageHelper {

	private static final boolean debugging = false;

	public static long searchTime;

	/**
	 * needs to create a multiMessage container
	 */
	private boolean needToCreateContainer;

	public static MessageMappings messageMapper;
	/**
	 * defines a mapping from the initial request to the mapping which defines the replacement mapping ( which request has to be exchanged in the
	 * StrategyTree by which Request)
	 */
	private static HashMap<Class<? extends RequestContent>, HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>>> strategyChangeMessageMapping;

	// statistic variable
	public static Integer historyUsed = 0;

	/**
	 * Creates a new AbstractMessageHelper
	 * 
	 * @param requestToAnswer
	 *            : A mapping of all the request to the appropriate Answer (SingleRecieverRequest are also Requests)
	 * @param requestToSingleRequest
	 *            : A mapping of all the request to the SingleRecieverRequest
	 */
	public AbstractMessageHelper(HashMap<Class<? extends RequestContent>, Class<? extends AnswerContent>> requestToAnswer,
			HashMap<Class<? extends RequestContent>, Class<? extends SingleReceiverRequestContent>> requestToSingleRequest) {
		this.needToCreateContainer = true;
		if (strategyChangeMessageMapping == null)
			strategyChangeMessageMapping = new HashMap<Class<? extends RequestContent>, HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>>>();

		if (messageMapper == null)
			messageMapper = new MessageMappings(requestToAnswer, requestToSingleRequest);
		else
			messageMapper.addMessage(requestToAnswer, requestToSingleRequest);

	}

	public AbstractMessageHelper() {
		this.needToCreateContainer = true;

		if (strategyChangeMessageMapping == null)
			strategyChangeMessageMapping = new HashMap<Class<? extends RequestContent>, HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>>>();

		if (messageMapper == null)
			messageMapper = new MessageMappings();
	}

	/**
	 * Add a new Message(Request, SingleRecieverRequest, Answer) to the Helper
	 * 
	 * @param requestToAnswer
	 *            : A mapping of all the request to the appropriate Answer (SingleRecieverRequest are also Requests)
	 * @param requestToSingleRequest
	 *            : A mapping of all the request to the SingleRecieverRequest
	 */
	public void addMessage(HashMap<Class<? extends RequestContent>, Class<? extends AnswerContent>> requestToAnswer,
			HashMap<Class<? extends RequestContent>, Class<? extends SingleReceiverRequestContent>> requestToSingleRequest) {
		messageMapper.addMessage(requestToAnswer, requestToSingleRequest);
	}

	/**
	 * Adds the given Request to the given MultiRequest. Checks some conditions to ensure everything is correct
	 * 
	 * @param request
	 *            the request in context
	 * @param destinationPath
	 *            the destination path where the SingleRequest should be send to
	 * @param multiRequest
	 *            the MultiRequest which should contain the singleRequest later
	 */
	public void addSingleRequest(RequestContent request, String destinationPath, MultiRequestContainer multiRequest) {
		if (request instanceof SingleReceiverRequestContent)
		{
			SingleReceiverRequestContent tmp = (SingleReceiverRequestContent) request;
			tmp.recieverPath = destinationPath;

			boolean res = multiRequest.addSingleRequest(tmp);

			if (res == false)
				throw new IllegalArgumentException("MessageHelper: The given MultiMessage has not a SingleRequestContainer as last Request");

		}
		else
		{
			throw new IllegalArgumentException("MessageHelper: Request is nof from type SingleRecieverRequest");
		}
	}

	/**
	 * Change the requests/answers in the strategy.
	 * 
	 * @param strategy
	 *            the Strategy in context
	 * @param changeMapping
	 *            the mapping which should be applied, to change the requests
	 */
	private void changeRequestAndAnswersInStrategy(BasicFaultStrategy strategy,
			HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>> changeMapping) {

		HashMap<Class<? extends AnswerContent>, Class<? extends AnswerContent>> aMapping = new HashMap<Class<? extends AnswerContent>, Class<? extends AnswerContent>>();

		for (Entry<Class<? extends RequestContent>, Class<? extends RequestContent>> entry : changeMapping.entrySet())
		{
			Class<? extends RequestContent> oldRequest = entry.getKey();
			Class<? extends RequestContent> newRequest = entry.getValue();

			Class<? extends AnswerContent> oldAnswer = messageMapper.getAppropriateAnswerContent(oldRequest);// this.requestToAnswer.get(oldRequest);
			Class<? extends AnswerContent> newAnswer = messageMapper.getAppropriateAnswerContent(newRequest);// this.requestToAnswer.get(newRequest);

			aMapping.put(oldAnswer, newAnswer);
		}

		strategy.changeContent(changeMapping, aMapping);

	}

	/**
	 * Change the requests/answers in the strategy.
	 * 
	 * @param strategy
	 *            the Strategy in context
	 * @param request
	 *            the initial request
	 */
	public void changeRequestAndAnswersInStrategy(BasicFaultStrategy strategy, RequestContent request) {
		changeRequestAndAnswersInStrategy(strategy, strategyChangeMessageMapping.get(request.getClass()));
	}

	/**
	 * Creates a new SingleRequestContainer in the given MultiRequest. Does only create the multiRequest if the logic allows it
	 * 
	 * @param multiRequest
	 *            the MultiRequest in context
	 */
	public void createNewSingleRecieverContainer(MultiRequestContainer multiRequest) {
		if (needToCreateContainer)
		{
			multiRequest.addNewSingleRequestContainer();
			needToCreateContainer = false;
		}
	}

	/**
	 * Returns the matching AnswerContent to the given RequestContent
	 * 
	 * @param request
	 *            the RequestContent where the AnswerContent is needed
	 * @return the matching AnswerContent
	 */
	public Class<? extends AnswerContent> getAppropriateAnswerContent(RequestContent request) {
		return messageMapper.getAppropriateAnswerContent(request);
	}

	public Class<? extends AnswerContent> getAppropriateAnswerContent(Class<? extends RequestContent> requestclass) {
		return messageMapper.getAppropriateAnswerContent(requestclass);
	}

	/**
	 * Get from a given single receiver Request the matching GeneralRequest
	 * 
	 * @param request
	 *            the SingleRecieverRequest in context
	 * @return the matching GeneralRequest
	 */
	public Class<? extends RequestContent> getAppropriateGeneralRequest(SingleReceiverRequestContent request) {
		return messageMapper.getAppropriateGeneralRequest(request);
	}

	/**
	 * Get from a given single receiver Request the matching GeneralRequest
	 * 
	 * @param request
	 *            the SingleRecieverRequest in context
	 * @return the matching GeneralRequest
	 */
	public RequestContent getAppropriateGeneralRequestInstance(SingleReceiverRequestContent request) {

		return messageMapper.getAppropriateGeneralRequestInstance(request);
	}

	/**
	 * Get from a given GeneralRequest the matching single receiver Request
	 * 
	 * @param request
	 *            the GeneralRequest in context
	 * @return the matching SingleRecieverRequest
	 */
	public Class<? extends SingleReceiverRequestContent> getAppropriateSingleRequest(RequestContent request) {

		return messageMapper.getAppropriateSingleRequest(request);
	}

	/**
	 * Returns the RequestContent which caused the error
	 * 
	 * @param error
	 *            the error which was thrown
	 * @return the error causing RequestContent
	 */
	protected RequestContent getErrorCausingRequest(ErrorAnswerContent error) {
		return getErrorCausingRequest(error.getRequest(), error.getSender());
	}

	/**
	 * Returns the RequestContent which caused the error
	 * 
	 * @param request
	 *            the request which might have caused the error. Needs to be refined
	 * @param requestReciever
	 *            the Reciever of the param Request
	 * @return the concrete RequestContent which caused the error
	 */
	private RequestContent getErrorCausingRequest(RequestContent request, String requestReciever) {
		RequestContent res = null;

		if (request instanceof MultiRequestContainer)
		{
			// recursive call to analyze the last entry of the multirequest
			res = getErrorCausingRequest(((MultiRequestContainer) request).getCurrentRequestContent(), requestReciever);
		}
		else
		{
			if (request instanceof SingleReceiverRequestContainer)
			{
				SingleReceiverRequestContainer singleRequestContainer = ((SingleReceiverRequestContainer) request);
				for (SingleReceiverRequestContent singleRequest : singleRequestContainer.getRequests())
				{
					if (singleRequest.recieverPath.equals(requestReciever))
					{
						res = singleRequest;
						break;
					}
				}
			}
			else
			{
				// it is a normal Request or a SingleRequestReciever or null, so we can just return it
				res = request;
			}
		}

		return res;
	}

	/**
	 * tries to get the latest most fresh old message from the history. This message will replace the message which was not received
	 * 
	 * @param error
	 *            the error causing answer
	 * @param model
	 *            the BehaviorModel which received the error (mostly the parent of the defect node)
	 * @return the Answer which was found in the History
	 */
	public BasicAnswer getLastHistoryEntry(ErrorAnswerContent error, BehaviorModel model) {
		// long starttime = System.currentTimeMillis();
		RequestContent requestToCheck = getErrorCausingRequest(error);

		// check which request it was
		if (requestToCheck instanceof PingRequestContent)
		{
			requestToCheck = getPreviousRequestOfPingRequest(error.getSender(), error);
		}

		// get the type of the answer we are looking for
		Class<? extends AnswerContent> answerClass = messageMapper.getAppropriateAnswerContent(requestToCheck);

		// get the oldest Answer from history
		// System.out.println("getLastHistoryEntry "+error );
		BasicAnswer answerToAdd = model.actor.messageHistory.getOldestHistoryEntry(error.getSender(), answerClass);

		return answerToAdd;
	}

	/**
	 * tries to get the average of the messages from the history. This message will replace the message which was not received
	 * 
	 * @param error
	 *            the error causing answer
	 * @param model
	 *            the BehaviorModel which received the error (mostly the parent of the defect node)
	 * @return the average values of the answers which which found in the History
	 */
	public LinkedList<BasicAnswer> getAverageHistoryEntry(ErrorAnswerContent error, BehaviorModel model) {

		RequestContent requestToCheck = getErrorCausingRequest(error);

		// check which request it was
		if (requestToCheck instanceof PingRequestContent)
		{
			requestToCheck = getPreviousRequestOfPingRequest(error.getSender(), error);
		}

		// get the type of the answer we are looking for
		Class<? extends AnswerContent> answerClass = messageMapper.getAppropriateAnswerContent(requestToCheck);

		// get the oldest Answer from history
		LinkedList<BasicAnswer> answersToAdd = model.actor.messageHistory.getAverageHistoryEntry(error.getSender(), answerClass);

		return answersToAdd;
	}

	public void addAlteredHistoryEntry(BasicAnswer alteredHistoryEntry, BehaviorModel model) {
		long starttime = System.currentTimeMillis();
		if (alteredHistoryEntry != null)
		{
			if (debugging)
				System.out.println("Message found in History : " + alteredHistoryEntry.answerContent);

			historyUsed++;

			model.answerListReceived.add(alteredHistoryEntry);
		}
		else
		{
			if (debugging)
				System.out.println("No Message found in History ");
		}

		long endtime = System.currentTimeMillis();

		long tmp = endtime - starttime;

		searchTime += tmp;
	}

	/**
	 * Get the Request which was send before the PingRequest
	 * 
	 * @param pingRequestReciever
	 *            the receiver of the PingRequest
	 * @param error
	 *            the error which was thrown
	 * @return The Request which was send before the PingRequest
	 */
	private RequestContent getPreviousRequestOfPingRequest(String pingRequestReciever, ErrorAnswerContent error) {
		RequestContent result = null;

		if (error.getRequest() instanceof MultiRequestContainer)
		{
			RequestContent previous = ((MultiRequestContainer) error.getRequest()).getPreviousRequest();

			if (previous instanceof SingleReceiverRequestContainer)
			{
				SingleReceiverRequestContainer container = (SingleReceiverRequestContainer) previous;

				for (SingleReceiverRequestContent sRequest : container.getRequests())
				{
					if (pingRequestReciever != null)
					{
						if (pingRequestReciever.equals(sRequest.recieverPath))
							result = sRequest;
					}
					else
					{
						if (pingRequestReciever == sRequest.recieverPath)
							result = sRequest;
					}
				}
			}
			else
			{
				if (previous instanceof SingleReceiverRequestContent)
				{
					SingleReceiverRequestContent sPrevious = (SingleReceiverRequestContent) previous;

					if (pingRequestReciever != null)
					{
						if (pingRequestReciever.equals(sPrevious.recieverPath))
							result = sPrevious;
					}
					else
					{
						if (pingRequestReciever == sPrevious.recieverPath)
							result = sPrevious;
					}
				}
				else
				{
					// it is only a simple Request to everyone
					result = previous;
				}
			}

		}
		else
		{
			throw new IllegalArgumentException("Nothing can be done to get the previous Request");
		}

		return result;
	}

	/**
	 * Check if the current Strategy is used with the correct Requests/Answers
	 * 
	 * @param strategy
	 *            the strategy to test
	 * @param newRequest
	 *            the Request which should will be used next (normally the root request)
	 * @return true if the Strategy needs to be changed, false otherwise
	 */
	public boolean needToChangeStrategyMessages(BasicFaultStrategy strategy, RequestContent newRequest) {
		if (newRequest instanceof SingleReceiverRequestContainer || newRequest instanceof SingleReceiverRequestContent
				|| newRequest instanceof ForwardActorFailureRequestContent)
			return false;

		LinkedList<Class<? extends RequestContent>> strategyRequests = strategy.getAllRequestsTypes();

		boolean res = true;

		for (Class<? extends RequestContent> rc : strategyRequests)
		{
			if (rc.equals(newRequest.getClass()))
				res = false;
		}

		return res;
	}

	/**
	 * should be called after the MakeDecision is finished
	 */
	public void nextStepMakeDecision() {
		needToCreateContainer = true;
	}

	/**
	 * Add a new Change Mapping
	 * 
	 * @param mapping
	 *            The Request mapping
	 * @param newInitialRequest
	 *            the first Request
	 */
	public void setStrategyChangeRequestMapping(HashMap<Class<? extends RequestContent>, Class<? extends RequestContent>> mapping,
			Class<? extends RequestContent> newInitialRequest) {
		strategyChangeMessageMapping.put(newInitialRequest, mapping);
	}
}
