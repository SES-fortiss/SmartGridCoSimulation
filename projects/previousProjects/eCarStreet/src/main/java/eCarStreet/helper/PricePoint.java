/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package eCarStreet.helper;

import java.time.LocalTime;

public class PricePoint {
	
	public LocalTime localTime;
	public double price;

	public PricePoint(LocalTime localTime, double price){
		this.localTime = localTime;
		this.price = price;		
	}
	
}
