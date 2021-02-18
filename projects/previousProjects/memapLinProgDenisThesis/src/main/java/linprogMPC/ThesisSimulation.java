package linprogMPC;

import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class ThesisSimulation {

	private ActorTopology topology;
	
	private void run() throws InterruptedException {
		
		// **************MEMAP OFF *******************
		
		//int[] mpcTimeSteps = {1,4,12,24,36,48,60,72};
		
		int[] mpcTimeSteps = {4};
		for (int i = 0; i < mpcTimeSteps.length; i++) {
			topology = ThesisTopologySimpleSingle.createTopology(mpcTimeSteps[i], false);
			
			SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
			
			ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);
			simulationStarter.startSimulation(actorSystem, 0, ThesisTopologySimpleSingle.NR_OF_ITERATIONS);
		}
		
		
		// **************MEMAP ON ********************
		//int[] mpcTimeSteps2 = {1,4,12,24,36,48,60,72};
		int[] mpcTimeSteps2 = {};
		for (int i = 0; i < mpcTimeSteps2.length; i++) {
			topology = ThesisTopologySimple.createTopology(mpcTimeSteps2[i], true);
			SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
			
			ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);
			simulationStarter.startSimulation(actorSystem, 0, ThesisTopologySimple.NR_OF_ITERATIONS);
		}
						
		
	}
	
	public static void main(String[] args){
		try {
			new ThesisSimulation().run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
