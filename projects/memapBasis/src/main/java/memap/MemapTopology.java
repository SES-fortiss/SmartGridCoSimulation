package memap;

import topology.ActorTopology;

/**
 *
 * DesignedTopology for example with 5 buildings with Linear Programming
 * 
 * @author andreas.thut
 *
 */
public class MemapTopology {
	public static String simulationName = "2MEMAP";	
	
	public static ActorTopology createTopology(int mpcInput,boolean memapActive){
		
		MemapConfig.NR_OF_CONSUMERS = 5;
		MemapConfig.N_STEPS_MPC = mpcInput;
		MemapConfig.MEMAP_ON = memapActive;	
		int PORT_UNDEFINED = 0;
		String profilePath = "WaermeVerbraeucheAngepasst.csv";
		String networkType = "Heat";
		
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());		

		String building1Name = "Building1";
		ActorTopology building1 = new ActorTopology(building1Name);
		building1.addActor(building1Name, ActorFactory.createBuilding(PORT_UNDEFINED, false, 50));
		building1.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer(profilePath, networkType, 0, PORT_UNDEFINED));
		//building1.addActorAsChild(building1Name + "/GasBoiler1", ActorFactory.createGasBoiler(20, 0.95, 0.0685, PORT_UNDEFINED));		
		
		String building2Name = "Building2";
		ActorTopology building2 = new ActorTopology(building2Name);
		building2.addActor(building2Name, ActorFactory.createBuilding(PORT_UNDEFINED, false, 50));
		building2.addActorAsChild(building2Name + "/Consumption", ActorFactory.createConsumer(profilePath, networkType, 1, PORT_UNDEFINED));
		//building2.addActorAsChild(building2Name + "/GasBoiler2", ActorFactory.createGasBoiler(20, 0.99, 0.0591, PORT_UNDEFINED));
		//building2.addActorAsChild(building2Name + "/PV2", ActorFactory.createPV(5, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/Battery2", ActorFactory.createBattery(12.0, 9, 9, 0.95, 0.95, PORT_UNDEFINED));
		
		String building3Name = "Building3";
		ActorTopology building3 = new ActorTopology(building3Name);
		building3.addActor(building3Name, ActorFactory.createBuilding(PORT_UNDEFINED, false, 50));
		building3.addActorAsChild(building3Name + "/Consumption", ActorFactory.createConsumer(profilePath, networkType, 2, PORT_UNDEFINED));
		//building3.addActorAsChild(building3Name + "/PV3", ActorFactory.createPV(12.0, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/PV3", ActorFactory.createPV(12.0+5.0, 0.00001, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/HeatPump3", ActorFactory.createHeatPump(25, 2.5, -1, PORT_UNDEFINED));
		//building3.addActorAsChild(building3Name + "/ThermalStorage3", ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/ThermalStorage3", ActorFactory.createThermalStorage(3*100, 3*60, 3*60, 0.9, 0.9, PORT_UNDEFINED));
		
		String building4Name = "Building4";
		ActorTopology building4 = new ActorTopology(building4Name);
		building4.addActor(building4Name, ActorFactory.createBuilding(PORT_UNDEFINED, false, 50));
		building4.addActorAsChild(building4Name + "/Consumption", ActorFactory.createConsumer(profilePath, networkType, 3, PORT_UNDEFINED));
		building4.addActorAsChild(building4Name + "/CHP4", ActorFactory.createCHP(43, 0.61, 0.29, PORT_UNDEFINED));
		//building4.addActorAsChild(building4Name + "/ThermalStorage4", ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
		
		String building5Name = "Building5";
		ActorTopology building5 = new ActorTopology(building5Name);
		building5.addActor(building5Name, ActorFactory.createBuilding(PORT_UNDEFINED, false, 50));
		building5.addActorAsChild(building5Name + "/Consumption", ActorFactory.createConsumer(profilePath, networkType, 4, PORT_UNDEFINED));
		//building5.addActorAsChild(building5Name + "/CHP5", ActorFactory.createCHP(43, 0.60, 0.28, PORT_UNDEFINED));
		//building5.addActorAsChild(building5Name + "/ThermalStorage5", ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
		building5.addActorAsChild(building5Name + "/SolarThermic5", ActorFactory.createSolarThermic(10, 0.00001, PORT_UNDEFINED));
		
		top.addSubTopology(simulationName, building1);
		top.addSubTopology(simulationName, building2);
		top.addSubTopology(simulationName, building3);
		top.addSubTopology(simulationName, building4);
		top.addSubTopology(simulationName, building5);
	
		return top;
		
	}

}
