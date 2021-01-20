package memap.main;

import java.io.FileWriter;
import java.io.Writer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.google.gson.Gson;

import memap.controller.BuildingController;
import memap.controller.OpcUaBuildingController;
import memap.controller.TopologyController;
import memap.helper.EnergyPrices;
import memap.helper.MEMAPLogging;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;

/**
 * 
 * JettyStart class initiates new topology controller.
 * 
 * @author freiesleben
 */

public class JettyStart {

	public TopologyController topologyMemapOn;
	//public TopologyController topologyMemapOff;
	public JsonObject errorCode;
	protected Gson gson = new Gson();
	
	public boolean simLoop = true;
	public static int numofBuildings = 0;
	ScheduledExecutorService memapOnOffRegulator = Executors.newScheduledThreadPool(2);
	public TopologyController getTopology() {
		return topologyMemapOn;
	}

	public JsonObject getErrorCode() {
		return errorCode;
	}

	public void stopSimulation() {
		simLoop = false;
		topologyMemapOn.endSimulation();
		//topologyMemapOff.endSimulation();
	}

	/**
	 * Initializes topologyController with all required buildings and has a Json
	 * containing the endpointValues(currently contains the configFile) as its
	 * input. errorCode contains a list of all requested buildings and an error code
	 * for their status. (Currently 0 = connected, 1 = not connected)
	 * 
	 * @param memapStartMessage JsonArray. Contains the buildingName, the OPC-UA
	 *                       address, the endpointDescriptor, and the nodesConfig
	 *                       Json file.
	 */

	public void run(JsonObject memapStartMessage) {
		topologyMemapOn = new TopologyController("MemapOn", OptHierarchy.MEMAP, Optimizer.MILP, OptimizationCriteria.EUR,
				ToolUsage.SERVER, MEMAPLogging.RESULTS_ONLY);
<<<<<<< HEAD
		TopologyConfig.getInstance().init(Simulation.N_STEPS_MPC, 96, 30, 4880, 0);
		EnergyPrices.getInstance().init(0.285);
		EnergyPrices.getInstance().initGas("C:/Git/SESSIM/projects/memapCore/src/main/java/resources/gasprice_15minutes.csv");
//		EnergyPrices.getInstance().initGas("./gasprice_15minutes.csv");
=======
		TopologyConfig.getInstance().init(Simulation.N_STEPS_MPC, 96, 30, 7020, 0);
		System.out.println("MPC set to " + Simulation.N_STEPS_MPC);
		EnergyPrices.getInstance().init(0.285);
//		EnergyPrices.getInstance().initGas("C:/Git/SESSIM/projects/memapCore/src/main/java/resources/gasprice_hourly.csv");
		EnergyPrices.getInstance().initGas("./gasprice_15minutes.csv");
>>>>>>> feat-PortalConnection
		//topologyMemapOff = new TopologyController("MemapOff", OptHierarchy.BUILDING, Optimizer.MILP, OptimizationCriteria.EUR,
		//		ToolUsage.SERVER, MEMAPLogging.RESULTS_ONLY);
		
		errorCode = new JsonObject();
		/*
		 * Iterating through all the end-point Jsons inputed in the user interface
		 * generates a building controller for every jsonEndpoint,jsonNodes tuple
		 * Buildings get attached to the topology
		 */
		
		int num = 0;
		/*
		 * In case the startMessage comes directly from an opcua endpoint aggregator 
		 * (e.g Holsten Systems UI), this part will use directly the information from the datamodel
		 */
<<<<<<< HEAD
		JsonArray endpoints = endpointValues;
//		try {
//			JsonObject full = (JsonObject) endpointValues.get(0);
//			JsonObject project = (JsonObject) full.get("project");
//			endpoints = (JsonArray) project.get("endpoints");
//			
//			try (Writer writer = new FileWriter("endpoints.json")) {
//			    writer.write(gson.toJson(endpoints));
//			} catch (Exception e) {
//				System.err.println("Speicher fail!");
//				e.printStackTrace();
//			}
//			
//			num =  endpoints.size();
//			
//			
//		} catch (Exception e1) {
//			System.err.println("houses.get(\"endpoints\") hat nicht geklappt");
//			e1.printStackTrace();
//		}
=======
>>>>>>> feat-PortalConnection
		
		JsonArray endpoints = null;
		try {
			JsonObject project = (JsonObject) memapStartMessage.get("project");
			endpoints = (JsonArray) project.get("endpoints");
			num =  endpoints.size();	
		} catch (Exception e1) {
			System.err.println("JSON Object startMessage has bad format.");
			e1.printStackTrace();
		}
		
		setNumofBuildings(num);
		System.out.println("Number of buildings: " + num);
		
		for (int i = 0; i < endpoints.size(); i++) {
			
			JsonObject jsonEndpoint = (JsonObject) endpoints.get(i);
<<<<<<< HEAD
			try {
				String NodeConfig = (String) jsonEndpoint.get("config");
				JsonObject jsonNodes = null;
				try {
					jsonNodes = (JsonObject) Jsoner.deserialize(NodeConfig);
				} catch (JsonException e) {
					System.err.println("Topology could not be deserialized");
					e.printStackTrace();
				}
				System.out.println("Building " + (i+1) + " will be added...");
				BuildingController sampleBuilding = new OpcUaBuildingController(topologyMemapOn, jsonEndpoint, jsonNodes);
=======
			JsonObject configNodes = null;
			
			try {
				
				configNodes = (JsonObject) jsonEndpoint.get("config");
				
//				try (Writer writer = new FileWriter("configNodes2.json")) {
//					writer.write(gson.toJson(configNodes));
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
				
				System.out.println("Building " + (i+1) + " will be added...");
				BuildingController sampleBuilding = new OpcUaBuildingController(topologyMemapOn, jsonEndpoint, configNodes);
>>>>>>> feat-PortalConnection
				//BuildingController sampleBuilding2 = new OpcUaBuildingController(topologyMemapOff, jsonEndpoint, jsonNodes);
				topologyMemapOn.attach(sampleBuilding);
				//topologyMemapOff.attach(sampleBuilding2);
				errorCode.put((String) jsonEndpoint.get("name"), 0);
				System.out.println("Building " + (i+1) + " was added...");

			} catch (IllegalStateException e2) {
				System.err.println("WARNING: Failed to create Client. Building has not been initialised");
				e2.printStackTrace();
				errorCode.put((String) jsonEndpoint.get("name"), 1);
			}
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // Wait so that we get initial values for all devices

		// Here, the topology Controller gets started and runs in a loop.
		Runnable simulationMemapOn = new Runnable() {
			public void run() {
				while (simLoop) {
					topologyMemapOn.startSimulation();
					
				}
			}
		};
		/*Runnable simulationMemapOff = new Runnable() {
			public void run() {
				while (simLoop) {
					topologyMemapOff.startSimulation();
				}
			}
		};*/

		memapOnOffRegulator.schedule(simulationMemapOn, 0, TimeUnit.SECONDS);
		//memapOnOffRegulator.schedule(simulationMemapOff, 0, TimeUnit.SECONDS);
	}
	public void setNumofBuildings(int x) {
		numofBuildings = x;
	}
	public static int getNumofBuildings() {
		return numofBuildings;
	}
}
