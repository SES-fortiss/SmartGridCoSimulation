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
	 *                          address, the endpointDescriptor, and the nodesConfig
	 *                          Json file.
	 */

	public void run(JsonObject memapStartMessage) {

		topologyMemapOn = new TopologyController("MemapOn", OptHierarchy.MEMAP, Optimizer.MILP,
				OptimizationCriteria.EUR, ToolUsage.SERVER, MEMAPLogging.ALL);

		TopologyConfig.getInstance().init(Simulation.N_STEPS_MPC, 96, 30, 7020, 0);
		System.out.println(">> MPC set to " + Simulation.N_STEPS_MPC);
		EnergyPrices.getInstance().init(new ElectricityPrice(0.285, Simulation.N_STEPS_MPC),
				new ElectricityPrice(0.285, Simulation.N_STEPS_MPC), new HeatPrice(0.285, Simulation.N_STEPS_MPC));

		if (doubleSim) {
			topologyMemapOff = new TopologyController("MemapOff", OptHierarchy.BUILDING, Optimizer.MILP,
					OptimizationCriteria.EUR, ToolUsage.SERVER, MEMAPLogging.ALL);
		}

		errorCode = new JsonObject();

		int num = 0;

		JsonArray endpoints = null;
		try {
			JsonObject project = (JsonObject) memapStartMessage.get("project");
			endpoints = (JsonArray) project.get("endpoints");
			num = endpoints.size();
		} catch (Exception e1) {
			System.err.println("JSON Object startMessage has bad format.");
			e1.printStackTrace();
		}

		setNumofBuildings(num);
		System.out.println(">> Number of buildings: " + num);

		for (int i = 0; i < endpoints.size(); i++) {

			JsonObject jsonEndpoint = (JsonObject) endpoints.get(i);
			JsonObject configNodes = null;

			try {

				configNodes = (JsonObject) jsonEndpoint.get("config");

				System.out.println("Building " + (i + 1) + " will be added...");
				BuildingController sampleBuilding = new OpcUaBuildingController(topologyMemapOn, jsonEndpoint,
						configNodes);
				topologyMemapOn.attach(sampleBuilding.getName(), sampleBuilding);
				if (doubleSim) {
					topologyMemapOff.attach(sampleBuilding.getName(), sampleBuilding);
				}
				errorCode.put((String) jsonEndpoint.get("name"), 0);
				System.out.println("Building " + (i + 1) + " was added...");

			} catch (IllegalStateException e2) {
				System.err.println("WARNING: Failed to create Client. Building has not been initialised");
				e2.printStackTrace();
				errorCode.put((String) jsonEndpoint.get("name"), 1);
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
//				topologyMemapOn.startLiveSimulation(nextQuarter.toLocalDate(), java.time.Duration.ofSeconds(5));		
				topologyMemapOn.startLiveSimulation(LocalDate.now(), java.time.Duration.ofSeconds(5));
			}

		};

		Runnable simulationMemapOff = new Runnable() {
			public void run() {
				if (doubleSim) {
					topologyMemapOff.startLiveSimulation(LocalDate.now(), java.time.Duration.ofSeconds(5));
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
