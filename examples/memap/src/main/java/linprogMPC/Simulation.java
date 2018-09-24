package linprogMPC;

import java.util.concurrent.TimeUnit;

import akka.actor.ActorSystem;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class Simulation {

	private ActorTopology topology;
	
	// ================= Model Predictive Control (MPC) =================
	public static final int N_STEPS_MPC = 5; //equals N_STEPS for case of overall optimization, smaller for case of MPC
	public static final int PREDICTION_UNCERTAINTY = 0;
	
	public static final int TIMESTEPS_PER_DAY = 12; // 120 min timestep
	public static final int NR_OF_ITERATIONS =  2*TIMESTEPS_PER_DAY; // 2 Days
	public static final int N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC; 
	//public static final double N_DAYS = 2; // 24 hours
	
	
	// Does MEMAP has a long-distance heating connection to buy heat ?
	public static final boolean MEMAP_LDHeating = true;
	public static final double HEAT_LOSSES = 1.0;
	
	//For the moment, the following 3 parameters need to stay as defined to match data input
//	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,11,0);
//	public static LocalDateTime endTime = LocalDateTime.of(2014,7,1,12,0);
//	public static Duration timeInterval = Duration.ofMinutes(15);
	
	
	private void run() {
		// Test-Topology:
		topology = Topology2HousesMPC.createTopology();
//		topology = Topology.createTopology();
		SimulationStarter.saveGridTopologyPlot(topology);   
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        SimulationStarter.startSimulation(actorSystem, 0, NR_OF_ITERATIONS);
        
	}
	
	public static void main(String[] args){
		new Simulation().run();
		
	}
	
	public static double stepLength(TimeUnit timeUnit) {
		double stepLengthInSeconds = 24*3600/TIMESTEPS_PER_DAY;
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
