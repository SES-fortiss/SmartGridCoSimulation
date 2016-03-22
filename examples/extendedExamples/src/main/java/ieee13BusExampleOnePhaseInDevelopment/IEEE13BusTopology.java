/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ieee13BusExampleOnePhaseInDevelopment;

import powerflowApi.LineConfiguration;
import powerflowApi.PowerflowTopology;
import topology.ActorTopology;
import CIM15.IEC61970.Topology.TopologicalNode;

public class IEEE13BusTopology {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "IEEE13Bus";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		
		// Components
		top.addActor("650", NodeBehaviorFactory.createNode("650", 0, 0));
		top.addActor("645", NodeBehaviorFactory.createNode("645", 170, 125));
		top.addActor("646", NodeBehaviorFactory.createNode("646", 230, 132));
		top.addActor("632", NodeBehaviorFactory.createNode("632", 0, 0));  
		top.addActor("633", NodeBehaviorFactory.createNode("633", 0, 0));
		top.addActor("634", NodeBehaviorFactory.createNode("634", 160+120+120,110+90+90)); 
		top.addActor("611", NodeBehaviorFactory.createNode("611", 170, 80));
		top.addActor("684", NodeBehaviorFactory.createNode("684", 0, 0));
		top.addActor("671", NodeBehaviorFactory.createNode("671", 3*385,3*220));
		top.addActor("692", NodeBehaviorFactory.createNode("692", 170,151));
		top.addActor("675", NodeBehaviorFactory.createNode("675", 485+68+290,190+60+212));
		top.addActor("652", NodeBehaviorFactory.createNode("652", 128,86));		
		top.addActor("680", NodeBehaviorFactory.createNode("680", 0,0));
		top.addActor("632to671", NodeBehaviorFactory.createNode("632to671", 17+66+117,10+38+68)); // this shall be distributed load
		
		PowerflowTopology pfModel = new PowerflowTopology();

		TopologicalNode swing = pfModel.CIMmodel.getSWINGNode();
		TopologicalNode node650 = pfModel.createPQNode("/user/ActorSupervisor/650");
		pfModel.connectNodes(swing, node650, new LineConfiguration(0.00001, 0.00001));
		
		TopologicalNode node632 = pfModel.createPQNode("/user/ActorSupervisor/632");
		pfModel.connectNodes(node650, node632, new LineConfiguration(0.1255, 0.1280));
		
		TopologicalNode node633 = pfModel.createPQNode("/user/ActorSupervisor/633");
		pfModel.connectNodes(node632, node633, new LineConfiguration(0.01, 0.03));

		TopologicalNode node634 = pfModel.createPQNode("/user/ActorSupervisor/634");
		pfModel.connectNodes(node633, node634, new LineConfiguration(0.1292, 0.3915));
		
		TopologicalNode node645 = pfModel.createPQNode("/user/ActorSupervisor/645");
		pfModel.connectNodes(node632, node645, new LineConfiguration(0.0753, 0.0768));
		
		TopologicalNode node646 = pfModel.createPQNode("/user/ActorSupervisor/646");
		pfModel.connectNodes(node645, node646, new LineConfiguration(0.0708, 0.1132));		
		
		TopologicalNode node632to671 = pfModel.createPQNode("/user/ActorSupervisor/632to671");
		pfModel.connectNodes(node632, node632to671, new LineConfiguration(0.00001, 0.00001));
		
		TopologicalNode node671 = pfModel.createPQNode("/user/ActorSupervisor/671");
		pfModel.connectNodes(node632to671, node671, new LineConfiguration(0.00001, 0.00001));		
		
		TopologicalNode node684 = pfModel.createPQNode("/user/ActorSupervisor/684");
		pfModel.connectNodes(node671, node684, new LineConfiguration(0.0753, 0.0409));
		
		TopologicalNode node611 = pfModel.createPQNode("/user/ActorSupervisor/611");
		pfModel.connectNodes(node684, node611, new LineConfiguration(0.0753, 0.0768));
		
		TopologicalNode node652 = pfModel.createPQNode("/user/ActorSupervisor/652");
		pfModel.connectNodes(node684, node652, new LineConfiguration(0.0755, 0.0766));
		
		TopologicalNode node680 = pfModel.createPQNode("/user/ActorSupervisor/680");
		pfModel.connectNodes(node671, node680, new LineConfiguration(0.2034, 0.0776));
		
		TopologicalNode node692 = pfModel.createPQNode("/user/ActorSupervisor/692");
		pfModel.connectNodes(node671, node692, new LineConfiguration(0.0646, 0.1957));
		
		TopologicalNode node675 = pfModel.createPQNode("/user/ActorSupervisor/675");
		pfModel.connectNodes(node692, node675, new LineConfiguration(0.1, 0.1));
		
		pfModel.autoMap(top);		
		
		System.out.println(pfModel.CIMmodel);
		
		return top;
	}
	
} 