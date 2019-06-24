package linprog;

import linprog.helper.ConsumptionProfiles;
import topology.ActorTopology;

/**
 *
 * Topology for example with 5 buildings (CoSES) with Linear Programming
 * 
 * @author jan.mayer
 *
 */
@SuppressWarnings("unused")
public class TopologyCoSES {	
	
	private static String simulationName = "LinProg";
	public static final int NR_OF_CONSUMERS = 5;

	// Alle Angaben in % [Efficiency], kW [P_MAX] 
	
	// BHKW	
	private static final double EFFICIENCY_CHP_H = .6;
	private static final double EFFICIENCY_CHP_EL = .3; 
	
	private static final double QDOT_el_MAX_microCHP = 2.;     // [kW_el]
	private static final double QDOT_th_MAX_microCHP = 5.3;    // [kW_th]  
	private static final double QDOT_el_MAX_StirlingCHP = 1.;  // [kW_el]
	private static final double QDOT_th_MAX_StirlingCHP = 6.;  // [kW_th]
	private static final double QDOT_el_MAX_CHP1 = 5.5;        // [kW_el]
	private static final double QDOT_th_MAX_CHP1 = 14;  	   // [kW_th]
	private static final double QDOT_el_MAX_CHP2 = 20.;        // [kW_el]
	private static final double QDOT_th_MAX_CHP2 = 36.;  	   // [kW_th]
	
	
	// Wärmepumpe
	private static final double EFFICIENCY_HEATPUMP = 2.5;  // Mittelwert wobei Wasser / Wasser besser ist.
	
	private static final double P_MAX_HEATPUMP = 10.;  	   // [kW_th]
	
	// Heizkessel
	private static final double EFFICIENCY_GASBOILER = 0.85; 
//	private static final double EFFICIENCY_OILBOILER = 0.95; // angepasst
	
	private static final double QDOT_MAX_GASBOILER1 = 20.;   		 // [kW_th]
	private static final double QDOT_MAX_GASBOILER2 = 26.;    		 // [kW_th]
	private static final double QDOT_MAX_GASBOILER3 = 20.;   		 // [kW_th]
	private static final double QDOT_MAX_ELECTRICBOILER = 10.;    // [kW_th]
	private static final double QDOT_MAX_GASBOILER5 = 50.;   		 // [kW_th]
	
	// Solarthermie
	private static final double EFFICIENCY_SOLARTHERMIC = .75; // vier mal pv --> in das Dokument (Latex)
	private static final double AREA_SOLARTHERMIC = 16.;
	
	// Batterie 
	private static final double EFFICIENCY_BAT = 1.;
	
	private static final double P_MAX_BATTERY_IN = 5.;
	private static final double P_MAX_BATTERY_OUT = 5.;
	
	private static final double CAPACITY_BATTERY = 12.; 	// [kWh]
	
	// Photovoltaik
	private static final double EFFICIENCY_PV = .2;
	private static final double AREA_PV = 20.;
	

	// Wärmespeicher
	private static final double EFFICIENCY_THERMALSTORAGE = 0.9; 	
	
	private static final double QDOT_MAX_THERMALSTORAGE_IN = 60.;   // [kW_th]  -  Beladung eines speichers, 90grad maximal temperatur
	private static final double QDOT_MAX_THERMALSTORAGE_OUT = 60.;  // [kW_th]
	
	
	private static final double CAPACITY_THERMALSTORAGE1 = 19.8; 	// [kWh] -  850 l
	private static final double CAPACITY_THERMALSTORAGE2 = 23.3; 	// [kWh] - 1000 l
	private static final double CAPACITY_THERMALSTORAGE3 = 11.6; 	// [kWh] -  500 l
	private static final double CAPACITY_THERMALSTORAGE4 = 19.8; 	// [kWh] -  850 l
	private static final double CAPACITY_THERMALSTORAGE5 = 46.6; 	// [kWh] - 2000 l
	 // 1000 L Speicher kann maximal 60kWh Wärme speichern
	
	private static final double QDOT_MAX_THERMAL_LOSSES = 2.;   		 // [kWh/d]
	// not used yet
	
	// Warmwassermodul
	
	
	
	private static final int PORT_UNDEFINED = 0;	
	

	public static ActorTopology createTopology(){
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor(simulationName, ActorFactory.createLinProgBehavior());
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);
		
		//Aggregated Consumption
//		top.addActorAsChild(simulationName + "/Consumption", ActorFactory.createConsumer("/Consumption", port++));

