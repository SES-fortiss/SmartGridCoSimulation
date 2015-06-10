/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package faultStrategy;

import java.util.LinkedList;

import faultStrategy.backEnd.BasicFaultStrategy;
import faultStrategy.requests.EndMessageRequestContent;
import faultStrategy.requests.GetLastHistoryRequestContent;
import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;

public class StandartFaultStrategy extends BasicFaultStrategy {

	public StandartFaultStrategy(Class<? extends RequestContent> request, Class<? extends AnswerContent> answer) {
		super("StandartStrategy");
		init(request, answer);
	}

	private void init(Class<? extends RequestContent> request, Class<? extends AnswerContent> answer) {
		//maxNumberOfSteps = 1;

		// create the tree
		LinkedList<Class<? extends RequestContent>> requestPath = new LinkedList<>();
		LinkedList<Class<? extends AnswerContent>> answerPath = new LinkedList<>();

		// immediate success
		requestPath.add(request);
		requestPath.add(EndMessageRequestContent.class);

		answerPath.add(answer);

		super.addPathToStrategy(requestPath, answerPath);

		// Error then look up history
		requestPath = new LinkedList<>();
		answerPath = new LinkedList<>();

		requestPath.add(request);
		requestPath.add(GetLastHistoryRequestContent.class);

		answerPath.add(ErrorAnswerContent.class);

		super.addPathToStrategy(requestPath, answerPath);
	}
}
