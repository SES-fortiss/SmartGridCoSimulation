package memap.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import memap.components.CSVConsumer;
import memap.components.CSVCoupler;
import memap.components.CSVProducer;
import memap.components.CSVStorage;
import memap.components.CSVVolatileProducer;
import memap.components.prototypes.Connection;
import memap.helper.DirectoryConfiguration;
import memap.helper.EnergyPrices;
import memap.helper.MEMAPLogging;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;
import memap.main.TopologyConfig;
import memap.messages.extension.NetworkType;

public class GuiController {

	private TopologyController topMemapOn;
	private TopologyController topMemapOff;
	private String pathToConfigJson;

	public GuiController(String pathToConfigJson) {
		this.pathToConfigJson = pathToConfigJson;
	}

	public void setUp() throws FileNotFoundException {
		FileReader reader = new FileReader(pathToConfigJson);
		JsonParser jsonParser = new JsonParser();
		JsonObject configJson = (JsonObject) jsonParser.parse(reader);

		topMemapOn = createTopology(configJson);
		topMemapOn.setOptimizationHierarchy(OptHierarchy.MEMAP);

		topMemapOff = createTopology(configJson);
		topMemapOff.setOptimizationHierarchy(OptHierarchy.BUILDING);
		System.out.print("");
	}

	public void startSimulation() {
		System.out.println("====== START GUI SIMULATON =====");

		Thread helperThread = new Thread(topMemapOff);
		helperThread.start();

		topMemapOn.run();
		//topMemapOff.run();
	}

	private TopologyController createTopology(JsonObject json) {

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(TopologyController.class, new TopologyControllerDeserializer());
		Gson gson = gsonBuilder.create();

		TopologyController top = gson.fromJson(json, TopologyController.class);

		return top;

	}

	class TopologyControllerDeserializer implements JsonDeserializer<TopologyController> {

		@Override
		public TopologyController deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			JsonObject jObject = (JsonObject) jsonElement;

			// Configure simulation parameters
			TopologyConfig topologyConfig = TopologyConfig.getInstance();

			boolean isFixedPrice = jObject.get("hasfixedPrice").getAsBoolean();
			double fixedPrice = jObject.get("fixedMarketPrice").getAsDouble();
			int nrStepsMPC = jObject.get("steps").getAsInt();
			int timeStepsPerDay = jObject.get("length").getAsInt();
			int nrDays = jObject.get("days").getAsInt();
			String variablePriceFile = jObject.get("marketPriceFile").getAsString();

			topologyConfig.init(nrStepsMPC, timeStepsPerDay, nrDays, 0, 0);

			// Configure topology
			EnergyPrices energyPrices = EnergyPrices.getInstance();
			if (isFixedPrice) {
				energyPrices.init(fixedPrice);
			} else {
				energyPrices.init(variablePriceFile);
			}

			// Configure tool parameters
			ArrayList<Connection> connections = getConnections();

			Optimizer optimizer = null;
			String optimizerType = jObject.get("optimizer").getAsString();

			if (optimizerType.equals("lp")) {
				if (connections.size() > 0) {
					optimizer = Optimizer.LPwithConnections;
				} else {
					optimizer = Optimizer.LP;
				}
			} else {
				if (connections.size() > 0) {
					optimizer = Optimizer.MILPwithConnections;
				} else {
					optimizer = Optimizer.MILP;
				}
			}

			OptHierarchy optHierarchy = (jObject.get("memapON").getAsBoolean() == true) ? OptHierarchy.MEMAP
					: OptHierarchy.BUILDING;
			OptimizationCriteria optimizationCriteria = (jObject.get("optCriteria").getAsString().contentEquals("cost"))
					? OptimizationCriteria.EUR
					: OptimizationCriteria.CO2;

			String loggingST = jObject.get("loggingMode").getAsString();

			MEMAPLogging loggingMode = MEMAPLogging.ALL;
			if (loggingST.equals("fileLogs"))
				loggingMode = MEMAPLogging.FILES;
			if (loggingST.equals("resultLogs"))
				loggingMode = MEMAPLogging.RESULTS_ONLY;

			TopologyController top = new TopologyController(jObject.get("simulationName").getAsString(), optHierarchy,
					optimizer, optimizationCriteria, ToolUsage.PLANNING, loggingMode);

