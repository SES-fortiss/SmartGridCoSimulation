package linprogMPC.controller;

import static linprogMPC.ConfigurationMEMAP.chosenCriteria;
import static linprogMPC.ConfigurationMEMAP.chosenMEMAPLogging;
import static linprogMPC.ConfigurationMEMAP.chosenOptimizationHierarchy;
import static linprogMPC.ConfigurationMEMAP.chosenOptimizer;
import static linprogMPC.ConfigurationMEMAP.chosenToolUsage;

import java.util.ArrayList;
import java.util.List;

import akka.actor.ActorSystem;
import linprogMPC.ActorFactory;
import linprogMPC.ConfigurationMEMAP;
import linprogMPC.ConfigurationMEMAP.MEMAPLogging;
import linprogMPC.ConfigurationMEMAP.OptHierarchy;
import linprogMPC.ConfigurationMEMAP.OptimizationCriteria;
import linprogMPC.ConfigurationMEMAP.Optimizer;
import linprogMPC.ConfigurationMEMAP.ToolUsage;
import linprogMPC.TopologyConfig;
import linprogMPC.components.prototypes.Building;
import linprogMPC.components.prototypes.Device;
import linprogMPC.components.prototypes.MEMAPCoordination;
import linprogMPC.helper.EnergyPrices;
import simulation.SimulationStarter;
import topology.ActorTopology;

/**
 * This class is used to handle the topology of the optimization. This includes
 * 1) Setting the static fields of {@linkplain TopologyConfig} and
 * {@linkplain ConfigurationMEMAP} 2) Attaching Buildings to the Topology.
 * 
 * Note: Because {@linkplain TopologyConfig} is using static fields, creating a
 * new TopologyController will change these fields for ALL topologies.
 * Therefore: Do not try to use more than one TopologyController at the same
 * time!
 * 
 * @author Adrian.Krueger
 *
 */
public class TopologyController extends TopologyConfig {

	public List<BuildingController> managedBuildings = new ArrayList<BuildingController>();

	public ActorTopology top;

	public TopologyController(OptHierarchy optHierarchy, Optimizer optimizer, OptimizationCriteria optimizationCriteria,
			ToolUsage toolUsage, MEMAPLogging memapLogging, String name, int nrStepsMPC, int timeStepsPerDay,
			int nrDays, String energyPriceFile, int portUndefined, int predUncertainty) {
		configureGlobalParameters(optHierarchy, optimizer, optimizationCriteria, toolUsage, memapLogging, name,
				nrStepsMPC, timeStepsPerDay, nrDays, portUndefined, predUncertainty);
		TopologyConfig.energyPrices = new EnergyPrices(energyPriceFile);
	}

	public TopologyController(OptHierarchy optHierarchy, Optimizer optimizer, OptimizationCriteria optimizationCriteria,
			ToolUsage toolUsage, MEMAPLogging memapLogging, String name, int nrStepsMPC, int timeStepsPerDay,
			int nrDays, double energyPriceValue, int portUndefined, int predUncertainty) {
		configureGlobalParameters(optHierarchy, optimizer, optimizationCriteria, toolUsage, memapLogging, name,
				nrStepsMPC, timeStepsPerDay, nrDays, portUndefined, predUncertainty);
		TopologyConfig.energyPrices = new EnergyPrices(energyPriceValue);
	}
	
	private void configureGlobalParameters(OptHierarchy optHierarchy, Optimizer optimizer,
			OptimizationCriteria optimizationCriteria, ToolUsage toolUsage, MEMAPLogging memapLogging, String name,
			int nrStepsMPC, int timeStepsPerDay, int nrDays, int portUndefined, int predUncertainty) {

		// Configure MEMAP
		chosenOptimizer = optimizer;
		chosenCriteria = optimizationCriteria;
		chosenOptimizationHierarchy = optHierarchy;
		chosenToolUsage = toolUsage;
		chosenMEMAPLogging = memapLogging;

		// Configure topology
		simulationName = name;
		N_STEPS_MPC = nrStepsMPC;
		TIMESTEPS_PER_DAY = timeStepsPerDay;
		NR_DAYS = nrDays;
		calcNrIterations();
		calcNrSteps();
		PORT_UNDEFINED = portUndefined;
		PREDICTION_UNCERTAINTY = predUncertainty;
	}

	public void attach(BuildingController buildingController) {
		managedBuildings.add(buildingController);
	}

	public void startSimulation() {

		createTopology();
		ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(this.top);
		SimulationStarter.startSimulation(actorSystem, 0, TopologyConfig.NR_OF_ITERATIONS);
	}

	public void endSimulation() {
		SimulationStarter.stopSimulation();
	}

	private void createTopology() {
		// Creating Actor Topology
		this.top = new ActorTopology(TopologyConfig.simulationName);
		top.addActor(TopologyConfig.simulationName, ActorFactory.createDevice(new MEMAPCoordination()));

		for (BuildingController managedBuilding : managedBuildings) {
			String buildingName = managedBuilding.getName();

			Building building = new Building(TopologyConfig.PORT_UNDEFINED);

			ActorTopology buildingHead = new ActorTopology(buildingName);
			buildingHead.addActor(buildingName, ActorFactory.createDevice(building));
			for (Device device : managedBuilding.getDevices()) {
				buildingHead.addActorAsChild(buildingName + "/" + device.actorName, ActorFactory.createDevice(device));
			}
			top.addSubTopology(TopologyConfig.simulationName, buildingHead);
			TopologyConfig.PORT_UNDEFINED += 1;
		}
	}
}
