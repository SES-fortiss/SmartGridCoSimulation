package linprogMPC;

import akka.actor.ActorSystem;
import linprogMPC.examples.FiveBuildingExample;
import opcMEMAP.ConfigInterface;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class ThesisSimulation {

    private ActorTopology topology;

    public static void main(String[] args) {
	ConfigInterface jsonInterface = new ConfigInterface();
	String server = jsonInterface.getHost();
	int port = jsonInterface.getPort();
	String help = "Hi there, this is MEMAP.\n" + "To reach the OPC-UA server on this machine, please use opc.tcp://"
		+ server + ":" + port + "/sessim\n" + "\n"
		+ "Use these commands to run the simulation (i.e. use MemapServer.jar [command]: \n"
		+ "    start : runs the simulation once \n" + "    loop  : runs the simulation in an indefinite loop \n"
		+ "    help  : show the help screen \n";

	// Show the help screen by default
	String arg = "help";
	if (args.length == 1) {
	    arg = args[0];
	}

	switch (arg) {
	case "help":
	case "h":
	    System.out.println(help);
	    break;
	case "start":
	case "s":
	    try {
		new ThesisSimulation().run();
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	    break;
	case "loop":
	case "l":
	    boolean loop = true;
	    while (loop) {
		try {
		    new ThesisSimulation().run();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    }
	    break;
	default:
	    System.out.println(help);
	    break;
	}
    }

    private void run() throws InterruptedException {
	// Testing of new Implementation
	int[] mpcTimeSteps = { 2 };
	for (int i = 0; i < mpcTimeSteps.length; i++) {
	    topology = FiveBuildingExample.exampleTopology();
	    ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
	    SimulationStarter.startSimulation(actorSystem, 0, 7 * 96);
	}
	// **************MEMAP OFF *******************

	// int[] mpcTimeSteps = { 1, 4, 12, 24, 36, 48, 60, 72 };

	// int[] mpcTimeSteps = { 4 };
	// for (int i = 0; i < mpcTimeSteps.length; i++) {
	// topology = ThesisTopologySimple.createTopology(mpcTimeSteps[i], false);
	// ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
	// SimulationStarter.startSimulation(actorSystem, 0,
	// ThesisTopologySimple.NR_OF_ITERATIONS);
	// }

	// **************MEMAP ON ********************
//	int[] mpcTimeSteps2 = { 1, 4, 12, 24, 36, 48, 60, 72 };
//	for (int i = 0; i < mpcTimeSteps2.length; i++) {
//	    topology = ThesisTopologySimple.createTopology(mpcTimeSteps2[i], true);
//	    ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
//	    SimulationStarter.startSimulation(actorSystem, 0, ThesisTopologySimple.NR_OF_ITERATIONS);
//	}

    }
}
