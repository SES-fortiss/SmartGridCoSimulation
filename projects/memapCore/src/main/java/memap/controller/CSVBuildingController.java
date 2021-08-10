package memap.controller;

import java.util.HashSet;
import java.util.Set;

import memap.components.prototypes.Device;

public class CSVBuildingController implements BuildingController {

	public String name;
	public double[] elecBuylimit;
	private Set<Device> devices = new HashSet<Device>();

	public CSVBuildingController(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Set<Device> getDevices() {
		return devices;
	}

	@Override
	public void attach(Device device) {
		this.devices.add(device);
	}

	@Override
	public double[] getElecBuyLimit() {
		return elecBuylimit;
	}
	
	public void setElecBuylimit(double[] elecBuylimit) {
		this.elecBuylimit = elecBuylimit;
	}

}
