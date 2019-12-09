/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.helper;

import dems.behaviorType.StrategyBehaviorType;

/**
 * PlantProperties
 * 10.06.2014
 * @author bytschkow
 *
 */
public class PowerPlantProperties {
	
	public String id;
	public double installedPower;
	public double cost;
	public double expectedProduction;
	public boolean upControl;
	public boolean downControl;
	public int rampRate;
	
	public PowerPlantProperties(String id, double installedPower, double cost, double expectedProduction, StrategyBehaviorType type){
		this.id = id;
		this.installedPower = installedPower;
		this.cost = cost;
		this.expectedProduction = expectedProduction;
		this.upControl = type.upControl;
		this.downControl = type.downControl;	
		this.rampRate = type.rampRate;
	}
	
}
