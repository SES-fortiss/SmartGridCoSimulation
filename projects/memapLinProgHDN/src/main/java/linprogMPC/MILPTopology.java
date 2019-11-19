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
		top.addActorAsChild(building1Name + "/PV", ActorFactory.createPV(5, PORT_UNDEFINED));
		top.addActorAsChild(building1Name + "/Battery", ActorFactory.createBattery(12, 3.3, 3.3, 0.99, 0.99, PORT_UNDEFINED));
		top.addActorAsChild(building1Name + "/HeatPump", ActorFactory.createHeatPump(10, 0, 3.8, -1 , PORT_UNDEFINED));			
		
		return top;
		
	}

}