		String building1Name = "Office_1";		
		Boolean LDHeatingB1 = false;
		Integer heatTransportLengthB1 = 50;
//		Integer[] heatTransportLengthB1 = {0, 30, 300, 20, 60};
		ActorTopology building1 = new ActorTopology(building1Name);		
		building1.addActor(building1Name, ActorFactory.createBuilding(building1Name, port++, LDHeatingB1, heatTransportLengthB1));
		 building1.addActorAsChild(building1Name + "/CHP", ActorFactory.createCHP("CHP", QDOT_th_MAX_microCHP, EFFICIENCY_CHP_EL, EFFICIENCY_CHP_H, PORT_UNDEFINED));
		 building1.addActorAsChild(building1Name + "/GasBoiler", ActorFactory.createOilBoiler("GasBoiler", QDOT_MAX_GASBOILER1, EFFICIENCY_GASBOILER, PORT_UNDEFINED));
		 building1.addActorAsChild(building1Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE1, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));
 		 building1.addActorAsChild(building1Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 0, PORT_UNDEFINED));


		String building2Name = "Office_2";	
		Boolean LDHeatingB2 = false;
		Integer heatTransportLengthB2 = 150;
		ActorTopology building2 = new ActorTopology(building2Name);	
		building2.addActor(building2Name, ActorFactory.createBuilding(building2Name, port++, LDHeatingB2, heatTransportLengthB2));
		 building2.addActorAsChild(building2Name + "/CHP", ActorFactory.createCHP("CHP", QDOT_th_MAX_StirlingCHP, EFFICIENCY_CHP_EL, EFFICIENCY_CHP_H, PORT_UNDEFINED));
		 building2.addActorAsChild(building2Name + "/GasBoiler", ActorFactory.createOilBoiler("GasBoiler", QDOT_MAX_GASBOILER2, EFFICIENCY_GASBOILER, PORT_UNDEFINED));
		 building2.addActorAsChild(building2Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE2, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));
 		 building2.addActorAsChild(building2Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 1, PORT_UNDEFINED));
		
		String building3Name = "Living";		
		Boolean LDHeatingB3 = false;
		Integer heatTransportLengthB3 = 250;
		ActorTopology building3 = new ActorTopology(building3Name);		
		building3.addActor(building3Name, ActorFactory.createBuilding(building3Name, port++, LDHeatingB3, heatTransportLengthB3));
		 building3.addActorAsChild(building3Name + "/GasBoiler", ActorFactory.createOilBoiler("GasBoiler", QDOT_MAX_GASBOILER3, EFFICIENCY_GASBOILER, PORT_UNDEFINED));
		 building3.addActorAsChild(building3Name + "/SolarThermic", ActorFactory.createSolarThermic("SolarThermic", AREA_SOLARTHERMIC, EFFICIENCY_SOLARTHERMIC, PORT_UNDEFINED));
		 building3.addActorAsChild(building3Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE3, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));
		 building3.addActorAsChild(building3Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 2, PORT_UNDEFINED));

		String building4Name = "School";		
		Boolean LDHeatingB4 = false;
		Integer heatTransportLengthB4 = 350;
		ActorTopology building4 = new ActorTopology(building4Name);		
		building4.addActor(building4Name, ActorFactory.createBuilding(building4Name, port++, LDHeatingB4, heatTransportLengthB4));		
		 building4.addActorAsChild(building4Name + "/HeatPump", ActorFactory.createHeatPump("HeatPump", P_MAX_HEATPUMP, EFFICIENCY_HEATPUMP, PORT_UNDEFINED));
		 building4.addActorAsChild(building4Name + "/ElectricBoiler", ActorFactory.createGasBoiler("ElectricBoiler", QDOT_MAX_ELECTRICBOILER, EFFICIENCY_GASBOILER, PORT_UNDEFINED));
		 building4.addActorAsChild(building4Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE4, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));
		 building4.addActorAsChild(building4Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 3, PORT_UNDEFINED));
		
		
		String building5Name = "Hotel";		
		Boolean LDHeatingB5 = false;
		Integer heatTransportLengthB5 = 450;
		ActorTopology building5 = new ActorTopology(building5Name);		
		building5.addActor(building5Name, ActorFactory.createBuilding(building5Name, port++, LDHeatingB5, heatTransportLengthB5));
		 building5.addActorAsChild(building5Name + "/CHP1", ActorFactory.createCHP("CHP1", QDOT_th_MAX_CHP1, EFFICIENCY_CHP_EL, EFFICIENCY_CHP_H, PORT_UNDEFINED));
		 building5.addActorAsChild(building5Name + "/CHP2", ActorFactory.createCHP("CHP2", QDOT_th_MAX_CHP2, EFFICIENCY_CHP_EL, EFFICIENCY_CHP_H, PORT_UNDEFINED));
		 building5.addActorAsChild(building5Name + "/GasBoiler", ActorFactory.createOilBoiler("GasBoiler", QDOT_MAX_GASBOILER5, EFFICIENCY_GASBOILER, PORT_UNDEFINED));	
		 building5.addActorAsChild(building5Name + "/ThermalStorage", ActorFactory.createThermalStorage("ThermalStorage", QDOT_MAX_THERMALSTORAGE_IN, QDOT_MAX_THERMALSTORAGE_OUT, CAPACITY_THERMALSTORAGE5, EFFICIENCY_THERMALSTORAGE, PORT_UNDEFINED));		
		 building5.addActorAsChild(building5Name + "/Consumption", ActorFactory.createConsumer("Consumption", consumptionProfiles, 4, PORT_UNDEFINED));
			
		
		top.addSubTopology(simulationName, building1);
		top.addSubTopology(simulationName, building2);
		top.addSubTopology(simulationName, building3);
		top.addSubTopology(simulationName, building4);
		top.addSubTopology(simulationName, building5);
		
		return top;
	}

}
