/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim.simulation.internal;

import java.util.ArrayList;

import org.fortiss.powerflowsim.model.AdditionalInformationMapping;

import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Wires.ACLineSegment;

/**
 * This class contains the information of a Node such as connected lines and
 * their power.
 * 
 * @author murphy
 *
 */
public class NodeInformation {

	public Integer nodeNumber;
	public TopologicalNode node;
	public String nodeName;
	

	public ArrayList<Integer> lineIndices = new ArrayList<Integer>();
	public ArrayList<ACLineSegment> lineCIMObjects = new ArrayList<ACLineSegment>();
	private ArrayList<NodeLineInformation> lines = new ArrayList<NodeLineInformation>();

	private double voltageMagnitude;
	private double voltageAngle; 

	/**
	 * @param node
	 */
	public NodeInformation(TopologicalNode node, Integer index) {
		this.node = node;
		this.nodeName = node.getMRID();
		this.nodeNumber = index;
	}
	
	public void setVoltage(double voltage, double angle){
		this.voltageMagnitude = voltage;
		this.voltageAngle = angle;
	}	
	
	public void addLine(NodeLineInformation line){
		this.lines.add(line);
	}

	public ArrayList<Integer> getPowerLineIndices() {
		return lineIndices;
	}

	public void addLine(int index, ACLineSegment line) {
		lineIndices.add(index);
		lineCIMObjects.add(line);
	}

	public String toString() {
		String result =
				"NodeInformation of node: " + this.nodeName;
		
		if (AdditionalInformationMapping.nodeETI_HashMap.containsKey(node)) {
			result += " be carefull with q, node has bus shunt susceptance";
		}
		
		result += "\n";
		
		result += "Voltage: " + String.format("%.3f",this.voltageMagnitude) + " ("+  String.format("%.2f",this.voltageAngle)  +"°)\n";
		result += "PowerInjection: " + 
				String.format("%.3f", this.node.getSvInjection().getPNetInjection()) + " + "+
				String.format("%.3f",this.node.getSvInjection().getQNetInjection())+ "i\n";

		for (int i = 0; i < lines.size(); i++) {
			result += "Line" + i + " power: "+lines.get(i) + "\n";
		}

		return result;
	}
}
