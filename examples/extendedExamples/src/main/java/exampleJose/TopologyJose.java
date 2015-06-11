/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package exampleJose;

import powerflowApi.PowerflowModel;
import topology.ActorTopology;

public class TopologyJose {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	public static String simulationName = "Jose-Simulation";	
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		
		top.addActor("Koordinator", FactoryJose.createKoordinator());
		
		String name = "";
		for (int i = 0; i < 3; i++) {
			name = "Koordinator/House" + i;
			top.addActorAsChild(name, FactoryJose.createEMSHouse());
		}
		
		PowerflowModel pf = new PowerflowModel();
		pf.addNodeBelow("Koordinator/House1");
		pf.addNodeBelow("Koordinator/House2");
		pf.addNodeBelow("Koordinator/House3");
		pf.autoMap(top);
		
		return top;
	}

} 