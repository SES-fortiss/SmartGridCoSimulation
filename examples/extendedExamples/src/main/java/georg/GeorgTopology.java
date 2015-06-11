/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package georg;

import topology.ActorTopology;
import georg.models.helper.GeorgActorFactory;

public class GeorgTopology {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "Grid-for-solver-simulation";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		int fridgeNum = 10;
		
		// Components
		top.addActor("Aggregator", GeorgActorFactory.createGeorgsAggregator("aggregator"));
		top.addActorAsChild("Aggregator/Solar", GeorgActorFactory.createGeorgsComponent("solar", "/user/ActorSupervisor/Aggregator/Solar"));
		top.addActorAsChild("Aggregator/Storage", GeorgActorFactory.createGeorgsComponent("storage", "/user/ActorSupervisor/Aggregator/Storage"));
				
		String topologyPath;
		for (int i = 1; i <= fridgeNum; i++) {
			topologyPath = "Aggregator/Fridge"+i;
			top.addActorAsChild(topologyPath, GeorgActorFactory.createGeorgsComponent("fridge"+i, "/user/ActorSupervisor/Aggregator/Fridge" +i)); 
		}
		
		GeorgPowerflowTopology.createModelandMapping(top);
		return top;
	}
	
}