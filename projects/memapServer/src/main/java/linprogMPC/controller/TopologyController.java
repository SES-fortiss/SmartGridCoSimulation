package linprogMPC.controller;

import java.util.ArrayList;
import java.util.List;
import akka.actor.ActorSystem;
import linprogMPC.ActorFactory;
import linprogMPC.TopologyConfig;
import linprogMPC.components.prototypes.Building;
import linprogMPC.components.prototypes.Device;
import linprogMPC.components.prototypes.LinProgBehavior;
import simulation.SimulationStarter;
import topology.ActorTopology;

/**
 * This class is used to handle the topology of the optimization. This includes 1) Setting the
 * static fields of ThesisTopologysimple 2) Attaching Buildings to the Topology.
 * 
 * Note: Because ThesisTopologySimple is using static fields, creating a new TopologyController will
 * change these fields for ALL topologies. Therefore: Do not try to use more than one
 * TopologyController at the same time!
 * 
 * @author Adrian.Krueger
 *
 */
public class TopologyController extends TopologyConfig {

  public List<BuildingController> managedBuildings = new ArrayList<BuildingController>();

  public ActorTopology top;

  public TopologyController(String name, boolean memapOn, int nrStepsMPC, int timeStepsPerDay,
      int nrDays, int predUncertainty, boolean hasLDHeating, int portUndefined) {
   
    TopologyConfig.simulationName = name;
    TopologyConfig.PORT_UNDEFINED = portUndefined;
    TopologyConfig.N_STEPS_MPC = nrStepsMPC;
    TopologyConfig.TIMESTEPS_PER_DAY = timeStepsPerDay;
    TopologyConfig.PREDICTION_UNCERTAINTY = predUncertainty;
    TopologyConfig.MEMAP_LDHeating = hasLDHeating;
    TopologyConfig.MEMAP_ON = memapOn;
    TopologyConfig.NR_DAYS = nrDays;
    TopologyConfig.calcNrIterations();
    TopologyConfig.calcNrSteps();
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
    int thePort = 7070;
    this.top = new ActorTopology(TopologyConfig.simulationName);
    LinProgBehavior linProg = new LinProgBehavior(thePort);
    top.addActor(TopologyConfig.simulationName, ActorFactory.createDevice(linProg));

    for (BuildingController managedBuilding : managedBuildings) {
      String buildingName = managedBuilding.getName();
      boolean LDHeatingON = managedBuilding.hasLDHeaeting();
      int heatTransportLength = managedBuilding.getHeatTransportLength();

      Building building = new Building(TopologyConfig.PORT_UNDEFINED, LDHeatingON, heatTransportLength);

      ActorTopology buildingHead = new ActorTopology(buildingName);
      buildingHead.addActor(buildingName, ActorFactory.createDevice(building));
      for (Device device : managedBuilding.getDevices()) {
        buildingHead.addActorAsChild(buildingName + "/" + device.getClass().getName(),
            ActorFactory.createDevice(device));
      }
      top.addSubTopology(TopologyConfig.simulationName, buildingHead);
      TopologyConfig.PORT_UNDEFINED += 1;
    }
  }
}
