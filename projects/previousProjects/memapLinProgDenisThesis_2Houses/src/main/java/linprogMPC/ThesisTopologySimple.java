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
@SuppressWarnings("unused")
public class ThesisTopologySimple {
	
	public static String simulationName = "2Houses";
	
	// ================= Model Predictive Control (MPC) =================
	public static int N_STEPS_MPC = 192;
			; //equals N_STEPS for case of overall optimization, smaller for case of MPC
	public static int PREDICTION_UNCERTAINTY = 0;
	
	public static int TIMESTEPS_PER_DAY = 96; // Timesteps muss ganze Minuten ergeben.
	public static int NR_OF_ITERATIONS =  1; // X Days
	public static int N_STEPS = 192; // NR_OF_ITERATIONS + N_STEPS_MPC; // benötigt man damit der Optimierer funktioniert.
	
	public static boolean MEMAP_ON = true;
	
	// ================= Components =================
	public static int NR_OF_CONSUMERS = 5;
	private static int PORT_UNDEFINED = 0;
	
	
	private static int port = 8081;	
	
	// Does MEMAP has a long-distance heating connection to buy heat ?
	public static boolean MEMAP_LDHeating = false;
	public static double HEAT_LOSSES = 1.0;	

//  ===============================================================	

	// Efficiencies [kWh]
	private static final double EFFICIENCY_CHP_H = .6;
	private static final double EFFICIENCY_CHP_EL = .25;
	private static final double EFFICIENCY_THERMALSTORAGE = 1.;
	private static final double EFFICIENCY_GASBOILER = .65;
	private static final double EFFICIENCY_OILBOILER = .65;
	private static final double EFFICIENCY_SOLARTHERMIC = .5;
	private static final double EFFICIENCY_HEATPUMP = 3.8;
	private static final double EFFICIENCY_PV = .18;
	private static final double EFFICIENCY_BAT = 1.;

	// Capacities [kW or kWh]
	private static final double QDOT_MAX_THERMALSTORAGE_IN = 5.;
	private static final double QDOT_MAX_THERMALSTORAGE_OUT = 5.;
	private static final double QDOT_MAX_GASBOILER = 40.;
	private static final double QDOT_MAX_OILBOILER = 40.;
	private static final double P_MAX_BATTERY_IN = 3.3;
	private static final double P_MAX_BATTERY_OUT = 3.3;
	private static final double QDOT_MAX_CHP = 3.6;
	private static final double AREA_SOLARTHERMIC = 3.;
	//private static final double QDOT_MAX_SOLARTHERMIC = 3.;
	private static final double AREA_PV = 18.;
	private static final double P_MAX_HEATPUMP = 10.;
	private static final double CAPACITY_THERMALSTORAGE = 20;
	private static final double CAPACITY_BATTERY = 12.;

//  ===============================================================		
	
	public static ActorTopology createTopology(int mpcInput,boolean memapActive){
		N_STEPS_MPC = mpcInput;
		MEMAP_ON = memapActive;	
		
		
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
		
		String building1Name = "Building1";	
		Boolean LDHeatingB1 = false;
		Integer heatTransportLengthB1 = 50;
		ActorTopology building1 = new ActorTopology(building1Name);		
		building1.addActor(building1Name, ActorFactory.createBuilding(port++, LDHeatingB1, heatTransportLengthB1));
		building1.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 0, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/PV", ActorFactory.createPV(5, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Battery", ActorFactory.createBattery(CAPACITY_BATTERY, P_MAX_BATTERY_IN, P_MAX_BATTERY_OUT, EFFICIENCY_BAT, EFFICIENCY_BAT, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/HeatPump", ActorFactory.createHeatPump(P_MAX_HEATPUMP, EFFICIENCY_HEATPUMP, -1 , PORT_UNDEFINED));
		
		
		String building2Name = "Building2";	
		Boolean LDHeatingB2 = false;
		Integer heatTransportLengthB2 = 300;
		ActorTopology building2 = new ActorTopology(building2Name);		
		building2.addActor(building2Name, ActorFactory.createBuilding(port++, LDHeatingB2, heatTransportLengthB2));
		building2.addActorAsChild(building2Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 2, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/SolarThermic", ActorFactory.createSolarThermic(4, port++));		
		building2.addActorAsChild(building2Name + "/ThermalStorage", ActorFactory.createThermalStorage(CAPACITY_THERMALSTORAGE, QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, EFFICIENCY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/CHP", ActorFactory.createCHP( QDOT_MAX_CHP, EFFICIENCY_CHP_H, EFFICIENCY_CHP_EL, port++));

		
		top.addSubTopology(simulationName, building1);
		top.addSubTopology(simulationName, building2);
	
		
		return top;
	}

}
