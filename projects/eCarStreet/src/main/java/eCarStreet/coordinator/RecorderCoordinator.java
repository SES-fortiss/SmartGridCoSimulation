/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.coordinator;

import helper.FileRecorderGridarchitect;
import behavior.BehaviorModel;

public class RecorderCoordinator extends FileRecorderGridarchitect {
	
	public RecorderCoordinator(BehaviorModel behaviorModel){
		this.model = behaviorModel;
		this.header = "Time, DemandTotal, DemandECars, DemandHouses";
	}
}
