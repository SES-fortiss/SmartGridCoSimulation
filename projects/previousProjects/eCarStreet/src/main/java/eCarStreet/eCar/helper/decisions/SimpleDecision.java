/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar.helper.decisions;

import java.time.LocalDateTime;
import java.time.LocalTime;

import akka.systemActors.GlobalTime;
import eCarStreet.eCar.ECar;


/**
 * Die Klasse stellt eine Einfache Entscheidungslogik dar. 
 * So lange das Auto nicht voll ist, wird geladen. 
 * Wenn der gewünschte Ladezustand erreicht ist, wird nicht mehr geladen.
 * 
 * @author bytschkow
 *
 */
public class SimpleDecision implements Decision{

	/**
	 * Die wichtigste Methode: Liefert als Ergebniss die gewünschte Ladeleistung.
	 */
	@Override
	public double getDemand(ECar eCar, LocalDateTime time) {
		
		LocalTime localTime = LocalTime.of(time.getHour(), time.getMinute());			
				
		// um 12:00 wird das Auto SIC auf minSOC gesetzt
		if ( localTime.compareTo(LocalTime.of(12, 0)) == 0)  {
			eCar.setSOC(eCar.startSOC);
		}		
						
		if (localTime.compareTo(eCar.arrivalTime) >= 0 || 
				localTime.compareTo(eCar.leavingTime) <= 0 ) {			
			
			double result = doCharge(eCar);			
			return result;
			
		} else {
			return 0;
		}
	}

	/**
	 * Helfer Methode für die Berechnung der Leistung.
	 * 
	 * @param eCar
	 * @param time
	 * @return
	 */
	public double doCharge(ECar eCar) {
		double chargingPowerinKWh = 0;
		double startSOCinKWh = eCar.getSOC() * eCar.capacity;
		double endSOCinKWh = eCar.endSOC * eCar.capacity;
		double expectedSOCinKWh;
		double timeFactor = GlobalTime.period.getSeconds() / 3600.0;		
		
		if (startSOCinKWh < endSOCinKWh){
						
			chargingPowerinKWh = eCar.maxChargingSpeed;	
			expectedSOCinKWh = startSOCinKWh + chargingPowerinKWh * timeFactor;
			
			System.out.println("timeFaktor: " + timeFactor + " StartSOC: " + startSOCinKWh + " loading: " + chargingPowerinKWh*timeFactor);			
			
			if (expectedSOCinKWh > endSOCinKWh){
				chargingPowerinKWh =  (endSOCinKWh - startSOCinKWh) / timeFactor;
			}
			
			double result = (startSOCinKWh + chargingPowerinKWh * timeFactor) / eCar.capacity; 
			eCar.setSOC(result);
		}		
		
		return -chargingPowerinKWh;
	}
}
