package linprogMPC;

import java.util.concurrent.TimeUnit;

import akka.actor.ActorSystem;
import akka.timeManagement.GlobalTime;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class Simulation {

	private ActorTopology topology;
	
	//
	public static final boolean Static_Simulation = true;
	
	// ================= Model Predictive Control (MPC) =================
	public static final int N_STEPS_MPC = 192; //equals N_STEPS for case of overall optimization, smaller for case of MPC
	public static final int PREDICTION_UNCERTAINTY = 0;
	
	public static final int TIMESTEPS_PER_DAY = 96; // 120 min timestep
	public static final int NR_OF_ITERATIONS =  1; // 2*TIMESTEPS_PER_DAY; // 2 Days
	public static final int N_STEPS = 192; // NR_OF_ITERATIONS + N_STEPS_MPC; 

	
	
	// Does MEMAP has a long-distance heating connection to buy heat ?
	public static final boolean MEMAP_LDHeating = false;
	public static final double HEAT_LOSSES = 1.0;
	
	
	//For the moment, the following 3 parameters need to stay as defined to match data input
//	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,11,0);
//	public static LocalDateTime endTime = LocalDateTime.of(2014,7,1,12,0);
//	public static Duration timeInterval = Duration.ofMinutes(15);
	
	private static GlobalTime globalTime = new GlobalTime();
	
	public static GlobalTime getGlobalTime(){
		return globalTime; 
	}
	
	
	private void run() {
		// Test-Topology:
		topology = Topology2Houses.createTopology();
//		topology = Topology.createTopology();
		SimulationStarter.saveGridTopologyPlot(topology);
		
		SimulationStarter simStarter = new SimulationStarter(globalTime);
		
		ActorSystem actorSystem = simStarter.initialiseActorSystem(topology);
		simStarter.startSimulation(actorSystem, 0, NR_OF_ITERATIONS);
        
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
