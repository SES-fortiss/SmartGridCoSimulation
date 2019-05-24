package linprogMPC.controller;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import linprogMPC.components.ClientConsumer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.helperOPCua.BasicClient;

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
	heatTransportLength = 50;
	hasLDHeating = false;

	// Initialize the client which connects to the OpcUaServer
	endpointConfigHandler.initEndpoint();
	this.client = new BasicClient(endpointURL, endpointDescriptor);

	// Subscribe to all devices on the OpcUaServer which are referenced in the
	// nodesConfig File
	nodesConfigHandler.initDevices();
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

	private void initDevices() {
	    for (String key : nodesConfig.keySet()) {
		switch (key) {
		case "consumer":
		    JsonArray consumers = (JsonArray) nodesConfig.get("consumer");
		    for (int i = 0; i < consumers.size(); i++) {
			JsonObject consumer = (JsonObject) consumers.get(i);
			attach(new ClientConsumer(client, NodeId.parse((String) consumer.get("heatConsumptionId")),
				NodeId.parse((String) consumer.get("powerConsumptionId")), heatTransportLength));
		    }
		    // TODO: Implement cases for other devices
		}

	    }
	}

    }

    private static String getNextId() {
	return Integer.toString(nextId.incrementAndGet());
    }

}
