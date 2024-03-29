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
import java.time.LocalDateTime;

import eCarStreet.eCar.ECar;

public interface Decision {
	
	public double getDemand(ECar eCar, LocalDateTime time, Duration period); 
}
