/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package linePowerTopology;

import powerflowApi.PowerflowTopology;
import topology.ActorTopology;

public class TopologyLine {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "Grid-for-solver-simulation";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		int consumerNum = 10;

		String nodeName;
		
		// SolverComponents
		top.addActor("SolverAggregator", BFactory.createAggregatorActor("SOLVER-AGGREGATOR"));
		for (int i = 1; i <= consumerNum; i++) {
			nodeName = "SolverAggregator/Node"+i;			
			top.addActorAsChild(nodeName, BFactory.createActor(nodeName, 100*i));
		}

		PowerflowTopology pfModel = new PowerflowTopology();

		for (int i = 1; i <= consumerNum; i++) {
			nodeName = "/user/ActorSupervisor/SolverAggregator/Node"+i;
			pfModel.addNodeBelow(nodeName);
		}

		pfModel.autoMap(top);

		return top;
	}

} 