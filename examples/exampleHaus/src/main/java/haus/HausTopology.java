package haus;

import haus.behaviorModels.EMSBehaviorModel;
import haus.behaviorModels.HeizungBehaviourModel;
import haus.behaviorModels.KuehlschrankBehaviorModel;
import haus.behaviorModels.WaschmaschineBehaviorModel;

import java.util.HashSet;

import resultSaving.NoSave;
import topology.ActorTopology;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;


/**
 * HausTopology
 * 14.04.2014
 * @author Markus
 *
 */

public class HausTopology {
	
	/**
	 * ACHTUNG Name der Simulation muss ohne Leerzeichen sein! (wg. AKKA)
	 */
	private static String simulationName = "Haus-Simulation";
	
	public static ActorTopology createTopology(){
		ActorTopology top = new ActorTopology(simulationName);
		String path = "EMS";
		
		/*
		 *  Actor Topology
		 */
		ActorOptions result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new EMSBehaviorModel(),new NoSave());	
		top.addActor(path, result); 
		
		
		path = "EMS/Waschmaschine";
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new WaschmaschineBehaviorModel(),new NoSave());	
		top.addActorAsChild(path, result); 
		
		
		
		path = "EMS/Heizung";
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new HeizungBehaviourModel(),new NoSave());	
		top.addActorAsChild(path, result); 
		
		path = "EMS/Kuehlschrank";
		result = new ActorOptions(LoggingMode.MINIMAL,							
				new HashSet<String>(),new HashSet<String>(),new HashSet<String>(),
				new KuehlschrankBehaviorModel(),new NoSave());	
		top.addActorAsChild(path, result); 
			
		
		return top;
	}
}
