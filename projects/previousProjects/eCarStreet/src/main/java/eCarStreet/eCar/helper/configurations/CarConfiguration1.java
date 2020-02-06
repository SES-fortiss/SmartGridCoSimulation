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

public class CarConfiguration1 extends ECar {

	public CarConfiguration1() {
		super.capacity = 10;
		super.arrivalTime = LocalTime.of(18,00);
		super.leavingTime = LocalTime.of(7,00);
		super.startSOC = 0.3;
		super.endSOC = 1.0;
	}

}
