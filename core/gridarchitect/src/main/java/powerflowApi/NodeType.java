/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package powerflowApi;

public enum NodeType {	
	PQ, // Load, i.e. active power P and reactive power Q are given, voltage and angle are unregulated
	PV, // Generation, i.e. active power P and voltage V are given, Q and angle are unregulated
	Slack // Hold voltage and angle, power P and Q are unregulated
}
