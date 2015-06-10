/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.gridlabd;

/**
 * a timestep for the simulation
 * 
 * @author Martin Zellner
 * 
 */
public class Timestep {
	private String startDate = "2000-01-01 00:01:00";
	private String stopDate = "2000-01-01 00:02:00";
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getStopDate() {
		return stopDate;
	}
	
	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}
	
}
