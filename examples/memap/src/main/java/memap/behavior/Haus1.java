/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package memap.behavior;

import com.google.gson.Gson;

import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import memap.messages.EMSanswer;
import memap.messages.Erzeuger;
import memap.messages.Leistung;
import memap.messages.Medium;

public class Haus1 extends BehaviorModel {
	
	public EMSanswer answerContentToSend = new EMSanswer();
	public M2MDisplay display;
	
	public Haus1() {
		
		display = new M2MDisplay(8081);
		display.run();
		
		// Definition statischer Elemente
		Erzeuger kaelte = new Erzeuger();
		kaelte.medium = Medium.KAELTE;
		kaelte.erzeugerKosten = 100;
		kaelte.maximalLeistung = 100;
		kaelte.minimalLeistung = 0;
		kaelte.minTemperatur = 5;	
		
		Erzeuger strom = new Erzeuger();
		strom.medium = Medium.STROM;
		strom.erzeugerKosten = 5;
		strom.maximalLeistung = 100;
		strom.minimalLeistung = 0;
		
		answerContentToSend.erzeugerList.add(kaelte);
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
		Gson gson = new Gson();
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

}
