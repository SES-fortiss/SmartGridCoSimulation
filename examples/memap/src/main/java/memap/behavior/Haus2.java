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

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import memap.messages.EMSanswer;
import memap.messages.Erzeuger;
import memap.messages.Leistung;
import memap.messages.Medium;

public class Haus2 extends BehaviorModel {
	
	public EMSanswer answerContentToSend = new EMSanswer();
	public M2MDisplay display; // Für die Visualisierung
	Gson gson = new Gson();
	
	public Haus2() {
		
		display = new M2MDisplay(8082);
		display.run();
		
		// Definition statischer Elemente		
		Erzeuger waerme = new Erzeuger();
		waerme.medium = Medium.WAERME;
		waerme.erzeugerKosten = 1;
		waerme.maximalLeistung = 100;
		waerme.minimalLeistung = 0;
		waerme.maxTemperatur = 95;
		
		Erzeuger strom = new Erzeuger();
		strom.medium = Medium.STROM;
		strom.erzeugerKosten = 5;
		strom.maximalLeistung = 100;
		strom.minimalLeistung = 0;
		
		answerContentToSend.erzeugerList.add(waerme);
		answerContentToSend.erzeugerList.add(strom);
	}
	
	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {
		// Definition dynamischer Elemente, d.h. Werten		
		Leistung stromAktuell = new Leistung();
		stromAktuell.medium = Medium.STROM;
		stromAktuell.bedarf = 10;
		answerContentToSend.leistungenList.add(stromAktuell);
		display.update(gson.toJson(answerContentToSend));
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
