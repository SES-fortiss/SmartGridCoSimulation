package linprogMPC;

import akka.actor.ActorSystem;
import simulation.SimulationStarter;
import topology.ActorTopology;
import static linprogMPC.ThesisTopologySimple.*; 

public class ThesisSimulation {

	private ActorTopology topology;	
	
	private void run() {
		topology = createTopology();
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        SimulationStarter.startSimulation(actorSystem, 0, NR_OF_ITERATIONS);
	}
	
	public static void main(String[] args){
		new ThesisSimulation().run();		
	}
}
