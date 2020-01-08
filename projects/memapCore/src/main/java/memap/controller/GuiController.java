package memap.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import memap.components.CSVConsumer;
import memap.components.CSVCoupler;
import memap.components.CSVProducer;
import memap.components.CSVStorage;
import memap.components.CSVVolatileProducer;
import memap.main.ConfigurationMEMAP.MEMAPLogging;
import memap.main.ConfigurationMEMAP.OptHierarchy;
import memap.main.ConfigurationMEMAP.OptimizationCriteria;
import memap.main.ConfigurationMEMAP.Optimizer;
import memap.main.ConfigurationMEMAP.ToolUsage;
import memap.messages.extension.NetworkType;

public class GuiController {

	private TopologyController top;

	public GuiController(String pathToConfigJson) throws FileNotFoundException {

		FileReader reader = new FileReader(pathToConfigJson);
		JsonParser jsonParser = new JsonParser();
		JsonObject configJson = (JsonObject) jsonParser.parse(reader);

		this.top = createTopology(configJson);
	}

	public void startSimulation() {
		System.out.println("====== START GUI SIMULATON =====");
		top.startSimulation();
	}

	private TopologyController createTopology(JsonObject topologyConfig) {

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(TopologyController.class, new TopologyControllerDeserializer());
		Gson gson = gsonBuilder.create();
		TopologyController top = gson.fromJson(topologyConfig, TopologyController.class);

		return top;

	}

	class TopologyControllerDeserializer implements JsonDeserializer<TopologyController> {

		@Override
		public TopologyController deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			JsonObject jObject = (JsonObject) jsonElement;
			
			OptHierarchy optHierarchy = (jObject.get("memapON").getAsBoolean() == true) ? OptHierarchy.MEMAP
					: OptHierarchy.BUILDING;
			Optimizer optimizer = (jObject.get("optimizer").getAsString().contentEquals("lp")) ? Optimizer.LP
					: Optimizer.MILP;
			OptimizationCriteria optimizationCriteria = (jObject.get("optCriteria").getAsString().contentEquals("cost"))
					? OptimizationCriteria.EUR
					: OptimizationCriteria.CO2;
			MEMAPLogging loggingMode = (jObject.get("loggingMode").equals("resultLogs")) ? MEMAPLogging.RESULTS_ONLY : (jObject.get("loggingMode").equals("fileLogs")) ? MEMAPLogging.FILES : MEMAPLogging.ALL;

			boolean fixedPrice = jObject.get("fixedPrice").getAsBoolean();
			
			// Creating topologyController
			TopologyController top = (fixedPrice) ? new TopologyController(optHierarchy, optimizer, optimizationCriteria, ToolUsage.PLANNING,
					loggingMode, jObject.get("simulationName").getAsString(), jObject.get("steps").getAsInt(),
					jObject.get("length").getAsInt(), jObject.get("days").getAsInt(), jObject.get("fixedMarketPrice").getAsDouble(), 0, 0)
			: new TopologyController(optHierarchy, optimizer, optimizationCriteria, ToolUsage.PLANNING,
					loggingMode, jObject.get("simulationName").getAsString(), jObject.get("steps").getAsInt(),
					jObject.get("length").getAsInt(), jObject.get("days").getAsInt(), jObject.get("marketPriceFile").getAsString(), 0, 0);

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
					top.attach(building);

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}

			return top;
		}
	}

	class BuildingControllerDeserializer implements JsonDeserializer<BuildingController> {

		@Override
		public BuildingController deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			JsonObject jObject = (JsonObject) jsonElement;

			// Creating the building
			BuildingController building = new CSVBuildingController(jObject.get("name").getAsString(),
					jObject.get("ldHeating").getAsBoolean(), jObject.get("heatTransportLength").getAsInt());

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
					jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);		}
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