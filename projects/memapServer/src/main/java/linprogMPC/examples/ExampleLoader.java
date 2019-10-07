package linprogMPC.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import linprogMPC.components.CSVCoupler;
import linprogMPC.components.CSVProducer;
import linprogMPC.components.CSVStorage;
import linprogMPC.components.CSVVolatileProducer;
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
    TopologyController topologyController =
        new TopologyController("MEMAP", true, 5, 96, 7, 0, false, 4880);

    try {
      BufferedReader endpoint1 = new BufferedReader(new InputStreamReader(ExampleLoader.class
          .getClassLoader().getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding1Endpoint.json")));
      BufferedReader nodes1 = new BufferedReader(new InputStreamReader(ExampleLoader.class
          .getClassLoader().getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding1Nodes.json")));
      JsonObject jsonEndpoint1 = (JsonObject) Jsoner.deserialize(endpoint1);
      JsonObject jsonNodes1 = (JsonObject) Jsoner.deserialize(nodes1);
      BuildingController sampleBuilding1 = new OpcUaBuildingController(jsonEndpoint1, jsonNodes1);
      topologyController.attach(sampleBuilding1);

    } catch (JsonException e1) {
      System.err
          .println("WARNING: Failed to read JSON config files. Building has not been initalised.");
      e1.printStackTrace();
    } catch (IllegalStateException e2) {
      System.err.println("WARNING: Failed to create Client. Building has not been initialised");
      e2.printStackTrace();
    }

    try {
      BufferedReader endpoint2 = new BufferedReader(new InputStreamReader(ExampleLoader.class
          .getClassLoader().getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding2Endpoint.json")));
      BufferedReader nodes2 = new BufferedReader(new InputStreamReader(ExampleLoader.class
          .getClassLoader().getResourceAsStream(DirectoryConfiguration.exampleDir + "/FortissBuilding2Nodes.json")));
      JsonObject jsonEndpoint2 = (JsonObject) Jsoner.deserialize(endpoint2);
      JsonObject jsonNodes2 = (JsonObject) Jsoner.deserialize(nodes2);
      BuildingController sampleBuilding2 = new OpcUaBuildingController(jsonEndpoint2, jsonNodes2);
      topologyController.attach(sampleBuilding2);
    } catch (JsonException e1) {
      System.err
          .println("WARNING: Failed to read JSON config files. Building has not been initalised.");
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

  public static TopologyController CsvExample() {
    final int PORT_UNDEFINED = 0;

    TopologyController topologyController =
        new TopologyController("MEMAP", true, 2, 96, 7, 0, false, 4880);

    BuildingController building1 =
        new CSVBuildingController("Building1", "WaermeVerbraeucheAngepasstGebaeude1.csv",
            "StromVerbraeucheAngepasstGebaeude1.csv", false, 50);

    BuildingController building2 =
        new CSVBuildingController("Building2", "WaermeVerbraeucheAngepasstGebaeude2.csv",
            "StromVerbraeucheAngepasstGebaeude2.csv", false, 50);
    Storage battery2 = new CSVStorage(12.0, 9, 9, 0.95, 0.95, NetworkType.ELECTRICITY, 0);
    Producer producer2 = new CSVProducer(20.0, 0.89, 0.006, PORT_UNDEFINED);
    building2.attach(producer2);
    building2.attach(battery2);

    BuildingController building3 =
        new CSVBuildingController("Building3", "WaermeVerbraeucheAngepasstGebaeude3.csv",
            "StromVerbraeucheAngepasstGebaeude3.csv", false, 50);
    Producer pv3 = new CSVVolatileProducer(12.0 + 5.0, NetworkType.ELECTRICITY, PORT_UNDEFINED);
    Coupler heatpump3 = new CSVCoupler(25, 2.5, -1, false, PORT_UNDEFINED);
    Storage thermalStorage3 =
        new CSVStorage(3 * 100, 3 * 60, 3 * 60, 0.9, 0.9, NetworkType.HEAT, PORT_UNDEFINED);
    building3.attach(pv3);
    building3.attach(heatpump3);
    building3.attach(thermalStorage3);

    BuildingController building4 =
        new CSVBuildingController("Building4", "WaermeVerbraeucheAngepasstGebaeude4.csv",
            "StromVerbraeucheAngepasstGebaeude4.csv", false, 50);
    Coupler chp4 = new CSVCoupler(43, 0.61, 0.29, true, PORT_UNDEFINED);
    building4.attach(chp4);

    BuildingController building5 =
        new CSVBuildingController("Building5", "WaermeVerbraeucheAngepasstGebaeude4.csv",
            "StromVerbraeucheAngepasstGebaeude4.csv", false, 50);
    Producer solarThermic5 = new CSVVolatileProducer(10, NetworkType.HEAT, PORT_UNDEFINED);
    building5.attach(solarThermic5);

    topologyController.attach(building1);
    topologyController.attach(building2);
    topologyController.attach(building3);
    topologyController.attach(building4);
    topologyController.attach(building5);

    return topologyController;
  }

}
