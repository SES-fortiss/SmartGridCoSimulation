/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package behavior.advancedBehaviorModels;

import java.util.LinkedList;
import java.util.List;

import akka.basicMessages.RequestContent;

public class InitialRequestsHandler {

	private List<RequestContent> initialRequests;
	private int intialRequestCounter;
	private boolean isIntitalStep;
	private boolean existedNextInitialRequest;

	public InitialRequestsHandler() {
		this.intialRequestCounter = 0;
		this.isIntitalStep = true;
		this.initialRequests = null;
		this.existedNextInitialRequest = false;
	}

	/**
	 * Check if there exists a next RequestContent which needs to be processed every timestep
	 * 
	 * @return true if there is another one, false otherwise
	 */
	public boolean existsNextInitalRequest() {
		return ((intialRequestCounter + 1) < initialRequests.size());
	}

	/**
	 * Get the Request which should be processed at the moment
	 * 
	 * @return the current RequestContent
	 */
	public RequestContent getCurrentInitalRequest() {
		return this.initialRequests.get(intialRequestCounter);
	}

	/**
	 * Add a List of RequestContents which should be executed every TimeStep
	 * 
	 * @param initialRequest
	 *            the RequestContents which should be executed every TimeStep
	 */
	public void setInitalRequest(List<RequestContent> initialRequest) {
		this.initialRequests = initialRequest;
	}

	/**
	 * Add a RequestContent which should be executed every TimeStep
	 * 
	 * @param initialRequest
	 *            the RequestContent which should be executed every TimeStep
	 */
	public void setInitalRequest(RequestContent initialRequest) {
		this.initialRequests = new LinkedList<RequestContent>();
		this.initialRequests.add(initialRequest);
	}

	/**
	 * switch to the next Request for this TimeStep
	 */
	public void switchToNextInitalRequest() {
		if ((intialRequestCounter + 1) < initialRequests.size())
		{
			intialRequestCounter++;
		}
		else
		{
			throw new IllegalAccessError("There is no more InitialRequest space");
		}
	}

	/**
	 * Check if it is currently the initial Request
	 * 
	 * @return true if yes, else false
	 */
	public boolean isIntitalStep() {
		return isIntitalStep;
	}

	/**
	 * Set the Initial Step
	 * 
	 * @param isIntitalStep
	 *            boolean value
	 */
	public void setIntitalStep(boolean isIntitalStep) {
		this.isIntitalStep = isIntitalStep;
	}

	/**
	 * check if a next initial request was found
	 * 
	 * @return true if yes, else false
	 */
	public boolean foundNextInitialRequestLastTimeStep() {
		return existedNextInitialRequest;
	}

	/**
	 * Set the value if there was another initial Request
	 * 
	 * @param existedNextInitialRequest
	 *            boolean value
	 */
	public void setfoundNextInitialRequestLastTimeStep(boolean existedNextInitialRequest) {
		this.existedNextInitialRequest = existedNextInitialRequest;
	}

	/**
	 * Get all the initial Requests
	 * 
	 * @return a List with all the RequestContents
	 */
	public List<RequestContent> getInitialRequests() {
		return initialRequests;
	}

	/**
	 * Reset the value of the IntialRequestCounter
	 */
	public void resetIntialRequestCounter() {
		this.intialRequestCounter = 0;
	}

}
