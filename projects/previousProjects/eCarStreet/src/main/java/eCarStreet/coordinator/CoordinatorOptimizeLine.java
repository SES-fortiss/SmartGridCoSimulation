/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.coordinator;

import helper.standardLastProfil.StandardLastProfil;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;

import akka.basicMessages.BasicAnswer;
import akka.systemActors.GlobalTime;
import eCarStreet.eCar.ECar;
import eCarStreet.house.HouseAnswerContent;

/**
 * @author Denis Bytschkow
 *
 */
public abstract class CoordinatorOptimizeLine {
	
	public static double capacity = 40;
	public static double predicted = 0;
	public static double totalLoadRemaining = 0;
	public static HashSet<ECar> eCarList = new HashSet<ECar>();
	public static ArrayList<Double> verbrauchList = new ArrayList<Double>();
	public static ArrayList<Double> vorhandenList = new ArrayList<Double>();
	
	public static ArrayList<Double> verbrauchListKWH = new ArrayList<Double>();
	public static ArrayList<Double> vorhandenListKWH = new ArrayList<Double>();
	public static ArrayList<Double> eCarLoadList = new ArrayList<Double>();
		
	public static LocalTime startTime = LocalTime.of(18, 00);
	public static LocalTime endTime = LocalTime.of(8, 00);
	public static int startIndex = -1;
	public static int endIndex = -1;	
	
	public static ArrayList<Double> prepareRequest(ArrayList<BasicAnswer> answerListReceived){		
		predicted = 0;
		double verbrauch = 0;
		if (answerListReceived == null) return null; // nur im ersten Schritt, da noch keine Antworten vorhanden
		
		for (BasicAnswer message : answerListReceived){
			if (message.answerContent instanceof HouseAnswerContent) {
				HouseAnswerContent answer = (HouseAnswerContent) message.answerContent;
				predicted += answer.predicted;
				verbrauch += answer.jahresVerbrauch;
				if (answer.eCarInformation != null) eCarList.add(answer.eCarInformation);
			}
		}
		
		double requiredLoad = calculateRemainingCarLoad();
		totalLoadRemaining = requiredLoad;
		
		if (verbrauchList == null || verbrauchList.size() == 0){			
			
			verbrauchList = getVerbrauchListe(verbrauch);
			vorhandenList = calcVorhandenListe(verbrauchList);
			
			double skalierFaktor = 1.0 * GlobalTime.period.getSeconds() / 3600.0;
			
			for (int i = 0; i < verbrauchList.size(); i++) {
				verbrauchListKWH.add(verbrauchList.get(i)*skalierFaktor);
				vorhandenListKWH.add(vorhandenList.get(i)*skalierFaktor);
			}
			
			/*
			for (Double double1 : verbrauchListKWH) {
				System.out.print(double1 + " ");
			} System.out.println();
			*/
			
			eCarLoadList = calculateLoadList(verbrauchListKWH, requiredLoad);			
			
			/*
			for (Double double1 : verbrauchListKWH) {
				System.out.print(double1 + " ");
			}
			System.out.println();
			
			for (Double double1 : eCarLoadList) {
				System.out.print(double1 + " ");
			}
			System.out.println();
			*/
				
		}
		return eCarLoadList;
	}
	
	private static ArrayList<Double> calculateLoadList(
			ArrayList<Double> verbrauchListKWH2, double requiredLoad) {
		
		LocalTime time = GlobalTime.currentTime.toLocalTime();
		
		ArrayList<Double> result = new ArrayList<Double>();
		for (int i = 0; i < verbrauchListKWH2.size(); i++) {
			result.add(0D);
			if (time.equals(startTime)) startIndex = i;
			if (time.equals(endTime)) endIndex = i;
			time = time.plus(GlobalTime.period);
		}
		
		double remainingLoad = -requiredLoad;		
		double skalierFaktor = 1.0 * GlobalTime.period.getSeconds() / 3600.0;		
		
		do {
			
			int index = getMinimum(verbrauchListKWH2);
			
			Double value = verbrauchListKWH2.get(index);
			value += 0.1 * skalierFaktor;
			verbrauchListKWH2.set(index, value);
			
			Double eCar = result.get(index);
			eCar += 0.1 * skalierFaktor;
			result.set(index, eCar);
			
			remainingLoad = remainingLoad - 0.1 * skalierFaktor;
			
		} while (remainingLoad > 0);		
		
		return result;
	}

	private static int getMinimum(ArrayList<Double> verbrauchListKWH2) {
		int result = 0;
		double puffer = verbrauchListKWH2.get(0);		
		
		//for (int i = 1; i < verbrauchListKWH2.size(); i++) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (verbrauchListKWH2.get(i) < puffer) {
				puffer = verbrauchListKWH2.get(i);
				result = i;
			}
		}
		
		return result;
	}

	private static ArrayList<Double> calcVorhandenListe(ArrayList<Double> verbrauchList2) {
		ArrayList<Double> result = new ArrayList<Double>();
		
		for (Double double1 : verbrauchList2) {
			result.add(capacity - double1);
		}
		
		return result;
	}

	private static ArrayList<Double> getVerbrauchListe(double verbrauch) {
		
		ArrayList<Double> result = new ArrayList<Double>();
		for (int i = 0; i < GlobalTime.lastTimeStep; i++) {
			result.add(StandardLastProfil.getH0Demand(verbrauch, GlobalTime.currentTime.plus(GlobalTime.period.multipliedBy(i))));
		}				
		return result;
	}

	private static double calculateRemainingCarLoad(){
		
		double remainingLoad = 0;
		for (ECar ecar : eCarList) {
			double loadCar = (ecar.getSOC() - ecar.endSOC) * ecar.capacity;
			//System.out.println("Ecar remaining Load: " + loadCar);	
			remainingLoad += loadCar;
		}
		
		/*
		System.out.println();
		System.out.println("Total load required: " + remainingLoad);
		System.out.println();
		*/
		
		return remainingLoad;
	}

}
