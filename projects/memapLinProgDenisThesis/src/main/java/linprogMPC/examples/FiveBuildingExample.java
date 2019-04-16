package linprogMPC.examples;

import linprogMPC.components.Battery;
import linprogMPC.components.CHP;
import linprogMPC.components.HeatPump;
import linprogMPC.components.PV;
import linprogMPC.components.SolarThermic;
import linprogMPC.components.ThermalStorage;
import linprogMPC.controller.BuildingController;
import linprogMPC.controller.CSVExampleController;
import linprogMPC.controller.TopologyController;
import topology.ActorTopology;

public abstract class FiveBuildingExample {

    public static ActorTopology exampleTopology(boolean memapOn) {
	final int PORT_UNDEFINED = 0;

	TopologyController topologyController = new TopologyController("MEMAP", memapOn, 2, 96, 7, 0, false, 0);

	BuildingController building1 = new CSVExampleController("Building1", "WaermeVerbraeucheAngepasstGebaeude1.csv",
		"StromVerbraeucheAngepasstGebaeude1.csv", false, 50);

	BuildingController building2 = new CSVExampleController("Building2", "WaermeVerbraeucheAngepasstGebaeude2.csv",
		"StromVerbraeucheAngepasstGebaeude2.csv", false, 50);
	Battery battery2 = new Battery(12.0, 9, 9, 0.95, 0.95, 0);
	building2.attach(battery2);

	BuildingController building3 = new CSVExampleController("Building3", "WaermeVerbraeucheAngepasstGebaeude3.csv",
		"StromVerbraeucheAngepasstGebaeude3.csv", false, 50);
	PV pv3 = new PV(12.0 + 5.0, PORT_UNDEFINED);
	HeatPump heatpump3 = new HeatPump(25, 2.5, -1, PORT_UNDEFINED);
	ThermalStorage thermalStorage3 = new ThermalStorage(3 * 100, 3 * 60, 3 * 60, 0.9, 0.9, PORT_UNDEFINED);
	building3.attach(pv3);
	building3.attach(heatpump3);
	building3.attach(thermalStorage3);

	BuildingController building4 = new CSVExampleController("Building4", "WaermeVerbraeucheAngepasstGebaeude4.csv",
		"StromVerbraeucheAngepasstGebaeude4.csv", false, 50);
	CHP chp4 = new CHP(43, 0.61, 0.29, PORT_UNDEFINED);
	building4.attach(chp4);

	BuildingController building5 = new CSVExampleController("Building5", "WaermeVerbraeucheAngepasstGebaeude4.csv",
		"StromVerbraeucheAngepasstGebaeude4.csv", false, 50);
	SolarThermic solarThermic5 = new SolarThermic(10, PORT_UNDEFINED);
	building5.attach(solarThermic5);

	topologyController.attach(building1);
	topologyController.attach(building2);
	topologyController.attach(building3);
	topologyController.attach(building4);
	topologyController.attach(building5);

	return topologyController.getTopology();
    }

}
