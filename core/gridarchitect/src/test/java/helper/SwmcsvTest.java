/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package helper;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.Test;

public class SwmcsvTest {

	@Test
	public void getSWMProfileSolarTest() {
		System.out.println("*** getSWMProfileSolarTest()");
		double bevor = Swmcsv.getSWMProfileSolar(LocalDateTime.of(2013,8,1,12,0));
		System.out.println(bevor);
		double dannach = Swmcsv.getSWMProfileSolar(LocalDateTime.of(2013,8,1,12,15));
		System.out.println(dannach);
		double dazwischen = Swmcsv.getSWMProfileSolar(LocalDateTime.of(2013,8,1,12,3));
		System.out.println(dazwischen);		
	}
	
	@Test
	public void simpleOutPutTest(){
		Swmcsv.readFiles();
		System.out.println("*** simpleOutPutTest()");
		System.out.println("SimpleOutput: WaterProfile = " + Arrays.toString(Swmcsv.waterProfile));
		System.out.println("SimpleOutput: WaterProfile[0] = " + Swmcsv.getSWMProfileWater(1));
	}
	
	@Test
	public void timeInputWinterTest(){
		System.out.println("*** timeInputWinterTest()");
		LocalDateTime time = LocalDateTime.of(2013, 1, 13, 0, 0);
		System.out.println("timeInput: SolarProfile at 13.01.2013 00:00 = " + Swmcsv.getSWMProfileSolar(time));
		
		time = LocalDateTime.of(2013, 1, 13, 0, 1);
		System.out.println("timeInput: SolarProfile at 13.01.2013 00:01 = " + Swmcsv.getSWMProfileSolar(time));
		
		time = LocalDateTime.of(2013, 1, 13, 0, 35);
		System.out.println("timeInput: SolarProfile at 13.01.2013 00:35 = " + Swmcsv.getSWMProfileSolar(time));		
	}
	
	@Test
	public void timeInputWinterTest2(){
		System.out.println("*** timeInputWinterTest2()");
		LocalDateTime time = LocalDateTime.of(2013, 1, 13, 0, 0);
		System.out.println("timeInput: WaterProfile at 13.01.2013 00:00 = " + Swmcsv.getSWMProfileWater(time));
		
		time = LocalDateTime.of(2013, 1, 13, 0, 1);
		System.out.println("timeInput: WaterProfile at 13.01.2013 00:01 = " + Swmcsv.getSWMProfileWater(time));
		
		time = LocalDateTime.of(2013, 1, 13, 0, 35);
		System.out.println("timeInput: WaterProfile at 13.01.2013 00:35 = " + Swmcsv.getSWMProfileWater(time));		
	}
	
	@Test
	public void timeInputSommerTest(){
		System.out.println("*** timeInputSommerTest()");
		LocalDateTime time = LocalDateTime.of(2013, 8, 1, 0, 0);
		System.out.println("timeInput: WaterProfile at 01.08.2013 00:00 = " + Swmcsv.getSWMProfileWater(time));
	}
}
