/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim;

import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.PowerTransformerEnd;

/**
 * Contains all constants used in powerflowsim
 * 
 * @author Martin Zellner
 * 
 */
public abstract class Properties {
	@SuppressWarnings("rawtypes")
	public static Class[] primaryEquipmentClasses = { PowerTransformerEnd.class, EnergySource.class, EnergyConsumer.class, ACLineSegment.class };
	public static double solverTolerance = 1.0e-7;
	public static int solverMaxIterations = 10;
	
	// change between "gridlab" and "internal", used only in the PowerFlowSim.class
	public static String solverEngine = "internal";
}
