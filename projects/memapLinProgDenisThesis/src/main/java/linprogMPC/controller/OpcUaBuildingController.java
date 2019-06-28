package linprogMPC.controller;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import linprogMPC.components.ClientConsumer;
import linprogMPC.components.ClientCoupler;
import linprogMPC.components.ClientProducer;
import linprogMPC.components.ClientStorage;
import linprogMPC.components.ClientVolatileProducer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.helperOPCua.BasicClient;
import linprogMPC.messages.extension.NetworkType;

public class OpcUaBuildingController implements BuildingController {

    public BasicClient client;
    private static AtomicInteger nextId = new AtomicInteger(0);

    public JsonObject endpointConfig;
    public JsonObject nodesConfig;

    public String name;
    public boolean hasLDHeating;
    public int heatTransportLength;
    private String endpointURL;
    private int endpointDescriptor;
    private Set<Device> devices = new HashSet<Device>();
    private Logger logger = LoggerFactory.getLogger(OpcUaBuildingController.class);

    public OpcUaBuildingController(JsonObject opcUaEndpointConfig, JsonObject opcUaNodesConfig) {

	// Initialize ConfigHandlers to access the Jsons
	this.endpointConfig = opcUaEndpointConfig;
	this.nodesConfig = opcUaNodesConfig;
	EndpointConfigHandler endpointConfigHandler = new EndpointConfigHandler();
	NodesConfigHandler nodesConfigHandler = new NodesConfigHandler();

	// TODO: How should these valued be accessed?
	this.heatTransportLength = 50;
	this.hasLDHeating = false;

	// Initialize the client which connects to the OpcUaServer
	endpointConfigHandler.initEndpoint();
	this.client = new BasicClient(endpointURL, endpointDescriptor);

	// Subscribe to all devices on the OpcUaServer which are referenced in the
	// nodesConfig File
	try {
	    nodesConfigHandler.initDevices();
	} catch (InterruptedException | ExecutionException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public boolean hasLDHeaeting() {
	return hasLDHeating;
    }

    @Override
    public int getHeatTransportLength() {
	return heatTransportLength;
    }

    @Override
    public Set<? extends Device> getDevices() {
	return devices;
    }

    @Override
    public void attach(Device device) {
	devices.add(device);
    }

    private class EndpointConfigHandler {

	public void initEndpoint() {
	    name = getName();
	    endpointURL = getEndpointURL();
	    endpointDescriptor = getEndpointDescriptor();
	}

	private String getName() {
	    if (endpointConfig.containsKey("name")) {
		String name = (String) endpointConfig.get("name");
		if (name.startsWith("Building X")) {
		    name = getNextId();
		    logger.info("Names starting with 'Building X' are allocated by the system. Changed name to '" + name
			    + "'");
		}
		return name;
	    } else {
		String name = "Building X" + getNextId();
		logger.info("Could not find a 'name' key in the OpcUaEndpoint config file. Using name: '" + name
			+ "' instead.");
		return name;
	    }
	}

	private String getEndpointURL() {
	    if (endpointConfig.containsKey("endpointURL")) {
		return (String) endpointConfig.get("endpointURL");
	    } else {
		throw new NoSuchElementException(
			"Could not find a key 'endpointURL' in the endpoint config file. Please add this key");
	    }
	}

	private int getEndpointDescriptor() {
	    if (endpointConfig.containsKey("endpointDescriptor")) {
		return Integer.parseInt((String) endpointConfig.get("endpointDescriptor"));
	    } else {
		throw new NoSuchElementException(
			"Could not find a key 'endpointDescriptor' in the endpoint config file. Please add this key");
	    }
	}
    }

    private class NodesConfigHandler {

	private void initDevices() throws InterruptedException, ExecutionException {
	    for (String key : nodesConfig.keySet()) {
		switch (key) {
		case "battery":
		    JsonArray batteries = (JsonArray) nodesConfig.get("battery");
		    for (int i = 0; i < batteries.size(); i++) {
			JsonObject battery = (JsonObject) batteries.get(i);
			NodeId capacityId = NodeId.parse((String) battery.get("capacityId"));
			NodeId maxChargingId = NodeId.parse((String) battery.get("maxChargingId"));
			NodeId maxDischargingId = NodeId.parse((String) battery.get("maxDischargingId"));
			NodeId effInId = NodeId.parse((String) battery.get("effInId"));
			NodeId effOutId = NodeId.parse((String) battery.get("effOutId"));
			attach(new ClientStorage(client, capacityId, maxChargingId, maxDischargingId, effInId, effOutId,
				NetworkType.ELECTRICITY, 0));
			System.out.println("Added battery to " + name);
		    }
		    break;

		case "chp":
		    JsonArray chps = (JsonArray) nodesConfig.get("chp");
		    for (int i = 0; i < chps.size(); i++) {
			JsonObject chp = (JsonObject) chps.get(i);
			NodeId installedPowerId = NodeId.parse((String) chp.get("installedPowerId"));
			NodeId effHeatId = NodeId.parse((String) chp.get("effHeatId"));
			NodeId effElecId = NodeId.parse((String) chp.get("effElecId"));
			attach(new ClientCoupler(client, installedPowerId, effHeatId, effElecId, 0));
			System.out.println("Added chp to " + name);
		    }
		    break;

		case "consumer":
		    JsonArray consumers = (JsonArray) nodesConfig.get("consumer");
		    for (int i = 0; i < consumers.size(); i++) {
			JsonObject consumer = (JsonObject) consumers.get(i);
			attach(new ClientConsumer(client, NodeId.parse((String) consumer.get("heatConsumptionId")),
				NodeId.parse((String) consumer.get("powerConsumptionId")), 0));
			System.out.println("Added consumer to " + name);
		    }
		    break;

		case "gasboiler":
		    JsonArray gasboilers = (JsonArray) nodesConfig.get("gasboiler");
		    for (int i = 0; i < gasboilers.size(); i++) {
			JsonObject gasboiler = (JsonObject) gasboilers.get(i);
			NodeId installedPowerId = NodeId.parse((String) gasboiler.get("installedPowerId"));
			NodeId effId = NodeId.parse((String) gasboiler.get("effId"));
			NodeId costsId = NodeId.parse((String) gasboiler.get("costsId"));
			attach(new ClientProducer(client, installedPowerId, effId, costsId, NetworkType.HEAT, 0));
			System.out.println("Added gasboiler to " + name);
		    }
		    break;

		case "heatpump":
		    JsonArray heatpumps = (JsonArray) nodesConfig.get("heatpump");
		    for (int i = 0; i < heatpumps.size(); i++) {
			JsonObject heatpump = (JsonObject) heatpumps.get(i);
			NodeId installedPowerId = NodeId.parse((String) heatpump.get("installedPowerId"));
			NodeId effHeatId = NodeId.parse((String) heatpump.get("effHeatId"));
			NodeId effElecId = NodeId.parse((String) heatpump.get("effElecId"));
			attach(new ClientCoupler(client, installedPowerId, effHeatId, effElecId, 0));
			System.out.println("Added heatpump to " + name);
		    }
		    break;

		case "PV":
		    JsonArray pvs = (JsonArray) nodesConfig.get("pc");
		    for (int i = 0; i < pvs.size(); i++) {
			JsonObject pv = (JsonObject) pvs.get(i);
			NodeId installedPowerId = NodeId.parse((String) pv.get("installedPowerId"));
			NodeId effId = NodeId.parse((String) pv.get("effId"));
			NodeId productionId = NodeId.parse((String) pv.get("productionId"));
			attach(new ClientVolatileProducer(client, installedPowerId, effId, productionId,
				NetworkType.ELECTRICITY, 0));
			System.out.println("Added pv to " + name);
		    }
		    break;

		case "solarthermic":
		    JsonArray solarthermics = (JsonArray) nodesConfig.get("solarthermic");
		    for (int i = 0; i < solarthermics.size(); i++) {
			JsonObject solarthermic = (JsonObject) solarthermics.get(i);
			NodeId installedPowerId = NodeId.parse((String) solarthermic.get("installedPowerId"));
			NodeId effId = NodeId.parse((String) solarthermic.get("effId"));
			NodeId productionId = NodeId.parse((String) solarthermic.get("productionId"));
			attach(new ClientVolatileProducer(client, installedPowerId, effId, productionId,
				NetworkType.HEAT, 0));
			System.out.println("Added solarthermic to " + name);
		    }
		    break;

		case "thermalstorage":
		    JsonArray thermalStorages = (JsonArray) nodesConfig.get("thermalstorage");
		    for (int i = 0; i < thermalStorages.size(); i++) {
			JsonObject thermalStorage = (JsonObject) thermalStorages.get(i);
			NodeId capacityId = NodeId.parse((String) thermalStorage.get("capacityId"));
			NodeId maxChargingId = NodeId.parse((String) thermalStorage.get("maxChargingId"));
			NodeId maxDischargingId = NodeId.parse((String) thermalStorage.get("maxDischargingId"));
			NodeId effInId = NodeId.parse((String) thermalStorage.get("effInId"));
			NodeId effOutId = NodeId.parse((String) thermalStorage.get("effOutId"));
			attach(new ClientStorage(client, capacityId, maxChargingId, maxDischargingId, effInId, effOutId,
				NetworkType.ELECTRICITY, 0));
			System.out.println("Added thermalstorage to " + name);
		    }
		    break;

		}

	    }
	}

    }

    private static String getNextId() {
	return Integer.toString(nextId.incrementAndGet());
    }

}
