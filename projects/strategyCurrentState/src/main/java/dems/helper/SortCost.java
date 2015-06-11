/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.helper;

import java.util.Comparator;

/**
 * SortCost
 * 11.06.2014
 * @author bytschkow
 *
 */
public class SortCost implements Comparator<PowerPlantProperties>{

	public int compare(PowerPlantProperties p1, PowerPlantProperties p2) {		
		if ( p1.cost < p2.cost){
			return -1;
		}
		
		if ( p1.cost > p2.cost){
			return 1;
		}
		
		return 0;
	}
	
}
