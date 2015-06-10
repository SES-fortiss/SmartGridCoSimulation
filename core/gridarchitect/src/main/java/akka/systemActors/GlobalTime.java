/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akka.systemActors;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * GlobalTime
 * 04.06.2014
 * @author bytschkow
 *
 */
public class GlobalTime {
	/*
	public static LocalDateTime currentTime = null;
	public static Duration period = null;
	public static int currentTimeStep = -1;
	public static int lastTimeStep = -1;
	public static LocalDateTime nextTime = null;	
	*/
	
	public static LocalDateTime currentTime;
	public static Duration period;
	public static int currentTimeStep;
	public static int lastTimeStep;
	public static LocalDateTime nextTime;
	public static LocalDate demoDate = LocalDate.of(2013, 8, 1);
	
	public static void init()
	{
		currentTime = null;
		period = null;
		currentTimeStep = 0;
		lastTimeStep = 1;
		nextTime = null;

	}

	public static int getCurrentTimeStep() {
		return currentTimeStep;
	}
}
