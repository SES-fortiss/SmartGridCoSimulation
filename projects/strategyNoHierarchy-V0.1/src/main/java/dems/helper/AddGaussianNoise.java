/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.helper;

import java.util.Random;

public class AddGaussianNoise {
	
	public static double getNoise(double sigma){
		
		Random r = new Random();
		double result = 1.0 + r.nextGaussian()*sigma;
		//System.out.println(result);
		return result;
	}

}
