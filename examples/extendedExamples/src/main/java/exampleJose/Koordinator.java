/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package exampleJose;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;

/**
 * @author Denis Bytschkow
 *
 */
public class Koordinator extends BehaviorModel{
	
	public KRequest request = new KRequest();

	public void handleRequest() {
		double x = Math.random();
		if (x > 0.8) request.noPower = false;
		else request.noPower = true;
	}

	public void makeDecision() {
		
		double sum = 0;
		double reactivePower=0;
		
		for (BasicAnswer basicAnswer : answerListReceived) {
			EMSAnswer receivedAnswer = (EMSAnswer) basicAnswer.answerContent;
			sum = sum + receivedAnswer.currentPower;
			reactivePower = reactivePower + receivedAnswer.reactivePower;
		}
		
		System.out.println(sum);
		System.out.println(reactivePower);
		
	}

	public AnswerContent returnAnswerContentToSend() {
		return null;
	}

	public RequestContent returnRequestContentToSend() {
		return request;
	}
}
