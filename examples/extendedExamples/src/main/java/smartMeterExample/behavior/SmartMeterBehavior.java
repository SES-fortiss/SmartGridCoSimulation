/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package smartMeterExample.behavior;

import java.util.LinkedList;

import smartMeterExample.message.SmartMeterAnswer;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

public class SmartMeterBehavior extends BehaviorModel {
	
	public SmartMeterAnswer answerContentToSend = new SmartMeterAnswer();

	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
		answerContentToSend.size = (int) (Math.random() * 256);
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		
	}
}
