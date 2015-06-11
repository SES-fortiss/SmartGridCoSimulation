/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ieee13BusExample;

import CIM15.IEC61970.Topology.TopologicalNode;
import powerflowApi.LineConfiguration;
import powerflowApi.PowerflowModel;
import topology.ActorTopology;

public class Topology {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "Grid-for-solver-simulation";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		
		// Components
		top.addActor("Node2", BehaviorFactory.createActor("Node2", 0, 0));
		top.addActor("Node3", BehaviorFactory.createActor("Node3", 3000, 0));
		top.addActor("Node4", BehaviorFactory.createActor("Node4", 9000, 0));
		top.addActor("Node5", BehaviorFactory.createActor("Node5", 0,0));
		top.addActor("Node6", BehaviorFactory.createActor("Node6", 0,0));
		top.addActor("Node7", BehaviorFactory.createActor("Node7", 0,-200)); // maybe 200.000
		top.addActor("Node8", BehaviorFactory.createActor("Node8", 200,0));
		top.addActor("Node9", BehaviorFactory.createActor("Node9", 9000,0));
		top.addActor("Node10", BehaviorFactory.createActor("Node10", 0,0));
		top.addActor("Node11", BehaviorFactory.createActor("Node11", 0, -100)); // maybe 100.000
		top.addActor("Node12", BehaviorFactory.createActor("Node12", 2000,0));
		top.addActor("Node13", BehaviorFactory.createActor("Node13", 5000,0));		
		
		PowerflowModel pfModel = new PowerflowModel();

		TopologicalNode swing = pfModel.CIMmodel.getSWINGNode();
		TopologicalNode node4 = pfModel.createNode("/user/ActorSupervisor/Node4");
		pfModel.connectNodes(swing, node4, new LineConfiguration(0.1292, 0.391510));
		
		TopologicalNode node3 = pfModel.createNode("/user/ActorSupervisor/Node3");
		pfModel.connectNodes(node4, node3, new LineConfiguration(0.1255, 0.1280));
		
		TopologicalNode node2 = pfModel.createNode("/user/ActorSupervisor/Node2");
		pfModel.connectNodes(node3, node2, new LineConfiguration(0.0753, 0.0768));
		
		TopologicalNode node5 = pfModel.createNode("/user/ActorSupervisor/Node5");
		pfModel.connectNodes(node4, node5, new LineConfiguration(0.0708, 0.1132));
		// There is a transformer between node6 and node5
		TopologicalNode node6 = pfModel.createNode("/user/ActorSupervisor/Node6");
		pfModel.connectNodes(node5, node6, new LineConfiguration(0.01, 0.03));
		TopologicalNode node9 = pfModel.createNode("/user/ActorSupervisor/Node9");
		pfModel.connectNodes(node4, node9, new LineConfiguration(0.1292, 0.3915));
		
		
		TopologicalNode node10 = pfModel.createNode("/user/ActorSupervisor/Node10");
		pfModel.connectNodes(node9, node10, new LineConfiguration(0.00001, 0.00001));
		
		
		TopologicalNode node11 = pfModel.createNode("/user/ActorSupervisor/Node11");
		pfModel.connectNodes(node10, node11, new LineConfiguration(0.0753, 0.0409));
		TopologicalNode node8 = pfModel.createNode("/user/ActorSupervisor/Node8");
		pfModel.connectNodes(node9, node8, new LineConfiguration(0.0753, 0.0768));
		TopologicalNode node7 = pfModel.createNode("/user/ActorSupervisor/Node7");
		pfModel.connectNodes(node8, node7, new LineConfiguration(0.0755, 0.0766));
		TopologicalNode node12 = pfModel.createNode("/user/ActorSupervisor/Node12");
		pfModel.connectNodes(node8, node12, new LineConfiguration(0.2034, 0.0776));
		TopologicalNode node13 = pfModel.createNode("/user/ActorSupervisor/Node13");
		pfModel.connectNodes(node9, node13, new LineConfiguration(0.0646, 0.1957));
		
		pfModel.connectNodes(node2, node10);
		
		pfModel.autoMap(top);		
		
		System.out.println(pfModel.CIMmodel);
		
		return top;
	}
	
} 