			// Attaching buildings
			JsonArray buildingPathList = (JsonArray) jObject.get("descriptorFiles");

			for (JsonElement buildingPath : buildingPathList) {
				JsonObject buildingPathJ = (JsonObject) buildingPath;
				String path = buildingPathJ.get("path").getAsString();

				try {
					FileReader reader = new FileReader(path);
					JsonParser jsonParser = new JsonParser();
					JsonObject buildingConfig = (JsonObject) jsonParser.parse(reader);

					GsonBuilder gsonBuilder = new GsonBuilder();
					gsonBuilder.registerTypeAdapter(BuildingController.class, new BuildingControllerDeserializer());
					Gson gson = gsonBuilder.create();

					BuildingController building = gson.fromJson(buildingConfig, BuildingController.class);
					top.attach(building.getName(), building);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}

			// create connections
			for (Connection connection : connections) {
				BuildingController sourceBuilding = top.managedBuildings.get(connection.sourceBuilding);
				sourceBuilding.attach(connection);
			}

			return top;
		}

		private ArrayList<Connection> getConnections() {
			// Read connections
			String connectionsFile = System.getProperty("user.dir") + File.separator + DirectoryConfiguration.mainDir
					+ File.separator + DirectoryConfiguration.configDir + File.separator + "connections.json";
			BufferedReader br = null;
			try {
				InputStream is = new FileInputStream(connectionsFile);
				br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

			} catch (FileNotFoundException e) {
				System.out.println("<INFO> - FileManager file not found: " + connectionsFile);
				return null;
			}

			Type connectionMapType = new TypeToken<ArrayList<Connection>>() {
			}.getType();
			GsonBuilder gsonBuilder = new GsonBuilder();
			gsonBuilder.registerTypeAdapter(Connection.class, new ConnectionTypeAdapter());
			Gson gson = gsonBuilder.create();

			ArrayList<Connection> connections = gson.fromJson(br, connectionMapType);
			return connections;
		}

	}

	class ConnectionTypeAdapter implements JsonDeserializer<Connection> {

		@Override
		public Connection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			JsonObject obj = json.getAsJsonObject();

			String sourceBuilding = obj.get("nameNodeA").getAsString();
			String connectedBuilding = obj.get("nameNodeB").getAsString();
			double pipeLengthInMeter = obj.get("length").getAsDouble();
			double lossesPer100m = obj.get("losses").getAsDouble();

