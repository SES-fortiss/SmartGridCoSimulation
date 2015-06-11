/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar.helper.decisions;

import java.time.Duration;

import eCarStreet.eCar.ECar;

public class Optimizer {	
		
	OptimizationPoint[][] opt;
	
	public int timeN;
	public int socN;
	public Duration deltaTime;
	public double deltaSOCinKWh;
	
	public ECar eCar;
	public double efficiency = 0.999;
	
	public OptimizationPoint[] fahrplan = null;
	
	public Optimizer(ECar eCar, Duration period){
		this.deltaTime = period;
		
		double power = 0.1; // Der Faktor bestimmt, dass die Battrieladegeschwindigkeit mit 100W Leistung varieren kann.
		this.deltaSOCinKWh = power * deltaTime.getSeconds() / 3600;
		// Intervalle sind pro Stunde genormt, also auf die Einheit kWh
		
		this.timeN = getNforTime(eCar);
		this.socN = getNforSOC(eCar);
		this.opt = new OptimizationPoint[timeN][socN];
		this.eCar = eCar;
	}
	
	private int getNforTime(ECar eCar) {
		
		Duration duration = Duration.between(eCar.arrivalTime, eCar.leavingTime);
		if (eCar.arrivalTime.isAfter(eCar.leavingTime)) {
			duration = duration.plus(Duration.ofHours(24L));
		}
		
		long durationSeconds = duration.getSeconds();
		long globalSeconds = deltaTime.getSeconds();		

		int result = (int) (durationSeconds / globalSeconds);
		return 1 + result;
	}
	
	private int getNforSOC(ECar eCar) {
				
		double start = eCar.startSOC * eCar.capacity;
		double end = eCar.endSOC * eCar.capacity;
		double diffNum = (end - start) / deltaSOCinKWh;
		
		return 1 + (int) diffNum;
	}

	public OptimizationPoint[] optimize(double [] preisarray) {
		
		if (timeN >= preisarray.length+1){
			System.out.println("ACHTUNG! Preisarray ist kuerzer als der zu optimierende Bereich.");
		}
		
		double loadingFactor = (0.0 + deltaTime.getSeconds() )/3600;
		double maxLoad = eCar.maxChargingSpeed * loadingFactor;
		double minLoad = eCar.maxDischargingSpeed * loadingFactor;
		//int counter = 0;
		
		// Schleife für die Zeit
		for (int i = timeN - 1 ; i >= 0; i--) {			
			
			// Schleife für den Ladezustand
			for (int j = 0; j < socN; j++){
				opt[i][j] = new OptimizationPoint();
				
				opt[i][j].SOCinKWh = eCar.startSOC*eCar.capacity + deltaSOCinKWh*j; 				
				opt[i][j].SOC = opt[i][j].SOCinKWh / eCar.capacity;
				opt[i][j].time = eCar.arrivalTime.plus(deltaTime.multipliedBy(i));
				
				// Berechne letzten Zeitschritt
				if (i == timeN-1){
					//counter++;
					opt[i][j].next = null;
					if (opt[i][j].SOC >= eCar.endSOC){
						opt[i][j].cost = 0;
					} else {
						opt[i][j].cost = 1e7 - 1e5*(opt[i][j].SOC - eCar.endSOC);
						// Achtung, die Werte sind hardgecodet, helfen aber eine Lösung zu finden, auch wenn die Nebenbedingung "endSOC" verletzt wird.
					}
				}
				// Berechne die anderen Zeitschritte				
				else {					
					/**
					 * Die Berechnung funktioniert, ist im Moment aber etwas zeitintensiv für große Optimierungen.
					 * Die Klasse OptimizationPoint kann auch geteilt werden, um Speicher zu sparen. 
					 * Man kann das evtl. verbessern, wenn man möchte.
					 */
					
					double minCost = 1e10; // Es werden zunächst extrem hohe Kosten angenommen und dann minimiert
					double deltaSOC; // Delta SOC
					double power;
					double cost;
					
					double ci = 0.0001; // Faktor aus Formel im Paper (beeinfluss die Ladeleistung) 
					
					// hier werden die kosten zu den drauf folgenden Punkten berechnet
					for (int k = 0; k <= socN-1; k++){
						deltaSOC = opt[i+1][k].SOCinKWh - opt[i][j].SOCinKWh;
						//counter++;
						
						power = deltaSOC / efficiency + ci * (deltaSOC*deltaSOC);
						/*
						if (deltaSOC > 0 ){							
							power = deltaSOC / efficiency + 0.00001 * (deltaSOC*deltaSOC);
						} else {
							power = deltaSOC / efficiency + 0.0001 * (deltaSOC*deltaSOC);
						}
						*/
						
						if (power <= maxLoad && power >= minLoad ){
							cost = power * preisarray[i];
							
							// im Vergleich kann auch <= stehen. Damit wird das Verhalten so geändert dass die schnellen Ladezyklen bevorzugt werden!
							if (cost + opt[i+1][k].cost <= minCost){
								minCost = cost + opt[i+1][k].cost;
								opt[i][j].cost = minCost;
								opt[i][j].next = opt[i+1][k];
								opt[i][j].nextPowerDemand = power/loadingFactor;
							}
						}
					}
				}	
			}			
		}
		//System.out.println(counter);
		OptimizationPoint[] result = new OptimizationPoint[timeN];		
		OptimizationPoint point = opt[0][0];		
		
		for (int i = 0; i < result.length; i++) {
			result[i] = point;
			point = point.next;
		}
		
		fahrplan = result;
		
		return fahrplan;
	}
}
