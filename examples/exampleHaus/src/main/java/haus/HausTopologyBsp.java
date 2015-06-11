package haus;

import haus.behaviorModels.EMSBehaviorModel;
import haus.behaviorModels.testVererbung;

import java.util.HashSet;

import resultSaving.NoSave;
import topology.ActorTopology;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;

/* HausTopology
 * 14.04.2014
 * @author Markus
 *
 */

public class HausTopologyBsp {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	private static String simulationName = "VPP-Grid-SimulationBSP";
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		String path;
		
		/*
		 *  Actor Topology
		 */
		
		// Solar
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new EMSBehaviorModel(),new NoSave());	
		top.addActor("Basic", result);
		
		for (int i = 1; i <= 10; i++) {
			result = new ActorOptions(LoggingMode.MINIMAL,							
					new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
					new testVererbung(),new NoSave());	
			path = "/Solar"+i;
			top.addActorAsChild("Basic"+path, result); 
		}
		
		return top;
	}
}
