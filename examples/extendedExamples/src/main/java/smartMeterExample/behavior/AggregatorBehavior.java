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
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import akka.systemActors.GlobalTime;
import behavior.BehaviorModel;

public class AggregatorBehavior extends BehaviorModel {

	// CPU rating per second
	public double cpuRating = 1337;

	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
		
		int sum = 0;
		int cpuMessageRating = 0;
		double cpuDemand = 0;
		
		for (BasicAnswer answer : super.answerListReceived) {
		
			SmartMeterAnswer ans = (SmartMeterAnswer) answer.answerContent;
			sum = sum + ans.size;			
			
			// CPU Bedarf pro Nachricht 
			if (ans.size <= 20) cpuMessageRating = 10;
			else cpuMessageRating = 20;
			
			if (ans.size > 200) cpuMessageRating = 30;

			// Berechne den CPU Bedarf
			cpuDemand += cpuMessageRating;			
		}
		
		// Berechne die Last pro Sekunde
		double memoryUtlization = sum / GlobalTime.period.getSeconds();		
		cpuDemand  = cpuDemand / GlobalTime.period.getSeconds();
		
		// Umrechnen in Prozent
		double cpuUtilization = cpuDemand / cpuRating;
		cpuUtilization = cpuUtilization * 100;
				
		// Ausgabe
		System.out.println("Speicher Last: " + memoryUtlization + " kB/s");
		System.out.println("CPU Last: " + cpuUtilization + " %");
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
