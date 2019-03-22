package linprogMPC.controller;

import java.util.Set;

import linprogMPC.components.prototypes.Device;

public class CSVExampleController implements BuildingController {

    public String name;
    public boolean hasLDHeating;
    public int heatTransportLength;
    public Set<Device> devices;

    public CSVExampleController(String name, boolean hasLDHeating, int heatTransportLength, Set<Device> devices) {
	this.name = name;
	this.hasLDHeating = hasLDHeating;
	this.heatTransportLength = heatTransportLength;
	this.devices = devices;
    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public boolean hasLDHeaeting() {
	return hasLDHeating;
    }

    @Override
    public int getHeatTransportLength() {
	return heatTransportLength;
    }

    @Override
    public Set<Device> getDevices() {
	return devices;
    }
}
