package linprogMPC.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import linprogMPC.components.Battery;
import linprogMPC.components.CHP;
import linprogMPC.components.HeatPump;
import linprogMPC.components.PV;
import linprogMPC.components.SolarThermic;
import linprogMPC.components.ThermalStorage;
import linprogMPC.controller.BuildingController;
import linprogMPC.controller.CSVBuildingController;
import linprogMPC.controller.OpcUaBuildingController;
import linprogMPC.controller.TopologyController;

public final class ExampleLoader {
    public static TopologyController OpcUaExample = OpcUaExample();
    public static TopologyController CsvExample = CsvExample();

    private ExampleLoader() {
    }

    private static TopologyController OpcUaExample() {
	TopologyController topologyController = new TopologyController("MEMAP", true, 5, 96, 7, 0, false, 4880);

	try {
	    BufferedReader endpoint1 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
		    .getResourceAsStream("opcconfig/FortissBuilding1Endpoint.json")));
	    BufferedReader nodes1 = new BufferedReader(new InputStreamReader(
		    ExampleLoader.class.getClassLoader().getResourceAsStream("opcconfig/FortissBuilding1Nodes.json")));
	    JsonObject jsonEndpoint1 = (JsonObject) Jsoner.deserialize(endpoint1);
	    JsonObject jsonNodes1 = (JsonObject) Jsoner.deserialize(nodes1);
	    BuildingController sampleBuilding1 = new OpcUaBuildingController(jsonEndpoint1, jsonNodes1);
	    topologyController.attach(sampleBuilding1);

	} catch (JsonException e1) {
	    System.err.println("WARNING: Failed to read JSON config files. Building has not been initalised.");
	    e1.printStackTrace();
	} catch (IllegalStateException e2) {
	    System.err.println("WARNING: Failed to create Client. Building has not been initialised");
	    e2.printStackTrace();
	}

	try {
	    BufferedReader endpoint2 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
		    .getResourceAsStream("opcconfig/FortissBuilding2Endpoint.json")));
	    BufferedReader nodes2 = new BufferedReader(new InputStreamReader(
		    ExampleLoader.class.getClassLoader().getResourceAsStream("opcconfig/FortissBuilding2Nodes.json")));
	    JsonObject jsonEndpoint2 = (JsonObject) Jsoner.deserialize(endpoint2);
	    JsonObject jsonNodes2 = (JsonObject) Jsoner.deserialize(nodes2);
	    BuildingController sampleBuilding2 = new OpcUaBuildingController(jsonEndpoint2, jsonNodes2);
	    topologyController.attach(sampleBuilding2);
	} catch (JsonException e1) {
	    System.err.println("WARNING: Failed to read JSON config files. Building has not been initalised.");
	    e1.printStackTrace();
	} catch (IllegalStateException e2) {
	    System.err.println("WARNING: Failed to create Client. Building has not been initialised");
	    e2.printStackTrace();
	}

	try {
	    Thread.sleep(5000);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} // Wait so that we get initial values for all devices

	return topologyController;
    }

    private static TopologyController CsvExample() {
	final int PORT_UNDEFINED = 0;

	TopologyController topologyController = new TopologyController("MEMAP", true, 2, 96, 7, 0, false, 0);

	BuildingController building1 = new CSVBuildingController("Building1", "WaermeVerbraeucheAngepasstGebaeude1.csv",
		"StromVerbraeucheAngepasstGebaeude1.csv", false, 50);

	BuildingController building2 = new CSVBuildingController("Building2", "WaermeVerbraeucheAngepasstGebaeude2.csv",
		"StromVerbraeucheAngepasstGebaeude2.csv", false, 50);
	Battery battery2 = new Battery(12.0, 9, 9, 0.95, 0.95, 0);
	building2.attach(battery2);

	BuildingController building3 = new CSVBuildingController("Building3", "WaermeVerbraeucheAngepasstGebaeude3.csv",
		"StromVerbraeucheAngepasstGebaeude3.csv", false, 50);
	PV pv3 = new PV(12.0 + 5.0, PORT_UNDEFINED);
	HeatPump heatpump3 = new HeatPump(25, 2.5, -1, PORT_UNDEFINED);
	ThermalStorage thermalStorage3 = new ThermalStorage(3 * 100, 3 * 60, 3 * 60, 0.9, 0.9, PORT_UNDEFINED);
	building3.attach(pv3);
	building3.attach(heatpump3);
	building3.attach(thermalStorage3);

	BuildingController building4 = new CSVBuildingController("Building4", "WaermeVerbraeucheAngepasstGebaeude4.csv",
		"StromVerbraeucheAngepasstGebaeude4.csv", false, 50);
	CHP chp4 = new CHP(43, 0.61, 0.29, PORT_UNDEFINED);
	building4.attach(chp4);

	BuildingController building5 = new CSVBuildingController("Building5", "WaermeVerbraeucheAngepasstGebaeude4.csv",
		"StromVerbraeucheAngepasstGebaeude4.csv", false, 50);
	SolarThermic solarThermic5 = new SolarThermic(10, PORT_UNDEFINED);
	building5.attach(solarThermic5);

	topologyController.attach(building1);
	topologyController.attach(building2);
	topologyController.attach(building3);
	topologyController.attach(building4);
	topologyController.attach(building5);

	return topologyController;
    }

}