			return new Connection(sourceBuilding, connectedBuilding, pipeLengthInMeter, lossesPer100m, 1.0);
		}

	}

	class BuildingControllerDeserializer implements JsonDeserializer<BuildingController> {

		@Override
		public BuildingController deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			JsonObject jObject = (JsonObject) jsonElement;

			// Creating the building
			BuildingController building = new CSVBuildingController(jObject.get("name").getAsString());

			// Attaching devices
			JsonArray couplers = (JsonArray) jObject.get("coupler_list");
			JsonArray producers = (JsonArray) jObject.get("controllable_list");
			JsonArray volatileProducers = (JsonArray) jObject.get("volatile_list");
			JsonArray storages = (JsonArray) jObject.get("storage_list");
			JsonArray consumers = (JsonArray) jObject.get("demand_list");

			GsonBuilder gsonBuilder = new GsonBuilder();
			gsonBuilder.registerTypeAdapter(CSVCoupler.class, new CSVCouplerDeserializer());
			gsonBuilder.registerTypeAdapter(CSVProducer.class, new CSVProducerDeserializer());
			gsonBuilder.registerTypeAdapter(CSVVolatileProducer.class, new CSVVolatileProducerDeserializer());
			gsonBuilder.registerTypeAdapter(CSVStorage.class, new CSVStorageDeserializer());
			gsonBuilder.registerTypeAdapter(CSVConsumer.class, new CSVConsumerDeserializer());
			Gson gson = gsonBuilder.create();

			for (JsonElement couplerEl : couplers) {
				JsonObject couplerConfig = (JsonObject) couplerEl;
				CSVCoupler coupler = gson.fromJson(couplerConfig, CSVCoupler.class);
				building.attach(coupler);
			}

			for (JsonElement producersEl : producers) {
				JsonObject producerConfig = (JsonObject) producersEl;
				CSVProducer producer = gson.fromJson(producerConfig, CSVProducer.class);
				building.attach(producer);
			}

			for (JsonElement volatileProducersEl : volatileProducers) {
				JsonObject volatileProducerConfig = (JsonObject) volatileProducersEl;
				CSVVolatileProducer volatileProducer = gson.fromJson(volatileProducerConfig, CSVVolatileProducer.class);
				building.attach(volatileProducer);
			}

			for (JsonElement storageEl : storages) {
				JsonObject storageConfig = (JsonObject) storageEl;
				CSVStorage storage = gson.fromJson(storageConfig, CSVStorage.class);
				building.attach(storage);
			}

			for (JsonElement consumerEl : consumers) {
				JsonObject consumerConfig = (JsonObject) consumerEl;
				CSVConsumer consumer = gson.fromJson(consumerConfig, CSVConsumer.class);
				building.attach(consumer);
			}

			return building;
		}
	}

	class CSVCouplerDeserializer implements JsonDeserializer<CSVCoupler> {
		@Override
		public CSVCoupler deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jObject = (JsonObject) jsonElement;
			String networkP = jObject.get("networkTypeP").getAsString();

			NetworkType primaryNetworkType = (networkP.equals("Heat")) ? NetworkType.HEAT : NetworkType.ELECTRICITY;
			NetworkType secondaryNetworkType = (primaryNetworkType.equals(NetworkType.HEAT)) ? NetworkType.ELECTRICITY
					: NetworkType.HEAT;

			return new CSVCoupler(jObject.get("name").getAsString(), jObject.get("minimumPower").getAsDouble(),
					jObject.get("maximumPower").getAsDouble(), jObject.get("efficiencyPrimary").getAsDouble(),
					jObject.get("efficiencySecondary").getAsDouble(), primaryNetworkType, secondaryNetworkType,
					jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);
		}
	}

	class CSVProducerDeserializer implements JsonDeserializer<CSVProducer> {
		@Override
		public CSVProducer deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jObject = (JsonObject) jsonElement;
			String networkT = jObject.get("networkType").getAsString();

			NetworkType networkType = (networkT.equals("Heat")) ? networkType = NetworkType.HEAT
					: NetworkType.ELECTRICITY;

			return new CSVProducer(jObject.get("name").getAsString(), jObject.get("minimumPower").getAsDouble(),
					jObject.get("maximumPower").getAsDouble(), jObject.get("efficiency").getAsDouble(), networkType,
					jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);
		}
	}

	class CSVVolatileProducerDeserializer implements JsonDeserializer<CSVVolatileProducer> {
		@Override
		public CSVVolatileProducer deserialize(JsonElement jsonElement, Type typeOfT,
				JsonDeserializationContext context) throws JsonParseException {
			JsonObject jObject = (JsonObject) jsonElement;
			String networkT = jObject.get("networkType").getAsString();

			NetworkType networkType = (networkT.equals("Heat")) ? networkType = NetworkType.HEAT
					: NetworkType.ELECTRICITY;

			return new CSVVolatileProducer(jObject.get("name").getAsString(), jObject.get("forecastFile").getAsString(),
					jObject.get("minimumPower").getAsDouble(), jObject.get("maximumPower").getAsDouble(), networkType,
					jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);
		}
	}

	class CSVStorageDeserializer implements JsonDeserializer<CSVStorage> {
		@Override
		public CSVStorage deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jObject = (JsonObject) jsonElement;
			String networkT = jObject.get("networkType").getAsString();

			NetworkType networkType = (networkT.equals("Heat")) ? networkType = NetworkType.HEAT
					: NetworkType.ELECTRICITY;

			return new CSVStorage(jObject.get("name").getAsString(), jObject.get("capacity").getAsDouble(),
					jObject.get("soc").getAsDouble(), jObject.get("maxCharging").getAsDouble(),
					jObject.get("maxDischarging").getAsDouble(), jObject.get("effIN").getAsDouble(),
					jObject.get("effOUT").getAsDouble(), networkType, 0.0001, 0.0001, 0);
		}
	}

	class CSVConsumerDeserializer implements JsonDeserializer<CSVConsumer> {
		@Override
		public CSVConsumer deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jObject = (JsonObject) jsonElement;

			return new CSVConsumer(jObject.get("name").getAsString(), jObject.get("consumptionProfile").getAsString(),
					0);
		}
	}

}
