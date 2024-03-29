package memap.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
import memap.helper.CO2Emission;
import memap.helper.ElectricityPrice;
import memap.helper.EnergyPrices;
import memap.helper.HeatPrice;
import memap.helper.MEMAPLogging;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;
import memap.main.TopologyConfig;
import memap.messages.extension.NetworkType;

public abstract class ExampleLoader {
	public static TopologyController OpcUaExample(int nrStepsMPC) {

		TopologyController topologyController = new TopologyController("MemapExample", OptHierarchy.MEMAP,
				Optimizer.MILP, OptimizationCriteria.EUR, ToolUsage.PLANNING, MEMAPLogging.RESULTS_ONLY);
		TopologyConfig.getInstance().init(nrStepsMPC, 96, 7, 4880, 0);

		EnergyPrices.getInstance().init(new ElectricityPrice(9999, nrStepsMPC), new ElectricityPrice(0.285, nrStepsMPC),
				new ElectricityPrice(0.285, nrStepsMPC), new HeatPrice(0.285, nrStepsMPC), new CO2Emission(0.540, nrStepsMPC));

		try {

//			FileReader endpoint1 = new FileReader(("src/main/resources/examples/FortissBuilding1Endpoint.json"));
//			FileReader nodes1 = new FileReader(("src/main/resources/examples/FortissBuilding1Nodes.json"));
			FileReader endpoint1 = new FileReader(("src/main/java/resources/examples/FortissBuilding1Endpoint.json"));
			FileReader nodes1 = new FileReader(
					("src/main/java/resources/examples/FortissBuilding1Nodes_NewDatamodel.json"));

			JsonObject jsonEndpoint1 = (JsonObject) Jsoner.deserialize(endpoint1);
			JsonObject jsonNodes1 = (JsonObject) Jsoner.deserialize(nodes1);
			BuildingController sampleBuilding1 = new OpcUaBuildingController(topologyController, jsonEndpoint1,
					jsonNodes1, null);
			topologyController.attach(sampleBuilding1.getName(), sampleBuilding1);

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

//			FileReader endpoint2 = new FileReader(("src/main/resources/examples/FortissBuilding2Endpoint.json"));
//			FileReader nodes2 = new FileReader(("src/main/resources/examples/FortissBuilding2Nodes.json"));
			FileReader endpoint2 = new FileReader(("src/main/java/resources/examples/FortissBuilding2Endpoint.json"));
			FileReader nodes2 = new FileReader(
					("src/main/java/resources/examples/FortissBuilding2Nodes_NewDatamodel.json"));

			JsonObject jsonEndpoint2 = (JsonObject) Jsoner.deserialize(endpoint2);
			JsonObject jsonNodes2 = (JsonObject) Jsoner.deserialize(nodes2);
			BuildingController sampleBuilding2 = new OpcUaBuildingController(topologyController, jsonEndpoint2,
					jsonNodes2, null);
			topologyController.attach(sampleBuilding2.getName(), sampleBuilding2);
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
		int nrStepsMPC = 5;
		TopologyConfig.getInstance().init(nrStepsMPC, 96, 7, 0, 4880);

		EnergyPrices.getInstance().init(new ElectricityPrice(9999, nrStepsMPC), new ElectricityPrice(0.285, nrStepsMPC),
				new ElectricityPrice("ELECTRICITYPRICEEXAMPLE"), new HeatPrice(0.285, nrStepsMPC), new CO2Emission(0.540, nrStepsMPC));

		TopologyController topologyController = new TopologyController("MemapExample", OptHierarchy.BUILDING,
				Optimizer.MILP, OptimizationCriteria.EUR, ToolUsage.PLANNING, MEMAPLogging.RESULTS_ONLY);

		BuildingController building1 = new CSVBuildingController("Building1");
		Consumer consumer1 = new CSVConsumer("demand1", "CONSUMPTIONEXAMPLE1", 0);
		Producer producer1 = new CSVProducer("producer1", 0, 20.0, 0.89, NetworkType.HEAT, 0.0591, 0.202,
				PORT_UNDEFINED);
		building1.attach(producer1);
		building1.attach(consumer1);

		BuildingController building2 = new CSVBuildingController("Building2");
		Consumer consumer2 = new CSVConsumer("demand2", "CONSUMPTIONEXAMPLE2", 0);
		Storage battery2 = new CSVStorage("storage2", 30.0, 0.9, 0.9, 0.9, 0.95, 0.95, NetworkType.ELECTRICITY, 0.0001,
				0.0001, 0, 0);
		Producer producer2 = new CSVProducer("producer2", 0, 40.0, 0.89, NetworkType.HEAT, 0.0591, 0.202,
				PORT_UNDEFINED);
		building2.attach(producer2);
		building2.attach(battery2);
		building2.attach(consumer2);
		// TODO: Test connections with more buildings
		Connection connection = new Connection(building2.getName(), building1.getName(), 100, 0.01, 1000);
		building2.attach(connection);

		BuildingController building3 = new CSVBuildingController("Building3");
		Consumer consumer3 = new CSVConsumer("demand3", "CONSUMPTIONEXAMPLE3", 0);
		Producer pv3 = new CSVVolatileProducer("pv3", "", 0, 40.0, NetworkType.ELECTRICITY, 0.0001, 0, PORT_UNDEFINED);
		Coupler heatpump3 = new CSVCoupler("heatpump3", 0, 62.0, 2.5, -1, NetworkType.ELECTRICITY, NetworkType.HEAT,
				0.0591, 0.202, PORT_UNDEFINED);
		Storage thermalStorage3 = new CSVStorage("thermalStorage3", 300, 0.9, 180, 180, 0.9, 0.9, NetworkType.HEAT,
				0.0001, 0.0001, 0, PORT_UNDEFINED);
		building3.attach(pv3);
		building3.attach(heatpump3);
		building3.attach(thermalStorage3);
		building3.attach(consumer3);

		BuildingController building4 = new CSVBuildingController("Building4");
		Consumer consumer4 = new CSVConsumer("demand4", "CONSUMPTIONEXAMPLE4", 0);
		Coupler chp4 = new CSVCoupler("chp4", 0, 43, 0.61, 0.29, NetworkType.HEAT, NetworkType.ELECTRICITY, 0.0591,
				0.202, PORT_UNDEFINED);
		building4.attach(chp4);
		building4.attach(consumer4);

		BuildingController building5 = new CSVBuildingController("Building5");
		Consumer consumer5 = new CSVConsumer("demand5", "CONSUMPTIONEXAMPLE5", 0);
		Coupler chp5 = new CSVCoupler("chp5", 0, 43, 0.8, 0.4, NetworkType.HEAT, NetworkType.ELECTRICITY, 0.0591, 0.202,
				PORT_UNDEFINED);
		Producer solarThermic5 = new CSVVolatileProducer("solarThermic5", "FORECASTEXAMPLE", 0, 40, NetworkType.HEAT, 0,
				0, PORT_UNDEFINED);
		building5.attach(solarThermic5);
		building5.attach(chp5);
		building5.attach(consumer5);

		topologyController.attach(building1.getName(), building1);
		topologyController.attach(building2.getName(), building2);
		topologyController.attach(building3.getName(), building3);
		topologyController.attach(building4.getName(), building4);
		topologyController.attach(building5.getName(), building5);

		return topologyController;
	}

}
