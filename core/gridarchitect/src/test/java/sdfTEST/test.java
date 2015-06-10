/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package sdfTEST;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Test;


/**
 * test
 * 04.06.2014
 * @author bytschkow
 *
 */
public class test {
	
	@Test
	public void sdfTEST(){
				
		
		LocalTime lt = LocalTime.now();
		System.out.println( lt );
		
		LocalDate ld = LocalDate.now();
		System.out.println( ld );
		
		LocalDateTime ldt = LocalDateTime.of(2013, 01, 15 , 16, 30, 31);
		System.out.println(ldt);
		
		ldt = ldt.plusMinutes(1);
		System.out.println(ldt);
		
	
		LocalDateTime startTime = LocalDateTime.of(2014,1,1,0,0);
		LocalDateTime endTime = LocalDateTime.of(2014,1,2,0,0);
		Duration timeInterval = Duration.ofMinutes(15);
		long timeSteps = Duration.between(startTime, endTime).toMillis() / timeInterval.toMillis();
		System.out.println(timeSteps);
		
	}
	
	@Test
	public void test2(){
		System.out.println(-97%96);
		
	}

}
