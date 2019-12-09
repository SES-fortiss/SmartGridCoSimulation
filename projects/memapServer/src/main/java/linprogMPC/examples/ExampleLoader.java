package linprogMPC.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import linprogMPC.components.CSVConsumer;
import linprogMPC.components.CSVCoupler;
import linprogMPC.components.CSVProducer;
import linprogMPC.components.CSVStorage;
import linprogMPC.components.CSVVolatileProducer;
import linprogMPC.components.prototypes.Consumer;
import linprogMPC.components.prototypes.Coupler;
import linprogMPC.components.prototypes.Producer;
import linprogMPC.components.prototypes.Storage;
import linprogMPC.controller.BuildingController;
import linprogMPC.controller.CSVBuildingController;
import linprogMPC.controller.OpcUaBuildingController;
import linprogMPC.controller.TopologyController;
import linprogMPC.helper.DirectoryConfiguration;
import linprogMPC.messages.extension.NetworkType;

public abstract class ExampleLoader {
	public static TopologyController OpcUaExample() {
		TopologyController topologyController = new TopologyController("MEMAP", true, 5, 96, 7, "ELECTRICITYPRICEEXAMPLE", "cost", 0, false, 4880);

		try {
			BufferedReader endpoint1 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding1Endpoint.json")));
			BufferedReader nodes1 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding1Nodes.json")));
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
					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding2Endpoint.json")));
			BufferedReader nodes2 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding2Nodes.json")));
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
			e.printStackTrace();
		} // Wait so that we get initial values for all devices

		return topologyController;
	}

	public static TopologyController CsvExample() {
		final int PORT_UNDEFINED = 0;
		TopologyController topologyController = new TopologyController("MEMAP", true, 2, 96, 2, "ELECTRICITYPRICEEXAMPLE", "cost", 0, false, 4880);

		BuildingController building1 = new CSVBuildingController("Building1", false, 50);
		Consumer consumer1 = new CSVConsumer("demand1", "EXAMPLE1", 0);
		Producer producer1 = new CSVProducer("producer1", 20.0, 0.89, NetworkType.HEAT, 0.0591, 0.202, PORT_UNDEFINED);
		building1.attach(producer1);
		building1.attach(consumer1);

		BuildingController building2 = new CSVBuildingController("Building2", false, 50);
		Consumer consumer2 = new CSVConsumer("demand2", "EXAMPLE2", 0);
		Storage battery2 = new CSVStorage("storage2", 30.0, 0.9, 0.9, 0.9, 0.95, 0.95, NetworkType.ELECTRICITY, 0.0001,
				0.0001, 0);
		Producer producer2 = new CSVProducer("producer2", 40.0, 0.89, NetworkType.HEAT, 0.0591, 0.202, PORT_UNDEFINED);
		building2.attach(producer2);
		building2.attach(battery2);
		building2.attach(consumer2);

		BuildingController building3 = new CSVBuildingController("Building3", false, 50);
		Consumer consumer3 = new CSVConsumer("demand3", "EXAMPLE3", 0);
		Producer pv3 = new CSVVolatileProducer("pv3", "", 40.0, NetworkType.ELECTRICITY, 0.0001, 0, PORT_UNDEFINED);
		Coupler heatpump3 = new CSVCoupler("heatpump3", 62.0, 2.5, -1, NetworkType.ELECTRICITY, NetworkType.HEAT,
				0.0591, 0.202, PORT_UNDEFINED);
		Storage thermalStorage3 = new CSVStorage("thermalStorage3", 300, 0.9, 180, 180, 0.9, 0.9, NetworkType.HEAT, 0.0001,
				0.0001, PORT_UNDEFINED);
		building3.attach(pv3);
		building3.attach(heatpump3);
		building3.attach(thermalStorage3);
		building3.attach(consumer3);

		BuildingController building4 = new CSVBuildingController("Building4", false, 50);
		Consumer consumer4 = new CSVConsumer("demand4", "EXAMPLE4", 0);
		Coupler chp4 = new CSVCoupler("chp4", 43, 0.61, 0.29, NetworkType.HEAT, NetworkType.ELECTRICITY, 0.0591, 0.202,
				PORT_UNDEFINED);
		building4.attach(chp4);
		building4.attach(consumer4);

		BuildingController building5 = new CSVBuildingController("Building5", false, 50);
		Consumer consumer5 = new CSVConsumer("demand5", "EXAMPLE5", 0);
		Coupler chp5 = new CSVCoupler("chp4", 43, 0.8, 0.4, NetworkType.HEAT, NetworkType.ELECTRICITY, 0.0591, 0.202,
				PORT_UNDEFINED);
		Producer solarThermic5 = new CSVVolatileProducer("solarThermic5", "", 40, NetworkType.HEAT, 0, 0, PORT_UNDEFINED);
		building5.attach(solarThermic5);
		building5.attach(chp5);
		building5.attach(consumer5);

		topologyController.attach(building1);
		topologyController.attach(building2);
		topologyController.attach(building3);
		topologyController.attach(building4);
		topologyController.attach(building5);

		return topologyController;
	}

}
