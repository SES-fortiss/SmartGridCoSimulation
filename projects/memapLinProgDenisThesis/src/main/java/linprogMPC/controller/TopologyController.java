package linprogMPC.controller;

import java.util.HashSet;
import java.util.Set;

import linprogMPC.ActorFactory;
import linprogMPC.components.Building;
import linprogMPC.components.LinProgBehavior;
import linprogMPC.components.prototypes.Device;
import topology.ActorTopology;

public class TopologyController {

    public int nrStepsMPC;
    public boolean memapOn;
    public int portUndefined;
    public String name;

    public Set<BuildingController> managedBuildings = new HashSet<>();

    public ActorTopology top;

    public TopologyController(String name, int nrStepsMPC, boolean memapOn, int portUndefined) {
	this.name = name;
	this.nrStepsMPC = nrStepsMPC;
	this.memapOn = memapOn;
	this.portUndefined = portUndefined;
    }

    public void attachBuilding(BuildingController buildingController) {
	managedBuildings.add(buildingController);
    }

    public void createTopology() {
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

    public ActorTopology getTopology() {
	return top;
    }

}
