/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package play;

import org.junit.Test;

public class NewtonRapson {

	@Test
	public void testingSquareRoot(String [] args ){
		double zahl = 100;
		
		double ergebnis = 1;
		double fehlerwert = 1e-10;
		
		int counter = 0;
		
		while ( Math.abs(ergebnis - (zahl / ergebnis)) > fehlerwert){
			ergebnis = 0.5 * (ergebnis + zahl / ergebnis) ;
			counter++;
			System.out.println(counter + ": " + ergebnis);
		}		
	}
	
}
