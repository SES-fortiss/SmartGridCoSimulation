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
public class Topology2HousesMPC {	
	
	private static String simulationName = "LinProg";
	public static final int NR_OF_CONSUMERS = 5;
	
	// Efficiencies
	private static final double EFFICIENCY_CHP_H = .6;
	private static final double EFFICIENCY_CHP_EL = .25;
	private static final double EFFICIENCY_THERMALSTORAGE = 1.;
	private static final double EFFICIENCY_SOLARTHERMIC = .5;
	private static final double EFFICIENCY_HEATPUMP = 3.8;
	private static final double EFFICIENCY_PV = .2;
	private static final double EFFICIENCY_BAT = 1.;

	// Capacities
	private static final double QDOT_MAX_THERMALSTORAGE_IN = 5.;
	private static final double QDOT_MAX_THERMALSTORAGE_OUT = 5.;
	private static final double P_MAX_BATTERY_IN = 5.;
	private static final double P_MAX_BATTERY_OUT = 5.;
	private static final double QDOT_MAX_CHP = 80.;
	private static final double AREA_SOLARTHERMIC = 6.;
	//private static final double QDOT_MAX_SOLARTHERMIC = 3.;
	private static final double AREA_PV = 20.;
	private static final double P_MAX_HEATPUMP = 20.;
	private static final double CAPACITY_THERMALSTORAGE = 100000.;
	private static final double CAPACITY_BATTERY = 400000.;
	private static final int PORT_UNDEFINED = 0;
	
	
	private static final double QDOT_MAX_OILBOILER = 40.;
	private static final double EFFICIENCY_OILBOILER = .95;
	private static final double PV_KWP = 10.;
	
	public static ActorTopology createTopology(){
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
		
		//Aggregated Consumption
//		top.addActorAsChild(simulationName + "/Consumption", ActorFactory.createConsumer("/Consumption", port++));

		String building1Name = "Building1";
		Boolean LDHeatingB1 = false;
		Integer heatTransportLengthB1 = 50;
		ActorTopology building1 = new ActorTopology(building1Name);		
		building1.addActor(building1Name, ActorFactory.createBuilding(port++, LDHeatingB1, heatTransportLengthB1));
		building1.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 0, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/OilBoiler", ActorFactory.createOilBoiler(QDOT_MAX_OILBOILER, EFFICIENCY_OILBOILER, PORT_UNDEFINED));
		//building1.addActorAsChild(building1Name + "/PV", ActorFactory.createPV(AREA_PV, EFFICIENCY_PV, PORT_UNDEFINED));
		//building1.addActorAsChild(building1Name + "/Battery", ActorFactory.createBattery(P_MAX_BATTERY_IN, P_MAX_BATTERY_OUT, EFFICIENCY_BAT, EFFICIENCY_BAT, CAPACITY_BATTERY, 8085));
		//building1.addActorAsChild(building1Name + "/HeatPump", ActorFactory.createHeatPump(P_MAX_HEATPUMP, EFFICIENCY_HEATPUMP, PORT_UNDEFINED));
				
		String building2Name = "Building2";	
		Boolean LDHeatingB2 = false;
		Integer heatTransportLengthB2 = 300;
		//ActorTopology building2 = new ActorTopology(building2Name);
		//building2.addActor(building2Name, ActorFactory.createBuilding(port++, LDHeatingB2, heatTransportLengthB2));
		//building2.addActorAsChild(building2Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 1, PORT_UNDEFINED));
		//building2.addActorAsChild(building2Name + "/SolarThermic", ActorFactory.createSolarThermic(AREA_SOLARTHERMIC, EFFICIENCY_SOLARTHERMIC, PORT_UNDEFINED));		
		//building2.addActorAsChild(building2Name + "/ThermalStorage", ActorFactory.createThermalStorage(QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, 8086));
		//building2.addActorAsChild(building2Name + "/CHP", ActorFactory.createCHP(QDOT_MAX_CHP, EFFICIENCY_CHP_EL, EFFICIENCY_CHP_H, PORT_UNDEFINED));
		
		top.addSubTopology(simulationName, building1);
		//top.addSubTopology(simulationName, building2);
	
		return top;
		
	}

}
