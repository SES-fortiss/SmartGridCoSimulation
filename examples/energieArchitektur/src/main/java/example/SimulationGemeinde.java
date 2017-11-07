package example;

import java.time.Duration;
import java.time.LocalDateTime;

import simulation.SimulationStarter;
import topology.ActorTopology;
import akka.actor.ActorSystem;


public class SimulationGemeinde {
	
	private ActorTopology topology;
	
	public static LocalDateTime startTime = LocalDateTime.of(2014,1,1,0,0);
	public static LocalDateTime endTime = LocalDateTime.of(2015,1,1,0,0);
	public static Duration timeInterval = Duration.ofMinutes(60);
	
	public void run(){
		topology = GemeindeTest.createTopology();
		
		//topology = SchlechingExcel.createTopology();
		
		SimulationStarter.saveGridTopologyPlot(topology);   
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
		SimulationStarter.startSimulation(actorSystem,startTime, endTime, timeInterval);
	}
	
	public static void main(String[] args){
		new SimulationGemeinde().run();
	}
}
