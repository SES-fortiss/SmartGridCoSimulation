/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package powerflowApi;

import org.junit.Assert;
import org.junit.Test;

public class ThreePhaseLineConfigurationTest {

	ThreePhaseLineConfiguration line = new ThreePhaseLineConfiguration();	
	
	@Test
	public void testInits(){

		double a = 15;
		double b = 150; 
		double c = 1111;
		
		line.setR1(a, b, c);
		line.setR2(b, c, a);
		line.setR3(c, a, b);
		
		double[] result;
						
		result = line.getR1();
		Assert.assertEquals(a, result[0], 0.1);
		Assert.assertEquals(b, result[1], 0.1);
		Assert.assertEquals(c, result[2], 0.1);
		
		result = line.getR2();
		Assert.assertEquals(b, result[0], 0.1);
		Assert.assertEquals(c, result[1], 0.1);
		Assert.assertEquals(a, result[2], 0.1);		
		
		result = line.getR3();
		Assert.assertEquals(c, result[0], 0.1);
		Assert.assertEquals(a, result[1], 0.1);
		Assert.assertEquals(b, result[2], 0.1);
	}
	
	@Test
	public void testScale() {
		
		double a = 1;
		double b = 2; 
		double c = 3;
						
		line.setNormR1(a, b, c);
		line.setNormR2(b, c, a);
		line.setNormR3(c, a, b);
		
		line.setLength(500);
		
		line.setR1(a, b, c);
		line.setLength(1000);
		
		double[] result; 
				
		result = line.getR1();
		Assert.assertEquals(a*2, result[0], 0.1);
		Assert.assertEquals(b*2, result[1], 0.1);
		Assert.assertEquals(c*2, result[2], 0.1);
		
		result = line.getR2();
		Assert.assertEquals(b, result[0], 0.1);
		Assert.assertEquals(c, result[1], 0.1);
		Assert.assertEquals(a, result[2], 0.1);		
		
		result = line.getR3();
		Assert.assertEquals(c, result[0], 0.1);
		Assert.assertEquals(a, result[1], 0.1);
		Assert.assertEquals(b, result[2], 0.1);		
		
		line.setNormX1(a, b, c);
		line.setNormX2(b, c, a);
		line.setNormX3(c, a, b);		
		
		result = line.getX1();
		Assert.assertEquals(a, result[0], 0.1);
		Assert.assertEquals(b, result[1], 0.1);
		Assert.assertEquals(c, result[2], 0.1);
		
		result = line.getX2();
		Assert.assertEquals(b, result[0], 0.1);
		Assert.assertEquals(c, result[1], 0.1);
		Assert.assertEquals(a, result[2], 0.1);		
		
		result = line.getX3();
		Assert.assertEquals(c, result[0], 0.1);
		Assert.assertEquals(a, result[1], 0.1);
		Assert.assertEquals(b, result[2], 0.1);
		
		line.setNormB1(a, b, c);
		line.setNormB2(b, c, a);
		line.setNormB3(c, a, b);
		
		result = line.getB1();
		Assert.assertEquals(a, result[0], 0.1);
		Assert.assertEquals(b, result[1], 0.1);
		Assert.assertEquals(c, result[2], 0.1);
		
		result = line.getB2();
		Assert.assertEquals(b, result[0], 0.1);
		Assert.assertEquals(c, result[1], 0.1);
		Assert.assertEquals(a, result[2], 0.1);		
		
		result = line.getB3();
		Assert.assertEquals(c, result[0], 0.1);
		Assert.assertEquals(a, result[1], 0.1);
		Assert.assertEquals(b, result[2], 0.1);
		
		
		//fail("Not yet implemented");
	}	

}
