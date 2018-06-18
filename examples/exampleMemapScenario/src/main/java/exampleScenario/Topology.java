/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package exampleScenario;

import exampleScenario.ActorFactory;
import topology.ActorTopology;

/**
 * 
 * This is the topology for the simulation
 * 
 * @author bytschkow
 *
 */

public class Topology {
	
	private static String simulationName = "MEMAP-Simulation";
	
	public static ActorTopology createTopology(){
		int port = 33101;
		ActorTopology top = new ActorTopology(simulationName);						
		top.addActor("MEMAP", ActorFactory.createMEMAP());
		String path;
		
		for (int i = 1; i <= 5; i++) {
			path = "MEMAP/Haus"+i;
			top.addActorAsChild(path, ActorFactory.createBuilding("Haus"+i, port++));
		}
		
		//Haus 1
		top.addActorAsChild("MEMAP/Haus1/Consumer", ActorFactory.createConsumer("Consumer", "Lastprofil_EFH.csv"));
		top.addActorAsChild("MEMAP/Haus1/OilBoiler", ActorFactory.createOilBoiler("OilBoiler", 40.0, 1.0));
		
		
		//Haus 2
		top.addActorAsChild("MEMAP/Haus2/Consumer", ActorFactory.createConsumer("Consumer", "Lastprofil_EFH.csv"));
		top.addActorAsChild("MEMAP/Haus2/PV", ActorFactory.createPV("PV", 8.0, 0.2));
		top.addActorAsChild("MEMAP/Haus2/HeatPump", ActorFactory.createHeatPump("HeatPump", 300, 3.8));
		top.addActorAsChild("MEMAP/Haus2/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", 5.0, 5.0, 100000, 1.0));
		
		//Haus 3
		top.addActorAsChild("MEMAP/Haus3/Consumer", ActorFactory.createConsumer("Consumer", "Lastprofil_EFH2.csv"));
		top.addActorAsChild("MEMAP/Haus3/PV", ActorFactory.createPV("PV", 8.0, 0.2));
		top.addActorAsChild("MEMAP/Haus3/Battery", ActorFactory.createBattery("Battery", 5.0, 5.0, 40000));
		top.addActorAsChild("MEMAP/Haus3/GasBoiler", ActorFactory.createGasBoiler("GasBoiler", 40.0, 1.0));
		
		//Haus 4
		top.addActorAsChild("MEMAP/Haus4/Consumer", ActorFactory.createConsumer("Consumer", "Lastprofil_EFH2.csv"));
		top.addActorAsChild("MEMAP/Haus4/CHP", ActorFactory.createCHP("CHP", 80.0, 0.25, 0.6));
		top.addActorAsChild("MEMAP/Haus4/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", 5.0, 5.0, 100000, 1.0));
		
		//Haus 5
		top.addActorAsChild("MEMAP/Haus5/Consumer", ActorFactory.createConsumer("Consumer", "Lastprofil_EFH.csv"));
		top.addActorAsChild("MEMAP/Haus5/CHP", ActorFactory.createCHP("CHP", 80.0, 0.25, 0.6));
		top.addActorAsChild("MEMAP/Haus5/SolarThermic", ActorFactory.createSolarThermic("SolarThermic", 6, 0.5));
		top.addActorAsChild("MEMAP/Haus5/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", 5.0, 5.0, 100000, 1.0));
		
		

		return top;
	}
}
