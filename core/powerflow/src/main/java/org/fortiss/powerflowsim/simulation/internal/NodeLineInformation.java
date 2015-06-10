/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.internal;

import CIM15.IEC61970.Topology.TopologicalNode;

/**
 * @author murphy
 *
 */
public class NodeLineInformation {

	public double power;
	public TopologicalNode connectedNode;

	public NodeLineInformation(double power, TopologicalNode connectedNode) {
		this.power = power;
		this.connectedNode = connectedNode;
	}

	public String toString() {
		String result = String.format("%.3f", power) + " to " + connectedNode.getMRID();
		return result;
	}
}
