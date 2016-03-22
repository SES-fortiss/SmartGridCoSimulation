/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package akkaAndSolver;

import powerflowApi.PowerflowTopology;
import topology.ActorTopology;

public class SolverTopology {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "Grid-for-solver-simulation";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		int consumerNum = 5;
				
		String topologyPath;
		
		// SolverComponents
		top.addActor("SolverAggregator", SolverFactory.createSolverAggregatorActor("SOLVER-AGGREGATOR"));
		for (int i = 1; i <= consumerNum; i++) {
			topologyPath = "SolverAggregator/Solar"+i;
			//top.addActorAsChild(topologyPath, SolverFactory.createSolverActor("/user/ActorSupervisor/"+topologyPath, 1000.0*Math.random())); 
			top.addActorAsChild(topologyPath, SolverFactory.createSolverActor(topologyPath, 100*i));
		} 
		
		//PowerflowMapping.type = PowerflowType.LINE;
		//PowerflowMapping.setMapping(top);
		//System.out.println("*********************");
		//System.out.println(PowerflowMapping.akkaTopology);
		
		PowerflowTopology pfModel = new PowerflowTopology();
		
		for (int i = 0; i <= consumerNum; i++) {
			topologyPath = "/user/ActorSupervisor/SolverAggregator/Solar"+i;
			pfModel.addNodeBelow(topologyPath);
		}
		
		pfModel.autoMap(top);
		
		return top;
	}
	
} 