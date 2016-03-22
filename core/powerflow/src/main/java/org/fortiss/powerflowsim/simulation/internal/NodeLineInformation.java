/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.internal;

import org.jblas.ComplexDouble;

import CIM15.IEC61970.Topology.TopologicalNode;

/**
 * @author murphy
 *
 */
public class NodeLineInformation {

	public ComplexDouble power;
	public double realLosses;
	public TopologicalNode connectedNode;

	public NodeLineInformation(ComplexDouble power, double losses, TopologicalNode connectedNode) {
		this.power = power;	
		this.realLosses = losses;
		this.connectedNode = connectedNode;
	}

	public String toString() {		
		
		String imagA = (power.imag() > 0.0) ? "+"+String.format("%.3f", power.imag()) : String.format("%.3f", power.imag());		
		String result = String.format("%.3f", power.real()) +" "+ imagA + "i "+
				"connected to " + connectedNode.getMRID();
		
		return result;
	}
}
