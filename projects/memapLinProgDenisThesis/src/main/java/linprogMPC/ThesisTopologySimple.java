package linprogMPC;

/**
 *
 * Topology for example with 5 buildings with Linear Programming
 * 
 * @author andreas.thut
 *
 */
public abstract class ThesisTopologySimple {
    public static String simulationName = "2MEMAP";

    // ================= Model Predictive Control (MPC) =================
    public static int N_STEPS_MPC = 2; // equals N_STEPS for case of overall optimization, smaller for case of MPC
    public static int PREDICTION_UNCERTAINTY = 0;

    public static int TIMESTEPS_PER_DAY = 96; // Timesteps muss ganze Minuten ergeben.
    public static int NR_DAYS = 7;
    public static int NR_OF_ITERATIONS = NR_DAYS * TIMESTEPS_PER_DAY; // X Days
    public static int N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC; // benötigt man damit der Optimierer funktioniert.

    public static boolean MEMAP_ON = true;

    // ================= Components =================
    // public static int NR_OF_CONSUMERS = 5;
    // private static int PORT_UNDEFINED = 0;

    @SuppressWarnings("unused")
    private static int port = 9999;

    // Does MEMAP has a long-distance heating connection to buy heat ?
    public static boolean MEMAP_LDHeating = false;
    public static double HEAT_LOSSES = 1.0;

//    public static ActorTopology createTopology(int mpcInput, boolean memapActive) {
//	N_STEPS_MPC = mpcInput;
//	MEMAP_ON = memapActive;
//
//	ActorTopology top = new ActorTopology(simulationName);
//	top.addActor(simulationName, ActorFactory.createDevice(new LinProgBehavior()));
//	ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
//
//	String building1Name = "Building1";
//	ActorTopology building1 = new ActorTopology(building1Name);
//	building1.addActor(building1Name, ActorFactory.createDevice(new Building(PORT_UNDEFINED, false, 50)));
//	building1.addActorAsChild(building1Name + "/Consumption",
//		ActorFactory.createDevice(new Consumer(consumptionProfiles, 0, PORT_UNDEFINED)));
//	// building1.addActorAsChild(building1Name + "/GasBoiler1",
//	// ActorFactory.createGasBoiler(20, 0.95, 0.0685, PORT_UNDEFINED));
//
//	String building2Name = "Building2";
//	ActorTopology building2 = new ActorTopology(building2Name);
//	building2.addActor(building2Name, ActorFactory.createDevice(new Building(PORT_UNDEFINED, false, 50)));
//	building2.addActorAsChild(building2Name + "/Consumption",
//		ActorFactory.createDevice(new Consumer(consumptionProfiles, 1, PORT_UNDEFINED)));
//	// building2.addActorAsChild(building2Name + "/GasBoiler2",
//	// ActorFactory.createGasBoiler(20, 0.99, 0.0591, PORT_UNDEFINED));
//	// building2.addActorAsChild(building2Name + "/PV2", ActorFactory.createPV(5,
//	// PORT_UNDEFINED));
//	building2.addActorAsChild(building2Name + "/Battery2",
//		ActorFactory.createDevice(new Battery(12.0, 9, 9, 0.95, 0.95, PORT_UNDEFINED)));
//
//	String building3Name = "Building3";
//	ActorTopology building3 = new ActorTopology(building3Name);
//	building3.addActor(building3Name, ActorFactory.createDevice(new Building(PORT_UNDEFINED, false, 50)));
//	building3.addActorAsChild(building3Name + "/Consumption",
//		ActorFactory.createDevice(new Consumer(consumptionProfiles, 2, PORT_UNDEFINED)));
//	// building3.addActorAsChild(building3Name + "/PV3", ActorFactory.createPV(12.0,
//	// PORT_UNDEFINED));
//	building3.addActorAsChild(building3Name + "/PV3",
//		ActorFactory.createDevice(new PV(12.0 + 5.0, PORT_UNDEFINED)));
//	building3.addActorAsChild(building3Name + "/HeatPump3",
//		ActorFactory.createDevice(new HeatPump(25, 2.5, -1, PORT_UNDEFINED)));
//	// building3.addActorAsChild(building3Name + "/ThermalStorage3",
//	// ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
//	building3.addActorAsChild(building3Name + "/ThermalStorage3",
//		ActorFactory.createDevice(new ThermalStorage(3 * 100, 3 * 60, 3 * 60, 0.9, 0.9, PORT_UNDEFINED)));
//
//	String building4Name = "Building4";
//	ActorTopology building4 = new ActorTopology(building4Name);
//	building4.addActor(building4Name, ActorFactory.createDevice(new Building(PORT_UNDEFINED, false, 50)));
//	building4.addActorAsChild(building4Name + "/Consumption",
//		ActorFactory.createDevice(new Consumer(consumptionProfiles, 3, PORT_UNDEFINED)));
//	building4.addActorAsChild(building4Name + "/CHP4",
//		ActorFactory.createDevice(new CHP(43, 0.61, 0.29, PORT_UNDEFINED)));
//	// building4.addActorAsChild(building4Name + "/ThermalStorage4",
//	// ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
//
//	String building5Name = "Building5";
//	ActorTopology building5 = new ActorTopology(building5Name);
//	building5.addActor(building5Name, ActorFactory.createDevice(new Building(PORT_UNDEFINED, false, 50)));
//	building5.addActorAsChild(building5Name + "/Consumption",
//		ActorFactory.createDevice(new Consumer(consumptionProfiles, 4, PORT_UNDEFINED)));
//	// building5.addActorAsChild(building5Name + "/CHP5", ActorFactory.createCHP(43,
//	// 0.60, 0.28, PORT_UNDEFINED));
//	// building5.addActorAsChild(building5Name + "/ThermalStorage5",
//	// ActorFactory.createThermalStorage(100, 60, 60, 0.9, 0.9, PORT_UNDEFINED));
//	building5.addActorAsChild(building5Name + "/SolarThermic5",
//		ActorFactory.createDevice(new SolarThermic(10, PORT_UNDEFINED)));
//
//	top.addSubTopology(simulationName, building1);
//	top.addSubTopology(simulationName, building2);
//	top.addSubTopology(simulationName, building3);
//	top.addSubTopology(simulationName, building4);
//	top.addSubTopology(simulationName, building5);
//	return top;
//    }

    public static void setStepsMPC(int stepsMPC) {
	N_STEPS = stepsMPC;
    }

    public static void setPredUncertainty(int predUncertainty) {
	PREDICTION_UNCERTAINTY = predUncertainty;
    }

    public static void setTimeStepsPerDay(int timeStepsPerDay) {
	TIMESTEPS_PER_DAY = timeStepsPerDay;
    }

    public static void setMemapOn(boolean memapOn) {
	MEMAP_ON = memapOn;
    }

    public static void setMemapLDHeating(boolean hasLDHeating) {
	MEMAP_LDHeating = hasLDHeating;
    }

    public static void setHeatLoss(double HeatLoss) {
	HEAT_LOSSES = HeatLoss;
    }

    public static void setNrOfDays(int nrDays) {
	NR_DAYS = nrDays;
    }
}
