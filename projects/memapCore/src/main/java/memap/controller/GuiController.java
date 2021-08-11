package memap.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonStreamParser;
import com.google.gson.reflect.TypeToken;

import memap.components.CSVConsumer;
import memap.components.CSVCoupler;
import memap.components.CSVProducer;
import memap.components.CSVStorage;
import memap.components.CSVVolatileProducer;
import memap.components.prototypes.Connection;
import memap.helper.MaxBuyLimit;
import memap.helper.ElectricityPrice;
import memap.helper.EnergyPrices;
import memap.helper.HeatPrice;
import memap.helper.MEMAPLogging;
import memap.helper.Price;
import memap.helper.configurationOptions.OptHierarchy;
import memap.helper.configurationOptions.OptimizationCriteria;
import memap.helper.configurationOptions.Optimizer;
import memap.helper.configurationOptions.ToolUsage;
import memap.main.SimulationProgress;
import memap.main.Status;
import memap.main.TopologyConfig;
import memap.messages.extension.NetworkType;

public class GuiController {

	private TopologyController topMemapOn;
	private TopologyController topMemapOff;
	private String topologyFilePath;

	public GuiController(String topologyFilePath) {
		this.topologyFilePath = topologyFilePath;
	}

	public void setUp() throws FileNotFoundException {
		topMemapOn = createTopology(OptHierarchy.MEMAP);
		topMemapOff = createTopology(OptHierarchy.BUILDING);
	}

	public void startSimulation() throws InterruptedException {
		System.out.println("====== START GUI SIMULATON =====");

		Thread memapOffThread = new Thread(topMemapOff);
		Thread memapOnThread = new Thread(topMemapOn);

		memapOffThread.start();
		memapOnThread.start();

		memapOffThread.join();
		memapOnThread.join();

	}

