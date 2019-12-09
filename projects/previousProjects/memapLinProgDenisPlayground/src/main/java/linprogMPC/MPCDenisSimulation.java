package linprogMPC;

import java.util.concurrent.TimeUnit;

import akka.actor.ActorSystem;
import cern.colt.matrix.DoubleMatrix2D;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class MPCDenisSimulation {

	private ActorTopology topology;
	
	// ================= Model Predictive Control (MPC) =================
	public static final int N_STEPS_MPC = 6; //equals N_STEPS for case of overall optimization, smaller for case of MPC
	public static final int PREDICTION_UNCERTAINTY = 0;
	
	public static final int TIMESTEPS_PER_DAY = 24; // Timesteps muss ganze Minuten ergeben.
	public static final int NR_OF_ITERATIONS =  2*TIMESTEPS_PER_DAY; // 2 Days
	public static final int N_STEPS = NR_OF_ITERATIONS + N_STEPS_MPC; // benötigt man damit der optimierer funktioniert.	
	
	// Does MEMAP has a long-distance heating connection to buy heat ?
	public static final boolean MEMAP_LDHeating = true;
	public static final double HEAT_LOSSES = 1.0;
	
	private void run() {
		topology = Topology2HousesMPC.createTopology();
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
        SimulationStarter.startSimulation(actorSystem, 0, NR_OF_ITERATIONS);
	}
	
	public static void main(String[] args){
		new MPCDenisSimulation().run();		
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
