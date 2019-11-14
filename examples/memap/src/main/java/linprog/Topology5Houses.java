package linprog;

import linprog.helper.ConsumptionProfiles;
import topology.ActorTopology;

/**
 *
 * Topology for example with 5 buildings with Linear Programming
 * 
 * @author andreas.thut
 *
 */
@SuppressWarnings("unused")
public class Topology5Houses {	
	
	private static String simulationName = "LinProg";
	public static final int NR_OF_CONSUMERS = 5;

	
	// Efficiencies	
	private static final double EFFICIENCY_CHP1_H = .61;
	private static final double EFFICIENCY_CHP1_EL = .29;  // angepasst, runterskalieren?
	private static final double QDOT_MAX_CHP1 = 70.5; // eher kleiner
	
	private static final double EFFICIENCY_CHP2_H = .6;
	private static final double EFFICIENCY_CHP2_EL = .28;  // angepasst, runterskalieren?
	private static final double QDOT_MAX_CHP2 = 71.7; // eher kleiner
	
	private static final double EFFICIENCY_BAT = .98;
	
	private static final double EFFICIENCY_THERMALSTORAGE = .9; 	
	private static final double EFFICIENCY_GASBOILER = .95; // angepasst    --> Gas etwas günstiger als Öl 5,5 pro kwH, 6,0 kWh
	private static final double EFFICIENCY_OILBOILER = .95; // angepasst
	private static final double EFFICIENCY_SOLARTHERMIC = .8; // vier mal pv --> in das Dokument (Latex)
	private static final double EFFICIENCY_HEATPUMP = 2.5;  // Mittelwert wobei Wasser / Wasser besser ist.
	private static final double EFFICIENCY_PV = .2;

	// Capacities
	private static final double CAPACITY_THERMALSTORAGE = 100.; // anpassen in KJ, 1000 L Speicher kann maximal 60kWh Wärme speichern
	private static final double QDOT_MAX_THERMALSTORAGE_IN = 60.;  // Beladung eines speichers, 90grad maximal temperatur
	private static final double QDOT_MAX_THERMALSTORAGE_OUT = 60.;
	private static final double QDOT_MAX_GASBOILER = 20.; // eigentlich nur für Spitzenlast wichtig
	private static final double QDOT_MAX_OILBOILER = 20.;
	private static final double P_MAX_BATTERY_IN = 9.;
	private static final double P_MAX_BATTERY_OUT = 9.;
	
	private static final double AREA_SOLARTHERMIC = 25.; // ab 8 qm kann zur heizungsunterstützungs genommen werden.
	private static final double AREA_PV = 25.; // aber  größer auch ok
	private static final double P_MAX_HEATPUMP = 10.;
	
	// Efficiencies
	private static final double CAPACITY_BATTERY = 12.;
	
	private static final double QDOT_MAX_THERMAL_LOSSES = 2.;   		 // [kWh/d]
	// not used yet
	
	
	private static final int PORT_UNDEFINED = 0;	
	
	public static ActorTopology createTopology(){
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
		
		//Aggregated Consumption
//		top.addActorAsChild(simulationName + "/Consumption", ActorFactory.createConsumer("/Consumption", port++));

		String building1Name = "Wohnen";		
		Boolean LDHeatingB1 = false;
		Integer heatTransportLengthB1 = 50;
		ActorTopology building1 = new ActorTopology(building1Name);		
		building1.addActor(building1Name, ActorFactory.createBuilding(building1Name, port++, LDHeatingB1, heatTransportLengthB1));
		building1.addActorAsChild(building1Name + "/OilBoiler", ActorFactory.createOilBoiler("OilBoiler", QDOT_MAX_OILBOILER, EFFICIENCY_OILBOILER, PORT_UNDEFINED));
		building1.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 0, PORT_UNDEFINED));


		String building2Name = "Buero_2";	
		Boolean LDHeatingB2 = false;
		Integer heatTransportLengthB2 = 150;
		ActorTopology building2 = new ActorTopology(building2Name);		
		building2.addActor(building2Name, ActorFactory.createBuilding(building2Name, port++, LDHeatingB2, heatTransportLengthB2));
		building2.addActorAsChild(building2Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 1, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/PV", ActorFactory.createPV("PV", AREA_PV*3, EFFICIENCY_PV, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/HeatPump", ActorFactory.createHeatPump("HeatPump", P_MAX_HEATPUMP, EFFICIENCY_HEATPUMP, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));
		building2.addActorAsChild(building2Name + "/GasBoiler", ActorFactory.createGasBoiler("GasBoiler", QDOT_MAX_GASBOILER, EFFICIENCY_GASBOILER, PORT_UNDEFINED));

		String building3Name = "Buero_1";		
		Boolean LDHeatingB3 = false;
		Integer heatTransportLengthB3 = 250;
		ActorTopology building3 = new ActorTopology(building3Name);		
		building3.addActor(building3Name, ActorFactory.createBuilding(building3Name, port++, LDHeatingB3, heatTransportLengthB3));
		building3.addActorAsChild(building3Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 2, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/PV", ActorFactory.createPV("PV", AREA_PV, EFFICIENCY_PV, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/Battery", ActorFactory.createBattery("Battery", P_MAX_BATTERY_IN, P_MAX_BATTERY_OUT, EFFICIENCY_BAT, CAPACITY_BATTERY, PORT_UNDEFINED));
		building3.addActorAsChild(building3Name + "/GasBoiler", ActorFactory.createGasBoiler("GasBoiler", QDOT_MAX_GASBOILER, EFFICIENCY_GASBOILER, PORT_UNDEFINED));

		String building4Name = "Hotel";		
		Boolean LDHeatingB4 = false;
		Integer heatTransportLengthB4 = 350;
		ActorTopology building4 = new ActorTopology(building4Name);		
		building4.addActor(building4Name, ActorFactory.createBuilding(building4Name, port++, LDHeatingB4, heatTransportLengthB4));
		building4.addActorAsChild(building4Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 3, PORT_UNDEFINED));
		building4.addActorAsChild(building4Name + "/CHP", ActorFactory.createCHP("CHP1", QDOT_MAX_CHP1, EFFICIENCY_CHP1_EL, EFFICIENCY_CHP1_H, PORT_UNDEFINED));
		building4.addActorAsChild(building4Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));

		String building5Name = "Schule";		
		Boolean LDHeatingB5 = false;
		Integer heatTransportLengthB5 = 450;
		ActorTopology building5 = new ActorTopology(building5Name);		
		building5.addActor(building5Name, ActorFactory.createBuilding(building5Name, port++, LDHeatingB5, heatTransportLengthB5));
		building5.addActorAsChild(building5Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 4, PORT_UNDEFINED));
		building5.addActorAsChild(building5Name + "/CHP", ActorFactory.createCHP("CHP1", QDOT_MAX_CHP2, EFFICIENCY_CHP2_EL, EFFICIENCY_CHP2_H, PORT_UNDEFINED));
		building5.addActorAsChild(building5Name + "/SolarThermic", ActorFactory.createSolarThermic("SolarThermic", AREA_SOLARTHERMIC, EFFICIENCY_SOLARTHERMIC, PORT_UNDEFINED));		
		building5.addActorAsChild(building5Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));		
		
		
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
		
		
		top.addSubTopology(simulationName, building1);
		top.addSubTopology(simulationName, building2);
		top.addSubTopology(simulationName, building3);
		top.addSubTopology(simulationName, building4);
		top.addSubTopology(simulationName, building5);
		
//		top.addSubTopology(simulationName, building6);
//		top.addSubTopology(simulationName, districtStorage);
		
		
		return top;
	}

}
