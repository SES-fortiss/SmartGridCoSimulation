/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.advancedMessages;

import java.util.LinkedList;

import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * MultipleRequest
 * 
 * @author Luc Should be used as soon as there Multiple communication in one Timestep is needed
 *
 */

public class MultiRequestContainer implements RequestContent {

	public int maxNbCommunicationSteps;
	private int stepCounter;
	private LinkedList<RequestContent> messages;
	public BehaviorModel sender;

	/**
	 * Creates a new {@link MultiRequestContainer} object
	 * 
	 * @param maxNbCommunicationSteps
	 *            The number of communication steps which should be executed in one Timestep
	 * @param sender
	 *            the {@link BehaviorModel} which sends this message
	 */
	public MultiRequestContainer(int maxNbCommunicationSteps, BehaviorModel sender) {
		this.stepCounter = 0;
		this.maxNbCommunicationSteps = maxNbCommunicationSteps;
		this.messages = new LinkedList<RequestContent>();
		this.sender = sender;
	}

	/**
	 * add a request to the MultiMessage
	 * 
	 * @param request
	 *            the requestContent in context
	 */
	public void addRequestContent(RequestContent request) {
		if (messages.size() > maxNbCommunicationSteps)
			throw new IllegalArgumentException("More Request(" + messages.size() + ") than CommunicationSteps(" + maxNbCommunicationSteps + ") ");
		else
			messages.add(request);
	}

	/**
	 * Get the current RequestContent out of the MultiMessage
	 * 
	 * @return the RequestContent in context
	 */
	public RequestContent getCurrentRequestContent() {
		if (stepCounter < maxNbCommunicationSteps)
			return messages.get(stepCounter);
		else
			throw new IllegalArgumentException("Exceeded the number of possible steps");
	}

	/**
	 * Move to the next {@link RequestContent} of the {@link MultiRequestContainer}
	 * 
	 * @return true if there is another {@link RequestContent}, false if the current {@link RequestContent} is already the last one
	 */
	public boolean nextStep() {
		if (stepCounter < maxNbCommunicationSteps)
		{
			stepCounter++;
			if (stepCounter >= messages.size())
			{
				stepCounter = maxNbCommunicationSteps;
				maxNbCommunicationSteps = 0;
				return false;
			}
			else
				return true;
		}
		else
			return false;
	}

	/**
	 * Check if there is one more step available
	 * 
	 * @return true if there is another step, false otherwise
	 */
	public boolean isLastStep() {
		if ((stepCounter + 1) < maxNbCommunicationSteps)
		{
			return false;
		}
		else
			return true;
	}

	@Override
	public String toString() {
		String res = "MultiMessage {";

		for (int i = 0; i < maxNbCommunicationSteps; i++)
		{
			if (i != 0)
				res += " , ";
			if (i >= messages.size())
				res += "null";
			else
				res += messages.get(i);
		}

		res += " }";

		return res;
	}

	/**
	 * Get the Number of empty request Slots in the current {@link MultiRequestContainer}
	 * 
	 * @return The Number of empty request Slots
	 */
	public int getNumberOfFreeRequestSpaces() {
		return maxNbCommunicationSteps - messages.size();
	}

	/**
	 * checks if a SingleReceiverRequestContainer needs to be added. If the last request in the container is no SingleReceiverRequestContainer it will
	 * be added
	 * 
	 * @return true if an SingleReceiverRequestContainer is added, false otherwise
	 */
	public boolean addNewSingleRequestContainer() {
		if (messages.size() > maxNbCommunicationSteps)
			return false;
		else
		{
			SingleReceiverRequestContainer single = new SingleReceiverRequestContainer();
			messages.add(single);
			return true;
		}
	}

	/**
	 * add as a SingleReceiverRequestContent to the {@link MultiRequestContainer}.
	 * 
	 * @param request
	 *            the request that should be added
	 * @return true if it was added, false otherwise
	 */
	public boolean addSingleRequest(SingleReceiverRequestContent request) {
		if (messages.size() > 0 && messages.getLast() instanceof SingleReceiverRequestContainer)
		{
			SingleReceiverRequestContainer tmp = (SingleReceiverRequestContainer) messages.getLast();
			tmp.addRequest(request);

			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * gets the request before the last request
	 * 
	 * @return the request
	 */
	public RequestContent getPreviousRequest() {
		if (messages.size() > 1)
			return messages.get(messages.size() - 2);
		else
			return null;
	}

	/**
	 * checks if the {@link MultiRequestContainer} is empty
	 * 
	 * @return true if it is empty, false otherwise
	 */
	public boolean isEmpty() {
		return messages.isEmpty();
	}

	/**
	 * add additional places to the {@link MultiRequestContainer}
	 * 
	 * @param additionalSteps
	 *            number of additional places
	 */
	public void reSizeMultiRequest(int additionalSteps) {
		this.maxNbCommunicationSteps += additionalSteps;
	}

	/**
	 * set the {@link MultiRequestContainer} to the initial state
	 */
	public void resetMultiRequest() {
		this.stepCounter = 0;
		this.maxNbCommunicationSteps = 0;
		this.messages = new LinkedList<RequestContent>();
	}
}
