package linprogMPC;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Set;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonKey;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import akka.actor.ActorSystem;
import linprogMPC.controller.BuildingController;
import linprogMPC.controller.OpcUaBuildingController;
import linprogMPC.controller.TopologyController;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.helperOPCua.OpcuaClient;
import opcMEMAP.ConfigInterface;
import simulation.SimulationStarter;
import topology.ActorTopology;

public class JettyStart {

//	public ActorTopology topology;
	public TopologyController topologyController;
	public JsonObject errorCode;
	
	
	public void main(String arg, JsonArray endpoint) {
		// show help by default

		switch (arg) {
		case "help":
		case "h":
			System.out.println(showHelp());
			break;
		// run the simulation
		case "start":
		case "s":
			new JettyStart().run(endpoint);
			break;
		// run the simulation in a loop
		case "loop":
		case "l":
			boolean loop = true;
			while (loop) {
				new JettyStart().run(endpoint);
				break;
			}
		default:
			System.out.println(showHelp());
			break;
		}
	}
	
	public TopologyController getTopology() {
		return topologyController;
	}
	public JsonObject getErrorCode() {
		return errorCode;
	}
	
	public void stopSimulation() {
		System.out.println("disconnect");
//		No Idea
		}
	
	public void run(JsonArray endpointValues) {
		topologyController = new TopologyController("MEMAP", true, 1, 96, 7, 0, false, 9999);
		errorCode=new JsonObject();
		
		//So far, Config Nodes are hard coded. For future versions the Node Json has to be provided by the local EMS
		/*JsonObject jsonNodes1=null;
		try {
			FileReader nodes1 = new FileReader("src/main/java/linprogMPC/controller/FortissBuilding1Nodes.json");
			jsonNodes1 = (JsonObject) Jsoner.deserialize(nodes1);
		} catch (FileNotFoundException | JsonException e1) {
			System.err.println("WARNING: Failed to read JSON config files. Building has not been initalised.");
			e1.printStackTrace();
		}
		*/
		//Iterating through all the endpoint Jsons inputed in the user interface
		//generates a building controller for every jsonEndpoint,jsonNodes tuple
		//Buildings get attached to the topology
		
		
		for (int i=0;i<endpointValues.size();i++) {

				
					JsonObject jsonEndpoint = (JsonObject) endpointValues.get(i);
					try {
					String NodeConfig=(String) jsonEndpoint.get("config");
					JsonObject jsonNodes=null;
					try {
						jsonNodes = (JsonObject) Jsoner.deserialize(NodeConfig);
					} catch (JsonException e) {
						System.out.println("could not be deserialized");
						e.printStackTrace();
					}
					BuildingController sampleBuilding = new OpcUaBuildingController(jsonEndpoint, jsonNodes);
					topologyController.attach(sampleBuilding);
					errorCode.put((String) jsonEndpoint.get("name"), 0);
			
		} catch (IllegalStateException e2) {
			System.err.println("WARNING: Failed to create Client. Building has not been initialised");
			e2.printStackTrace();
			errorCode.put((String) jsonEndpoint.get("name"), 1);
		}
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Wait so that we get initial values for all devices
		
		
		
		//Here, the topology Controller gets started. However, if activated, the thread runs through and thereby blocks our Jetty Server.
		
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
				+ "    help  : show the help screen \n";
		return help;
	}
}
