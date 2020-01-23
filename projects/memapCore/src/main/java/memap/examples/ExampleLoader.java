package memap.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import memap.components.CSVConsumer;
import memap.components.CSVCoupler;
import memap.components.CSVProducer;
import memap.components.CSVStorage;
import memap.components.CSVVolatileProducer;
import memap.components.prototypes.Connection;
import memap.components.prototypes.Consumer;
import memap.components.prototypes.Coupler;
import memap.components.prototypes.Producer;
import memap.components.prototypes.Storage;
import memap.controller.BuildingController;
import memap.controller.CSVBuildingController;
import memap.controller.OpcUaBuildingController;
import memap.controller.TopologyController;
import memap.helper.DirectoryConfiguration;
import memap.main.ConfigurationMEMAP.MEMAPLogging;
import memap.main.ConfigurationMEMAP.OptHierarchy;
import memap.main.ConfigurationMEMAP.OptimizationCriteria;
import memap.main.ConfigurationMEMAP.Optimizer;
import memap.main.ConfigurationMEMAP.ToolUsage;
import memap.messages.extension.NetworkType;

public abstract class ExampleLoader {
	public static TopologyController OpcUaExample() {
		TopologyController topologyController = new TopologyController(OptHierarchy.MEMAP, Optimizer.MILP,
				OptimizationCriteria.EUR, ToolUsage.PLANNING, MEMAPLogging.RESULTS_ONLY, "MemapExample", 5, 192, 20,
				"ELECTRICITYPRICEEXAMPLE", 0, 4880);

		try {
//			BufferedReader endpoint1 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
//					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding1Endpoint.json")));
//			BufferedReader nodes1 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
//					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding1Nodes.json")));
			FileReader endpoint1 = new FileReader(("res/FortissBuilding1Endpoint.json"));
			FileReader nodes1 = new FileReader(("res/FortissBuilding1Nodes.json"));
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
		} catch (FileNotFoundException e) {
			System.err.println("WARNING: File not found. Building has not been initialised");
			System.out.println(new File(".").getAbsolutePath());
			e.printStackTrace();
		}

		try {
//			BufferedReader endpoint2 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
//					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding2Endpoint.json")));
//			BufferedReader nodes2 = new BufferedReader(new InputStreamReader(ExampleLoader.class.getClassLoader()
//					.getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding2Nodes.json")));
			FileReader endpoint2 = new FileReader(("res/FortissBuilding2Endpoint.json"));
			FileReader nodes2 = new FileReader(("res/FortissBuilding2Nodes.json"));
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
		} catch (FileNotFoundException e) {
			System.err.println("WARNING: File not found. Building has not been initialised");
			System.out.println(new File(".").getAbsolutePath());
			e.printStackTrace();
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return topologyController;
	}

	public static TopologyController CsvExample() {
		final int PORT_UNDEFINED = 0;
		TopologyController topologyController = new TopologyController(OptHierarchy.BUILDING, Optimizer.LP,
				OptimizationCriteria.EUR, ToolUsage.PLANNING, MEMAPLogging.FILES, "MemapExample", 5, 96, 2,
				"ELECTRICITYPRICEEXAMPLE", 0, 4880);

		BuildingController building1 = new CSVBuildingController("Building1", false, 50);
		Consumer consumer1 = new CSVConsumer("demand1", "EXAMPLE1", 0);
		Producer producer1 = new CSVProducer("producer1", 0, 20.0, 0.89, NetworkType.HEAT, 0.0591, 0.202,
				PORT_UNDEFINED);
		building1.attach(producer1);
		building1.attach(consumer1);

		BuildingController building2 = new CSVBuildingController("Building2", false, 50);
		Consumer consumer2 = new CSVConsumer("demand2", "EXAMPLE2", 0);
		Storage battery2 = new CSVStorage("storage2", 30.0, 0.9, 0.9, 0.9, 0.95, 0.95, NetworkType.ELECTRICITY, 0.0001,
				0.0001, 0);
		Producer producer2 = new CSVProducer("producer2", 0, 40.0, 0.89, NetworkType.HEAT, 0.0591, 0.202,
				PORT_UNDEFINED);
		building2.attach(producer2);
		building2.attach(battery2);
		building2.attach(consumer2);
		// TODO: Test connections with more buildings
		Connection connection = new Connection(building1.getName(), 100, 0.01, 1000);
		building2.attach(connection);

		BuildingController building3 = new CSVBuildingController("Building3", false, 50);
		Consumer consumer3 = new CSVConsumer("demand3", "EXAMPLE3", 0);
		Producer pv3 = new CSVVolatileProducer("pv3", "", 0, 40.0, NetworkType.ELECTRICITY, 0.0001, 0, PORT_UNDEFINED);
		Coupler heatpump3 = new CSVCoupler("heatpump3", 0, 62.0, 2.5, -1, NetworkType.ELECTRICITY, NetworkType.HEAT,
				0.0591, 0.202, PORT_UNDEFINED);
		Storage thermalStorage3 = new CSVStorage("thermalStorage3", 300, 0.9, 180, 180, 0.9, 0.9, NetworkType.HEAT,
				0.0001, 0.0001, PORT_UNDEFINED);
		building3.attach(pv3);
		building3.attach(heatpump3);
		building3.attach(thermalStorage3);
		building3.attach(consumer3);

		BuildingController building4 = new CSVBuildingController("Building4", false, 50);
		Consumer consumer4 = new CSVConsumer("demand4", "EXAMPLE4", 0);
		Coupler chp4 = new CSVCoupler("chp4", 0, 43, 0.61, 0.29, NetworkType.HEAT, NetworkType.ELECTRICITY, 0.0591,
				0.202, PORT_UNDEFINED);
		building4.attach(chp4);
		building4.attach(consumer4);

		BuildingController building5 = new CSVBuildingController("Building5", false, 50);
		Consumer consumer5 = new CSVConsumer("demand5", "EXAMPLE5", 0);
		Coupler chp5 = new CSVCoupler("chp5", 0, 43, 0.8, 0.4, NetworkType.HEAT, NetworkType.ELECTRICITY, 0.0591, 0.202,
				PORT_UNDEFINED);
		Producer solarThermic5 = new CSVVolatileProducer("solarThermic5", "", 0, 40, NetworkType.HEAT, 0, 0,
				PORT_UNDEFINED);
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
