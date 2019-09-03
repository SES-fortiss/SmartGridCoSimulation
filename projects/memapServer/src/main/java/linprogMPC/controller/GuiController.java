package linprogMPC.controller;

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
import linprogMPC.components.CSVCoupler;
import linprogMPC.components.CSVProducer;
import linprogMPC.components.CSVStorage;
import linprogMPC.components.CSVVolatileProducer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.messages.extension.NetworkType;



public class GuiController {

  private TopologyController top;

  public GuiController(String pathToConfigJson) throws FileNotFoundException {

    FileReader reader = new FileReader(pathToConfigJson);
    JsonParser jsonParser = new JsonParser();
    JsonObject configJson = (JsonObject) jsonParser.parse(reader);

    this.top = createTopology(configJson);
  }

  public void startSimulation() {
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
    public TopologyController deserialize(JsonElement jsonElement, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {

      JsonObject jObject = (JsonObject) jsonElement;

      // Creating topologyController
      TopologyController top = new TopologyController("Memap",
          jObject.get("memapON").getAsBoolean(), jObject.get("steps").getAsInt(),
          jObject.get("length").getAsInt(), jObject.get("days").getAsInt(), 0, false, 0);

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
          gsonBuilder.registerTypeAdapter(BuildingController.class,
              new BuildingControllerDeserializer());
          Gson gson = gsonBuilder.create();

          BuildingController building = gson.fromJson(buildingConfig, BuildingController.class);
          top.attach(building);

        } catch (FileNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }

      return top;
    }
  }

  class BuildingControllerDeserializer implements JsonDeserializer<BuildingController> {

    @Override
    public BuildingController deserialize(JsonElement jsonElement, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {

      JsonObject jObject = (JsonObject) jsonElement;
      JsonArray demandList = (JsonArray) jObject.get("demand_list");

      // Creating the building

      // This just takes the first index of the first object in the demand list.
      // TODO: Passing links to actual csv files here
      JsonObject demand = (JsonObject) demandList.get(0);
      int index = demand.get("index").getAsInt();

      String heatDemandFile = "WaermeVerbraeucheAngepasstGebaeude" + index + ".csv";
      String electricityDemandFile = "StromVerbraeucheAngepasstGebaeude" + index + ".csv";

      BuildingController building = new CSVBuildingController(jObject.get("name").getAsString(),
          heatDemandFile, electricityDemandFile, jObject.get("ldHeating").getAsBoolean(),
          jObject.get("heatTransportLength").getAsInt());

      // Attaching devices
      JsonArray couplers = (JsonArray) jObject.get("coupler_list");
      JsonArray producers = (JsonArray) jObject.get("controllable_list");
      JsonArray volatileProducers = (JsonArray) jObject.get("volatile_list");
      JsonArray storages = (JsonArray) jObject.get("storage_list");

      GsonBuilder gsonBuilder = new GsonBuilder();
      gsonBuilder.registerTypeAdapter(Device.class, new DeviceDeserializer());
      Gson gson = gsonBuilder.create();

      for (JsonElement couplerEl : couplers) {
        JsonObject couplerConfig = (JsonObject) couplerEl;
        CSVCoupler coupler = gson.fromJson(couplerConfig, CSVCoupler.class);
        building.attach(coupler);
      }

      for (JsonElement producersEl : producers) {
        JsonObject producerConfig = (JsonObject) producersEl;
        CSVProducer coupler = gson.fromJson(producerConfig, CSVProducer.class);
        building.attach(coupler);
      }

      for (JsonElement volatileProducersEl : volatileProducers) {
        JsonObject volatileProducerConfig = (JsonObject) volatileProducersEl;
        CSVVolatileProducer volatileProducer =
            gson.fromJson(volatileProducerConfig, CSVVolatileProducer.class);
        building.attach(volatileProducer);
      }

      for (JsonElement storageEl : storages) {
        JsonObject storageConfig = (JsonObject) storageEl;
        CSVStorage storage = gson.fromJson(storageConfig, CSVStorage.class);
        building.attach(storage);
      }
      return building;
    }
  }

  class DeviceDeserializer implements JsonDeserializer<Device> {

    @Override
    public Device deserialize(JsonElement jsonElement, Type typeOfT,
        JsonDeserializationContext context) throws JsonParseException {
      JsonObject jObject = (JsonObject) jsonElement;

      if (typeOfT == CSVCoupler.class) {
        return new CSVCoupler(0, 0, 0, false, 0);

      }

      else if (typeOfT == CSVProducer.class) {
        return new CSVProducer(0, 0, 0, 0);

      }

      else if (typeOfT == CSVVolatileProducer.class) {
        return new CSVVolatileProducer(0, NetworkType.ELECTRICITY, 0);

      }

      else if (typeOfT == CSVStorage.class) {
        return new CSVStorage(0, 0, 0, 0, 0, NetworkType.HEAT, 0);
      }

      else {
        // TODO: Throw exception here
        return null;
      }

    }
  }

}
