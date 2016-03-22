/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package _3busExampleIowa;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;

/**
 * This simulation example was created to test a simple power flow model.
 * The example is introduced and calculated by "hand" at the reference *.doc
 * <a href="home.eng.iastate.edu/~jdm/ee553/PowerFlow.doc"> http://home.eng.iastate.edu/... </a>.
 * 
 * @author denis
 *
 */
public class Iowa3BusSimulation {
	
	public static ActorTopology topology;
	private int startTimeStep = 1;
	private int maxTimeStep = 2;
	
	public void run(){
		topology = Iowa3BusTopology.createTopology();
		
		SimulationStarter.saveGridTopologyPlot(topology);		
        ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);        
        SimulationStarter.startSimulation(actorSystem, startTimeStep, maxTimeStep);
	}
	
	public static void main(String[] args){
		new Iowa3BusSimulation().run();
	}
}
