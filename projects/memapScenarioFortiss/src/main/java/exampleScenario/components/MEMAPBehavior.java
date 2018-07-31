/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package exampleScenario.components;

import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;
import exampleScenario.external.M2MDisplay;
import exampleScenario.messages.MEMAPanswer;

public class MEMAPBehavior extends BehaviorModel {

	public MEMAPanswer answerContent = new MEMAPanswer();
	public M2MDisplay display;
	int counter=0;
	int sum=0;
	
	public MEMAPBehavior() {
		display = new M2MDisplay(8100); // add port in to display a json
		display.run();
	}
	
	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		counter++;		
		answerContent.counter = counter;
		answerContent.currentTime = GlobalTime.currentTime;
		
		Gson gson = new Gson();
		display.update(gson.toJson(answerContent));
		
		
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContent;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
	
	@Override
	public void endSimulation() {
		display.stop();
	}
}
