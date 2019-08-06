package linprogMPC;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import linprogMPC.controller.BuildingController;
import linprogMPC.controller.OpcUaBuildingController;
import linprogMPC.controller.TopologyController;
import linprogMPC.websocket.JettyWebsocket;
import opcMEMAP.ConfigInterface;

public class ThesisSimulation {

    public static void main(String[] args) {
	// show help by default
	String arg = "help";
	// if argument is passed, use argument instead
	if (args.length == 1) {
	    arg = args[0];
	}

	switch (arg) {
	case "help":
	case "h":
	    System.out.println(showHelp());
	    break;
	// run the simulation
	case "start":
	case "s":
	    new ThesisSimulation().run();
	    break;
	// run the simulation in a loop
	case "loop":
	case "l":
	    boolean loop = true;
	    while (loop) {
		new ThesisSimulation().run();
	    }
	    break;
	case "jetty":
	case "j":
	    String[] arbitraryValue = null;
	    JettyWebsocket.main(arbitraryValue);
	    break;
	default:
	    System.out.println(showHelp());
	    break;
	}
    }

    private void run() {
	TopologyController topologyController = new TopologyController("MEMAP", true, 5, 96, 7, 0, false, 9999);

	try {
	    BufferedReader endpoint1 = new BufferedReader(new InputStreamReader(
		    this.getClass().getClassLoader().getResourceAsStream("opcconfig/FortissBuilding1Endpoint.json")));
	    BufferedReader nodes1 = new BufferedReader(new InputStreamReader(
		    this.getClass().getClassLoader().getResourceAsStream("opcconfig/FortissBuilding1Nodes.json")));
	    JsonObject jsonEndpoint1 = (JsonObject) Jsoner.deserialize(endpoint1);
	    JsonObject jsonNodes1 = (JsonObject) Jsoner.deserialize(nodes1);
	    BuildingController sampleBuilding1 = new OpcUaBuildingController(jsonEndpoint1, jsonNodes1);
	    topologyController.attach(sampleBuilding1);
	} catch (JsonException e1) {
	    System.err.println("WARNING: Failed to read JSON config files. Building has not been initalised.");
	    e1.printStackTrace();
	} catch (IllegalStateException e2) {
	    System.err.println("WARNING: Failed to create Client. Building has not been initialised");
	    e2.printStackTrace();
	}

	try {
	    BufferedReader endpoint2 = new BufferedReader(new InputStreamReader(
		    this.getClass().getClassLoader().getResourceAsStream("opcconfig/FortissBuilding2Endpoint.json")));
	    BufferedReader nodes2 = new BufferedReader(new InputStreamReader(
		    this.getClass().getClassLoader().getResourceAsStream("opcconfig/FortissBuilding2Nodes.json")));
	    JsonObject jsonEndpoint2 = (JsonObject) Jsoner.deserialize(endpoint2);
	    JsonObject jsonNodes2 = (JsonObject) Jsoner.deserialize(nodes2);
	    BuildingController sampleBuilding2 = new OpcUaBuildingController(jsonEndpoint2, jsonNodes2);
	    topologyController.attach(sampleBuilding2);
	} catch (JsonException e1) {
	    System.err.println("WARNING: Failed to read JSON config files. Building has not been initalised.");
	    e1.printStackTrace();
	} catch (IllegalStateException e2) {
	    System.err.println("WARNING: Failed to create Client. Building has not been initialised");
	    e2.printStackTrace();
	}

	try {
	    Thread.sleep(5000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} // Wait so that we get initial values for all devices

	topologyController.startSimulation();

	// To test the optimizer with csv files, maybe try this:
//	topology = FiveBuildingExample.exampleTopology(true);
//	ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(topology);
//	SimulationStarter.startSimulation(actorSystem, 0, ThesisTopologySimple.NR_OF_ITERATIONS);

	// **************MEMAP OFF *******************

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

    private static String showHelp() {
	ConfigInterface jsonInterface = new ConfigInterface();
	String server = jsonInterface.getHost();
	int port = jsonInterface.getPort();
	String help = "Hi there, this is MEMAP.\n" + "To reach the OPC-UA server on this machine, please use opc.tcp://"
		+ server + ":" + port + "/sessim\n" + "\n"
		+ "Use these commands to run the simulation (i.e. use MemapServer.jar [command]: \n"
		+ "    start : runs the simulation once \n" + "    loop  : runs the simulation in an indefinite loop \n"
		+ "    jetty  : start jetty webserver. (Available under 8080) \n"
		+ "    help  : show the help screen \n";
	return help;
    }
}
