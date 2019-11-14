package linprog;

import java.util.concurrent.TimeUnit;

import akka.actor.ActorSystem;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class LinProgSimulation {

	private ActorTopology topology;

	public static final int N_STEPS = 192; // 15 min timestep
	public static final double N_DAYS = 2; // 24 hours
	
	public static final int TIMESTEPS_PER_ITERATION = N_STEPS; //equals N_STEPS for case of overall optimization, smaller for reactive case
	private static final int NR_OF_ITERATIONS = 1;
	
	// Does MEMAP has a long-distance heating connection to buy heat ?
	public static final boolean MEMAP_LDHeating = false;
	public static final double HEAT_LOSSES = 1.0;
	
	// Optimization parameters
	public static final double MIX_DE_EL = 0.474; // Emissionen deutscher Strommix   kg CO2 / kWh
	public static final double MIX_DE_H = 0.196; // Emissionen deutscher Fernwärme   kg CO2 / kWh
	public static final double ESV_DE = 0.1111;  // Einspeisevergütung

	
	// SET Optimization Criteria
	// OPT_RATIO * Grenzkosten + Emissionen* CO2_PRICE + (1-OPT_RATIO) * CO2 Emissionen in t
	public static final double OPT_RATIO = 1;	// 0 = CO2 Emissionen; 1 = Kosten
	public static final double CO2_PRICE = 140;   // Euro per ton
	
	// add cost_plus

	
	//For the moment, the following 3 parameters need to stay as defined to match data input
//	public static LocalDateTime startTime = LocalDateTime.of(2014,7,1,11,0);
//	public static LocalDateTime endTime = LocalDateTime.of(2014,7,1,12,0);
//	public static Duration timeInterval = Duration.ofMinutes(15);
	
	
	private void run() {
		// Test-Topology:
//		topology = Topology2Houses.createTopology();
//		topology = Topology.createTopology();
//		topology = TopologyCoSES.createTopology();
		topology = Topology5Houses.createTopology();
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
