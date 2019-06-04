package linprogMPC;

import linprogMPC.ActorFactory;
import linprogMPC.helper.ConsumptionProfiles;
import topology.ActorTopology;

/**
 *
 * Topology for example with 5 buildings with Linear Programming
 * 
 * @author andreas.thut
 *
 */
public class ThesisTopologySimple {
	public static String simulationName = "2MEMAP";	
	
	// ================= Model Predictive Control (MPC) =================
	public static int N_STEPS_MPC = 1;
			; //equals N_STEPS for case of overall optimization, smaller for case of MPC
	public static int PREDICTION_UNCERTAINTY = 0;
	
	public static int TIMESTEPS_PER_DAY = 96; // Timesteps muss ganze Minuten ergeben.
	public static int NR_OF_ITERATIONS =  7*TIMESTEPS_PER_DAY; // X Days
	public static int N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC; // ben�tigt man damit der Optimierer funktioniert.
	
	public static boolean MEMAP_ON = false;
	
	// ================= Components =================
	public static int NR_OF_CONSUMERS = 5;
	private static int PORT_UNDEFINED = 0;
	
	
	// Does MEMAP has a long-distance heating connection to buy heat ?
	public static boolean MEMAP_LDHeating = false;
	public static double HEAT_LOSSES = 1.0;	
	
	public static ActorTopology createTopology(int mpcInput,boolean memapActive){
		N_STEPS_MPC = mpcInput;
		MEMAP_ON = memapActive;		
		
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);		

		String building1Name = "Building1";
		ActorTopology building1 = new ActorTopology(building1Name);
		building1.addActor(building1Name, ActorFactory.createBuilding(PORT_UNDEFINED, MEMAP_LDHeating, 50));
		building1.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 0, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/OilBoiler1", ActorFactory.createGasBoiler(20, 0.95, 0.0685, PORT_UNDEFINED));	
		//building1.addActorAsChild(building1Name + "/Connection12", ActorFactory.createThermalConnection(2, 999.0, 999.0, 50, PORT_UNDEFINED));
		
		building1.addActorAsChild(building1Name + "/Connection12", ActorFactory.createThermalConnection(2, 999.0, 999.0, 120, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Connection13", ActorFactory.createThermalConnection(3, 999.0, 999.0, 200, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Connection14", ActorFactory.createThermalConnection(4, 999.0, 999.0, 50, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Connection15", ActorFactory.createThermalConnection(5, 999.0, 999.0, 120, PORT_UNDEFINED));
		
		
		String building2Name = "Building2";
		ActorTopology building2 = new ActorTopology(building2Name);
		building2.addActor(building2Name, ActorFactory.createBuilding(PORT_UNDEFINED, MEMAP_LDHeating, 50));
		building2.addActorAsChild(building2Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 1, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/GasBoiler2", ActorFactory.createGasBoiler(20, 0.98, 0.0591, PORT_UNDEFINED));
		//building2.addActorAsChild(building2Name + "/GasBoiler2", ActorFactory.createGasBoiler(20, 0.99, 0.0591, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/PV2", ActorFactory.createPV(5, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/Battery2", ActorFactory.createBattery(12.0, 9, 9, 0.98, 0.98, PORT_UNDEFINED));
		//building2.addActorAsChild(building2Name + "/Battery2", ActorFactory.createBattery(12.0, 9, 9, 0.95, 0.95, PORT_UNDEFINED));
		//building2.addActorAsChild(building2Name + "/Connection23", ActorFactory.createThermalConnection(3, 999.0, 999.0, 50, PORT_UNDEFINED));
		
		building2.addActorAsChild(building2Name + "/Connection23", ActorFactory.createThermalConnection(3, 999.0, 999.0, 80, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/Connection24", ActorFactory.createThermalConnection(4, 999.0, 999.0, 150, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/Connection25", ActorFactory.createThermalConnection(5, 999.0, 999.0, 40, PORT_UNDEFINED));
		 
		
		
		String building3Name = "Building3";
		ActorTopology building3 = new ActorTopology(building3Name);
		building3.addActor(building3Name, ActorFactory.createBuilding(PORT_UNDEFINED, MEMAP_LDHeating, 50));
		building3.addActorAsChild(building3Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 2, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/PV3", ActorFactory.createPV(40.0, PORT_UNDEFINED));
		//building3.addActorAsChild(building3Name + "/PV3", ActorFactory.createPV(12.0, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/HeatPump3", ActorFactory.createHeatPump(25, 2.5, -1, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/GasBoiler3", ActorFactory.createGasBoiler(20, 0.98, 0.0591, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/ThermalStorage3", ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
		//building3.addActorAsChild(building3Name + "/Connection34", ActorFactory.createThermalConnection(4, 999.0, 999.0, 50, PORT_UNDEFINED));
		
		building3.addActorAsChild(building3Name + "/Connection34", ActorFactory.createThermalConnection(4, 999.0, 999.0, 230, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/Connection35", ActorFactory.createThermalConnection(5, 999.0, 999.0, 120, PORT_UNDEFINED));
		
		
		
		String building4Name = "Building4";
		ActorTopology building4 = new ActorTopology(building4Name);
		building4.addActor(building4Name, ActorFactory.createBuilding(PORT_UNDEFINED, MEMAP_LDHeating, 50));
		building4.addActorAsChild(building4Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 3, PORT_UNDEFINED));
		building4.addActorAsChild(building4Name + "/CHP4", ActorFactory.createCHP(43, 0.61, 0.29, PORT_UNDEFINED));
		building4.addActorAsChild(building4Name + "/ThermalStorage4", ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
		//building4.addActorAsChild(building4Name + "/Connection45", ActorFactory.createThermalConnection(5, 999.0, 999.0, 50, PORT_UNDEFINED));
		
		building4.addActorAsChild(building4Name + "/Connection45", ActorFactory.createThermalConnection(5, 999.0, 999.0, 150, PORT_UNDEFINED));
		
		String building5Name = "Building5";
		ActorTopology building5 = new ActorTopology(building5Name);
		building5.addActor(building5Name, ActorFactory.createBuilding(PORT_UNDEFINED, MEMAP_LDHeating, 50));
		building5.addActorAsChild(building5Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 4, PORT_UNDEFINED));
		building5.addActorAsChild(building5Name + "/CHP5", ActorFactory.createCHP(43, 0.60, 0.28, PORT_UNDEFINED));
		building5.addActorAsChild(building5Name + "/ThermalStorage5", ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
		building5.addActorAsChild(building5Name + "/SolarThermic5", ActorFactory.createSolarThermic(20, PORT_UNDEFINED));
		//building5.addActorAsChild(building5Name + "/SolarThermic5", ActorFactory.createSolarThermic(10, PORT_UNDEFINED));
		
		top.addSubTopology(simulationName, building1);
		top.addSubTopology(simulationName, building2);
		top.addSubTopology(simulationName, building3);
		top.addSubTopology(simulationName, building4);
		top.addSubTopology(simulationName, building5);
	
		return top;
		
	}

}
