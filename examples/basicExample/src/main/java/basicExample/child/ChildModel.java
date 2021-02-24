/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package basicExample.child;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

public class ChildModel extends BehaviorModel {
	
	public ChildAnswer answerContentToSend = new ChildAnswer();

	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
		System.out.println(this.actorName + ": makeDecision()");
		answerContentToSend.data = (int) (Math.random() * 256);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}
}
