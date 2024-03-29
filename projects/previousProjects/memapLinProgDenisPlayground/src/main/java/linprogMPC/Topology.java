package linprogMPC;

import linprogMPC.helper.ConsumptionProfiles;
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
	public static final int NR_OF_CONSUMERS = 5;
	
	// Efficiencies
	private static final double EFFICIENCY_CHP_H = .6;
	private static final double EFFICIENCY_CHP_EL = .25;
	private static final double EFFICIENCY_THERMALSTORAGE = 1.;
	private static final double EFFICIENCY_GASBOILER = .65;
	private static final double EFFICIENCY_OILBOILER = .65;
	private static final double EFFICIENCY_HEATPUMP = 3.8;
	private static final double EFFICIENCY_BAT = 1.;

	// Capacities
	private static final double QDOT_MAX_THERMALSTORAGE_IN = 5.;
	private static final double QDOT_MAX_THERMALSTORAGE_OUT = 5.;
	private static final double QDOT_MAX_GASBOILER = 40.;
	private static final double QDOT_MAX_OILBOILER = 40.;
	private static final double P_MAX_BATTERY_IN = 5.;
	private static final double P_MAX_BATTERY_OUT = 5.;
	private static final double QDOT_MAX_CHP = 80.;
	//private static final double QDOT_MAX_SOLARTHERMIC = 3.;
	private static final double P_MAX_HEATPUMP = 20.;
	private static final double CAPACITY_THERMALSTORAGE = 100000.;
	private static final double CAPACITY_BATTERY = 40000.;
	private static final int PORT_UNDEFINED = 0;
	
	
	
	public static ActorTopology createTopology(){
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
		
		//Aggregated Consumption
//		top.addActorAsChild(simulationName + "/Consumption", ActorFactory.createConsumer("/Consumption", port++));

		String building1Name = "Building1";		
		Boolean LDHeatingB1 = true;
		Integer heatTransportLengthB1 = 50;
		ActorTopology building1 = new ActorTopology(building1Name);		
		building1.addActor(building1Name, ActorFactory.createBuilding(port++, LDHeatingB1, heatTransportLengthB1));
		building1.addActorAsChild(building1Name + "/OilBoiler", ActorFactory.createOilBoiler(QDOT_MAX_OILBOILER, EFFICIENCY_OILBOILER, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 0, PORT_UNDEFINED));
			
		String building2Name = "Building2";	
		Boolean LDHeatingB2 = false;
		Integer heatTransportLengthB2 = 150;
		ActorTopology building2 = new ActorTopology(building2Name);		
		building2.addActor(building2Name, ActorFactory.createBuilding(port++, LDHeatingB2, heatTransportLengthB2));
		building2.addActorAsChild(building2Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 1, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/PV", ActorFactory.createPV(10, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/HeatPump", ActorFactory.createHeatPump(P_MAX_HEATPUMP, EFFICIENCY_HEATPUMP, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/ThermalStorage", ActorFactory.createThermalStorage(QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));
		
		String building3Name = "Building3";		
		Boolean LDHeatingB3 = false;
		Integer heatTransportLengthB3 = 250;
		ActorTopology building3 = new ActorTopology(building3Name);		
		building3.addActor(building3Name, ActorFactory.createBuilding(port++, LDHeatingB3, heatTransportLengthB3));
		building3.addActorAsChild(building3Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 2, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/PV", ActorFactory.createPV(10, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/Battery", ActorFactory.createBattery(P_MAX_BATTERY_IN, P_MAX_BATTERY_OUT, EFFICIENCY_BAT, EFFICIENCY_BAT, CAPACITY_BATTERY, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/GasBoiler", ActorFactory.createGasBoiler(QDOT_MAX_GASBOILER, EFFICIENCY_GASBOILER, PORT_UNDEFINED));

		String building4Name = "Building4";		
		Boolean LDHeatingB4 = false;
		Integer heatTransportLengthB4 = 350;
		ActorTopology building4 = new ActorTopology(building4Name);		
		building4.addActor(building4Name, ActorFactory.createBuilding(port++, LDHeatingB4, heatTransportLengthB4));
		building4.addActorAsChild(building4Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 3, port++));
		building4.addActorAsChild(building4Name + "/CHP", ActorFactory.createCHP(QDOT_MAX_CHP, EFFICIENCY_CHP_EL, EFFICIENCY_CHP_H, port++));
		building4.addActorAsChild(building4Name + "/ThermalStorage", ActorFactory.createThermalStorage(QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, port++));

		String building5Name = "Building5";		
		Boolean LDHeatingB5 = false;
		Integer heatTransportLengthB5 = 450;
		ActorTopology building5 = new ActorTopology(building5Name);		
		building5.addActor(building5Name, ActorFactory.createBuilding(port++, LDHeatingB5, heatTransportLengthB5));
		building5.addActorAsChild(building5Name + "/Consumption", ActorFactory.createConsumer(consumptionProfiles, 4, port++));
		building5.addActorAsChild(building5Name + "/CHP", ActorFactory.createCHP(QDOT_MAX_CHP, EFFICIENCY_CHP_EL, EFFICIENCY_CHP_H, port++));
		building5.addActorAsChild(building5Name + "/SolarThermic", ActorFactory.createSolarThermic(10, port++));		
		building5.addActorAsChild(building5Name + "/ThermalStorage", ActorFactory.createThermalStorage(QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, port++));		
		
//		String building6Name = "Building6";	
//		Boolean LDHeatingB6 = false;
//		Integer heatTransportLengthB6 = 550;
//		ActorTopology building6 = new ActorTopology(building6Name);		
//		building6.addActor(building6Name, ActorFactory.createBuilding(building6Name, port++, LDHeatingB6, heatTransportLengthB6));
//		building6.addActorAsChild(building6Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 4, port++));
//		building6.addActorAsChild(building6Name + "/SolarThermic", ActorFactory.createSolarThermic("SolarThermic", AREA_SOLARTHERMIC, EFFICIENCY_SOLARTHERMIC, port++));
//		building6.addActorAsChild(building6Name + "/HeatPump", ActorFactory.createHeatPump("HeatPump", P_MAX_HEATPUMP, EFFICIENCY_HEATPUMP, PORT_UNDEFINED));
//		building6.addActorAsChild(building6Name + "/OilBoiler", ActorFactory.createOilBoiler("OilBoiler", QDOT_MAX_OILBOILER, EFFICIENCY_OILBOILER, PORT_UNDEFINED));
		
//		String districtStorageName = "DistrictStorage";
//		ActorTopology districtStorage = new ActorTopology(districtStorageName);	
//		districtStorage.addActor(districtStorageName, ActorFactory.createBattery("Battery", 10*P_MAX_BATTERY_IN, 10*P_MAX_BATTERY_OUT, EFFICIENCY_BAT, 10*CAPACITY_BATTERY, PORT_UNDEFINED));
		
		
		top.addSubTopology(simulationName, building3);
		top.addSubTopology(simulationName, building2);
		top.addSubTopology(simulationName, building1);
		top.addSubTopology(simulationName, building4);
		top.addSubTopology(simulationName, building5);
//		top.addSubTopology(simulationName, building6);
//		top.addSubTopology(simulationName, districtStorage);
		
		
		return top;
	}

}
