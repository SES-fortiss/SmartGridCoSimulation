/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package powerflowApi;

import org.fortiss.powerflowsim.model.ModelUtils;

import CIM15.IEC61970.Topology.TopologicalNode;

/**
 * This class intends to facilitate to construct a PowerflowModel that is
 * arranged as a ring.
 * 
 * @author Denis Bytschkow
 *
 */
public class RingPowerflowModel extends PowerflowModel{
	
	private TopologicalNode lastNodeLeft;
	private TopologicalNode lastNodeRight;
	
	public RingPowerflowModel(){
		super();
		lastNodeLeft = super.getLastNode();
		lastNodeRight = super.getLastNode();
	}	

	public void addLeft(String actorName) {
		TopologicalNode newNode = createNode(actorName);
		ModelUtils.createDefaultLine(CIMmodel, lastNodeLeft, newNode);
		lastNodeLeft = newNode;
	}
	
	public void addRight(String actorName) {		
		TopologicalNode newNode = createNode(actorName);
		ModelUtils.createDefaultLine(CIMmodel, lastNodeRight, newNode);
		lastNodeRight = newNode;
	}

	/**
	 * This method is experimental, as it has to be tested how this method behaves.
	 * TODO test
	 * @param actorName
	 */
	public void addBelow(String actorName) {
		TopologicalNode newNode = createNode(actorName);
		ModelUtils.createDefaultLine(CIMmodel, lastNodeRight, newNode);
		lastNodeRight = newNode;
		lastNodeLeft = newNode;
	}

	public void closeRing() {
		ModelUtils.createDefaultLine(CIMmodel, lastNodeRight, lastNodeLeft);
		System.out.println("Ring created");
	}	
}
