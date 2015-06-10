/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * PlainActor
 * 04.06.2014
 * @author bytschkow
 *
 */
public class BlankActorBehavior extends BehaviorModel{

	@Override
	public void makeDecision() {
	}

	@Override
	public void handleRequest() {		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}


	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
	}

}
