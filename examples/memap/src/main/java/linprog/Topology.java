package linprog;

import topology.ActorTopology;

/**
 *
 * Topology for example with 5 buildings with Linear Programming
 * 
 * @author andreas.thut
 *
 */
public class Topology {	
	
	private static String simulationName = "LinProg";
	
	public static ActorTopology createTopology(){
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());
		
		//Aggregated Consumption
		top.addActorAsChild(simulationName + "/Consumption", ActorFactory.createConsumer("/Consumption", port++));

		//Building 1
		top.addActorAsChild(simulationName + "/1_OilBoiler", ActorFactory.createOilBoiler("1_OilBoiler", 50000, .7, port++));

		//Building 2
		top.addActorAsChild(simulationName + "/2_PV", ActorFactory.createPV("2_PV", 3, .2, port++));
		top.addActorAsChild(simulationName + "/2_HeatPump", ActorFactory.createHeatPump("/2_HeatPump", 300, .33, port++));
		top.addActorAsChild(simulationName + "/2_ThermalStorage", ActorFactory.createThermalStorage("/2_ThermalStorage", 100, 100, 5000/3600, .9, port++));
		
		//Building 3
		top.addActorAsChild(simulationName + "/3_PV", ActorFactory.createPV("3_PV", 3, .2, port++));
		top.addActorAsChild(simulationName + "/3_Battery", ActorFactory.createBattery("3_Battery", 50, 50, 5000/3600, port++));
		top.addActorAsChild(simulationName + "/3_GasBoiler", ActorFactory.createGasBoiler("3_GasBoiler", 50000, .7, port++));

		//Building 4
//		top.addActorAsChild(simulationName + "/4_CHP", ActorFactory.createCHP("4_CHP", 250.0, .3, .55, port++));
//		top.addActorAsChild(simulationName + "/4_ThermalStorage", ActorFactory.createThermalStorage("/4_ThermalStorage", 100, 100, 5000/3600, .9, port++));
		
		//Building 5
//		top.addActorAsChild(simulationName + "/5_CHP", ActorFactory.createCHP("5_CHP", 250.0, .3, .55, port++));
//		top.addActorAsChild(simulationName + "/5_SolarThermic", ActorFactory.createSolarThermic("5_SolarThermic", 2, .2, port));		
//		top.addActorAsChild(simulationName + "/5_ThermalStorage", ActorFactory.createThermalStorage("/5_ThermalStorage", 100, 100, 5000/3600, .9, port++));		
		
		return top;
	}

}