	private TopologyController createTopology(OptHierarchy optimizationHierarchy) {

		FileReader reader = null;
		try {
			reader = new FileReader(topologyFilePath);
		} catch (FileNotFoundException e) {
			SimulationProgress.getInstance().setStatus(Status.ERROR, "Failed to read topology in " + topologyFilePath);
			e.printStackTrace();
		}

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(BuildingController.class, new BuildingControllerDeserializer());
		Type connectionMapType = new TypeToken<ArrayList<Connection>>() {
		}.getType();
		gsonBuilder.registerTypeAdapter(Connection.class, new ConnectionTypeAdapter());

		Gson gson = gsonBuilder.enableComplexMapKeySerialization().create();
		JsonStreamParser p = new JsonStreamParser(reader);
		JsonArray root = p.next().getAsJsonArray();
		
		// Buildings
		JsonElement topology = root.get(0);
		JsonArray buildings = topology.getAsJsonArray();

		// Connections
		JsonElement connections = root.get(1);
		ArrayList<Connection> connectionList = gson.fromJson(connections, connectionMapType);

		// Parameters
		JsonElement parameters = root.get(2);

		// Create topology
		JsonObject jObject = parameters.getAsJsonObject();

		// Configure simulation parameters
		TopologyConfig topologyConfig = TopologyConfig.getInstance();

		int mpcHorizon = jObject.get("mpcHorizon").getAsInt();
		int timeStepsPerDay = jObject.get("stepsPerDay").getAsInt();
		int nrDays = jObject.get("days").getAsInt();
		
		// Must come before prices are set!
		topologyConfig.init(mpcHorizon, timeStepsPerDay, nrDays, 0, 0);
		
		JsonObject maxBuyLimitObj = jObject.get("maxBuyLimit").getAsJsonObject();
		
		JsonObject elecBuyingPriceObj = jObject.get("elecBuyingPrice").getAsJsonObject();
		JsonObject elecSellingPriceObj = jObject.get("elecSellingPrice").getAsJsonObject();
		JsonObject heatBuyingPriceObj = jObject.get("heatBuyingPrice").getAsJsonObject();

		Price maxBuyLimit = new MaxBuyLimit(maxBuyLimitObj.get("fixed").getAsBoolean(),
				maxBuyLimitObj.get("price").getAsDouble(), maxBuyLimitObj.get("priceFilePath").getAsString(),
				mpcHorizon);
		
		Price elecBuyingPrice = new ElectricityPrice(elecBuyingPriceObj.get("fixed").getAsBoolean(),
				elecBuyingPriceObj.get("price").getAsDouble(), elecBuyingPriceObj.get("priceFilePath").getAsString(),
				mpcHorizon);
		Price elecSellingPrice = new ElectricityPrice(elecSellingPriceObj.get("fixed").getAsBoolean(),
				elecSellingPriceObj.get("price").getAsDouble(), elecSellingPriceObj.get("priceFilePath").getAsString(),
				mpcHorizon);
		Price heatBuyingPrice = new HeatPrice(heatBuyingPriceObj.get("fixed").getAsBoolean(),
				heatBuyingPriceObj.get("price").getAsDouble(), heatBuyingPriceObj.get("priceFilePath").getAsString(),
				mpcHorizon);

		EnergyPrices energyPrices = EnergyPrices.getInstance();
		energyPrices.init(maxBuyLimit, elecBuyingPrice, elecSellingPrice, heatBuyingPrice);

		Optimizer optimizer = null;
		String optimizerType = jObject.get("optimizer").getAsString();

		if (optimizerType.equals("lp")) {
			if (connectionList.size() > 0) {
				optimizer = Optimizer.LPwithConnections;
			} else {
				optimizer = Optimizer.LP;
			}
		} else {
			if (connectionList.size() > 0) {
				optimizer = Optimizer.MILPwithConnections;
			} else {
				optimizer = Optimizer.MILP;
			}
		}

		OptHierarchy optHierarchy = optimizationHierarchy;
		OptimizationCriteria optimizationCriteria = (jObject.get("optCriteria").getAsString().contentEquals("cost"))
				? OptimizationCriteria.EUR
				: OptimizationCriteria.CO2;

		String loggingST = jObject.get("loggingMode").getAsString();

		MEMAPLogging loggingMode = MEMAPLogging.ALL;
		if (loggingST.equals("fileLogs"))
			loggingMode = MEMAPLogging.FILES;
		if (loggingST.equals("resultLogs"))
			loggingMode = MEMAPLogging.RESULTS_ONLY;
		
		String fileName = Paths.get(topologyFilePath).getFileName().toString().replaceAll(".json", "");

		TopologyController top = new TopologyController(fileName, optHierarchy,
				optimizer, optimizationCriteria, ToolUsage.PLANNING, loggingMode);

		for (JsonElement json : buildings) {
			BuildingController building = gson.fromJson(json, BuildingController.class);
			top.attach(building.getName(), building);
		}
		// Create connections
		for (Connection connection : connectionList) {
			BuildingController sourceBuilding = top.managedBuildings.get(connection.sourceBuilding);
			sourceBuilding.attach(connection);
		}

		return top;

	}

	class ConnectionTypeAdapter implements JsonDeserializer<Connection> {

		@Override
		public Connection deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			JsonObject obj = json.getAsJsonObject();

			String sourceBuilding = obj.get("formattedNameNodeA").getAsString();
			String connectedBuilding = obj.get("formattedNameNodeB").getAsString();
			double pipeLengthInMeter = obj.get("length").getAsDouble();
			double lossesPer100m = obj.get("losses").getAsDouble();
			double maxTransportCapacity = obj.get("maxTransportCapacity").getAsDouble();

