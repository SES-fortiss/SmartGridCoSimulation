package ethereum;

import akka.basicActors.ActorOptions;
import ethereum.helper.ConsumptionProfiles;
import topology.ActorTopology;

/**
 *
 * Topology for example with 5 buildings with smart contracts
 * 
 * @author andreas.thut
 *
 */
public class Topology {	
	
	private static String simulationName = "Ethereum";
	private static final int NR_OF_CONSUMERS = 5;
	private static final double EFFICIENCY_CHP_H = .6;
	private static final double EFFICIENCY_CHP_EL = .25;
	private static final double EFFICIENCY_THERMALSTORAGE = 1.;
	private static final double EFFICIENCY_GASBOILER = 1.;
	private static final double EFFICIENCY_OILBOILER = 1.;
	private static final double EFFICIENCY_SOLARTHERMIC = .5;
	private static final double EFFICIENCY_HEATPUMP = 3.8;
	private static final double EFFICIENCY_PV = .2;

	private static final double QDOT_MAX_THERMALSTORAGE_IN = 5.;
	private static final double QDOT_MAX_THERMALSTORAGE_OUT = 5.;
	private static final double QDOT_MAX_GASBOILER = 40.;
	private static final double QDOT_MAX_OILBOILER = 40.;
	private static final double P_MAX_BATTERY_IN = 5.;
	private static final double P_MAX_BATTERY_OUT = 5.;
	private static final double QDOT_MAX_CHP = 80.;
	private static final double AREA_SOLARTHERMIC = 6.;
	private static final double AREA_PV = 8.;
	private static final double P_MAX_HEATPUMP = 20.;
	private static final double CAPACITY_THERMALSTORAGE = 100000.;
	private static final double CAPACITY_BATTERY = 40000.;
	
	public static ActorTopology createTopology(){
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);		
		top.addActor(simulationName, ActorFactory.createTimekeeper(port++));
		ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(NR_OF_CONSUMERS);

		String building1Name = "Building1";			
		top.addActorAsChild(simulationName + "/" + building1Name, ActorFactory.createBuilding1(
				building1Name,
				8082,
				"0xae6ae8e5ccbfb04590405997ee2d52d2b330726137b875053c36d94e974d162f",
				consumptionProfiles,
				0));

		String building2Name = "Building2";			
		top.addActorAsChild(simulationName + "/" + building2Name, ActorFactory.createBuilding2(
				building2Name,
				8083,
				"0x0dbbe8e4ae425a6d2687f1a7e3ba17bc98c673636790f1b8ad91193c05875ef1",
				consumptionProfiles,
				1));

		String building3Name = "Building3";			
		top.addActorAsChild(simulationName + "/" + building3Name, ActorFactory.createBuilding3(
				building3Name,
				8084,
				"0xc88b703fb08cbea894b6aeff5a544fb92e78a18e19814cd85da83b71f772aa6c",
				consumptionProfiles,
				2));

		String building4Name = "Building4";			
		top.addActorAsChild(simulationName + "/" + building4Name, ActorFactory.createBuilding4(
				building4Name,
				8085,
				"0x388c684f0ba1ef5017716adb5d21a053ea8e90277d0868337519f97bede61418",
				consumptionProfiles,
				3));

		String building5Name = "Building5";			
		top.addActorAsChild(simulationName + "/" + building5Name, ActorFactory.createBuilding5(
				building5Name,
				8086,
				"0x659cbb0e2411a44db63778987b1e22153c086a95eb6b18bdf89de078917abc63",
				consumptionProfiles,
				4));
		
		return top;
	}

}
