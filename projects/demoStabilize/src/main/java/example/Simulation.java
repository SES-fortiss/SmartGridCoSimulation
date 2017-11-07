package example;

import java.time.Duration;
import java.time.LocalDateTime;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;


public class Simulation {
	
	private ActorTopology topology;
	
	public static LocalDateTime startTime = LocalDateTime.of(2014,6,1,12,0);
	public static LocalDateTime endTime = LocalDateTime.of(2014,6,1,14,0);
	public static Duration timeInterval = Duration.ofMinutes(1);
	
	public void run(){			
		topology = AreaModel.createTopology();		
		SimulationStarter.saveGridTopologyPlot(topology);   
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);

		SimulationStarter.startSimulation(actorSystem,startTime, endTime, timeInterval);
	}
	
	public static void main(String[] args){
		new Simulation().run();
	}
}
