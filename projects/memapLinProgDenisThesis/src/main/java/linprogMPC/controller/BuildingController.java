package linprogMPC.controller;

import java.util.Set;

import linprogMPC.components.prototypes.Device;

public interface BuildingController {
    public String getName();

    public boolean hasLDHeaeting();

    public int getHeatTransportLength();

    public Set<? extends Device> getDevices();

    public double getHeatConsumption(int timeStep);

    public double getElectricityConsumption(int timeStep);
}
