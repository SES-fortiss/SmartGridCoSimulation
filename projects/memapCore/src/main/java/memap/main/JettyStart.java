package memap.main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import memap.controller.BuildingController;
import memap.controller.OpcUaBuildingController;
import memap.controller.TopologyController;
import memap.main.ConfigurationMEMAP.MEMAPLogging;
import memap.main.ConfigurationMEMAP.OptHierarchy;
import memap.main.ConfigurationMEMAP.OptimizationCriteria;
import memap.main.ConfigurationMEMAP.Optimizer;
import memap.main.ConfigurationMEMAP.ToolUsage;

/**
 * 
 * JettyStart class initiates new topology controller.
 * 
 * @author freiesleben
 */

public class JettyStart {

	public TopologyController topologyMemapOn;
	public TopologyController topologyMemapOff;
	public JsonObject errorCode;
	public boolean simLoop = true;
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
		topologyMemapOff.endSimulation();
	}

	/**
	 * Initializes topologyController with all required buildings and has a Json
	 * containing the endpointValues(currently contains the configFile) as its
	 * input. errorCode contains a list of all requested buildings and an error code
	 * for their status. (Currently 0 = connected, 1 = not connected)
	 * 
	 * @param endpointValues JsonArray. Contains the buildingName, the OPC-UA
	 *                       address, the endpointDescriptor, and the nodesConfig
	 *                       Json file.
	 */

	public void run(JsonArray endpointValues) {
		topologyMemapOn = new TopologyController(OptHierarchy.MEMAP, Optimizer.MILP, OptimizationCriteria.EUR,
				ToolUsage.SERVER, MEMAPLogging.RESULTS_ONLY, "MemapOn", 5, 96, 7, false , 0, "ELECTRICITYPRICEEXAMPLE", 0, 9999);
		topologyMemapOff = new TopologyController(OptHierarchy.BUILDING, Optimizer.MILP, OptimizationCriteria.EUR,
				ToolUsage.SERVER, MEMAPLogging.RESULTS_ONLY, "MemapOn", 5, 96, 7, false, 0, "ELECTRICITYPRICEEXAMPLE", 0, 9999);
		errorCode = new JsonObject();

		/*
		 * Iterating through all the end-point Jsons inputed in the user interface
		 * generates a building controller for every jsonEndpoint,jsonNodes tuple
		 * Buildings get attached to the topology
		 */
		System.out.println("Anzahl Gebäude: " + endpointValues.size());
		for (int i = 0; i < endpointValues.size(); i++) {
			JsonObject jsonEndpoint = (JsonObject) endpointValues.get(i);
			try {
				String NodeConfig = (String) jsonEndpoint.get("config");
				JsonObject jsonNodes = null;
				try {
					jsonNodes = (JsonObject) Jsoner.deserialize(NodeConfig);
				} catch (JsonException e) {
					System.err.println("Topology could not be deserialized");
					e.printStackTrace();
				}
				System.out.println("Gebäude " + i + " wird hinzugefügt....");
				BuildingController sampleBuilding = new OpcUaBuildingController(jsonEndpoint, jsonNodes);
				topologyMemapOn.attach(sampleBuilding);
				topologyMemapOff.attach(sampleBuilding);
				errorCode.put((String) jsonEndpoint.get("name"), 0);
				System.out.println("Gebäude " + i + " wurde hinzugefügt....");

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
		Runnable simulationMemapOff = new Runnable() {
			public void run() {
				while (simLoop) {
					topologyMemapOff.startSimulation();
				}
			}
		};

		memapOnOffRegulator.schedule(simulationMemapOn, 0, TimeUnit.SECONDS);
		memapOnOffRegulator.schedule(simulationMemapOff, 0, TimeUnit.SECONDS);
	}
}
