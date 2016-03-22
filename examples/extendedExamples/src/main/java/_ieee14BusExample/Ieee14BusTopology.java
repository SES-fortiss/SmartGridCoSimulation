/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package _ieee14BusExample;

import org.fortiss.powerflowsim.model.AdditionalInformationMapping;
import org.fortiss.powerflowsim.model.ExtendedTopologyInformation;

import powerflowApi.LineConfiguration;
import powerflowApi.LineConfigurationWithTransformer;
import powerflowApi.PowerflowTopology;
import powerflowApi.standardActors.PowerFlowBusActorFactory;
import topology.ActorTopology;
import CIM15.IEC61970.Topology.TopologicalNode;

public class Ieee14BusTopology {
	
	public static String simulationName = "IEEE14Bus";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		
		// the factor is required due to the 100 MVAR baseline
		double factor = 0.01;
		
		// This will be the slack node, i.e. angle shall be fixed to 0.0 and voltage to 1.060
		//top.addActor("1", NodeFactory.createPVactor("1", 0, 1.060));
		
		// PV nodes, i.e. power and voltage need to be set.
		top.addActor("2", PowerFlowBusActorFactory.createPVactor("2", (40-21.7)*factor, 1.045)); 	 
		top.addActor("3", PowerFlowBusActorFactory.createPVactor("3", -94.2*factor, 1.010));
		top.addActor("6", PowerFlowBusActorFactory.createPVactor("6", -11.2*factor, 1.070));
		top.addActor("8", PowerFlowBusActorFactory.createPVactor("8", 0, 1.090));
				
		// PQ nodes, i.e. active and reactive power need to be set.
		top.addActor("4", PowerFlowBusActorFactory.createPQactor("4", -47.8*factor, 3.9*factor));		
		top.addActor("5", PowerFlowBusActorFactory.createPQactor("5", -7.6*factor, -1.6*factor)); 
		top.addActor("7", PowerFlowBusActorFactory.createPQactor("7", 0, 0));
		top.addActor("9", PowerFlowBusActorFactory.createPQactor("9", -29.5*factor, -16.6*factor));
		top.addActor("10", PowerFlowBusActorFactory.createPQactor("10", -9*factor, -5.8*factor));
		top.addActor("11", PowerFlowBusActorFactory.createPQactor("11", -3.5*factor, -1.8*factor));
		top.addActor("12", PowerFlowBusActorFactory.createPQactor("12", -6.1*factor, -1.6*factor));		
		top.addActor("13", PowerFlowBusActorFactory.createPQactor("13", -13.5*factor, -5.8*factor));
		top.addActor("14", PowerFlowBusActorFactory.createPQactor("14", -14.9*factor, -5.0*factor));
		
		// the powerflow model
		PowerflowTopology pfModel = new PowerflowTopology();
		
		TopologicalNode swing = pfModel.CIMmodel.getSWINGNode();
		pfModel.setSwingNodeVoltage(1.06);
		
		// PV nodes
		TopologicalNode node2 = pfModel.createPVNode("/user/ActorSupervisor/2");
		TopologicalNode node3 = pfModel.createPVNode("/user/ActorSupervisor/3");		
		TopologicalNode node6 = pfModel.createPVNode("/user/ActorSupervisor/6");		
		TopologicalNode node8 = pfModel.createPVNode("/user/ActorSupervisor/8");
		
		// PQ nodes
		TopologicalNode node4 = pfModel.createPQNode("/user/ActorSupervisor/4");
		TopologicalNode node5 = pfModel.createPQNode("/user/ActorSupervisor/5");
		TopologicalNode node7 = pfModel.createPQNode("/user/ActorSupervisor/7");
		TopologicalNode node10 = pfModel.createPQNode("/user/ActorSupervisor/10");
		TopologicalNode node11 = pfModel.createPQNode("/user/ActorSupervisor/11");
		TopologicalNode node12 = pfModel.createPQNode("/user/ActorSupervisor/12");
		TopologicalNode node13 = pfModel.createPQNode("/user/ActorSupervisor/13");
		TopologicalNode node14 = pfModel.createPQNode("/user/ActorSupervisor/14");
				
		TopologicalNode node9 = pfModel.createPQNode("/user/ActorSupervisor/9");		
		
		ExtendedTopologyInformation node9eti = new ExtendedTopologyInformation();
		node9eti.setB_shunt(0.19);
		AdditionalInformationMapping.nodeETI_HashMap.put(node9, node9eti);
						
		// the lines (R, X, B)
		pfModel.connectNodes(swing, node2, new LineConfiguration(0.01938, 0.05917, 0.0528));
		pfModel.connectNodes(swing, node5, new LineConfiguration(0.05403, 0.22304, 0.0492));
		pfModel.connectNodes(node2, node3, new LineConfiguration(0.04699, 0.19797, 0.0438));
		pfModel.connectNodes(node2, node4, new LineConfiguration(0.05811, 0.17632, 0.0340));
		pfModel.connectNodes(node2, node5, new LineConfiguration(0.05695, 0.17388, 0.0346));
		pfModel.connectNodes(node3, node4, new LineConfiguration(0.06701, 0.17103, 0.0128));
		pfModel.connectNodes(node4, node5, new LineConfiguration(0.01335, 0.04211));
		
		// transformer lines --> they include a transformer ratio
		pfModel.connectNodes(node4, node7, new LineConfigurationWithTransformer(0.00000, 0.20912, 0.978));		
		pfModel.connectNodes(node4, node9, new LineConfigurationWithTransformer(0.00000, 0.55618, 0.969));
		pfModel.connectNodes(node5, node6, new LineConfigurationWithTransformer(0.00000, 0.25202, 0.932));						
		
		pfModel.connectNodes(node6, node11, new LineConfiguration(0.09498, 0.19890));		
		pfModel.connectNodes(node6, node12, new LineConfiguration(0.12291, 0.25581));
		pfModel.connectNodes(node6, node13, new LineConfiguration(0.06615, 0.13027));
		pfModel.connectNodes(node7, node8,  new LineConfiguration(0.00000, 0.17615));
		pfModel.connectNodes(node7, node9,  new LineConfiguration(0.00000, 0.11001));
		pfModel.connectNodes(node9, node10, new LineConfiguration(0.03181, 0.08450));
		pfModel.connectNodes(node9, node14, new LineConfiguration(0.12711, 0.27038));
		pfModel.connectNodes(node10, node11,new LineConfiguration(0.08205, 0.19207));
		pfModel.connectNodes(node12, node13,new LineConfiguration(0.22092, 0.19988));
		pfModel.connectNodes(node13, node14,new LineConfiguration(0.17093, 0.34802));		
		
		pfModel.autoMap(top);		
		
		System.out.println(pfModel.CIMmodel);
		
		return top;
	}
	
} 