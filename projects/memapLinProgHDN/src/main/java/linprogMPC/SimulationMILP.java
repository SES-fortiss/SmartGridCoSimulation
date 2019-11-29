package linprogMPC;

import akka.actor.ActorSystem;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class SimulationMILP {

	private ActorTopology topology;
	
	private void run() throws InterruptedException {
		
		int nMPC = 3;
		
		// **************MEMAP OFF *******************		
		topology = MILPTopology.createTopology(nMPC, false);
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        SimulationStarter.startSimulation(actorSystem, 0, 2);
	}
	
	public static void main(String[] args){
		try {
			new SimulationMILP().run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
