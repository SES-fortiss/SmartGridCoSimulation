package linprogMPC.controller;

import java.util.HashSet;
import java.util.Set;

import akka.actor.ActorSystem;
import linprogMPC.ActorFactory;
import linprogMPC.ThesisTopologySimple;
import linprogMPC.components.Building;
import linprogMPC.components.LinProgBehavior;
import linprogMPC.components.prototypes.Device;
import simulation.SimulationStarter;
import topology.ActorTopology;

/**
 * This class is used to handle the topology of the optimization. This includes
 * 1) Setting the static fields of ThesisTopologysimple 2) Attaching Buildings
 * to the Topology.
 * 
 * Note: Because ThesisTopologySimple is using static fields, creating a new
 * TopologyController will change these fields for ALL topologies. Therefore: Do
 * not try to use more than one TopologyController at the same time!
 * 
 * @author Adrian.Krueger
 *
 */
public class TopologyController extends ThesisTopologySimple {

    public int nrStepsMPC;
    public boolean memapOn;
    public int portUndefined;
    public String name;
    public int timeStepsPerDay;
    public int nrDays;
    public int predUncertainty;
    public boolean hasLDHeating;

    public Set<BuildingController> managedBuildings = new HashSet<>();

    public ActorTopology top;

    public TopologyController(String name, boolean memapOn, int nrStepsMPC, int timeStepsPerDay, int nrDays,
	    int predUncertainty, boolean hasLDHeating, int portUndefined) {
	this.name = name;
	this.nrStepsMPC = nrStepsMPC;
	this.memapOn = memapOn;
	this.portUndefined = portUndefined;
	this.timeStepsPerDay = timeStepsPerDay;
	this.nrDays = nrDays;
	this.predUncertainty = predUncertainty;
	this.hasLDHeating = hasLDHeating;

	ThesisTopologySimple.setStepsMPC(nrStepsMPC);
	ThesisTopologySimple.setTimeStepsPerDay(timeStepsPerDay);
	ThesisTopologySimple.setPredUncertainty(predUncertainty);
	ThesisTopologySimple.setMemapLDHeating(hasLDHeating);
	ThesisTopologySimple.setMemapOn(memapOn);
	ThesisTopologySimple.setNrOfDays(nrDays);
	ThesisTopologySimple.calcNrIterations();
	ThesisTopologySimple.calcNrSteps();
    }

    public void attach(BuildingController buildingController) {
	managedBuildings.add(buildingController);
    }

    public void startSimulation() {
	createTopology();
	ActorSystem actorSystem = SimulationStarter.initialiseActorSystem(this.top);
	SimulationStarter.startSimulation(actorSystem, 0, ThesisTopologySimple.NR_OF_ITERATIONS);
    }

    public void endSimulation() {
	SimulationStarter.stopSimulation();
    }

    private void createTopology() {
	// Creating Actor Topology
	this.top = new ActorTopology(this.name);
	LinProgBehavior linProg = new LinProgBehavior();
	top.addActor(this.name, ActorFactory.createDevice(linProg));

	for (BuildingController managedBuilding : managedBuildings) {
	    String buildingName = managedBuilding.getName();
	    boolean LDHeatingON = managedBuilding.hasLDHeaeting();
	    int heatTransportLength = managedBuilding.getHeatTransportLength();

	    Building building = new Building(portUndefined, LDHeatingON, heatTransportLength);

	    ActorTopology buildingHead = new ActorTopology(buildingName);
	    buildingHead.addActor(buildingName, ActorFactory.createDevice(building));
	    for (Device device : managedBuilding.getDevices()) {
		buildingHead.addActorAsChild(buildingName + "/" + device.getClass().getName(),
			ActorFactory.createDevice(device));
	    }

	    top.addSubTopology(name, buildingHead);
	}
    }

}
