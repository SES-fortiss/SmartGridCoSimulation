/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package tests;

import java.util.Random;

import org.junit.Test;

public class testRandom {
	
	
	@Test
	public void testRandomGaussian(){
		Random r = new Random();
		double x = 0;
		for (int i = 0; i<10000000; i++) {
			double y = r.nextGaussian();
			x = (y<x) ? y : x;
		}
		System.out.println(x);
	}
	
	@Test
	public void testRandomInt(){
		Random r = new Random();
		int x = 0;
		for (int i = 0; i<10000000; i++) {
			int y = r.nextInt();
			x = (y<x) ? y : x;
		}
		System.out.println(x);
	}
	
	@Test
	public void testRandomDouble(){
		Random r = new Random();
		double x = 0;
		for (int i = 0; i<10000000; i++) {
			double y = r.nextDouble();
			x = (y<x) ? y : x;
		}
		System.out.println(x);
		
	}
	
	@Test
	public void testMathRandom(){
		double x = 0;
		for (int i = 0; i<10000000; i++) {
			double y = Math.random();
			x = (y<x) ? y : x;
		}
		System.out.println(x);
		
	}
}
