/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package meritorder.components;

import java.util.ArrayList;
import java.util.LinkedList;

import com.google.gson.Gson;

import akka.advancedMessages.ErrorAnswerContent;
import akka.basicMessages.AnswerContent;
import akka.basicMessages.BasicAnswer;
import akka.basicMessages.RequestContent;
import behavior.BehaviorModel;
import memap.external.M2MDisplay;
import meritorder.messages.Accepted;
import meritorder.messages.AggregatedState;
import meritorder.messages.Demand;
import meritorder.messages.Offer;
public class AggregatorBehavior extends BehaviorModel {

	public AggregatedState ans = new AggregatedState();
	public M2MDisplay display;
	Gson gson = new Gson();
	
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
		
		ans.demandlist.sort((Demand a, Demand b) -> (int) (b.price - a.price));
		ans.offerlist.sort((Offer a, Offer b) -> (int) (a.price - b.price));
		
		// Berechnung des Volumens und des Preises
		double systemPrice = schnittPunktBestimmen(ans.demandlist, ans.offerlist);
		double systemVolumen = 0;
		double overProduction = 0;
		double overConsumption = 0;
		
		System.out.println("Price: " + systemPrice);
		
		double offerVolumen = 0;
		for (Offer offer : ans.offerlist) {
			if (offer.price <= systemPrice) offerVolumen += offer.volume;			
		}
		
		double demandVolumen = 0;		
		for (Demand demand :ans.demandlist) {			
			if (demand.price >= systemPrice) {
				System.out.println(gson.toJson(demand));				
				demandVolumen += demand.volume;			
			}
		}		
		
		System.out.println("DemandVolume: " + demandVolumen);
		System.out.println("OfferVolume: " + offerVolumen);
		
		if (offerVolumen < demandVolumen) {
			systemVolumen = offerVolumen;
			overConsumption = demandVolumen - offerVolumen;
		}
		
		if (offerVolumen > demandVolumen) {
			systemVolumen = demandVolumen;
			overProduction = offerVolumen - demandVolumen;
		}
		
		ans.systemPrice = systemPrice;
		ans.overConsumption = overConsumption;
		ans.overProduction = overProduction;
		ans.systemVolume = systemVolumen;
		
		display.update(gson.toJson(ans));		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private double schnittPunktBestimmen(ArrayList<Demand> dl, ArrayList<Offer> ol) {
		
		double result = 0;
		
		int counterDemand = 0;
		int counterOffer = 0;
		
		Demand dem = dl.get(counterDemand);
		Offer off = ol.get(counterOffer);
		double resDemand = dem.volume;
		double resOffer = off.volume;
		
		while (counterDemand < dl.size() && counterOffer < ol.size()) {
			double difference = 0;		
			if (dem.price >= off.price) {
				off.accepted = Accepted.partly;
				dem.accepted = Accepted.partly;
				difference = resOffer - resDemand;
			} else break;
			
			if (difference >= 0) {
				result = off.price;		
				resOffer = difference;
				counterDemand++;
				dem.accepted = Accepted.fully;
				if (counterDemand < dl.size()) {
					dem = dl.get(counterDemand);
					resDemand = dem.volume;
				}
				
			} else {
				result = dem.price;
				resDemand = difference * (-1);
				counterOffer++;
				off.accepted = Accepted.fully;
				if (counterOffer < ol.size()) {
					off = ol.get(counterOffer);
					resOffer = off.volume;
				}
			}
		}
		return result;
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
