package memap.controller;

import java.time.Duration;
import java.time.LocalDate;
import java.util.HashMap;

import akka.actor.ActorSystem;
import akka.timeManagement.CurrentTimeStepSubscriber;
import akka.timeManagement.GlobalTime;
import memap.components.prototypes.Building;
import memap.components.prototypes.Device;
import memap.components.prototypes.MEMAPCoordination;
import memap.helper.MEMAPLogging;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;
import memap.main.ActorFactory;
import memap.main.ConfigurationMEMAP;
import memap.main.SimulationProgress;
import memap.main.TopologyConfig;
import simulation.SimulationStarter;
import topology.ActorTopology;

/**
 * This class is used to handle the topology of the optimization. This includes
 * 1) Setting the fields of {@linkplain TopologyConfig} and
 * {@linkplain ConfigurationMEMAP} 2) Attaching Buildings to the Topology.
 * 
 * Note: Because {@linkplain TopologyConfig} does not use static fields, it is
 * possible to create multiple topology controllers to run concurrently
 * 
 */
public class TopologyController implements Runnable {

	/** Name of the simulation */
	private String topologyName;
	/** Simulation starter instance */
	private SimulationStarter simulationStarter;
	/** Global set of time-related values */
	private GlobalTime globalTime = new GlobalTime();
	/** General configuration for behavior of the tool */
	private ConfigurationMEMAP memapConfig;
	/** Parameter configuration for the topology */
	private TopologyConfig topologyConfig = TopologyConfig.getInstance();
	/** List of managed buildings in the topology */
	public HashMap<String, BuildingController> managedBuildings = new HashMap<String, BuildingController>();
	/** Actor topology */
	private ActorTopology top;

	public TopologyController(String topologyName, OptHierarchy optHierarchy, Optimizer optimizer, OptimizationCriteria optimizationCriteria,
			ToolUsage toolUsage, MEMAPLogging memapLogging) {
		this.topologyName = topologyName;
		simulationStarter = new SimulationStarter(globalTime);
		memapConfig = new ConfigurationMEMAP(optimizer, optimizationCriteria, optHierarchy, toolUsage, memapLogging);
		globalTime.subscribeToCurrentTimeStep(SimulationProgress.getInstance());
	}
	
	/** Attach a building to the topology */
	public void attach(String buildingName, BuildingController buildingController) {
		managedBuildings.put(buildingName, buildingController);
	}

	/** Calls creates the topology and starts the simulation */
	public void startSimulation() {
		createTopology();
		ActorSystem actorSystem = simulationStarter.initialiseActorSystem(this.top);
		simulationStarter.startSimulation(actorSystem, 0, topologyConfig.getNrOfIterations());
	}
	
	/** Calls creates the topology and starts the live-simulation 
	 * @param duration 
	 * @param startDate */
	public void startLiveSimulation(LocalDate startDate, Duration duration) {
		createTopology();
		ActorSystem actorSystem = simulationStarter.initialiseActorSystem(this.top);
		simulationStarter.startSimulation(actorSystem, startDate, duration);
	}
	
	/** Stops the simulation */
	public void endSimulation() {
		SimulationStarter.stopSimulation();
	}

	/**
	 * Creates the topology and provides a reference of the topology to all the
	 * devices contained
	 */
	private void createTopology() {
		// Creating Actor Topology
		this.top = new ActorTopology(topologyName);
		MEMAPCoordination memapCoordination = new MEMAPCoordination(this);
		top.addActor(topologyName, ActorFactory.createDevice(memapCoordination));

		//for (BuildingController managedBuilding : managedBuildings) {
		for (BuildingController managedBuilding : managedBuildings.values()) {
			String buildingName = managedBuilding.getName();
      
//      Building building = new Building(this, topologyConfig.getPortUndefined());
			Building building = new Building(this, 0);

			ActorTopology buildingHead = new ActorTopology(buildingName);
			buildingHead.addActor(buildingName, ActorFactory.createDevice(building));
			for (Device device : managedBuilding.getDevices()) {
				buildingHead.addActorAsChild(buildingName + "/" + device.actorName, ActorFactory.createDevice(device));
				device.setTopologyController(this);
			}
			top.addSubTopology(topologyName, buildingHead);
			topologyConfig.increasePortUndefined();
		}
	}

	public Optimizer getOptimizer() {
		return memapConfig.getOptimizer();
	}

	public OptHierarchy getOptimizationHierarchy() {
		return memapConfig.getOptimizationHierarchy();
	}

	public OptimizationCriteria getOptimizationCriteria() {
		return memapConfig.getOptimizationCriteria();
	}

	public ToolUsage getToolUsage() {
		return memapConfig.getToolUsage();
	}

	public MEMAPLogging getLogging() {
		return memapConfig.getLogging();
	}
	
	public String getSimulationName() {
		return topologyName;
	}
	
	public void setSimulationName(String topologyName) {
		this.topologyName = topologyName;
	}
	
	public void setOptimizationHierarchy(OptHierarchy optimizationHierarchy) {
		memapConfig.setOptimizationHierarchy(optimizationHierarchy);
	}

	public void subscribeToCurrentTimeStep(CurrentTimeStepSubscriber subscriber) {
		globalTime.subscribeToCurrentTimeStep(subscriber);
	}
	
	@Override
	public void run() {
		startSimulation();
	}
}
