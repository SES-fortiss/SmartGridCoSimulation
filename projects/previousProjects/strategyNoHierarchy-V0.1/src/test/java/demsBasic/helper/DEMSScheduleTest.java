/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package demsBasic.helper;

import java.time.LocalDateTime;

import org.junit.Test;

import dems.helper.DEMSSchedule;

/**
 * DEMSSchedule
 * 10.06.2014
 * @author bytschkow
 *
 */
public class DEMSScheduleTest {
	
	@Test
	public void getSchedule(){
		System.out.println(DEMSSchedule.getSchedule( LocalDateTime.of(2013, 01, 8, 0, 0)));
		System.out.println(DEMSSchedule.getSchedule( LocalDateTime.of(2013, 01, 13, 0, 0)));
		System.out.println(DEMSSchedule.getSchedule( LocalDateTime.of(2013, 01, 13, 1, 0)));
		System.out.println(DEMSSchedule.getSchedule( LocalDateTime.of(2013, 01, 14, 0, 0)));
		System.out.println(DEMSSchedule.getSchedule( LocalDateTime.of(2013, 01, 18, 0, 0)));
	}
}

