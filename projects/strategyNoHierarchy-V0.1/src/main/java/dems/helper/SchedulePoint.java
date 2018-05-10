/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package dems.helper;

import java.time.LocalDateTime;

public class SchedulePoint {
	
	public LocalDateTime time;
	public double schedule;
	
	public SchedulePoint(LocalDateTime t, double s){
		this.time = t;
		this.schedule = s;
	}
	
	public String toString(){
		return "Time:" + time + " Schedule:" + schedule;
	}
}
