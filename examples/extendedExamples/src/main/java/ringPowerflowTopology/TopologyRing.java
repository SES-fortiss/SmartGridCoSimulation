/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package ringPowerflowTopology;

import linePowerTopology.BFactory;
import powerflowApi.RingPowerflowModel;
import topology.ActorTopology;

public class TopologyRing {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "Grid-for-solver-simulation";	
	
	public static ActorTopology createTopology(){
		ActorTopology actorTopology = new ActorTopology(simulationName);
		// eine zu große Zahl z.B. mit mehr als 1000 Komponenten lässt sich nicht lösen. 600 geht. 700 geht nicht.
		int consumerNum = 4;
		int extra = 2;		
				
		String topologyPath;
		
		// SolverComponents
		actorTopology.addActor("SolverAggregator", BFactory.createAggregatorActor("SOLVER-AGGREGATOR"));
		for (int i = 0; i <= consumerNum+extra; i++) {
			topologyPath = "SolverAggregator/Node"+i; 					
			actorTopology.addActorAsChild(topologyPath, BFactory.createActor(topologyPath, 1000*i));
		}
		
		RingPowerflowModel ringPowerflowModel = new RingPowerflowModel();
		
		for (int i = 0; i <= consumerNum; i++) {
			topologyPath = "/user/ActorSupervisor/SolverAggregator/Node"+i;
			if (i== 0) ringPowerflowModel.addBelow(topologyPath);
			else
			if (i <= consumerNum / 2) {
				ringPowerflowModel.addRight(topologyPath);
			} else {
				ringPowerflowModel.addLeft(topologyPath);
			}
		}				
		ringPowerflowModel.closeRing();
		
		for (int i = 0; i < extra; i++){
			topologyPath = "/user/ActorSupervisor/SolverAggregator/Node"+(i+consumerNum+1);
			ringPowerflowModel.addRight(topologyPath);
		}
		ringPowerflowModel.closeRing();
		
		ringPowerflowModel.autoMap(actorTopology);		
		return actorTopology;
	}
	
} 