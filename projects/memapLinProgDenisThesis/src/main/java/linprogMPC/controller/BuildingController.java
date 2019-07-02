package linprogMPC.controller;

import java.util.Set;

import linprogMPC.components.prototypes.Device;

/**
 * The BuildingController Interface provides all methods needed for dealing with
 * buildings. Implementations of BuildingControllers guarantee functionality
 * of @Building.
 * 
 * @see CSVBuildingController
 * @see OpcUaBuildingController
 * 
 * @author Adrian.Krueger
 */
public interface BuildingController {
	/**
	 * Try to make sure to use unique names for buildings.
	 * 
	 * @return name of the building
	 */
	public String getName();

	/**
	 * If true, the optimizer will enable long-distance heating for this building.
	 * 
	 * @return long-distance heating enabled
	 */
	public boolean hasLDHeaeting();

	/**
	 * Heat transport length is needed by the optimizer to calculate the heat loss of the pipes.
	 * 
	 * @return heat transport length to the next building
	 */
	public int getHeatTransportLength();

	/**
	 * Returns a set of devices attached to this building. Options can be found in 
	 * linprogMPC.components.
	 * 
	 * Should contain at least one Consumer object.
	 * 
	 * @return set of attached devices
	 * @see Device
	 * @see linprogMPC.components
	 */
	public Set<? extends Device> getDevices();

	/**
	 * Attaches a device to the building. Options can be found in linprogMPC.compontens
	 * 
	 * Attach at least one consumer.
	 * 
	 * Do not attach LinProgBehavior
	 * 
	 * @param device device to attach
	 * @see Device
	 * @see linprogMPC.components
	 */
	public void attach(Device device);
}
