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

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import smartMeterExample.M2MDisplay;
import smartMeterExample.message.SmartMeterAnswer;

public class AggregatorBehavior extends BehaviorModel {

	public M2MDisplay display;
	public TestMessage test = new TestMessage();
	
	public AggregatorBehavior() {
		display = new M2MDisplay(8090);
		display.run();
	}
	
	
	// CPU rating per second
	public double cpuRating = 1337;

	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
		int sum = 0;
		for (BasicAnswer answer : super.answerListReceived) {
		
			SmartMeterAnswer ans = (SmartMeterAnswer) answer.answerContent;
			sum = sum + ans.size;			
				
		}
				
		// Ausgabe
		System.out.println("Summe : " + sum);
		
		test.size = sum;
		Gson gson = new Gson();
		display.update(gson.toJson(test));	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}
