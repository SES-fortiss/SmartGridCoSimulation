/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper.standardLastProfil;

import java.time.LocalDateTime;

import org.junit.Test;

public class StandardLastProfilTest {

	@Test
	public void testReadings() {		
		System.out.println();
		System.out.println("testReadings");
		System.out.println(StandardLastProfil.getH0Demand(5000, LocalDateTime.now()));
	}
	
	@Test
	public void testSeason(){
		System.out.println();
		System.out.println("testSeasons");
		System.out.println(StandardLastProfil.getH0Demand(5000, LocalDateTime.of(2015, 1, 1, 1, 0)));
		System.out.println(StandardLastProfil.getH0Demand(5000, LocalDateTime.of(2015, 4, 1, 1, 0)));
		System.out.println(StandardLastProfil.getH0Demand(5000, LocalDateTime.of(2015, 8, 1, 1, 0)));
		System.out.println(StandardLastProfil.getH0Demand(5000, LocalDateTime.of(2015, 11, 1, 1, 0)));
	}
	
	@Test
	public void testInterpolation(){
		System.out.println();
		System.out.println("testInterpolation");
		System.out.println(StandardLastProfil.getH0Demand(5000, LocalDateTime.of(2015, 11, 1, 1, 0)));
		System.out.println(StandardLastProfil.getH0Demand(5000, LocalDateTime.of(2015, 11, 1, 1, 15)));
		System.out.println(StandardLastProfil.getH0DemandInterpolated(5000, LocalDateTime.of(2015, 11, 1, 1, 7)));
		System.out.println(StandardLastProfil.getH0DemandInterpolated(5000, LocalDateTime.of(2015, 11, 1, 1, 15)));
	}

}
