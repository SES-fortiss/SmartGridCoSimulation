package memap;

import akka.actor.ActorSystem;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class MemapSimulation {

	private ActorTopology topology;
	
	private void run() throws InterruptedException {
		
		// **************MEMAP OFF *******************
		
		int mpcLength = 4;
		
		topology = MemapTopology.createTopology(mpcLength, true);
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        SimulationStarter.startSimulation(actorSystem, 0, MemapConfig.NR_OF_ITERATIONS);
	
	
	}
	
	public static void main(String[] args){
		try {
			new MemapSimulation().run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
