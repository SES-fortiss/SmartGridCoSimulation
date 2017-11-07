/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package memap.behavior;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;

public class ReaderFromOnline extends BehaviorModel {
	
	public WeatherData answerContentToSend = new WeatherData();
	public M2MDisplay display;
	public Gson gson = new Gson();
	
	public ReaderFromOnline() {		
		display = new M2MDisplay(8083);
		display.run();
	}
	
	@Override
	public void handleRequest() {
	}

	@Override
	public void makeDecision() {		
		Document doc = null;
		try {
			doc = Jsoup.connect("http://www.meteo.physik.uni-muenchen.de/dokuwiki/doku.php?id=wetter:stadt:messung").get();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		Element table = doc.select("table").first();
		Iterator<Element> ite = table.select("td").iterator();
		
		String result = null; // hier wird das Ergebnis gespeichert

		while (ite.hasNext()){			
			String str = ite.next().text(); 			
			if (str.equals("Lufttemperatur")) result = ite.next().text();			
		}
		result = result.replace("°C", "");		
		answerContentToSend.temperatur = Double.parseDouble(result);		
		display.update(gson.toJson(answerContentToSend));
		//display.update(doc.toString());
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
