package linprog;

import java.util.concurrent.TimeUnit;

import akka.actor.ActorSystem;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class LinProgSimulation {

	private ActorTopology topology;

<<<<<<< Updated upstream:examples/memap/src/main/java/linprog/LinProgSimulation.java
	public static final int N_STEPS = 3; // 15 min timestep
	public static final double N_DAYS = 1; // 24 hours
=======
	public static final int N_STEPS = 96; // 15 min timestep
	public static final double N_DAYS = 2; // 24 hours
>>>>>>> Stashed changes:examples/memap/src/main/java/linprog/Simulation.java
	
	public static final int TIMESTEPS_PER_ITERATION = N_STEPS; //equals N_STEPS for case of overall optimization, smaller for reactive case
	private static final int NR_OF_ITERATIONS = 1;
	
	// Does MEMAP has a long-distance heating connection to buy heat ?
	public static final boolean MEMAP_LDHeating = false;
	public static final double HEAT_LOSSES = 1.000;
	
	//For the moment, the following 3 parameters need to stay as defined to match data input
//	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,11,0);
//	public static LocalDateTime endTime = LocalDateTime.of(2014,7,1,12,0);
//	public static Duration timeInterval = Duration.ofMinutes(15);
	
	
	private void run() {
		// Test-Topology:
		topology = Topology2Houses.createTopology();
//		topology = Topology.createTopology();
		SimulationStarter.saveGridTopologyPlot(topology);   
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        SimulationStarter.startSimulation(actorSystem, 0, NR_OF_ITERATIONS);
		
	}
	
	public static void main(String[] args){
		new LinProgSimulation().run();
		
	}
	
	public static double stepLength(TimeUnit timeUnit) {
		double stepLengthInSeconds = 24*3600*N_DAYS/N_STEPS;
		switch (timeUnit) {
		case SECONDS:
			return stepLengthInSeconds;
		case MINUTES:
			return stepLengthInSeconds/60;
		case HOURS:
			return stepLengthInSeconds/3600;
		default:
			throw new RuntimeException("Timeunit " + timeUnit + " not implemented.");
		}
	}

}
