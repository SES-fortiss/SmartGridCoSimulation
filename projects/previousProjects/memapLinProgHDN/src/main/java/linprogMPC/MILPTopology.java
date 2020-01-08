package linprogMPC;

import linprogMPC.ActorFactory;
import linprogMPC.helper.ConsumptionProfiles;
import topology.ActorTopology;

/**
 *
 */
public class MILPTopology {
	public static String simulationName = "MEMAPcoordinator";	
	
	// ================= Model Predictive Control (MPC) =================
	public static int N_STEPS_MPC = 1;
	public static int TIMESTEPS_PER_DAY = 96; // Timesteps muss ganze Minuten ergeben.
	public static int NR_OF_ITERATIONS =  1*TIMESTEPS_PER_DAY; // X Days
	public static int N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC; // ben�tigt man damit der Optimierer funktioniert.
	
	// ================= Components =================
	public static int NR_OF_CONSUMERS = 5;
	private static int PORT_UNDEFINED = 0;	
	
	public static ActorTopology createTopology(int mpcInput) {
		N_STEPS_MPC = mpcInput;
		
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
		
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createMEMAPCoordinationBehavior2());
		
		String building1Name = "Building1";
		ActorTopology building1 = new ActorTopology(building1Name);			
		building1.addActor(building1Name, ActorFactory.createBuilding(PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Consumption1", ActorFactory.createConsumer(consumptionProfiles, 0, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/PV1", ActorFactory.createPV(5, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Battery1", ActorFactory.createBattery(12, 3.3, 3.3, 0.91, 0.91, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/HeatStorage1", ActorFactory.createThermalStorage(30, 10, 10, 0.91, 0.91, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/HeatPump1", ActorFactory.createHeatPump(10, 1, 3.8, -1 , PORT_UNDEFINED));		
		building1.addActorAsChild(building1Name + "/CHP1", ActorFactory.createCHP(10, 5, 0.62, 0.21 , PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/GasBoiler1", ActorFactory.createGasBoiler(10, 0, 0.91, 0.0591 , PORT_UNDEFINED));		
				
		top.addSubTopology(simulationName, building1);
		
		
		String building2Name = "Building2";
		ActorTopology building2 = new ActorTopology(building1Name);
		building2.addActor(building2Name, ActorFactory.createBuilding(PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/Consumption2", ActorFactory.createConsumer(consumptionProfiles, 1, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/PV2", ActorFactory.createPV(5, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/Battery2", ActorFactory.createBattery(12, 3.3, 3.3, 0.92, 0.92, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/HeatStorage2", ActorFactory.createThermalStorage(30, 10, 10, 0.92, 0.92, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/HeatPump2", ActorFactory.createHeatPump(10, 1, 3.8, -1 , PORT_UNDEFINED));		
		building2.addActorAsChild(building2Name + "/CHP2", ActorFactory.createCHP(10, 5, 0.62, 0.21 , PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/GasBoiler2", ActorFactory.createGasBoiler(10, 5, 0.92, 0.02 , PORT_UNDEFINED));
		
		building2.addActorAsChild(building2Name + "/Connection21", ActorFactory.createThermalConnection(building1Name, 150, 0.01, 999));
		
		
		top.addSubTopology(simulationName, building2);
		

		String building3Name = "Building3";
		ActorTopology building3 = new ActorTopology(building1Name);
		building3.addActor(building3Name, ActorFactory.createBuilding(PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/Consumption3", ActorFactory.createConsumer(consumptionProfiles, 2, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/GasBoiler3", ActorFactory.createGasBoiler(100, 0, 0.93, 0.12 , PORT_UNDEFINED));
		
		building3.addActorAsChild(building3Name + "/Connection32", ActorFactory.createThermalConnection(building2Name, 1250, 0.01, 999));			
		top.addSubTopology(simulationName, building3);
		

		return top;
		
	}

}
