/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package meritorder;

import java.util.ArrayList;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import meritorder.messages.Demand;
import meritorder.messages.Offer;
public class AggregatorBehavior extends BehaviorModel {

	public AggregatedState ans = new AggregatedState();
	public M2MDisplay display;
	int counter=0;
	
	public AggregatorBehavior() {
		display = new M2MDisplay(8080); // add port in to display a json
		display.run();
	}
	
	@Override
	public void handleRequest() {}

	@Override
	public void makeDecision() {
		
		ans.demandlist = new ArrayList<>();
		ans.offerlist = new ArrayList<>();		
		
		// mit Labda schreiben!?
		for (BasicAnswer basicAnswer : answerListReceived) {
			if (basicAnswer.answerContent instanceof Demand) {
				ans.demandlist.add((Demand) basicAnswer.answerContent);
			}
			if (basicAnswer.answerContent instanceof Offer) {
				ans.offerlist.add((Offer) basicAnswer.answerContent);
			}			
		}
		
		// sortieren
		
		// schnittpunkt
		
		// Ausgabe		
		Gson gson = new Gson();
		display.update(gson.toJson(ans));
		
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
