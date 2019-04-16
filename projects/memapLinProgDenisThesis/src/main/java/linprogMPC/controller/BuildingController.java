package linprogMPC.controller;

import java.util.Set;

import linprogMPC.components.prototypes.Device;

/**
 * The BuildingController Interface provides all methods needed for dealing with
 * buildings. As for now, CSV files are used for consumption information, but
 * later this interface might be implemented by a OPCua client.
 * 
 * @see CSVBuildingController
 * @author Adrian.Krueger
 */
public interface BuildingController {
    public String getName();

    public boolean hasLDHeaeting();

    public int getHeatTransportLength();

    public Set<? extends Device> getDevices();

    public void attach(Device device);
}
