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
	
	public static final boolean printErrorStatistic = false;
	public static final boolean unitTestingEnable = false;
	public static final boolean logResults = true;
	
	public static final int rootActorResponseTime = 200000;
	public static final int childrenResponseTime = 200000;

	public static long demoDelay = 0;
	
	public static final boolean showPowerFlowDetails = true;
	public static final boolean exportCIMFile = false;
}
