/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package configuration;

public abstract class GridArchitectConfiguration {
	
	// configuration for the module of error handling by Luc --> MultiCommunication
	public static boolean errorHandlerActive = false;
	public static boolean printErrorStatistic = false;
	public static boolean unitTestingEnable = false;
	public static boolean logResults = false;
	
	// Configuration of the time for a response
	public static int rootActorResponseTime = 600000;
	public static int childrenResponseTime = 600000;

	// Delay if the simulation is to quick 
	public static long demoDelay = 0;	
	
	// PowerFlowDetails
	public static boolean showPowerFlowDetails = true;
	public static boolean exportCIMFile = false;
}
