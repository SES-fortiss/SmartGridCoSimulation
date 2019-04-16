package linprogMPC.controller;

import java.util.HashSet;
import java.util.Set;

import linprogMPC.ActorFactory;
import linprogMPC.ThesisTopologySimple;
import linprogMPC.components.Building;
import linprogMPC.components.LinProgBehavior;
import linprogMPC.components.prototypes.Device;
import topology.ActorTopology;

public class TopologyController {

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
    }

    public void attachBuilding(BuildingController buildingController) {
	managedBuildings.add(buildingController);
    }

    public void createTopology() {
	// Setting Topology Parameters
	ThesisTopologySimple.setStepsMPC(nrStepsMPC);
	ThesisTopologySimple.setTimeStepsPerDay(timeStepsPerDay);
	ThesisTopologySimple.setPredUncertainty(predUncertainty);
	ThesisTopologySimple.setMemapLDHeating(hasLDHeating);
	ThesisTopologySimple.setMemapOn(memapOn);
	ThesisTopologySimple.setNrOfDays(nrDays);

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

    public ActorTopology getTopology() throws NullPointerException {
	if (top == null) {
	    throw new NullPointerException("You need to create the Topology first. Use createTopology()");
	}
	return top;
    }
}
