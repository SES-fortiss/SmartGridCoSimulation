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
import java.util.Map.Entry;

import akka.advancedMessages.PingAnswerContent;
import akka.advancedMessages.PingRequestContent;
import akka.advancedMessages.SingleReceiverRequestContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

public class MessageMappings {

	/**
	 * maps the RequestContent to the correct AnswerContent
	 */
	private HashMap<Class<? extends RequestContent>, Class<? extends AnswerContent>> requestToAnswer;
	/**
	 * maps the RequestContent to the correct single Receiver Request
	 */
	private HashMap<Class<? extends RequestContent>, Class<? extends SingleReceiverRequestContent>> requestToSingleRequest;
	/**
	 * maps the single Receiver Request to the correct RequestContent
	 */
	private HashMap<Class<? extends SingleReceiverRequestContent>, Class<? extends RequestContent>> singleRequestToRequest;

	/**
	 * Creates a new MessageMappings
	 * 
	 * @param requestToAnswer
	 *            : A mapping of all the request to the appropriate Answer (SingleRecieverRequest are also Requests)
	 * @param requestToSingleRequest
	 *            : A mapping of all the request to the SingleRecieverRequest
	 */
	public MessageMappings(HashMap<Class<? extends RequestContent>, Class<? extends AnswerContent>> requestToAnswer,
			HashMap<Class<? extends RequestContent>, Class<? extends SingleReceiverRequestContent>> requestToSingleRequest) {

		this.requestToAnswer = requestToAnswer;

		if (!requestToAnswer.containsKey(PingRequestContent.class))
		{
			requestToAnswer.put(PingRequestContent.class, PingAnswerContent.class);
		}

		this.requestToSingleRequest = requestToSingleRequest;
		
		singleRequestToRequest = new HashMap<Class<? extends SingleReceiverRequestContent>, Class<? extends RequestContent>>();

		// create the opposite mapping -> SingleRequest to general Request
		for (Entry<Class<? extends RequestContent>, Class<? extends SingleReceiverRequestContent>> entry : requestToSingleRequest.entrySet())
		{
			singleRequestToRequest.put(entry.getValue(), entry.getKey());
		}
	}
	public MessageMappings()
	{
		this.requestToAnswer = new HashMap<Class<? extends RequestContent>, Class<? extends AnswerContent>>();

		if (!requestToAnswer.containsKey(PingRequestContent.class))
		{
			requestToAnswer.put(PingRequestContent.class, PingAnswerContent.class);
		}

		this.requestToSingleRequest = new HashMap<Class<? extends RequestContent>, Class<? extends SingleReceiverRequestContent>>();
		
		singleRequestToRequest = new HashMap<Class<? extends SingleReceiverRequestContent>, Class<? extends RequestContent>>();

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
		// add all the new Mappings
		this.requestToAnswer.putAll(requestToAnswer);
		this.requestToSingleRequest.putAll(requestToSingleRequest);

		// create the opposite mapping -> SingleRequest to general Request
		for (Entry<Class<? extends RequestContent>, Class<? extends SingleReceiverRequestContent>> entry : requestToSingleRequest.entrySet())
		{
			singleRequestToRequest.put(entry.getValue(), entry.getKey());
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
		Class<? extends AnswerContent> ac = requestToAnswer.get(request.getClass());

		return ac;
	}

	/**
	 * Returns the matching AnswerContent to the given RequestContent
	 * 
	 * @param request
	 *            the RequestContent type where the AnswerContent is needed
	 * @return the matching AnswerContent
	 */
	public Class<? extends AnswerContent> getAppropriateAnswerContent(Class<? extends RequestContent> request) {
		Class<? extends AnswerContent> ac = requestToAnswer.get(request);

		return ac;
	}

	/**
	 * Get from a given single receiver Request the matching GeneralRequest
	 * 
	 * @param request
	 *            the SingleRecieverRequest in context
	 * @return the matching GeneralRequest
	 */
	public Class<? extends RequestContent> getAppropriateGeneralRequest(SingleReceiverRequestContent request) {
		Class<? extends RequestContent> rc = this.singleRequestToRequest.get(request.getClass());

		return rc;
	}

	/**
	 * Get from a given single receiver Request the matching GeneralRequest
	 * 
	 * @param request
	 *            the SingleRecieverRequest type in context
	 * @return the matching GeneralRequest
	 */
	public Class<? extends RequestContent> getAppropriateGeneralRequest(Class<? extends SingleReceiverRequestContent> request) {
		Class<? extends RequestContent> rc = this.singleRequestToRequest.get(request);

		return rc;
	}

	/**
	 * Get from a given single receiver Request the matching GeneralRequest
	 * 
	 * @param request
	 *            the SingleRecieverRequest in context
	 * @return the matching GeneralRequest
	 */
	public RequestContent getAppropriateGeneralRequestInstance(SingleReceiverRequestContent request) {
		Class<? extends RequestContent> rc = this.singleRequestToRequest.get(request.getClass());

		RequestContent res = null;

		try
		{
			res = rc.newInstance();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}

		return res;
	}

	/**
	 * Get from a given GeneralRequest the matching single receiver Request
	 * 
	 * @param request
	 *            the GeneralRequest in context
	 * @return the matching SingleRecieverRequest
	 */
	public Class<? extends SingleReceiverRequestContent> getAppropriateSingleRequest(RequestContent request) {
		Class<? extends SingleReceiverRequestContent> srr = this.requestToSingleRequest.get(request.getClass());

		return srr;
	}

	/**
	 * Get from a given GeneralRequest the matching SingleReceiverRequest
	 * 
	 * @param request
	 *            the GeneralRequest type in context
	 * @return the matching SingleRecieverRequest
	 */
	public Class<? extends SingleReceiverRequestContent> getAppropriateSingleRequest(Class<? extends RequestContent> request) {
		Class<? extends SingleReceiverRequestContent> srr = this.requestToSingleRequest.get(request.getClass());

		return srr;
	}
}
