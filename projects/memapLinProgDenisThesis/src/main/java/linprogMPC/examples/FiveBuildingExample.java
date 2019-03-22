package linprogMPC.examples;

import java.util.HashSet;
import java.util.Set;

import linprogMPC.components.Battery;
import linprogMPC.components.CHP;
import linprogMPC.components.Consumer;
import linprogMPC.components.HeatPump;
import linprogMPC.components.PV;
import linprogMPC.components.SolarThermic;
import linprogMPC.components.ThermalStorage;
import linprogMPC.components.prototypes.Device;
import linprogMPC.controller.BuildingController;
import linprogMPC.controller.CSVExampleController;
import linprogMPC.controller.TopologyController;
import linprogMPC.helper.ConsumptionProfiles;
import topology.ActorTopology;

public abstract class FiveBuildingExample {

    public static ActorTopology exampleTopology() {
	final int PORT_UNDEFINED = 0;

	TopologyController topologyController = new TopologyController("MEMAP", 1, false, 0);
	ConsumptionProfiles consumptionProfiles = new ConsumptionProfiles(5);

	Consumer consumer1 = new Consumer(consumptionProfiles, 0, 0);
	Set<Device> devices1 = new HashSet<>();
	devices1.add(consumer1);
	BuildingController building1 = new CSVExampleController("Building1", false, 50, devices1);

	Consumer consumer2 = new Consumer(consumptionProfiles, 1, 0);
	Battery battery2 = new Battery(12.0, 9, 9, 0.95, 0.95, 0);
	Set<Device> devices2 = new HashSet<>();
	devices2.add(consumer2);
	devices2.add(battery2);
	BuildingController building2 = new CSVExampleController("Building2", false, 50, devices2);

	Consumer consumer3 = new Consumer(consumptionProfiles, 2, 0);
	PV pv3 = new PV(12.0 + 5.0, PORT_UNDEFINED);
	HeatPump heatpump3 = new HeatPump(25, 2.5, -1, PORT_UNDEFINED);
	ThermalStorage thermalStorage3 = new ThermalStorage(3 * 100, 3 * 60, 3 * 60, 0.9, 0.9, PORT_UNDEFINED);
	Set<Device> devices3 = new HashSet<>();
	devices3.add(consumer3);
	devices3.add(pv3);
	devices3.add(heatpump3);
	devices3.add(thermalStorage3);
	BuildingController building3 = new CSVExampleController("Building3", false, 50, devices3);

	Consumer consumer4 = new Consumer(consumptionProfiles, 3, 0);
	CHP chp4 = new CHP(43, 0.61, 0.29, PORT_UNDEFINED);
	Set<Device> devices4 = new HashSet<>();
	devices4.add(consumer4);
	devices4.add(chp4);
	BuildingController building4 = new CSVExampleController("Building4", false, 50, devices4);

	Consumer consumer5 = new Consumer(consumptionProfiles, 4, 0);
	SolarThermic solarThermic5 = new SolarThermic(10, PORT_UNDEFINED);
	Set<Device> devices5 = new HashSet<>();
	devices5.add(consumer5);
	devices5.add(solarThermic5);
	BuildingController building5 = new CSVExampleController("Building5", false, 50, devices5);

	topologyController.attachBuilding(building1);
	topologyController.attachBuilding(building2);
	topologyController.attachBuilding(building3);
	topologyController.attachBuilding(building4);
	topologyController.attachBuilding(building5);

	topologyController.createTopology();

	return topologyController.getTopology();
    }

}
