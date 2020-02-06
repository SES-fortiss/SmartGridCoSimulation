package example;

import powerflowApi.PowerflowTopology;
import topology.ActorTopology;

/**
 * 
 * This is the topology for the simulation
 * 
 * @author bytschkow
 *
 */

public class AreaModel {
	
	private static String simulationName = "SimulationStabilizeE";
	
	public static ActorTopology createTopology(){
		
		ActorTopology actorTopology = new ActorTopology(simulationName);				
		
		
		/*
		 *  THIS is the ICT model
		 */
		
		actorTopology.addActor("Aggregator", HelperClassForCreation.createAggregator());
		String path;
		
		path = "Aggregator/Solar";
		actorTopology.addActorAsChild(path, HelperClassForCreation.createSolar(3000));		
		
		for (int i = 1; i <= 3; i++) {
			path = "Aggregator/HouseProfil1_"+i;
			actorTopology.addActorAsChild(path, HelperClassForCreation.createHouse(4300));
		}
				
		for (int i = 1; i <= 5; i++) {
			path = "Aggregator/HouseProfil2_"+i;
			actorTopology.addActorAsChild(path, HelperClassForCreation.createHouse(8000));
			path = path + "/solar";
			actorTopology.addActorAsChild(path, HelperClassForCreation.createSolar(2500));
		}
		
		for (int i = 1; i <= 3; i++) {
			path = "Aggregator/Commercial_"+i;
			actorTopology.addActorAsChild(path, HelperClassForCreation.createCommercial(15000));
		}
		
		for (int i = 1; i <= 2; i++) {
			path = "Aggregator/Farm_"+i;
			actorTopology.addActorAsChild(path, HelperClassForCreation.createFarm(11000));
			path = path + "/solar";
			actorTopology.addActorAsChild(path, HelperClassForCreation.createSolar(5000));
		}
						
		path = "Aggregator/StreetLights";
		actorTopology.addActorAsChild(path, HelperClassForCreation.createStreetLights(7000)); 		
		
		/*
		 *  THIS is the powerflow model
		 */
		
		PowerflowTopology pfModel = new PowerflowTopology();
		String nodeName = "";
		
		nodeName = "/user/ActorSupervisor/Aggregator/HouseProfil1_1";
		pfModel.addNodeBelow(nodeName);
		nodeName = "/user/ActorSupervisor/Aggregator/HouseProfil1_2";
		pfModel.addNodeBelow(nodeName);
		nodeName = "/user/ActorSupervisor/Aggregator/HouseProfil2_1";
		pfModel.addNodeBelow(nodeName);
		nodeName = "/user/ActorSupervisor/Aggregator/Farm_1";
		pfModel.addNodeBelow(nodeName);
		
		/*
		 *  THIS is the mapping between powerflow model and ICT
		 */
		
		pfModel.autoMap(actorTopology);
		
		return actorTopology;
	}
}
