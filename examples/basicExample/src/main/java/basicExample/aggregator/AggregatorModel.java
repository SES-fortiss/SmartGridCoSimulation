/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package basicExample.aggregator;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import basicExample.child.ChildAnswer;
import behavior.BehaviorModel;

public class AggregatorModel extends BehaviorModel {
	
	/*
	 * Place for further Behavior Variables
	 */

	@Override
	public void handleRequest() {
		System.out.println(this.actorName + ": Request received / Prepare new request for children");
		/*
		 * Place to create a specific requestContent that will be send to the children.
		 */
	}

	@Override
	public void makeDecision() {
		
		int sum = 0;
		
		for (BasicAnswer answer : super.answerListReceived) {		
			ChildAnswer ans = (ChildAnswer) answer.answerContent;
			sum = sum + ans.data;
		}
		System.out.println(this.actorName + ": makeDecision()");
		System.out.println(this.actorName + ": Sum of AnswerData: " + sum);
		
		/*
		 * Place for further behavior actions
		 */
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		System.out.println(this.actorName + ": send / access AnswerContent");
		return null;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		System.out.println(this.actorName + ": send / access RequestContent");
		return null;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
		System.out.println("test: handleError()");
	}
}
