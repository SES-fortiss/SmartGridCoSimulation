/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package memap.behavior;

import java.util.LinkedList;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import memap.messages.EMSanswer;

public class MEMAPBehavior extends BehaviorModel {

	public EMSanswer ans = new EMSanswer();
	public M2MDisplay display;
	int counter=0;
	
	public MEMAPBehavior() {
		display = new M2MDisplay(8080); // add port in to display a json
		display.run();
	}
	
	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		counter++;
		display.update(""+counter);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return ans;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return null;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {}
}
