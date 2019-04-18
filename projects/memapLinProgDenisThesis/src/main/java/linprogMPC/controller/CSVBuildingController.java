package linprogMPC.controller;

import java.util.HashSet;
import java.util.Set;

import linprogMPC.components.CSVConsumer;
import linprogMPC.components.prototypes.Device;

public class CSVBuildingController implements BuildingController {

    public String name;
    public boolean hasLDHeating;
    public int heatTransportLength;
    private Set<Device> devices = new HashSet<Device>();

    public CSVBuildingController(String name, String csvHeatFileName, String csvElectricityFileName,
	    boolean hasLDHeating, int heatTransportLength) {
	this.name = name;
	this.hasLDHeating = hasLDHeating;
	this.heatTransportLength = heatTransportLength;

	// adding Consumers from CSV files
	devices.add(new CSVConsumer(csvHeatFileName, csvElectricityFileName, 0));
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

    @Override
    public void attach(Device device) {
	this.devices.add(device);
    }
}