			return new Connection(sourceBuilding, connectedBuilding, pipeLengthInMeter, lossesPer100m, maxTransportCapacity);
		}

	}

	class BuildingControllerDeserializer implements JsonDeserializer<BuildingController> {

		@Override
		public BuildingController deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {

			JsonObject jObject = (JsonObject) jsonElement;

			// Creating the building
			CSVBuildingController building;
			
			try {
				building = new CSVBuildingController(jObject.get("formattedName").getAsString());
				double[] elecBuyLimit = new double[TopologyConfig.getInstance().getNrStepsMPC()];			
				Arrays.fill(elecBuyLimit,(int) jObject.get("max_buy_limit").getAsDouble());
				building.setElecBuylimit(elecBuyLimit);
			} catch (Exception e) {
				building = new CSVBuildingController(jObject.get("name").getAsString());
			}

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
			
			// FIXME this design is maybe not very beatiful. If a better solution exist, we should try to improve it.
			CSVCoupler coupler;
			
			try {
				coupler = new CSVCoupler(jObject.get("formattedName").getAsString(), jObject.get("minimumPower").getAsDouble(),
						jObject.get("maximumPower").getAsDouble(), jObject.get("efficiencyPrimary").getAsDouble(),
						jObject.get("efficiencySecondary").getAsDouble(), primaryNetworkType, secondaryNetworkType,
						jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0); 
			} catch (Exception e) {
				coupler = new CSVCoupler(jObject.get("name").getAsString(), jObject.get("minimumPower").getAsDouble(),
						jObject.get("maximumPower").getAsDouble(), jObject.get("efficiencyPrimary").getAsDouble(),
						jObject.get("efficiencySecondary").getAsDouble(), primaryNetworkType, secondaryNetworkType,
						jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);
			}

			return coupler;
		}
	}

	class CSVProducerDeserializer implements JsonDeserializer<CSVProducer> {
		@Override
		public CSVProducer deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jObject = (JsonObject) jsonElement;
			String networkT = jObject.get("networkType").getAsString();

			NetworkType networkType = (networkT.equals("Heat") || networkT.equals("HEAT") ) ? networkType = NetworkType.HEAT
					: NetworkType.ELECTRICITY;
			
			CSVProducer producer; 
			
			try {
				producer = new CSVProducer(jObject.get("formattedName").getAsString(), jObject.get("minimumPower").getAsDouble(),
						jObject.get("maximumPower").getAsDouble(), jObject.get("efficiency").getAsDouble(), networkType,
						jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0); 
			} catch (Exception e) {
				producer = new CSVProducer(jObject.get("name").getAsString(), jObject.get("minimumPower").getAsDouble(),
						jObject.get("maximumPower").getAsDouble(), jObject.get("efficiency").getAsDouble(), networkType,
						jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);
			}

			return producer; 
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

			CSVVolatileProducer vproducer; 
			
			try {
				vproducer = new CSVVolatileProducer(jObject.get("formattedName").getAsString(), jObject.get("forecastFile").getAsString(),
						jObject.get("minimumPower").getAsDouble(), jObject.get("maximumPower").getAsDouble(), networkType,
						jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);
			} catch (Exception e) {
				vproducer = new CSVVolatileProducer(jObject.get("name").getAsString(), jObject.get("forecastFile").getAsString(),
						jObject.get("minimumPower").getAsDouble(), jObject.get("maximumPower").getAsDouble(), networkType,
						jObject.get("cost").getAsDouble(), jObject.get("coEmission").getAsDouble(), 0);
			}
			
			return vproducer;
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
			
			CSVStorage storage;
			
			try {
				storage = new CSVStorage(jObject.get("formattedName").getAsString(), jObject.get("capacity").getAsDouble(),
						jObject.get("soc").getAsDouble(), jObject.get("maxCharging").getAsDouble(),
						jObject.get("maxDischarging").getAsDouble(), jObject.get("effIN").getAsDouble(),
						jObject.get("effOUT").getAsDouble(), networkType, 
						0.0, // operationalCost EUR 
						0.0, // operationalCost Co2
						jObject.get("losses").getAsDouble(),   // lossFactor
						0);
			} catch (Exception e) {
				storage = new CSVStorage(jObject.get("name").getAsString(), jObject.get("capacity").getAsDouble(),
						jObject.get("soc").getAsDouble(), jObject.get("maxCharging").getAsDouble(),
						jObject.get("maxDischarging").getAsDouble(), jObject.get("effIN").getAsDouble(),
						jObject.get("effOUT").getAsDouble(), networkType, 
						0.0, // operationalCost EUR 
						0.0, // operationalCost Co2
						jObject.get("losses").getAsDouble(),   // lossFactor
						0);
			}

			return storage;
		}
	}

	class CSVConsumerDeserializer implements JsonDeserializer<CSVConsumer> {
		@Override
		public CSVConsumer deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jObject = (JsonObject) jsonElement;
			
			CSVConsumer consumer;
			
			try {
				consumer = new CSVConsumer(jObject.get("formattedName").getAsString(), 
						jObject.get("consumptionProfile").getAsString(),
						0);
			} catch (Exception e) {
				consumer = new CSVConsumer(jObject.get("name").getAsString(), 
						jObject.get("consumptionProfile").getAsString(),
						0);
			}

			return consumer; 
		}
	}

}
