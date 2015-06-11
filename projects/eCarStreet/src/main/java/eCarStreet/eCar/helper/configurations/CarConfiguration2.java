/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.eCar.helper.configurations;

import java.time.LocalTime;

import eCarStreet.eCar.ECar;

public class CarConfiguration2 extends ECar {

	public CarConfiguration2() {
		super.capacity = 20;
		super.arrivalTime = LocalTime.of(18,15);
		super.leavingTime = LocalTime.of(7,15);
		super.startSOC = 0.25;
		super.endSOC = 0.9; 
	}

}
