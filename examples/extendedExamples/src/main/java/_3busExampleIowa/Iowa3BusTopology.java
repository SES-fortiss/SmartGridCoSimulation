/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package _3busExampleIowa;

import powerflowApi.LineConfiguration;
import powerflowApi.PowerflowTopology;
import powerflowApi.standardActors.PowerFlowBusActorFactory;
import topology.ActorTopology;
import CIM15.IEC61970.Topology.TopologicalNode;

/**
 * The desired topology. See also 
 * <a href="home.eng.iastate.edu/~jdm/ee553/PowerFlow.doc">
 * home.eng.iastate.edu/~jdm/ee553/PowerFlow.doc</a>
 * example T7.4.
 * 
 * @author denis
 * 
 */
public class Iowa3BusTopology {
	
	public static String simulationName = "3BusIowa";
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		
		// top.addActor("1", NodeFactory.createPVactor("1", 0, 1.000));
		// we do not need to include a swing / slack actor. Slack can
		// be seen as a mathematical necessity to get a solution. 
		
		top.addActor("2", PowerFlowBusActorFactory.createPVactor("2", 0.666, 1.05));
		top.addActor("3", PowerFlowBusActorFactory.createPQactor("3", -2.8653, -1.2244));
		
		PowerflowTopology pfModel = new PowerflowTopology();
		
		TopologicalNode swing = pfModel.CIMmodel.getSWINGNode();		
		TopologicalNode pqNode = pfModel.createPQNode("/user/ActorSupervisor/3");		
		TopologicalNode pvNode = pfModel.createPVNode("/user/ActorSupervisor/2");
		
		// The example 7.4 describes that the shunt elements are capacitors with an admittance
		// of 0.01. However, the admittance matrix represents a total shunt admittance of 0.02.
		// Since each line contributes b_shunt/2 to the admittance value, we need the value 0.02.
		pfModel.connectNodes(swing,  pvNode, new LineConfiguration(0.0, 0.1, 0.02));
		pfModel.connectNodes(pvNode, pqNode, new LineConfiguration(0.0, 0.1, 0.02));
		pfModel.connectNodes(pqNode, swing,  new LineConfiguration(0.0, 0.1, 0.02));
		
		pfModel.autoMap(top);		
		
		return top;
	}
	
} 