package linprogMPC;
import static linprogMPC.ConfigurationMEMAP.*;
import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;
import linprogMPC.ConfigurationMEMAP.MEMAPLogging;
import linprogMPC.ConfigurationMEMAP.OptHierarchy;
import linprogMPC.ConfigurationMEMAP.OptimizationGoal;
import linprogMPC.ConfigurationMEMAP.Optimizer;
import linprogMPC.ConfigurationMEMAP.ToolUsage;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class SimulationMILP {

	private ActorTopology topology;
	
	private void run() throws InterruptedException {
		
		int nMPC = 36;
		
		chosenOptimizer = Optimizer.MILP;
		chosenGoal = OptimizationGoal.EUR;
		//chosenGoal = OptimizationGoal.CO2;
		chosenOptimizationHierarchy = OptHierarchy.MEMAP;
		chosenToolUsage = ToolUsage.PLANNING;
		chosenMEMAPLogging =  MEMAPLogging.FILES;
		
		// **************MEMAP OFF *******************		
		topology = MILPTopology.createTopology(nMPC);
		
		SimulationStarter simulationStarter = new SimulationStarter(new GlobalTime());
		
		ActorSystem actorSystem = simulationStarter.initialiseActorSystem(topology);
		simulationStarter.startSimulation(actorSystem, 0, 2);
	}
	
	public static void main(String[] args){
		try {
			new SimulationMILP().run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
