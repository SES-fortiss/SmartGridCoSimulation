package linprog;

import topology.ActorTopology;

/**
 *
 * Topology for example with 5 buildings with Linear Programming
 * 
 * @author andreas.thut
 *
 */
public class Topology {	
	
	private static String simulationName = "LinProg-Simulation";
	
	public static ActorTopology createTopology(){
		int port = 8081;
		ActorTopology top = new ActorTopology(simulationName);
		top.addActor("MEMAP/BHKW1", ActorFactory.createBHKW("BHKW1", 250.0, .55, port++));
		top.addActor("MEMAP/BHKW2", ActorFactory.createBHKW("BHKW2", 250.0, .55, port++));
		top.addActor("MEMAP/BHKW3", ActorFactory.createBHKW("BHKW3", 250.0, .55, port++));
		top.addActor("MEMAP/BHKW4", ActorFactory.createBHKW("BHKW4", 250.0, .55, port++));
		top.addActor("MEMAP/BHKW5", ActorFactory.createBHKW("BHKW5", 250.0, .55, port++));
		
		return top;
	}

}
