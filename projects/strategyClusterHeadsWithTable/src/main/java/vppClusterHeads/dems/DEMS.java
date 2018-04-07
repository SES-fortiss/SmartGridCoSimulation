/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package vppClusterHeads.dems;

import java.util.ArrayList;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import vppClusterHeads.clusterHead.ClusterHeadAnswerContent;
import vppClusterHeads.genericStuff.GenericRequestContent;
import vppClusterHeads.helper.FileToLocalDiskHelper;

/**
 * DEMSAggregator bekommt alle Nachrichten und kann diese Verarbeiten
 * 
 * @author bytschkow
 */

public class DEMS extends BehaviorModel {

	public DEMSAnswerContent answerContentToSend = new DEMSAnswerContent();
	public GenericRequestContent requestContentToSend = new GenericRequestContent();

	public double ausgleichNotwendig, posAusgleichVerf, negAusgleichVerf;

	// private boolean connectionToLLdesired = true; im Moment unnötig siehe Kommentar unten

	Gson gson = new Gson();

	/*
	 * Constructor
	 */
	public DEMS() {
		this.actorName = "DEMS";
	}

	@Override
	public void handleRequest() {
		
		double requestFactor = 0;		
		
		if (ausgleichNotwendig > 0) {	
			// Es wird mehr Energie benötigt			
			requestFactor = ausgleichNotwendig / posAusgleichVerf;
			if (requestFactor > 1) requestFactor = 1.0;		
		} 
		
		if (ausgleichNotwendig < 0){
			// Es ist zuviel Energie vorhanden
			requestFactor = ausgleichNotwendig / negAusgleichVerf;			
			if (requestFactor < -1) requestFactor = -1;
		}
		
		requestContentToSend.flexibilityRequestFactor = requestFactor;		
		if (requestFactor != 0.0) System.out.println("DEMS reqestFlexibility: " + requestFactor);
	}

	@Override
	public void makeDecision() {

		double childTotalPower = 0.0;
		double childScheduledPower = 0.0;

		double childSolarPower = 0.0;
		double childWindPower = 0.0;
		double childWaterPower = 0.0;
		double childBioGasPower = 0.0;
		double childBioMassPower = 0.0;
		double childPosAusgleich = 0.0;
		double childNegAusgleich = 0.0;
		double childAusgleichNotwendig = 0.0;

		ArrayList<ClusterHeadAnswerContent> children = new ArrayList<ClusterHeadAnswerContent>();
		
		// System.out.println("DEMS AnswerList - " + answerListReceived.size());

		for (BasicAnswer message : super.answerListReceived) {
			if (message.answerContent instanceof ClusterHeadAnswerContent) {
				ClusterHeadAnswerContent answer =
						(ClusterHeadAnswerContent) message.answerContent;
				childTotalPower += answer.total;
				childScheduledPower += answer.scheduled;

				childSolarPower += answer.solar;
				childWindPower += answer.wind;
				childWaterPower += answer.water;
				childBioGasPower += answer.bioGas;
				childBioMassPower += answer.bioMass;

				childPosAusgleich += answer.pF;
				childNegAusgleich += answer.nF;

				// falls ein Kind im Minus ist, muss von wo anders ein positiver
				// Ausgleich gemacht werden.
				childAusgleichNotwendig += answer.requestedPower;
				children.add(answer);
			}
		}

		answerContentToSend.total = childTotalPower;
		answerContentToSend.scheduled = childScheduledPower;
		answerContentToSend.children = children;

		answerContentToSend.solar = childSolarPower;
		answerContentToSend.wind = childWindPower;
		answerContentToSend.water = childWaterPower;
		answerContentToSend.bioGas = childBioGasPower;
		answerContentToSend.bioMass = childBioMassPower;
		answerContentToSend.name = this.actorName;

		ausgleichNotwendig = childAusgleichNotwendig;
		posAusgleichVerf = childPosAusgleich;
		negAusgleichVerf = childNegAusgleich;

		String answerAsJson = gson.toJson(answerContentToSend);
		System.out.println(actorName + ": " + answerContentToSend);

		FileToLocalDiskHelper.printFileToWWW(answerAsJson); // for the data update

		/** obsolete, since the website doesnt work anymore
		if (connectionToLLdesired) {
			try {
				SenderToLivingLabWebsite.writeValues(answerAsJson);
			} catch (IOException e) {
				System.out
						.println("DEMS could not connect to LivingLab Site to update data");
				e.printStackTrace();
			}
		}
		*/
	}

	@Override
	public AnswerContent returnAnswerContentToSend() {
		return answerContentToSend;
	}

	@Override
	public RequestContent returnRequestContentToSend() {
		return requestContentToSend;
	}

	@Override
	public void handleError(LinkedList<ErrorAnswerContent> errors) {
	}
}