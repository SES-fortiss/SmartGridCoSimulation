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

/**
 * {@link SingleReceiverRequestContainer} is a container that can hold multiple {@link SingleReceiverRequestContent}
 * 
 * @author Luc
 *
 */
public class SingleReceiverRequestContainer implements RequestContent {

	private LinkedList<SingleReceiverRequestContent> requests;

	public SingleReceiverRequestContainer() {
		this.requests = new LinkedList<>();
	}

	public void addRequest(SingleReceiverRequestContent request) {
		this.requests.add(request);
	}

	public LinkedList<SingleReceiverRequestContent> getRequests() {
		return requests;
	}

	@Override
	public String toString() {
		String res = "SingleRecieverRequestContainer: { ";
		for (SingleReceiverRequestContent request : requests)
		{
			res += request.toString() + ", ";
		}

		res += " }";
		return res;
	}

	public boolean isEmpty() {
		return requests.isEmpty();
	}

}
