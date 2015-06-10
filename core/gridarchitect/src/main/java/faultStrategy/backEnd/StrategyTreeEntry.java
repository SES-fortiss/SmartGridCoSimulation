/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy.backEnd;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

/**
 * StrategyTreeEntry 15.07.2014
 * 
 * @author Luc
 *
 */
public class StrategyTreeEntry {

	private static int entryIdGenerator = -1;
	private int entryId;
	private Class<? extends RequestContent> request;
	private Class<? extends AnswerContent> answerPreviousRequest;
	private boolean answerChanged;
	private boolean requestChanged;

	public StrategyTreeEntry(Class<? extends RequestContent> request, Class<? extends AnswerContent> answerPreviousRequest) {
		entryIdGenerator++;
		this.entryId = entryIdGenerator;
		this.request = request;
		this.answerPreviousRequest = answerPreviousRequest;

		this.answerChanged = false;
		this.requestChanged = false;
	}

	public int getEntryId() {
		return entryId;
	}

	public Class<? extends RequestContent> getRequest() {
		return request;
	}

	public Class<? extends AnswerContent> getAnswerPreviousRequest() {
		return answerPreviousRequest;
	}
	
	public void setAnswerPreviousRequest(Class<? extends AnswerContent> newAnswerContent) {
		answerPreviousRequest=newAnswerContent;
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;

		if (o instanceof StrategyTreeEntry)
		{
			StrategyTreeEntry entry = (StrategyTreeEntry) o;

			boolean requestTest;

			if (request != null)
				requestTest = this.request.equals(entry.getRequest());
			else
				requestTest = this.request == entry.getRequest();

			boolean answerTest;
			if (answerPreviousRequest != null)
				answerTest = this.answerPreviousRequest.equals(entry.getAnswerPreviousRequest());
			else
				answerTest = this.answerPreviousRequest == entry.getAnswerPreviousRequest();

			result = requestTest && answerTest;
		}

		return result;
	}

	@Override
	public String toString() {
		String s = "";

		s += "[ Id " + entryId;
		s += " , Request " + request;
		s += " , Previous Answer " + answerPreviousRequest;
		s += "]";

		return s;
	}

	/**
	 * changes the RequestContent to the provided RequestContent
	 * 
	 * @param request
	 *            the new RequestContent
	 */
	public void changeRequestContent(Class<? extends RequestContent> request) {
		if (requestChanged == false)
		{
			this.request = request;
			requestChanged = true;
		}

	}

	/**
	 * changes the AnswerContent to the provided AnswerContent
	 * 
	 * @param answerPreviousRequest
	 *            the new AnswerContent
	 */
	public void changeAnswerContent(Class<? extends AnswerContent> answerPreviousRequest) {
		if (answerChanged == false)
		{
			this.answerPreviousRequest = answerPreviousRequest;
			answerChanged = true;
		}
	}

	/**
	 * After all the changes of Request/Answers the Entry needs to be reset
	 */
	public void resetAfterChanges() {
		this.answerChanged = false;
		this.requestChanged = false;
	}
}
