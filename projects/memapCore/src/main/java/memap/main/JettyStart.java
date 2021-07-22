package memap.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.google.gson.Gson;
import memap.controller.BuildingController;
import memap.controller.OpcUaBuildingController;
import memap.controller.TopologyController;
import memap.helper.ElectricityPrice;
import memap.helper.EnergyPrices;
import memap.helper.HeatPrice;
import memap.helper.HelperUnnestingJSON;
import memap.helper.MEMAPLogging;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;

/**
 * 
 * JettyStart class initiates new topology controller.
 * 
 * @author freiesleben, JanAxelMayer
 */

public class JettyStart {

	public TopologyController topologyMemapOn;
	public TopologyController topologyMemapOff;
	public JsonObject errorCode;
	protected Gson gson = new Gson();

	public boolean simLoop = true;
	public boolean doubleSim = false;

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
		if (doubleSim) {
			topologyMemapOff.endSimulation();
		}
	}

	/**
	 * Initializes topologyController with all required buildings and has a Json
	 * containing the endpointValues(currently contains the configFile) as its
	 * input. errorCode contains a list of all requested buildings and an error code
	 * for their status. (Currently 0 = connected, 1 = not connected)
	 * 
	 * @param memapStartMessage JsonArray. Contains the buildingName, the OPC-UA
	 *                          address, the endpointDescriptor, the nodesConfig
	 *                          Json file, and optional the heat-connections.
	 */

	public void run(JsonObject memapStartMessage) {
	
		errorCode = new JsonObject();
		
		JsonObject project = null;
		JsonArray endpoints = null;
		JsonArray connections = null;
		
		// Collect information from memapStartMessage (JSON)
		try {
			project = (JsonObject) memapStartMessage.get("project");
			endpoints = (JsonArray) project.get("endpoints");
		} catch (Exception e1) {
			System.err.println("JSON Object startMessage has bad format.");
			e1.printStackTrace();
		}
		
		// Check if one endpoint contains multiple buildings (as for the test site Riemerling): 
		endpoints = HelperUnnestingJSON.checkForMultipleBuildingEndpoints(endpoints);
		
		
		// ****************************
		// TODO: Further distinguish here between MILP/LP optimizer and between EUR/CO2 criteria
		//
		if (project.toJson().contains("connections")){
			connections = (JsonArray) project.get("connections");
			
			System.out.println(">> Heat connection information availible.");
			topologyMemapOn = new TopologyController(
					"MemapOn", 
					OptHierarchy.MEMAP, 
					Optimizer.MILPwithConnections,
					OptimizationCriteria.EUR, 
					ToolUsage.SERVER, 
					MEMAPLogging.RESULTS_ONLY
					);	
		} else {
			
			System.out.println(">> No heat connection information availible. Assuming unlimited heat exchange.");
			topologyMemapOn = new TopologyController(
					"MemapOn", 
					OptHierarchy.MEMAP, 
					Optimizer.MILP,
					OptimizationCriteria.EUR, 
					ToolUsage.SERVER, 
					MEMAPLogging.RESULTS_ONLY
					);	
		}
		
		// ****************************
		
		// MPC input through start of the simulation environment. For MPC as an input parameter, 
		// probably the global variable Simulation.N_STEPS_MPC has to be changed here.
		// TODO: Second init() method without int timeStepsPerDay, int nrDays input
		System.out.println(">> MPC set to " + Simulation.N_STEPS_MPC + "\n");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
		TopologyConfig.getInstance().init(Simulation.N_STEPS_MPC, 96, 30, 7020, 0);
		
		
		// Global EnergyPrices: Import can be designed similar to connection (see planning tool), 
		// but is not necessary, if buildings provide price values via OPC UA.
		EnergyPrices.getInstance().init(
				new ElectricityPrice(0.285, Simulation.N_STEPS_MPC), //global buying price
				new ElectricityPrice(0.08, Simulation.N_STEPS_MPC),  //global selling price
				new HeatPrice(0.13, Simulation.N_STEPS_MPC) 		 //global heat price
				);
		
		// Starts additional simulation threads on the building level if doubleSim = true.
		// boolean can also be input through parameter Key ?
		if (doubleSim) {
			topologyMemapOff = new TopologyController(
					"MemapOff", 
					OptHierarchy.BUILDING, 
					Optimizer.MILP,
					OptimizationCriteria.EUR, 
					ToolUsage.SERVER, MEMAPLogging.ALL
					);
		}
		
		
		setNumofBuildings(endpoints.size());
//		System.out.println(">> Number of buildings: " + endpoints.size() + "\n");

		for (int i = 0; i < endpoints.size(); i++) {

			
			JsonObject jsonEndpoint = (JsonObject) endpoints.get(i);
			JsonObject configNodes = null;

			// Check if a heat connection exists for this building:
			String endpointName = (String) jsonEndpoint.get("name");
			String nameNodeA = null;
			JsonObject thisBuildingConnection = null;
			
			if (project.toJson().contains("connections")){
				for (int j = 0; j < connections.size(); j++) {
				JsonObject jsonConnection = (JsonObject) connections.get(j);
				nameNodeA = (String) jsonConnection.get("nameNodeA");		
					if (nameNodeA.equals(endpointName)) {
						thisBuildingConnection = jsonConnection;
						System.out.println(">> Heat connection found for Building " + (i + 1) + ":");
						System.out.println(thisBuildingConnection.toString());
					
					}
				}	
			}
			
			try {

				configNodes = (JsonObject) jsonEndpoint.get("config");

				System.out.println(">> Building " + (i + 1) + " (" + endpointName + ") will be added...");
				BuildingController sampleBuilding = new OpcUaBuildingController(topologyMemapOn, jsonEndpoint,
						configNodes, thisBuildingConnection);
				topologyMemapOn.attach(sampleBuilding.getName(), sampleBuilding);
				if (doubleSim) {
					topologyMemapOff.attach(sampleBuilding.getName(), sampleBuilding);
				}
				errorCode.put(endpointName, 0);
				System.out.println(">> Building " + (i + 1) + " (" + endpointName + ") was added... \n");

			} catch (IllegalStateException e2) {
				System.err.println(">> WARNING: Failed to create Client. Building has not been initialised");
				e2.printStackTrace();
				errorCode.put((String) endpointName, 1);
			}
		}

		try {
			// Wait so that we get initial values for all devices
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		LocalDateTime time = LocalDateTime.now();
		LocalDateTime nextQuarter = time.truncatedTo(ChronoUnit.HOURS).plusMinutes(15 * (time.getMinute() / 15 + 1));
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ssX");
		System.out.println("");
		System.out.println(">> Simulation will start at " + nextQuarter);

		// Here, the topology Controller gets started and runs in a loop.
		Runnable simulationMemapOn = new Runnable() {
			public void run() {
//				topologyMemapOn.startLiveSimulation(nextQuarter.toLocalDate(), java.time.Duration.ofSeconds(Simulation.PauseInSec));		
				topologyMemapOn.startLiveSimulation(LocalDate.now(), java.time.Duration.ofSeconds(Simulation.PauseInSec));
			}

		};

		Runnable simulationMemapOff = new Runnable() {
			public void run() {
				if (doubleSim) {
					topologyMemapOff.startLiveSimulation(LocalDate.now(), java.time.Duration.ofSeconds(Simulation.PauseInSec));
				}
			}
		};

		memapOnOffRegulator.schedule(simulationMemapOn, 0, TimeUnit.SECONDS);
		if (doubleSim) {
			memapOnOffRegulator.schedule(simulationMemapOff, 0, TimeUnit.SECONDS);
		}
	}

	public void setNumofBuildings(int x) {
		numofBuildings = x;
	}

	public static int getNumofBuildings() {
		return numofBuildings;
	}
}
