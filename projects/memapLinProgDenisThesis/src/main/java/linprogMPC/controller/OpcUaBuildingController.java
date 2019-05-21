package linprogMPC.controller;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

import com.github.cliftonlabs.json_simple.JsonObject;

import linprogMPC.components.ClientConsumer;
import linprogMPC.components.Consumer;
import linprogMPC.components.prototypes.Device;
import linprogMPC.helperOPCua.BasicClient;

public class OpcUaBuildingController implements BuildingController {

    BasicClient client; // address of example server

    public final String name;
    public final boolean hasLDHeating;
    public final int heatTransportLength;
    private final String endpointURL;
    private final int endpointDescriptor;
    private Set<Device> devices = new HashSet<Device>();

    public OpcUaBuildingController(JsonObject opcUaEndpoint, JsonObject opcUaNodes) {
	this.name = (String) opcUaEndpoint.get("name");
	this.endpointURL = (String) opcUaEndpoint.get("endpointURL");
	this.endpointDescriptor = Integer.parseInt((String) opcUaEndpoint.get("endpointDescriptor"));
	client = new BasicClient(endpointURL, endpointDescriptor);

	heatTransportLength = 50;
	hasLDHeating = false;

	Consumer consumer = new ClientConsumer(client, NodeId.parse((String) opcUaNodes.get("heatConsumptionId")),
		NodeId.parse((String) opcUaNodes.get("powerConsumptionId")), heatTransportLength);
	attach(consumer);
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

}
