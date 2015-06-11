/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.behaviorType;

import behavior.BehaviorType;

public enum StrategyBehaviorType implements BehaviorType {
	
	SOLAR (true, false, 1000),
	WATER (true, false, 10),
	BIOGAS (true, true, 5),
	BIOMASS (true, true, 1),	
	WIND (true, false, 1000), 
	TRADING (true, false, 1000);
	
	public boolean upControl;
	public boolean downControl;
	public int rampRate;
	
	/**
	 * 
	 * @param down defines if the component can be controlled to reduce its power
	 * @param up defines it the component can be controlled to increase its power
	 * @param rampRate defines what rate per minute can be changed. A high number 
	 * means a quick change possible.
	 */
	private StrategyBehaviorType(boolean down, boolean up, int rampRate){
		this.downControl = down;
		this.upControl = up;
		this.rampRate = rampRate;
	}
}
