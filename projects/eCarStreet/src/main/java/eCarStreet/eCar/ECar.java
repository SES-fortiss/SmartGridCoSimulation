/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar;

import java.time.LocalDateTime;
import java.time.LocalTime;

import akka.systemActors.GlobalTime;
import eCarStreet.eCar.helper.decisions.Decision;

public class ECar {
	
	// Parameter der Batterie - default Werte
	public double capacity = 10;// in kWh
	public double maxSOC = 1;	// 100%
	public double minSOC = 0;	// 0%
	
	public double startSOC = 0.3;
	public double endSOC = 0.9;
	
	private double SOC = startSOC;	// aktueller Zustand - State of Charge
	
	public double getSOC(){
		return SOC;
	}
	
	public void setSOC(double value){
		this.SOC = value;
	}
		
	public LocalTime arrivalTime = LocalTime.of(18, 0); // default value
	public LocalTime leavingTime = LocalTime.of(7,0); // default value
	
	public Decision decision;	
	
	// Maximale Ladegeschwindigkeit in KW (default = normalle Steckdose)
	public double maxChargingSpeed = 3.5;	
	// Maximale Entladegeschwindigkeit in KW (default = normalle Steckdose)	
	public double maxDischargingSpeed = -3.5;
	
	public double getDemandAndCharge(LocalDateTime time){		
		return decision.getDemand(this, time);
	}

	/**
	 * @param carLoad
	 */
	public void setPower(double carLoad) {		
		double socKWH = SOC * capacity;
		socKWH += carLoad * GlobalTime.period.getSeconds() / 3600; 
		SOC = socKWH / capacity;		
	}

}
