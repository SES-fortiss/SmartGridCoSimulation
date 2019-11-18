package linprogMPC;

import linprogMPC.ActorFactory;
import linprogMPC.helper.ConsumptionProfiles;
import topology.ActorTopology;

/**
 *
 */
public class MILPTopology {
	public static String simulationName = "MILPTEST";	
	
	// ================= Model Predictive Control (MPC) =================
	public static int N_STEPS_MPC = 1;
	public static int TIMESTEPS_PER_DAY = 96; // Timesteps muss ganze Minuten ergeben.
	public static int NR_OF_ITERATIONS =  1*TIMESTEPS_PER_DAY; // X Days
	public static int N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC; // ben�tigt man damit der Optimierer funktioniert.
	
	public static boolean MEMAP_ON = false;
	
	// ================= Components =================
	public static int NR_OF_CONSUMERS = 5;
	private static int PORT_UNDEFINED = 0;	
	
	public static ActorTopology createTopology(int mpcInput, boolean memapActive) {
		N_STEPS_MPC = mpcInput;
		MEMAP_ON = memapActive;
		
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
		
		ActorTopology top = new ActorTopology(simulationName);
		
		String building1Name = "Building1";
		top.addActor(building1Name, ActorFactory.createBuilding(PORT_UNDEFINED));
		top.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 0, PORT_UNDEFINED));
		top.addActorAsChild(building1Name + "/OilBoiler1", ActorFactory.createGasBoiler(20, 10, 0.95, 0.0685, PORT_UNDEFINED));
		top.addActorAsChild(building1Name + "/ThermalStorage", ActorFactory.createThermalStorage(100, 100, 100, 0.9, 0.9, PORT_UNDEFINED));
			
		return top;
		
	}

}
