/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package tests;

import java.time.LocalDateTime;

import org.junit.Test;

public class test {

	
	@SuppressWarnings("unused")
	@Test
	public void test1(){
		boolean result;
		
		LocalDateTime time = LocalDateTime.of(2013,1,8,1,0);
		result = time.isBefore(LocalDateTime.of(2013,1,8,1,0));						
		
		System.out.println(result);
		
		result = true || (false && true);
		
		System.out.println(result);
		
	}
}
