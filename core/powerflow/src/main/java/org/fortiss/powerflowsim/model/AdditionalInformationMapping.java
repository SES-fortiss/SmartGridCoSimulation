/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution. 
 */

package org.fortiss.powerflowsim.model;

import java.util.HashMap;

import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Wires.ACLineSegment;

/**
 * In this class we put everything, that was not found to be part of the CIM model.
 * Current examples are that we are not completely sure how to model bus shunts.
 * Another example is that are not completely sure how to model transformers.
 * 
 * It might be the case, that we missed something. In that case we need to adapt our solution.
 * 
 * @author denis
 *
 */
public class AdditionalInformationMapping {
	
	public static HashMap<TopologicalNode, ExtendedTopologyInformation> nodeETI_HashMap = new HashMap<TopologicalNode, ExtendedTopologyInformation>();
	public static HashMap<ACLineSegment, ExtendedTopologyInformation> lineETI_HashMap = new HashMap<ACLineSegment, ExtendedTopologyInformation>();

}
