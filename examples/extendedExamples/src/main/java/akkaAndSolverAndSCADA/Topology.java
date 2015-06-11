/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akkaAndSolverAndSCADA;

import topology.ActorTopology;
import georg.GeorgPowerflowTopology;

public class Topology {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "Grid-for-solver-simulation";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		int consumerNum = 20;
				
		String topologyPath;
		
		// SolverComponents
		top.addActor("Aggregator", Factory.createAggregatorActor("AGGREGATOR"));
		for (int i = 1; i <= consumerNum; i++) {
			topologyPath = "Aggregator/Component"+i;
			top.addActorAsChild(topologyPath, Factory.createComponentActor("/user/ActorSupervisor/"+topologyPath, 1000.0*Math.random())); 
		}
		
		GeorgPowerflowTopology.createModelandMapping(top);
		//System.out.println("*********************");
		//System.out.println(PowerflowMapping.akkaTopology);
		return top;
	}
	
} 